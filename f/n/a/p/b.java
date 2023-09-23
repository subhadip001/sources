package f.n.a.p;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/* compiled from: PermissionModule.java */
/* loaded from: classes2.dex */
public class b implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f7064f;

    public b(c cVar) {
        this.f7064f = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -2) {
            this.f7064f.R();
        } else if (i2 != -1) {
        } else {
            this.f7064f.x = true;
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f7064f.getPackageName(), null));
            this.f7064f.startActivityForResult(intent, 888);
            Toast.makeText(this.f7064f.getBaseContext(), "Go to Permissions to Grant Storage", 1).show();
        }
    }
}
