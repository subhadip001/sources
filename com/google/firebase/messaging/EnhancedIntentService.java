package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.WithinAppServiceBinder;
import f.h.e.p.w;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    public final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    private void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i2 = this.runningTasks - 1;
            this.runningTasks = i2;
            if (i2 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: f.h.e.p.c
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService enhancedIntentService = EnhancedIntentService.this;
                Intent intent2 = intent;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Objects.requireNonNull(enhancedIntentService);
                try {
                    enhancedIntentService.handleIntent(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public /* synthetic */ void a(Intent intent, Task task) {
        finishTask(intent);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                @KeepForSdk
                public Task<Void> handle(Intent intent2) {
                    return EnhancedIntentService.this.processIntent(intent2);
                }
            });
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.lock) {
            this.lastStartId = i3;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(w.f6188f, new OnCompleteListener() { // from class: f.h.e.p.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.this.a(intent, task);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i2) {
        return stopSelfResult(i2);
    }
}
