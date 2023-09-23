package m.a.a;

/* compiled from: AsyncPoster.java */
/* loaded from: classes2.dex */
public class a implements Runnable, k {

    /* renamed from: f  reason: collision with root package name */
    public final j f9267f = new j();

    /* renamed from: g  reason: collision with root package name */
    public final c f9268g;

    public a(c cVar) {
        this.f9268g = cVar;
    }

    @Override // m.a.a.k
    public void a(p pVar, Object obj) {
        this.f9267f.a(i.a(pVar, obj));
        this.f9268g.f9278j.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b = this.f9267f.b();
        if (b != null) {
            this.f9268g.c(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
