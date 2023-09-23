package f.h.b.c.h;

import android.app.Dialog;
import android.os.Bundle;
import e.b.c.t;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes.dex */
public class e extends t {
    @Override // e.p.c.k
    public void dismiss() {
        i(false);
        super.dismiss();
    }

    @Override // e.p.c.k
    public void dismissAllowingStateLoss() {
        i(true);
        super.dismissAllowingStateLoss();
    }

    public final boolean i(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof d) {
            d dVar = (d) dialog;
            if (dVar.f5268h == null) {
                dVar.d();
            }
            boolean z2 = dVar.f5268h.G;
            return false;
        }
        return false;
    }

    @Override // e.b.c.t, e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        return new d(getContext(), getTheme());
    }
}
