package g.a.v0;

/* compiled from: ContextRunnable.java */
/* loaded from: classes2.dex */
public abstract class b0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final g.a.m f7601f;

    public b0(g.a.m mVar) {
        this.f7601f = mVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        g.a.m a = this.f7601f.a();
        try {
            a();
        } finally {
            this.f7601f.d(a);
        }
    }
}
