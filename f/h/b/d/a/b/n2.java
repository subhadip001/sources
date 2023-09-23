package f.h.b.d.a.b;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class n2 {
    public static final f.h.b.d.a.e.f c = new f.h.b.d.a.e.f("PackageStateCache");
    public final Context a;
    public int b = -1;

    public n2(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        if (this.b == -1) {
            try {
                this.b = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.b;
    }
}
