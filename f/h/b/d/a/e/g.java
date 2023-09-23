package f.h.b.d.a.e;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.d.a.i.m f5791f;

    public g() {
        this.f5791f = null;
    }

    public g(f.h.b.d.a.i.m mVar) {
        this.f5791f = mVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            f.h.b.d.a.i.m mVar = this.f5791f;
            if (mVar != null) {
                mVar.a(e2);
            }
        }
    }
}
