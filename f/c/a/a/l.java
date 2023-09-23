package f.c.a.a;

import android.view.View;

/* compiled from: SaleBannerFragment.kt */
/* loaded from: classes.dex */
public final class l extends i.l.b.j implements i.l.a.a<i.h> {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f3119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(0);
        this.f3119g = mVar;
    }

    @Override // i.l.a.a
    public i.h c() {
        m mVar = this.f3119g;
        j jVar = mVar.f3123h;
        if (jVar != null) {
            h hVar = mVar.f3122g;
            if (hVar != null) {
                jVar.c(hVar);
            } else {
                i.l.b.i.h("payload");
                throw null;
            }
        }
        View i2 = this.f3119g.i();
        if (i2 != null) {
            i2.setVisibility(8);
        }
        ((g) this.f3119g.f3126k.getValue()).a().removeCallbacksAndMessages(null);
        return i.h.a;
    }
}
