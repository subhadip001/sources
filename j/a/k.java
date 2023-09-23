package j.a;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class k extends d1 {

    /* renamed from: j  reason: collision with root package name */
    public final i<?> f8763j;

    public k(i<?> iVar) {
        this.f8763j = iVar;
    }

    @Override // i.l.a.l
    public /* bridge */ /* synthetic */ i.h b(Throwable th) {
        p(th);
        return i.h.a;
    }

    @Override // j.a.t
    public void p(Throwable th) {
        i<?> iVar = this.f8763j;
        Throwable r = iVar.r(q());
        if (!iVar.v() ? false : ((j.a.y1.e) iVar.f8757i).l(r)) {
            return;
        }
        iVar.n(r);
        iVar.p();
    }
}
