package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class o1<T> extends f1 {

    /* renamed from: j  reason: collision with root package name */
    public final i<T> f8769j;

    /* JADX WARN: Multi-variable type inference failed */
    public o1(i<? super T> iVar) {
        this.f8769j = iVar;
    }

    @Override // i.l.a.l
    public /* bridge */ /* synthetic */ i.h b(Throwable th) {
        p(th);
        return i.h.a;
    }

    @Override // j.a.t
    public void p(Throwable th) {
        Object z = q().z();
        if (z instanceof r) {
            this.f8769j.h(f.n.a.n.i.p(((r) z).a));
        } else {
            this.f8769j.h(h1.a(z));
        }
    }
}
