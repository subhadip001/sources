package com.arthenica.ffmpegkit.usecase;

import android.os.Handler;
import android.os.Looper;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.Level;
import com.arthenica.ffmpegkit.Log;
import com.arthenica.ffmpegkit.LogCallback;
import com.arthenica.ffmpegkit.Statistics;
import com.arthenica.ffmpegkit.StatisticsCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class FFmpegKitUseCase {
    private static final int LOG_LIMIT = 2500;
    private static final String TAG = "FFmpegKitUseCase";
    private static FFmpegKitUseCase fFmpegKitUseCase;
    private final Object LOCK = new Object();
    private boolean avoidFirstResponse;
    private Handler handler;
    private boolean isCanceled;
    private boolean isFFmpegRunning;
    private Queue<String> logMessageFirstHalf;
    private ArrayDeque<String> logMessageSecondHalf;
    private FFmpegSession session;
    private Queue<Task> taskQueue;

    private FFmpegKitUseCase() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkAndStartNextTask() {
        if (!this.isFFmpegRunning && !getTaskQueue().isEmpty()) {
            Task peek = getTaskQueue().peek();
            getTaskQueue().remove();
            if (peek != null) {
                this.isFFmpegRunning = true;
                executeAsyncTask(peek.getCommand(), peek.getResponseHandler());
            }
        }
    }

    private void executeAsyncTask(String[] strArr, ExecuteBinaryResponseHandler executeBinaryResponseHandler) {
        try {
            this.isCanceled = false;
            this.avoidFirstResponse = true;
            synchronized (this.LOCK) {
                Queue<String> queue = this.logMessageFirstHalf;
                if (queue != null) {
                    queue.clear();
                }
                ArrayDeque<String> arrayDeque = this.logMessageSecondHalf;
                if (arrayDeque != null) {
                    arrayDeque.clear();
                }
                this.logMessageFirstHalf = new ArrayDeque();
                this.logMessageSecondHalf = new ArrayDeque<>();
            }
            if (executeBinaryResponseHandler != null) {
                executeBinaryResponseHandler.onStart();
            }
            final WeakReference weakReference = new WeakReference(executeBinaryResponseHandler);
            this.session = FFmpegKit.executeWithArgumentsAsync(strArr, new FFmpegSessionCompleteCallback() { // from class: com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase.1
                @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
                public void apply(final FFmpegSession fFmpegSession) {
                    final ExecuteBinaryResponseHandler executeBinaryResponseHandler2 = (ExecuteBinaryResponseHandler) weakReference.get();
                    if (executeBinaryResponseHandler2 == null) {
                        return;
                    }
                    FFmpegKitUseCase.this.waitForAsynchronousMessagesInTransmit(fFmpegSession, 1000);
                    final StringBuilder sb = new StringBuilder();
                    synchronized (FFmpegKitUseCase.this.LOCK) {
                        for (String str : FFmpegKitUseCase.this.logMessageFirstHalf) {
                            sb.append(str);
                        }
                        Iterator it = FFmpegKitUseCase.this.logMessageSecondHalf.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                    }
                    FFmpegKitUseCase.this.getHandler().post(new Runnable() { // from class: com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (fFmpegSession.getReturnCode().isValueSuccess()) {
                                executeBinaryResponseHandler2.onSuccess(sb.toString());
                            } else {
                                executeBinaryResponseHandler2.onFailure(sb.toString());
                            }
                            executeBinaryResponseHandler2.onFinish();
                        }
                    });
                    FFmpegKitUseCase.this.isFFmpegRunning = false;
                    FFmpegKitUseCase.this.checkAndStartNextTask();
                }
            }, new LogCallback() { // from class: com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase.2
                @Override // com.arthenica.ffmpegkit.LogCallback
                public void apply(Log log) {
                    synchronized (FFmpegKitUseCase.this.LOCK) {
                        if (FFmpegKitUseCase.this.logMessageFirstHalf.size() < FFmpegKitUseCase.LOG_LIMIT) {
                            FFmpegKitUseCase.this.logMessageFirstHalf.add(log.getMessage());
                        } else if (FFmpegKitUseCase.this.logMessageSecondHalf.size() < FFmpegKitUseCase.LOG_LIMIT) {
                            FFmpegKitUseCase.this.logMessageSecondHalf.addLast(log.getMessage());
                        } else {
                            FFmpegKitUseCase.this.logMessageSecondHalf.removeFirst();
                            FFmpegKitUseCase.this.logMessageSecondHalf.addLast(log.getMessage());
                        }
                    }
                    if (((ExecuteBinaryResponseHandler) weakReference.get()) == null) {
                    }
                }
            }, new StatisticsCallback() { // from class: com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase.3
                @Override // com.arthenica.ffmpegkit.StatisticsCallback
                public void apply(Statistics statistics) {
                    ExecuteBinaryResponseHandler executeBinaryResponseHandler2 = (ExecuteBinaryResponseHandler) weakReference.get();
                    if (executeBinaryResponseHandler2 == null) {
                        return;
                    }
                    if (FFmpegKitUseCase.this.avoidFirstResponse) {
                        FFmpegKitUseCase.this.avoidFirstResponse = false;
                    } else if (FFmpegKitUseCase.this.isCanceled) {
                        if (FFmpegKitUseCase.this.session != null) {
                            FFmpegKitUseCase.this.session.cancel();
                        }
                    } else {
                        executeBinaryResponseHandler2.onProgress(String.format("%s %s", Integer.valueOf(statistics.getTime()), Long.valueOf(statistics.getSize())));
                    }
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
            if (executeBinaryResponseHandler != null) {
                executeBinaryResponseHandler.onFailure(e2.getMessage());
            }
            this.isFFmpegRunning = false;
            checkAndStartNextTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        return this.handler;
    }

    public static FFmpegKitUseCase getInstance() {
        if (fFmpegKitUseCase == null) {
            fFmpegKitUseCase = new FFmpegKitUseCase();
        }
        FFmpegKitConfig.setLogLevel(Level.AV_LOG_INFO);
        return fFmpegKitUseCase;
    }

    private Queue<Task> getTaskQueue() {
        if (this.taskQueue == null) {
            this.taskQueue = new LinkedList();
        }
        return this.taskQueue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForAsynchronousMessagesInTransmit(FFmpegSession fFmpegSession, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        while (fFmpegSession.thereAreAsynchronousMessagesInTransmit() && System.currentTimeMillis() < i2 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public synchronized void cancelTask() {
        this.isCanceled = true;
        this.isFFmpegRunning = false;
        FFmpegSession fFmpegSession = this.session;
        if (fFmpegSession == null) {
            FFmpegKit.cancel(0L);
        } else {
            FFmpegKit.cancel(fFmpegSession.getSessionId());
        }
        getTaskQueue().clear();
    }

    public synchronized void execute(String[] strArr, ExecuteBinaryResponseHandler executeBinaryResponseHandler) {
        getTaskQueue().add(new Task(strArr, executeBinaryResponseHandler));
        checkAndStartNextTask();
    }

    public boolean isFFmpegRunning() {
        return this.isFFmpegRunning;
    }
}
