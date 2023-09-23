package e.b.c;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class t extends e.p.c.k {
    @Override // e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        return new s(getContext(), getTheme());
    }

    @Override // e.p.c.k
    public void setupDialog(Dialog dialog, int i2) {
        if (dialog instanceof s) {
            s sVar = (s) dialog;
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            sVar.c(1);
            return;
        }
        super.setupDialog(dialog, i2);
    }
}
