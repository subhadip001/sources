package f.h.b.d.a.e;

import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: f  reason: collision with root package name */
    public final s f5810f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5811g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5812h;

    public t(s sVar, long j2, long j3) {
        this.f5810f = sVar;
        long g2 = g(j2);
        this.f5811g = g2;
        this.f5812h = g(g2 + j3);
    }

    @Override // f.h.b.d.a.e.s
    public final long a() {
        return this.f5812h - this.f5811g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // f.h.b.d.a.e.s
    public final InputStream f(long j2, long j3) {
        long g2 = g(this.f5811g);
        return this.f5810f.f(g2, g(j3 + g2) - g2);
    }

    public final long g(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.f5810f.a() ? this.f5810f.a() : j2;
    }
}
