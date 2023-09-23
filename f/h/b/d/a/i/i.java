package f.h.b.d.a.i;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f5827f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f5828g;

    public i(j jVar, p pVar) {
        this.f5828g = jVar;
        this.f5827f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5828g.b) {
            c cVar = this.f5828g.c;
            if (cVar != null) {
                cVar.onSuccess(this.f5827f.c());
            }
        }
    }
}
