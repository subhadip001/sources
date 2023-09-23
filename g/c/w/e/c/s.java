package g.c.w.e.c;

/* compiled from: MaybeSubscribeOn.java */
/* loaded from: classes2.dex */
public final class s<T> implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final g.c.j<? super T> f8391f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c.k<T> f8392g;

    public s(g.c.j<? super T> jVar, g.c.k<T> kVar) {
        this.f8391f = jVar;
        this.f8392g = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8392g.a(this.f8391f);
    }
}
