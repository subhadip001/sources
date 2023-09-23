package f.n.a.e;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import e.b.c.h;
import java.util.Objects;

/* compiled from: BgProcessEnableHandler.java */
/* loaded from: classes2.dex */
public class a {
    public final Activity a;
    public h b;

    /* compiled from: BgProcessEnableHandler.java */
    /* renamed from: f.n.a.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0171a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f6928f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f6929g;

        public View$OnClickListenerC0171a(c cVar, e eVar) {
            this.f6928f = cVar;
            this.f6929g = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = this.f6928f;
            if (cVar != null) {
                cVar.a(false);
            }
            e eVar = this.f6929g;
            if (eVar != null) {
                eVar.a();
                return;
            }
            h hVar = a.this.b;
            if (hVar != null && hVar.isShowing()) {
                a.this.b.dismiss();
            }
            a aVar = a.this;
            Activity activity = aVar.a;
            Objects.requireNonNull(aVar);
            PowerManager powerManager = (PowerManager) activity.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    powerManager.isIgnoringBatteryOptimizations(activity.getPackageName());
                    if (a.a()) {
                        aVar.a.startActivityForResult(new Intent("android.settings.SETTINGS"), 0);
                    } else {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                        activity.startActivity(intent);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* compiled from: BgProcessEnableHandler.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f6931f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f6932g;

        public b(c cVar, e eVar) {
            this.f6931f = cVar;
            this.f6932g = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = this.f6931f;
            if (cVar != null) {
                cVar.a(false);
            }
            h hVar = a.this.b;
            if (hVar != null) {
                hVar.dismiss();
            }
            e eVar = this.f6932g;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    /* compiled from: BgProcessEnableHandler.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(boolean z);

        void b();
    }

    public a(Activity activity) {
        this.a = activity;
    }

    public static boolean a() {
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (!lowerCase.contains("oppo")) {
                if (!lowerCase.contains("realme")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|(16:8|(14:13|14|15|16|17|(10:22|(8:27|28|29|(1:31)(1:41)|32|(1:34)|35|(2:37|38)(1:40))|43|28|29|(0)(0)|32|(0)|35|(0)(0))|44|28|29|(0)(0)|32|(0)|35|(0)(0))|47|14|15|16|17|(11:19|22|(9:24|27|28|29|(0)(0)|32|(0)|35|(0)(0))|43|28|29|(0)(0)|32|(0)|35|(0)(0))|44|28|29|(0)(0)|32|(0)|35|(0)(0))|48|14|15|16|17|(0)|44|28|29|(0)(0)|32|(0)|35|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0165, code lost:
        r7[0] = com.video_converter.video_compressor.R.drawable.samsung_battry_opt_guide_ss2;
        r7[1] = com.video_converter.video_compressor.R.drawable.samsung_battry_opt_guide_ss3;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012a A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:19:0x011e, B:21:0x012a, B:24:0x0131, B:26:0x0137, B:29:0x013e, B:30:0x0143, B:31:0x015a), top: B:46:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r21, f.n.a.e.e r22, f.n.a.e.a.c r23) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.e.a.b(android.content.Context, f.n.a.e.e, f.n.a.e.a$c):void");
    }
}
