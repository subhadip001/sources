package f.h.b.d.a.i;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f5825f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f5826g;

    public g(h hVar, p pVar) {
        this.f5826g = hVar;
        this.f5825f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        synchronized (this.f5826g.b) {
            b bVar = this.f5826g.c;
            if (bVar != null) {
                p pVar = this.f5825f;
                synchronized (pVar.a) {
                    exc = pVar.f5831e;
                }
                bVar.onFailure(exc);
            }
        }
    }
}
