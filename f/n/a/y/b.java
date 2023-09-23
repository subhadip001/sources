package f.n.a.y;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertController;
import com.video_converter.video_compressor.R;
import e.b.c.h;
import f.n.a.v.a.l;
import java.util.Objects;

/* compiled from: StoragePermissionUseCase.java */
/* loaded from: classes2.dex */
public class b implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f7522f;

    public b(d dVar) {
        this.f7522f = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -2) {
            Objects.requireNonNull(this.f7522f);
        } else if (i2 != -1) {
        } else {
            d dVar = this.f7522f;
            Activity activity = dVar.a;
            c cVar = new c(dVar);
            h.a aVar = new h.a(activity, R.style.MyDialogTheme);
            AlertController.b bVar = aVar.a;
            bVar.f100e = bVar.a.getText(R.string.required_permission);
            AlertController.b bVar2 = aVar.a;
            bVar2.f102g = bVar2.a.getText(R.string.permission_instruction_steps);
            aVar.a.f107l = false;
            aVar.setPositiveButton(R.string.open_settings, new l(cVar));
            aVar.create().show();
        }
    }
}
