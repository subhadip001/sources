package g.c.w.i;

import f.n.a.n.i;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SubscriptionArbiter.java */
/* loaded from: classes2.dex */
public class e extends AtomicInteger implements m.c.c {

    /* renamed from: f  reason: collision with root package name */
    public m.c.c f8576f;

    /* renamed from: g  reason: collision with root package name */
    public long f8577g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<m.c.c> f8578h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f8579i = new AtomicLong();

    /* renamed from: j  reason: collision with root package name */
    public final AtomicLong f8580j = new AtomicLong();

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f8581k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8582l;

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    public final void c() {
        int i2 = 1;
        m.c.c cVar = null;
        long j2 = 0;
        do {
            m.c.c cVar2 = this.f8578h.get();
            if (cVar2 != null) {
                cVar2 = this.f8578h.getAndSet(null);
            }
            long j3 = this.f8579i.get();
            if (j3 != 0) {
                j3 = this.f8579i.getAndSet(0L);
            }
            long j4 = this.f8580j.get();
            if (j4 != 0) {
                j4 = this.f8580j.getAndSet(0L);
            }
            m.c.c cVar3 = this.f8576f;
            if (this.f8581k) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f8576f = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j5 = this.f8577g;
                if (j5 != Long.MAX_VALUE) {
                    j5 = i.c(j5, j3);
                    if (j5 != Long.MAX_VALUE) {
                        j5 -= j4;
                        if (j5 < 0) {
                            SubscriptionHelper.reportMoreProduced(j5);
                            j5 = 0;
                        }
                    }
                    this.f8577g = j5;
                }
                if (cVar2 != null) {
                    if (cVar3 != null) {
                        cVar3.cancel();
                    }
                    this.f8576f = cVar2;
                    if (j5 != 0) {
                        j2 = i.c(j2, j5);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && j3 != 0) {
                    j2 = i.c(j2, j3);
                    cVar = cVar3;
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
        if (j2 != 0) {
            cVar.request(j2);
        }
    }

    @Override // m.c.c
    public void cancel() {
        if (this.f8581k) {
            return;
        }
        this.f8581k = true;
        b();
    }

    public final void d(long j2) {
        if (this.f8582l) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j3 = this.f8577g;
            if (j3 != Long.MAX_VALUE) {
                long j4 = j3 - j2;
                if (j4 < 0) {
                    SubscriptionHelper.reportMoreProduced(j4);
                    j4 = 0;
                }
                this.f8577g = j4;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            c();
            return;
        }
        i.b(this.f8580j, j2);
        b();
    }

    public final void e(m.c.c cVar) {
        if (this.f8581k) {
            cVar.cancel();
            return;
        }
        Objects.requireNonNull(cVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            m.c.c cVar2 = this.f8576f;
            if (cVar2 != null) {
                cVar2.cancel();
            }
            this.f8576f = cVar;
            long j2 = this.f8577g;
            if (decrementAndGet() != 0) {
                c();
            }
            if (j2 != 0) {
                cVar.request(j2);
                return;
            }
            return;
        }
        m.c.c andSet = this.f8578h.getAndSet(cVar);
        if (andSet != null) {
            andSet.cancel();
        }
        b();
    }

    @Override // m.c.c
    public final void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || this.f8582l) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j3 = this.f8577g;
            if (j3 != Long.MAX_VALUE) {
                long c = i.c(j3, j2);
                this.f8577g = c;
                if (c == Long.MAX_VALUE) {
                    this.f8582l = true;
                }
            }
            m.c.c cVar = this.f8576f;
            if (decrementAndGet() != 0) {
                c();
            }
            if (cVar != null) {
                cVar.request(j2);
                return;
            }
            return;
        }
        i.b(this.f8579i, j2);
        b();
    }
}
