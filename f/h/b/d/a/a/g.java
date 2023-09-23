package f.h.b.d.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class g implements b {
    public final o a;
    public final Context b;

    public g(o oVar, e eVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = oVar;
        this.b = context;
    }

    @Override // f.h.b.d.a.a.b
    public final f.h.b.d.a.i.p<a> a() {
        o oVar = this.a;
        String packageName = this.b.getPackageName();
        if (oVar.a == null) {
            o.f5555e.b("onError(%d)", -9);
            return f.h.b.c.a.h1(new InstallException(-9));
        }
        o.f5555e.d("requestUpdateInfo(%s)", packageName);
        f.h.b.d.a.i.m mVar = new f.h.b.d.a.i.m();
        oVar.a.b(new m(oVar, mVar, packageName, mVar), mVar);
        return mVar.a;
    }

    @Override // f.h.b.d.a.a.b
    public final boolean b(a aVar, int i2, Activity activity, int i3) {
        byte b = (byte) (((byte) 1) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((b & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        s sVar = new s(i2, false);
        if (activity == null) {
            return false;
        }
        if (!(aVar.a(sVar) != null) || aVar.f5543h) {
            return false;
        }
        aVar.f5543h = true;
        activity.startIntentSenderForResult(aVar.a(sVar).getIntentSender(), i3, null, 0, 0, 0, null);
        return true;
    }
}
