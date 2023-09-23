package f.c.a.a;

/* compiled from: SaleBannerFragment.kt */
/* loaded from: classes.dex */
public final class k extends i.l.b.j implements i.l.a.l<Integer, i.h> {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f3118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(1);
        this.f3118g = mVar;
    }

    @Override // i.l.a.l
    public i.h b(Integer num) {
        int intValue = num.intValue();
        m mVar = this.f3118g;
        j jVar = mVar.f3123h;
        if (jVar != null) {
            h hVar = mVar.f3122g;
            if (hVar != null) {
                jVar.d(hVar, intValue);
            } else {
                i.l.b.i.h("payload");
                throw null;
            }
        }
        return i.h.a;
    }
}
