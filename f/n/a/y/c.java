package f.n.a.y;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;

/* compiled from: StoragePermissionUseCase.java */
/* loaded from: classes2.dex */
public class c implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f7523f;

    public c(d dVar) {
        this.f7523f = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -2) {
            Objects.requireNonNull(this.f7523f);
        } else if (i2 != -1) {
        } else {
            Objects.requireNonNull(this.f7523f);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f7523f.a.getPackageName(), null));
            this.f7523f.a.startActivityForResult(intent, 888);
        }
    }
}
