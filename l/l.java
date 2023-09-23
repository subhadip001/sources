package l;

import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.java */
/* loaded from: classes2.dex */
public class l extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f9238e;

    public l(z zVar) {
        if (zVar != null) {
            this.f9238e = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // l.z
    public z a() {
        return this.f9238e.a();
    }

    @Override // l.z
    public z b() {
        return this.f9238e.b();
    }

    @Override // l.z
    public long c() {
        return this.f9238e.c();
    }

    @Override // l.z
    public z d(long j2) {
        return this.f9238e.d(j2);
    }

    @Override // l.z
    public boolean e() {
        return this.f9238e.e();
    }

    @Override // l.z
    public void f() {
        this.f9238e.f();
    }

    @Override // l.z
    public z g(long j2, TimeUnit timeUnit) {
        return this.f9238e.g(j2, timeUnit);
    }
}
