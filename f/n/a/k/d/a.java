package f.n.a.k.d;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import e.p.c.n;
import f.c.a.a.h;
import f.c.a.a.o;
import f.n.a.l.b;
import f.n.a.z.c;

/* compiled from: SaleBannerDetailsDialog.java */
/* loaded from: classes2.dex */
public class a implements o.a {
    public final /* synthetic */ n a;
    public final /* synthetic */ String b;

    public a(n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    @Override // f.c.a.a.o.a
    public void a(h hVar) {
        try {
            c.a().b(this.a, this.b, hVar.f3111f);
            b.c().d(this.a).f(this.a, hVar.f3117l);
        } catch (Exception e2) {
            e2.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException(e2);
            FirebaseCrashlytics.getInstance().log("sale_buy_init_failed");
        }
    }

    @Override // f.c.a.a.o.a
    public void b(h hVar) {
    }
}
