package f.n.a.p;

import android.content.DialogInterface;
import androidx.core.app.ActivityCompat;

/* compiled from: PermissionModule.java */
/* loaded from: classes2.dex */
public class a implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f7063f;

    public a(c cVar) {
        this.f7063f = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -2) {
            this.f7063f.R();
        } else if (i2 != -1) {
        } else {
            ActivityCompat.requestPermissions(this.f7063f, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
        }
    }
}
