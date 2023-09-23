package f.n.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.inverseai.adhelper.util.AdType;
import e.b.c.k;
import j.a.a0;
import j.a.c0;
import j.a.l0;
import j.a.y1.n;
import java.util.Objects;
import org.inverseai.cross_promo.activity.InterstitialAdActivity;
import org.inverseai.cross_promo.helpers.CrossPromoType;

/* compiled from: FullScreenAdLoader.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: h  reason: collision with root package name */
    public static h f6913h;
    public d a;
    public final c0 b;
    public final c0 c;

    /* renamed from: d  reason: collision with root package name */
    public f.j.a.a f6914d;

    /* renamed from: e  reason: collision with root package name */
    public f.j.a.c f6915e;

    /* renamed from: f  reason: collision with root package name */
    public final i.c f6916f;

    /* renamed from: g  reason: collision with root package name */
    public final f.j.a.m.a f6917g;

    public h(i.l.b.e eVar) {
        f.j.a.m.c cVar = f.j.a.m.c.a;
        a0 a0Var = f.j.a.m.c.b;
        this.b = f.n.a.n.i.a(a0Var.plus(l0.b));
        this.c = f.n.a.n.i.a(a0Var.plus(n.c));
        this.f6916f = f.n.a.n.i.E(g.f6912g);
        this.f6917g = new f(this);
    }

    public final void a(Activity activity) {
        boolean z;
        i.l.b.i.e(activity, "activity");
        e.g(activity, AdType.INTERSTITIAL_AD);
        Objects.requireNonNull((m.b.a.b) this.f6916f.getValue());
        i.l.b.i.e(activity, "activity");
        if ((activity instanceof k) && m.b.a.j.f.c(activity)) {
            activity.startActivityForResult(new Intent(activity, InterstitialAdActivity.class), 911);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d dVar = this.a;
            if (dVar == null) {
                return;
            }
            dVar.c(CrossPromoType.CROSS_INTERSTITIAL_AD);
            return;
        }
        d dVar2 = this.a;
        if (dVar2 == null) {
            return;
        }
        dVar2.b(CrossPromoType.CROSS_INTERSTITIAL_AD);
    }

    public final void b(Context context) {
        i.l.b.i.e(context, "context");
        if (f.n.a.u.a.e().b()) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig == null ? true : firebaseRemoteConfig.getBoolean("can_load_interstitial_ad")) {
                if (!e.a) {
                    e.a();
                } else if (e.e(context)) {
                    if (this.f6914d == null || this.f6915e == null) {
                        f.j.a.a aVar = new f.j.a.a(context, f.n.a.u.a.e().a());
                        this.f6914d = aVar;
                        i.l.b.i.b(aVar);
                        c0 c0Var = this.b;
                        c0 c0Var2 = this.c;
                        i.l.b.i.e(c0Var, "ioScope");
                        i.l.b.i.e(c0Var2, "mainScope");
                        i.l.b.i.e(context, "context");
                        if (aVar.f6454d == null) {
                            aVar.f6454d = new f.j.a.h.d(c0Var, c0Var2, context);
                        }
                        f.j.a.h.d dVar = aVar.f6454d;
                        i.l.b.i.b(dVar);
                        this.f6915e = dVar;
                    }
                    this.a = null;
                    f.j.a.c cVar = this.f6915e;
                    i.l.b.i.b(cVar);
                    cVar.b(this.f6917g);
                    f.j.a.c cVar2 = this.f6915e;
                    i.l.b.i.b(cVar2);
                    i.l.b.i.e(context, "context");
                    String d2 = f.n.a.u.a.e().d(224);
                    i.l.b.i.d(d2, "getInstance()\n          …ys.ADMOB_INTERSTITIAL_ID)");
                    cVar2.c(context, d2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if ((r0 != null ? r0.getBoolean("can_show_cross_interstitial_ad") : true) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.app.Activity r5, f.n.a.c.d r6) {
        /*
            r4 = this;
            java.lang.String r6 = "activity"
            i.l.b.i.e(r5, r6)
            r6 = 0
            r4.a = r6
            f.n.a.u.a r0 = f.n.a.u.a.e()
            boolean r0 = r0.b()
            if (r0 != 0) goto L13
            return
        L13:
            f.n.a.u.a r0 = f.n.a.u.a.e()
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r0.a
            java.lang.String r1 = "can_show_interstitial_ad_for_long_process"
            r2 = 1
            if (r0 != 0) goto L20
            r0 = 1
            goto L24
        L20:
            boolean r0 = r0.getBoolean(r1)
        L24:
            java.lang.String r3 = "can_show_cross_interstitial_ad"
            if (r0 != 0) goto L39
            f.n.a.u.a r0 = f.n.a.u.a.e()
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r0.a
            if (r0 != 0) goto L32
            r0 = 1
            goto L36
        L32:
            boolean r0 = r0.getBoolean(r3)
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            f.n.a.u.a r0 = f.n.a.u.a.e()
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r0.a
            if (r0 != 0) goto L43
            r0 = 1
            goto L47
        L43:
            boolean r0 = r0.getBoolean(r1)
        L47:
            if (r0 != 0) goto L58
            f.n.a.u.a r0 = f.n.a.u.a.e()
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = r0.a
            if (r0 != 0) goto L52
            goto L56
        L52:
            boolean r2 = r0.getBoolean(r3)
        L56:
            if (r2 != 0) goto L7b
        L58:
            boolean r0 = f.n.a.c.e.a
            if (r0 == 0) goto L7b
            boolean r0 = f.n.a.c.e.e(r5)
            if (r0 == 0) goto L7b
            com.inverseai.adhelper.util.AdType r0 = com.inverseai.adhelper.util.AdType.INTERSTITIAL_AD
            boolean r0 = f.n.a.c.e.b(r5, r0)
            if (r0 == 0) goto L6b
            goto L7b
        L6b:
            f.j.a.c r0 = r4.f6915e
            if (r0 != 0) goto L70
            goto L75
        L70:
            r0.a(r5)
            i.h r6 = i.h.a
        L75:
            if (r6 != 0) goto L7a
            r4.b(r5)
        L7a:
            return
        L7b:
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.c.h.c(android.app.Activity, f.n.a.c.d):void");
    }
}
