package com.google.firebase.inappmessaging.internal;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.internal.Logging;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.RateLimit;
import f.h.g.a.a.a.d.a;
import g.c.a;
import g.c.h;
import g.c.o;
import g.c.v.d;
import g.c.w.e.a.c;
import g.c.w.e.a.e;
import g.c.w.e.c.b;
import g.c.w.e.c.i;
import g.c.w.e.c.p;
import g.c.w.e.c.r;
import g.c.w.e.c.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class DisplayCallbacksImpl implements FirebaseInAppMessagingDisplayCallbacks {
    private static final String MESSAGE_CLICK = "message click to metrics logger";
    private final RateLimit appForegroundRateLimit;
    private final CampaignCacheClient campaignCacheClient;
    private final Clock clock;
    private final DataCollectionHelper dataCollectionHelper;
    private final ImpressionStorageClient impressionStorageClient;
    private final InAppMessage inAppMessage;
    private final MetricsLoggerClient metricsLoggerClient;
    private final RateLimiterClient rateLimiterClient;
    private final Schedulers schedulers;
    private final String triggeringEvent;
    private boolean wasImpressed = false;

    @VisibleForTesting
    public DisplayCallbacksImpl(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, CampaignCacheClient campaignCacheClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper, InAppMessage inAppMessage, String str) {
        this.impressionStorageClient = impressionStorageClient;
        this.clock = clock;
        this.schedulers = schedulers;
        this.rateLimiterClient = rateLimiterClient;
        this.campaignCacheClient = campaignCacheClient;
        this.appForegroundRateLimit = rateLimit;
        this.metricsLoggerClient = metricsLoggerClient;
        this.dataCollectionHelper = dataCollectionHelper;
        this.inAppMessage = inAppMessage;
        this.triggeringEvent = str;
    }

    private boolean actionMatches(Action action, Action action2) {
        if (action == null) {
            return action2 == null || TextUtils.isEmpty(action2.getActionUrl());
        }
        return action.getActionUrl().equals(action2.getActionUrl());
    }

    private void logActionNotTaken(String str, h<String> hVar) {
        if (hVar != null) {
            Logging.logd(String.format("Not recording: %s. Reason: %s", str, hVar));
        } else if (this.inAppMessage.getCampaignMetadata().getIsTestMessage()) {
            Logging.logd(String.format("Not recording: %s. Reason: Message is test message", str));
        } else if (!this.dataCollectionHelper.isAutomaticDataCollectionEnabled()) {
            Logging.logd(String.format("Not recording: %s. Reason: Data collection is disabled", str));
        } else {
            Logging.logd(String.format("Not recording: %s", str));
        }
    }

    private Task<Void> logImpressionIfNeeded(a aVar) {
        if (!this.wasImpressed) {
            impressionDetected();
        }
        return maybeToTask(aVar.i(), this.schedulers.io());
    }

    private Task<Void> logMessageClick(final Action action) {
        Logging.logd("Attempting to record: message click to metrics logger");
        return logImpressionIfNeeded(new c(new g.c.v.a() { // from class: f.h.e.n.e.w
            @Override // g.c.v.a
            public final void run() {
                DisplayCallbacksImpl.this.c(action);
            }
        }));
    }

    private a logToImpressionStore() {
        String campaignId = this.inAppMessage.getCampaignMetadata().getCampaignId();
        Logging.logd("Attempting to record message impression in impression store for id: " + campaignId);
        ImpressionStorageClient impressionStorageClient = this.impressionStorageClient;
        a.b d2 = f.h.g.a.a.a.d.a.d();
        long now = this.clock.now();
        d2.copyOnWrite();
        f.h.g.a.a.a.d.a.c((f.h.g.a.a.a.d.a) d2.instance, now);
        d2.copyOnWrite();
        f.h.g.a.a.a.d.a.b((f.h.g.a.a.a.d.a) d2.instance, campaignId);
        g.c.a d3 = impressionStorageClient.storeImpression(d2.build()).e(new g.c.v.c() { // from class: f.h.e.n.e.o
            @Override // g.c.v.c
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                Logging.loge("Impression store write failure");
            }
        }).d(new g.c.v.a() { // from class: f.h.e.n.e.x
            @Override // g.c.v.a
            public final void run() {
                Logging.logd("Impression store write success");
            }
        });
        return InAppMessageStreamManager.isAppForegroundEvent(this.triggeringEvent) ? new e(this.rateLimiterClient.increment(this.appForegroundRateLimit).e(new g.c.v.c() { // from class: f.h.e.n.e.q
            @Override // g.c.v.c
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                Logging.loge("Rate limiter client write failure");
            }
        }).d(new g.c.v.a() { // from class: f.h.e.n.e.t
            @Override // g.c.v.a
            public final void run() {
                Logging.logd("Rate limiter client write success");
            }
        }), g.c.w.b.a.f8143f).c(d3) : d3;
    }

    private static <T> Task<T> maybeToTask(h<T> hVar, o oVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        p pVar = new p(hVar.e(new g.c.v.c() { // from class: f.h.e.n.e.h2
            @Override // g.c.v.c
            public final void accept(Object obj) {
                TaskCompletionSource.this.setResult(obj);
            }
        }).m(new i(new Callable() { // from class: f.h.e.n.e.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TaskCompletionSource.this.setResult(null);
                return null;
            }
        })), new d() { // from class: f.h.e.n.e.p
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                Throwable th = (Throwable) obj;
                if (th instanceof Exception) {
                    taskCompletionSource2.setException((Exception) th);
                } else {
                    taskCompletionSource2.setException(new RuntimeException(th));
                }
                return g.c.w.e.c.d.f8342f;
            }
        }, true);
        Objects.requireNonNull(oVar, "scheduler is null");
        b bVar = new b(g.c.w.b.a.f8141d, g.c.w.b.a.f8142e, g.c.w.b.a.c);
        try {
            r rVar = new r(bVar);
            DisposableHelper.setOnce(bVar, rVar);
            g.c.w.a.c cVar = rVar.f8389f;
            g.c.t.b b = oVar.b(new s(rVar, pVar));
            Objects.requireNonNull(cVar);
            DisposableHelper.replace(cVar, b);
            return taskCompletionSource.getTask();
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    private boolean shouldLog() {
        return this.dataCollectionHelper.isAutomaticDataCollectionEnabled();
    }

    private g.c.a updateWasImpressed() {
        return new c(new g.c.v.a() { // from class: f.h.e.n.e.r
            @Override // g.c.v.a
            public final void run() {
                DisplayCallbacksImpl.this.e();
            }
        });
    }

    public /* synthetic */ void a(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        this.metricsLoggerClient.logRenderError(this.inAppMessage, inAppMessagingErrorReason);
    }

    public /* synthetic */ void b() {
        this.metricsLoggerClient.logImpression(this.inAppMessage);
    }

    public /* synthetic */ void c(Action action) {
        this.metricsLoggerClient.logMessageClick(this.inAppMessage, action);
    }

    public /* synthetic */ void d(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        this.metricsLoggerClient.logDismiss(this.inAppMessage, inAppMessagingDismissType);
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> displayErrorEncountered(final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        if (shouldLog()) {
            Logging.logd("Attempting to record: render error to metrics logger");
            return maybeToTask(logToImpressionStore().c(new c(new g.c.v.a() { // from class: f.h.e.n.e.s
                @Override // g.c.v.a
                public final void run() {
                    DisplayCallbacksImpl.this.a(inAppMessagingErrorReason);
                }
            })).c(updateWasImpressed()).i(), this.schedulers.io());
        }
        logActionNotTaken("render error to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    public /* synthetic */ void e() {
        this.wasImpressed = true;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> impressionDetected() {
        if (shouldLog() && !this.wasImpressed) {
            Logging.logd("Attempting to record: message impression to metrics logger");
            return maybeToTask(logToImpressionStore().c(new c(new g.c.v.a() { // from class: f.h.e.n.e.u
                @Override // g.c.v.a
                public final void run() {
                    DisplayCallbacksImpl.this.b();
                }
            })).c(updateWasImpressed()).i(), this.schedulers.io());
        }
        logActionNotTaken("message impression to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    @Deprecated
    public Task<Void> messageClicked() {
        return messageClicked(this.inAppMessage.getAction());
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> messageDismissed(final FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        if (shouldLog()) {
            Logging.logd("Attempting to record: message dismissal to metrics logger");
            return logImpressionIfNeeded(new c(new g.c.v.a() { // from class: f.h.e.n.e.v
                @Override // g.c.v.a
                public final void run() {
                    DisplayCallbacksImpl.this.d(inAppMessagingDismissType);
                }
            }));
        }
        logActionNotTaken("message dismissal to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    @VisibleForTesting
    public boolean wasImpressed() {
        return this.wasImpressed;
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks
    public Task<Void> messageClicked(Action action) {
        if (shouldLog()) {
            if (action.getActionUrl() == null) {
                return messageDismissed(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK);
            }
            return logMessageClick(action);
        }
        logActionNotTaken(MESSAGE_CLICK);
        return new TaskCompletionSource().getTask();
    }

    private void logActionNotTaken(String str) {
        logActionNotTaken(str, null);
    }
}
