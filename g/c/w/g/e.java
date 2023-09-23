package g.c.w.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* loaded from: classes2.dex */
public final class e extends AtomicLong implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public final String f8523f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8524g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8525h;

    /* compiled from: RxThreadFactory.java */
    /* loaded from: classes2.dex */
    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public e(String str) {
        this.f8523f = str;
        this.f8524g = 5;
        this.f8525h = false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f8523f + '-' + incrementAndGet();
        Thread aVar = this.f8525h ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f8524g);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return f.a.b.a.a.u(f.a.b.a.a.A("RxThreadFactory["), this.f8523f, "]");
    }

    public e(String str, int i2) {
        this.f8523f = str;
        this.f8524g = i2;
        this.f8525h = false;
    }

    public e(String str, int i2, boolean z) {
        this.f8523f = str;
        this.f8524g = i2;
        this.f8525h = z;
    }
}
