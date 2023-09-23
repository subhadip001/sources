package f.n.a.y;

import android.content.DialogInterface;
import androidx.core.app.ActivityCompat;
import java.util.Objects;

/* compiled from: StoragePermissionUseCase.java */
/* loaded from: classes2.dex */
public class a implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f7521f;

    public a(d dVar) {
        this.f7521f = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -2) {
            Objects.requireNonNull(this.f7521f);
        } else if (i2 != -1) {
        } else {
            ActivityCompat.requestPermissions(this.f7521f.a, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
        }
    }
}
