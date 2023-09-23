package f.h.b.d.a.i;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f5823f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f5824g;

    public e(f fVar, p pVar) {
        this.f5824g = fVar;
        this.f5823f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5824g.b) {
            a aVar = this.f5824g.c;
            if (aVar != null) {
                aVar.a(this.f5823f);
            }
        }
    }
}
