package f.n.a.y;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: StoragePermissionUseCase.java */
/* loaded from: classes2.dex */
public class d {
    public final Activity a;
    public SharedPreferences b;

    public d(Activity activity) {
        this.a = activity;
        this.b = activity.getSharedPreferences("permissionStatus", 0);
    }
}
