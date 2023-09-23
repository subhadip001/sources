package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.RateLimitProto;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.RateLimit;
import com.google.firebase.inappmessaging.internal.time.Clock;
import f.n.a.n.i;
import g.c.h;
import g.c.l;
import g.c.p;
import g.c.v.a;
import g.c.v.c;
import g.c.v.e;
import g.c.w.e.c.d;
import g.c.w.e.c.m;
import g.c.w.e.d.j;
import g.c.w.e.d.k;
import g.c.w.e.d.n;
import java.util.Objects;

/* loaded from: classes2.dex */
public class RateLimiterClient {
    private static final RateLimitProto.RateLimit EMPTY_RATE_LIMITS = RateLimitProto.RateLimit.getDefaultInstance();
    private h<RateLimitProto.RateLimit> cachedRateLimts = d.f8342f;
    private final Clock clock;
    private final ProtoStorageClient storageClient;

    public RateLimiterClient(@RateLimit ProtoStorageClient protoStorageClient, Clock clock) {
        this.storageClient = protoStorageClient;
        this.clock = clock;
    }

    public static /* synthetic */ void a(RateLimiterClient rateLimiterClient, RateLimitProto.RateLimit rateLimit) {
        rateLimiterClient.e(rateLimit);
    }

    private void clearInMemCache() {
        this.cachedRateLimts = d.f8342f;
    }

    public static /* synthetic */ RateLimitProto.RateLimit d(RateLimitProto.RateLimit rateLimit, com.google.firebase.inappmessaging.model.RateLimit rateLimit2, RateLimitProto.Counter counter) {
        return RateLimitProto.RateLimit.newBuilder(rateLimit).putLimits(rateLimit2.limiterKey(), increment(counter)).build();
    }

    private h<RateLimitProto.RateLimit> getRateLimits() {
        return this.cachedRateLimts.m(this.storageClient.read(RateLimitProto.RateLimit.parser()).e(new c() { // from class: f.h.e.n.e.c2
            @Override // g.c.v.c
            public final void accept(Object obj) {
                RateLimiterClient.a(RateLimiterClient.this, (RateLimitProto.RateLimit) obj);
            }
        })).d(new c() { // from class: f.h.e.n.e.a2
            @Override // g.c.v.c
            public final void accept(Object obj) {
                RateLimiterClient.this.b((Throwable) obj);
            }
        });
    }

    private static RateLimitProto.Counter increment(RateLimitProto.Counter counter) {
        return RateLimitProto.Counter.newBuilder(counter).clearValue().setValue(counter.getValue() + 1).build();
    }

    /* renamed from: initInMemCache */
    public void e(RateLimitProto.RateLimit rateLimit) {
        Objects.requireNonNull(rateLimit, "item is null");
        this.cachedRateLimts = new m(rateLimit);
    }

    private boolean isLimitExpired(RateLimitProto.Counter counter, com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        return this.clock.now() - counter.getStartTimeEpoch() > rateLimit.timeToLiveMillis();
    }

    private RateLimitProto.Counter newCounter() {
        return RateLimitProto.Counter.newBuilder().setValue(0L).setStartTimeEpoch(this.clock.now()).build();
    }

    public /* synthetic */ void b(Throwable th) {
        clearInMemCache();
    }

    public /* synthetic */ boolean c(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.Counter counter) {
        return !isLimitExpired(counter, rateLimit);
    }

    public /* synthetic */ g.c.c f(final RateLimitProto.RateLimit rateLimit) {
        return this.storageClient.write(rateLimit).d(new a() { // from class: f.h.e.n.e.y1
            @Override // g.c.v.a
            public final void run() {
                RateLimiterClient.this.e(rateLimit);
            }
        });
    }

    public g.c.c g(final com.google.firebase.inappmessaging.model.RateLimit rateLimit, final RateLimitProto.RateLimit rateLimit2) {
        RateLimitProto.Counter limitsOrDefault = rateLimit2.getLimitsOrDefault(rateLimit.limiterKey(), newCounter());
        Objects.requireNonNull(limitsOrDefault, "The item is null");
        l K = i.K(new j(limitsOrDefault));
        e eVar = new e() { // from class: f.h.e.n.e.d2
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return RateLimiterClient.this.c(rateLimit, (RateLimitProto.Counter) obj);
            }
        };
        Objects.requireNonNull(K);
        l K2 = i.K(new g.c.w.e.d.e(K, eVar));
        RateLimitProto.Counter newCounter = newCounter();
        Objects.requireNonNull(newCounter, "The item is null");
        l K3 = i.K(new j(newCounter));
        Objects.requireNonNull(K2);
        Objects.requireNonNull(K3, "other is null");
        l K4 = i.K(new n(K2, K3));
        g.c.v.d dVar = new g.c.v.d() { // from class: f.h.e.n.e.x1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return RateLimiterClient.d(RateLimitProto.RateLimit.this, rateLimit, (RateLimitProto.Counter) obj);
            }
        };
        Objects.requireNonNull(K4);
        l K5 = i.K(new k(K4, dVar));
        g.c.v.d dVar2 = new g.c.v.d() { // from class: f.h.e.n.e.b2
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return RateLimiterClient.this.f((RateLimitProto.RateLimit) obj);
            }
        };
        Objects.requireNonNull(K5);
        return new g.c.w.e.d.h(K5, dVar2, false);
    }

    public /* synthetic */ RateLimitProto.Counter h(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.RateLimit rateLimit2) {
        return rateLimit2.getLimitsOrDefault(rateLimit.limiterKey(), newCounter());
    }

    public /* synthetic */ boolean i(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.Counter counter) {
        return isLimitExpired(counter, rateLimit) || counter.getValue() < rateLimit.limit();
    }

    public p<Boolean> isRateLimited(final com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        return new g.c.w.e.c.l(getRateLimits().m(h.i(RateLimitProto.RateLimit.getDefaultInstance())).j(new g.c.v.d() { // from class: f.h.e.n.e.z1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return RateLimiterClient.this.h(rateLimit, (RateLimitProto.RateLimit) obj);
            }
        }).f(new e() { // from class: f.h.e.n.e.w1
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return RateLimiterClient.this.i(rateLimit, (RateLimitProto.Counter) obj);
            }
        }));
    }

    public g.c.a increment(final com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        return getRateLimits().c(EMPTY_RATE_LIMITS).h(new g.c.v.d() { // from class: f.h.e.n.e.v1
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return RateLimiterClient.this.g(rateLimit, (RateLimitProto.RateLimit) obj);
            }
        });
    }
}
