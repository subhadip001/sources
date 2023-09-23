package f.h.b.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import f.h.b.d.a.e.b0;
import f.h.b.d.a.e.c0;
import f.h.b.d.a.e.d0;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5555e = new f.h.b.d.a.e.f("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f5556f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public f.h.b.d.a.e.q a;
    public final String b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final q f5557d;

    public o(Context context, q qVar) {
        this.b = context.getPackageName();
        this.c = context;
        this.f5557d = qVar;
        if (f.h.b.d.a.e.r.b(context)) {
            Context applicationContext = context.getApplicationContext();
            this.a = new f.h.b.d.a.e.q(applicationContext != null ? applicationContext : context, f5555e, "AppUpdateService", f5556f, new f.h.b.d.a.e.m() { // from class: f.h.b.d.a.a.l
                @Override // f.h.b.d.a.e.m
                public final Object a(IBinder iBinder) {
                    int i2 = c0.f5790f;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
                    return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new b0(iBinder);
                }
            }, null);
        }
    }

    public static Bundle a(o oVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(f.h.b.d.a.c.a.a("app_update"));
        bundle2.putInt("playcore.version.code", 11003);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(oVar.c.getPackageManager().getPackageInfo(oVar.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f5555e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
