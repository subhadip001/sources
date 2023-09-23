package f.n.a.c;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.inverseai.adhelper.util.AdType;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import j.a.a0;
import j.a.c0;
import j.a.l0;
import j.a.y1.n;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: RewardedAdLoader.kt */
/* loaded from: classes2.dex */
public final class i implements f.j.a.m.b {

    /* renamed from: k  reason: collision with root package name */
    public static i f6918k;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f6919f;

    /* renamed from: g  reason: collision with root package name */
    public final c0 f6920g;

    /* renamed from: h  reason: collision with root package name */
    public f.j.a.a f6921h;

    /* renamed from: i  reason: collision with root package name */
    public f.j.a.f f6922i;

    /* renamed from: j  reason: collision with root package name */
    public final HashSet<f.j.a.m.b> f6923j;

    public i(i.l.b.e eVar) {
        f.j.a.m.c cVar = f.j.a.m.c.a;
        a0 a0Var = f.j.a.m.c.b;
        this.f6919f = f.n.a.n.i.a(a0Var.plus(l0.b));
        this.f6920g = f.n.a.n.i.a(a0Var.plus(n.c));
        this.f6923j = new HashSet<>();
    }

    public final boolean a() {
        f.j.a.f fVar = this.f6922i;
        if (fVar == null) {
            return false;
        }
        return fVar.b();
    }

    public final void b(Context context) {
        i.l.b.i.e(context, "context");
        if (f.n.a.u.a.e().b()) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig == null ? true : firebaseRemoteConfig.getBoolean("can_load_rewarded_ad")) {
                if (!e.a) {
                    e.a();
                } else if (e.e(context)) {
                    if (this.f6921h == null || this.f6922i == null) {
                        f.j.a.a aVar = new f.j.a.a(context, f.n.a.u.a.e().a());
                        this.f6921h = aVar;
                        i.l.b.i.b(aVar);
                        c0 c0Var = this.f6919f;
                        c0 c0Var2 = this.f6920g;
                        i.l.b.i.e(c0Var, "ioScope");
                        i.l.b.i.e(c0Var2, "mainScope");
                        i.l.b.i.e(context, "context");
                        if (aVar.f6455e == null) {
                            aVar.f6455e = new f.j.a.l.e(c0Var, c0Var2, context);
                        }
                        f.j.a.l.e eVar = aVar.f6455e;
                        i.l.b.i.b(eVar);
                        this.f6922i = eVar;
                    }
                    f.j.a.f fVar = this.f6922i;
                    i.l.b.i.b(fVar);
                    fVar.d(this);
                    f.j.a.f fVar2 = this.f6922i;
                    i.l.b.i.b(fVar2);
                    i.l.b.i.e(context, "context");
                    String d2 = f.n.a.u.a.e().d(225);
                    i.l.b.i.d(d2, "getInstance().getId(RemoteKeys.ADMOB_REWARDED_ID)");
                    fVar2.c(context, d2);
                }
            }
        }
    }

    @Override // f.j.a.m.a
    public void c(AdType adType) {
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().c(adType);
        }
    }

    public final void d(Activity activity, f.j.a.m.b bVar) {
        i.l.b.i.e(activity, "activity");
        i.l.b.i.e(bVar, "callback");
        if (a()) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig == null ? true : firebaseRemoteConfig.getBoolean("can_show_rewarded_ad")) {
                f.j.a.f fVar = this.f6922i;
                i.l.b.i.b(fVar);
                fVar.a(activity);
                return;
            }
        }
        ((RewardedAdManager) bVar).f(activity, AdType.REWARDED_AD);
    }

    @Override // f.j.a.m.a
    public void f(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "message");
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().f(context, adType);
        }
    }

    @Override // f.j.a.m.a
    public void g(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().g(context, adType);
        }
    }

    @Override // f.j.a.m.a
    public void h(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, "message");
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().h(context, adType);
        }
    }

    @Override // f.j.a.m.b
    public void i() {
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // f.j.a.m.a
    public void j(Context context, AdType adType) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        Iterator<f.j.a.m.b> it = this.f6923j.iterator();
        while (it.hasNext()) {
            it.next().j(context, adType);
        }
    }
}
