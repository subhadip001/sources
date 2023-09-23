package f.h.b.d.a.b;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: h  reason: collision with root package name */
    public final int f5671h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5672i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5673j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ r f5674k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, f.h.b.d.a.i.m mVar, int i2, String str, int i3) {
        super(rVar, mVar);
        this.f5674k = rVar;
        this.f5671h = i2;
        this.f5672i = str;
        this.f5673j = i3;
    }

    @Override // f.h.b.d.a.b.j, f.h.b.d.a.e.k0
    public final void zzd(Bundle bundle) {
        this.f5674k.f5688d.c(this.f5644f);
        r.f5686g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.f5673j;
        if (i2 > 0) {
            this.f5674k.h(this.f5671h, this.f5672i, i2 - 1);
        }
    }
}
