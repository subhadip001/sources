package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.WithinAppServiceConnection;
import f.a.b.a.a;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WithinAppServiceConnection implements ServiceConnection {
    private static final int REQUEST_TIMEOUT_MS = 9000;
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    /* loaded from: classes2.dex */
    public static class BindRequest {
        public final Intent intent;
        private final TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();

        public BindRequest(Intent intent) {
            this.intent = intent;
        }

        public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: f.h.e.p.d0
                @Override // java.lang.Runnable
                public final void run() {
                    WithinAppServiceConnection.BindRequest bindRequest = WithinAppServiceConnection.BindRequest.this;
                    Objects.requireNonNull(bindRequest);
                    Log.w("FirebaseMessaging", "Service took too long to process intent: " + bindRequest.intent.getAction() + " Releasing WakeLock.");
                    bindRequest.finish();
                }
            }, (this.intent.getFlags() & 268435456) != 0 ? WakeLockHolder.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS : 9000L, TimeUnit.MILLISECONDS);
            getTask().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: f.h.e.p.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }

        public Task<Void> getTask() {
            return this.taskCompletionSource.getTask();
        }
    }

    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    private synchronized void flushQueue() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.intentQueue.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            WithinAppServiceBinder withinAppServiceBinder = this.binder;
            if (withinAppServiceBinder != null && withinAppServiceBinder.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.binder.send(this.intentQueue.poll());
            } else {
                startConnectionIfNeeded();
                return;
            }
        }
    }

    private void startConnectionIfNeeded() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder A = a.A("binder is dead. start connection? ");
            A.append(!this.connectionInProgress);
            Log.d("FirebaseMessaging", A.toString());
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.connectionInProgress = false;
        finishAllInQueue();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.connectionInProgress = false;
        if (!(iBinder instanceof WithinAppServiceBinder)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            finishAllInQueue();
            return;
        }
        this.binder = (WithinAppServiceBinder) iBinder;
        flushQueue();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        flushQueue();
    }

    public synchronized Task<Void> sendIntent(Intent intent) {
        BindRequest bindRequest;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        bindRequest = new BindRequest(intent);
        bindRequest.arrangeTimeout(this.scheduledExecutorService);
        this.intentQueue.add(bindRequest);
        flushQueue();
        return bindRequest.getTask();
    }

    public WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService;
    }
}
