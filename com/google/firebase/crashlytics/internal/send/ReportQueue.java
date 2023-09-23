package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import com.google.firebase.crashlytics.internal.settings.Settings;
import f.a.b.a.a;
import f.h.b.a.e;
import f.h.b.a.g;
import f.h.b.a.i.n;
import f.h.b.a.i.p;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private int step;
    private final long stepDurationMs;
    private final e<CrashlyticsReport> transport;

    /* loaded from: classes2.dex */
    public final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double calcDelay = ReportQueue.this.calcDelay();
            Logger logger = Logger.getLogger();
            StringBuilder A = a.A("Delay for: ");
            A.append(String.format(Locale.US, "%.2f", Double.valueOf(calcDelay / 1000.0d)));
            A.append(" s for report: ");
            A.append(this.reportWithSessionId.getSessionId());
            logger.d(A.toString());
            ReportQueue.sleep(calcDelay);
        }

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }
    }

    public ReportQueue(e<CrashlyticsReport> eVar, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, eVar, onDemandCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, Math.pow(this.base, calcStep()) * (60000.0d / this.ratePerMinute));
    }

    private int calcStep() {
        int max;
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int now = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        if (isQueueFull()) {
            max = Math.min(100, this.step + now);
        } else {
            max = Math.max(0, this.step - now);
        }
        if (this.step != max) {
            this.step = max;
            this.lastUpdatedMs = now();
        }
        return max;
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger logger = Logger.getLogger();
        StringBuilder A = a.A("Sending report through Google DataTransport: ");
        A.append(crashlyticsReportWithSessionId.getSessionId());
        logger.d(A.toString());
        ((n) this.transport).a(new f.h.b.a.a(null, crashlyticsReportWithSessionId.getReport(), Priority.HIGHEST), new g() { // from class: f.h.e.i.e.g.b
            @Override // f.h.b.a.g
            public final void a(Exception exc) {
                ReportQueue reportQueue = ReportQueue.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                CrashlyticsReportWithSessionId crashlyticsReportWithSessionId2 = crashlyticsReportWithSessionId;
                Objects.requireNonNull(reportQueue);
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                reportQueue.flushScheduledReportsIfAble();
                taskCompletionSource2.trySetResult(crashlyticsReportWithSessionId2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d2) {
        try {
            Thread.sleep((long) d2);
        } catch (InterruptedException unused) {
        }
    }

    public void a(CountDownLatch countDownLatch) {
        e<CrashlyticsReport> eVar = this.transport;
        Priority priority = Priority.HIGHEST;
        if (eVar instanceof n) {
            p.a().f3713d.a(((n) eVar).a.e(priority), 1);
            countDownLatch.countDown();
            return;
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    public TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
            if (z) {
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (isQueueAvailable()) {
                    Logger logger = Logger.getLogger();
                    logger.d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                    Logger logger2 = Logger.getLogger();
                    logger2.d("Queue size: " + this.queue.size());
                    this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                    Logger logger3 = Logger.getLogger();
                    logger3.d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                calcStep();
                Logger logger4 = Logger.getLogger();
                logger4.d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                this.onDemandCounter.incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: f.h.e.i.e.g.c
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.this.a(countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public ReportQueue(double d2, double d3, long j2, e<CrashlyticsReport> eVar, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d2;
        this.base = d3;
        this.stepDurationMs = j2;
        this.transport = eVar;
        this.onDemandCounter = onDemandCounter;
        int i2 = (int) d2;
        this.queueCapacity = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }
}
