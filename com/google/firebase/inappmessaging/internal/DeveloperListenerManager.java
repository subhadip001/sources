package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDismissListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayErrorListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingImpressionListener;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class DeveloperListenerManager {
    private static final ThreadPoolExecutor CALLBACK_QUEUE_EXECUTOR;
    private static final int KEEP_ALIVE_TIME_SECONDS = 15;
    private static final int POOL_SIZE = 1;
    public static DeveloperListenerManager instance = new DeveloperListenerManager();
    private static BlockingQueue<Runnable> mCallbackQueue = new LinkedBlockingQueue();
    private Map<FirebaseInAppMessagingClickListener, ClicksExecutorAndListener> registeredClickListeners = new HashMap();
    private Map<FirebaseInAppMessagingDismissListener, DismissExecutorAndListener> registeredDismissListeners = new HashMap();
    private Map<FirebaseInAppMessagingDisplayErrorListener, ErrorsExecutorAndListener> registeredErrorListeners = new HashMap();
    private Map<FirebaseInAppMessagingImpressionListener, ImpressionExecutorAndListener> registeredImpressionListeners = new HashMap();

    /* loaded from: classes2.dex */
    public static class ClicksExecutorAndListener extends ExecutorAndListener<FirebaseInAppMessagingClickListener> {
        public FirebaseInAppMessagingClickListener listener;

        public ClicksExecutorAndListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener, Executor executor) {
            super(executor);
            this.listener = firebaseInAppMessagingClickListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.inappmessaging.internal.DeveloperListenerManager.ExecutorAndListener
        public FirebaseInAppMessagingClickListener getListener() {
            return this.listener;
        }

        public ClicksExecutorAndListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
            super(null);
            this.listener = firebaseInAppMessagingClickListener;
        }
    }

    /* loaded from: classes2.dex */
    public static class DismissExecutorAndListener extends ExecutorAndListener<FirebaseInAppMessagingDismissListener> {
        public FirebaseInAppMessagingDismissListener listener;

        public DismissExecutorAndListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener, Executor executor) {
            super(executor);
            this.listener = firebaseInAppMessagingDismissListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.inappmessaging.internal.DeveloperListenerManager.ExecutorAndListener
        public FirebaseInAppMessagingDismissListener getListener() {
            return this.listener;
        }

        public DismissExecutorAndListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener) {
            super(null);
            this.listener = firebaseInAppMessagingDismissListener;
        }
    }

    /* loaded from: classes2.dex */
    public static class ErrorsExecutorAndListener extends ExecutorAndListener<FirebaseInAppMessagingDisplayErrorListener> {
        public FirebaseInAppMessagingDisplayErrorListener listener;

        public ErrorsExecutorAndListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener, Executor executor) {
            super(executor);
            this.listener = firebaseInAppMessagingDisplayErrorListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.inappmessaging.internal.DeveloperListenerManager.ExecutorAndListener
        public FirebaseInAppMessagingDisplayErrorListener getListener() {
            return this.listener;
        }

        public ErrorsExecutorAndListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
            super(null);
            this.listener = firebaseInAppMessagingDisplayErrorListener;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ExecutorAndListener<T> {
        private final Executor executor;

        public ExecutorAndListener(Executor executor) {
            this.executor = executor;
        }

        public abstract T getListener();

        public Executor withExecutor(Executor executor) {
            Executor executor2 = this.executor;
            return executor2 == null ? executor : executor2;
        }
    }

    /* loaded from: classes2.dex */
    public static class FIAMThreadFactory implements ThreadFactory {
        private final String mNameSuffix;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        public FIAMThreadFactory(String str) {
            this.mNameSuffix = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder A = a.A("FIAM-");
            A.append(this.mNameSuffix);
            A.append(this.threadNumber.getAndIncrement());
            Thread thread = new Thread(runnable, A.toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    /* loaded from: classes2.dex */
    public static class ImpressionExecutorAndListener extends ExecutorAndListener<FirebaseInAppMessagingImpressionListener> {
        public FirebaseInAppMessagingImpressionListener listener;

        public ImpressionExecutorAndListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener, Executor executor) {
            super(executor);
            this.listener = firebaseInAppMessagingImpressionListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.inappmessaging.internal.DeveloperListenerManager.ExecutorAndListener
        public FirebaseInAppMessagingImpressionListener getListener() {
            return this.listener;
        }

        public ImpressionExecutorAndListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
            super(null);
            this.listener = firebaseInAppMessagingImpressionListener;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, mCallbackQueue, new FIAMThreadFactory("EventListeners-"));
        CALLBACK_QUEUE_EXECUTOR = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.registeredClickListeners.put(firebaseInAppMessagingClickListener, new ClicksExecutorAndListener(firebaseInAppMessagingClickListener));
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener) {
        this.registeredDismissListeners.put(firebaseInAppMessagingDismissListener, new DismissExecutorAndListener(firebaseInAppMessagingDismissListener));
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.registeredErrorListeners.put(firebaseInAppMessagingDisplayErrorListener, new ErrorsExecutorAndListener(firebaseInAppMessagingDisplayErrorListener));
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.registeredImpressionListeners.put(firebaseInAppMessagingImpressionListener, new ImpressionExecutorAndListener(firebaseInAppMessagingImpressionListener));
    }

    public void displayErrorEncountered(final InAppMessage inAppMessage, final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        for (final ErrorsExecutorAndListener errorsExecutorAndListener : this.registeredErrorListeners.values()) {
            errorsExecutorAndListener.withExecutor(CALLBACK_QUEUE_EXECUTOR).execute(new Runnable() { // from class: f.h.e.n.e.m
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperListenerManager.ErrorsExecutorAndListener errorsExecutorAndListener2 = DeveloperListenerManager.ErrorsExecutorAndListener.this;
                    InAppMessage inAppMessage2 = inAppMessage;
                    FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason2 = inAppMessagingErrorReason;
                    DeveloperListenerManager developerListenerManager = DeveloperListenerManager.instance;
                    errorsExecutorAndListener2.getListener().displayErrorEncountered(inAppMessage2, inAppMessagingErrorReason2);
                }
            });
        }
    }

    public void impressionDetected(final InAppMessage inAppMessage) {
        for (final ImpressionExecutorAndListener impressionExecutorAndListener : this.registeredImpressionListeners.values()) {
            impressionExecutorAndListener.withExecutor(CALLBACK_QUEUE_EXECUTOR).execute(new Runnable() { // from class: f.h.e.n.e.l
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperListenerManager.ImpressionExecutorAndListener impressionExecutorAndListener2 = DeveloperListenerManager.ImpressionExecutorAndListener.this;
                    InAppMessage inAppMessage2 = inAppMessage;
                    DeveloperListenerManager developerListenerManager = DeveloperListenerManager.instance;
                    impressionExecutorAndListener2.getListener().impressionDetected(inAppMessage2);
                }
            });
        }
    }

    public void messageClicked(final InAppMessage inAppMessage, final Action action) {
        for (final ClicksExecutorAndListener clicksExecutorAndListener : this.registeredClickListeners.values()) {
            clicksExecutorAndListener.withExecutor(CALLBACK_QUEUE_EXECUTOR).execute(new Runnable() { // from class: f.h.e.n.e.k
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperListenerManager.ClicksExecutorAndListener clicksExecutorAndListener2 = DeveloperListenerManager.ClicksExecutorAndListener.this;
                    InAppMessage inAppMessage2 = inAppMessage;
                    Action action2 = action;
                    DeveloperListenerManager developerListenerManager = DeveloperListenerManager.instance;
                    clicksExecutorAndListener2.getListener().messageClicked(inAppMessage2, action2);
                }
            });
        }
    }

    public void messageDismissed(final InAppMessage inAppMessage) {
        for (final DismissExecutorAndListener dismissExecutorAndListener : this.registeredDismissListeners.values()) {
            dismissExecutorAndListener.withExecutor(CALLBACK_QUEUE_EXECUTOR).execute(new Runnable() { // from class: f.h.e.n.e.j
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperListenerManager.DismissExecutorAndListener dismissExecutorAndListener2 = DeveloperListenerManager.DismissExecutorAndListener.this;
                    InAppMessage inAppMessage2 = inAppMessage;
                    DeveloperListenerManager developerListenerManager = DeveloperListenerManager.instance;
                    dismissExecutorAndListener2.getListener().messageDismissed(inAppMessage2);
                }
            });
        }
    }

    public void removeAllListeners() {
        this.registeredClickListeners.clear();
        this.registeredImpressionListeners.clear();
        this.registeredErrorListeners.clear();
    }

    public void removeClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener) {
        this.registeredClickListeners.remove(firebaseInAppMessagingClickListener);
    }

    public void removeDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener) {
        this.registeredErrorListeners.remove(firebaseInAppMessagingDisplayErrorListener);
    }

    public void removeImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener) {
        this.registeredImpressionListeners.remove(firebaseInAppMessagingImpressionListener);
    }

    public void addClickListener(FirebaseInAppMessagingClickListener firebaseInAppMessagingClickListener, Executor executor) {
        this.registeredClickListeners.put(firebaseInAppMessagingClickListener, new ClicksExecutorAndListener(firebaseInAppMessagingClickListener, executor));
    }

    public void addDismissListener(FirebaseInAppMessagingDismissListener firebaseInAppMessagingDismissListener, Executor executor) {
        this.registeredDismissListeners.put(firebaseInAppMessagingDismissListener, new DismissExecutorAndListener(firebaseInAppMessagingDismissListener, executor));
    }

    public void addDisplayErrorListener(FirebaseInAppMessagingDisplayErrorListener firebaseInAppMessagingDisplayErrorListener, Executor executor) {
        this.registeredErrorListeners.put(firebaseInAppMessagingDisplayErrorListener, new ErrorsExecutorAndListener(firebaseInAppMessagingDisplayErrorListener, executor));
    }

    public void addImpressionListener(FirebaseInAppMessagingImpressionListener firebaseInAppMessagingImpressionListener, Executor executor) {
        this.registeredImpressionListeners.put(firebaseInAppMessagingImpressionListener, new ImpressionExecutorAndListener(firebaseInAppMessagingImpressionListener, executor));
    }
}
