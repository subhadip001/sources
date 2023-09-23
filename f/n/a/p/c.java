package f.n.a.p;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import f.n.a.v.a.j;

/* compiled from: PermissionModule.java */
/* loaded from: classes2.dex */
public abstract class c extends f.n.a.v.c.e.a {
    public SharedPreferences w;
    public boolean x = false;

    /* compiled from: PermissionModule.java */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == -2) {
                c.this.R();
            } else if (i2 != -1) {
            } else {
                ActivityCompat.requestPermissions(c.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
            }
        }
    }

    public abstract void Q();

    public abstract void R();

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 888 && e.i.c.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Q();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f44k.a();
    }

    @Override // f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = getSharedPreferences("permissionStatus", 0);
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (this.x && e.i.c.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Q();
        }
    }

    @Override // e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 777) {
            if (iArr.length > 0 && iArr[0] == 0) {
                Q();
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                j.r(this, new a());
            } else {
                R();
                Toast.makeText(getBaseContext(), "Unable to get Permission", 1).show();
            }
        }
    }
}
