package f.n.a.k;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.p.c.k;

/* compiled from: DialogHelper.java */
/* loaded from: classes2.dex */
public class b {
    public final FragmentManager a;

    public b(FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            this.a = fragmentManager;
            return;
        }
        throw new IllegalArgumentException("FragmentManager mustn't be null");
    }

    public String a(k kVar) {
        if (kVar.getArguments() == null || !kVar.getArguments().containsKey("com.techyourchance.dialoghelper.ARGUMENT_DIALOG_ID")) {
            return null;
        }
        return kVar.getArguments().getString("com.techyourchance.dialoghelper.ARGUMENT_DIALOG_ID");
    }

    public void b(k kVar, String str) {
        Fragment I = this.a.I("com.techyourchance.dialoghelper.DIALOG_TAG");
        k kVar2 = (I == null || !k.class.isAssignableFrom(I.getClass())) ? null : (k) I;
        if (kVar2 != null) {
            kVar2.dismissAllowingStateLoss();
        }
        Bundle arguments = kVar.getArguments() != null ? kVar.getArguments() : new Bundle(1);
        arguments.putString("com.techyourchance.dialoghelper.ARGUMENT_DIALOG_ID", str);
        kVar.setArguments(arguments);
        e.p.c.a aVar = new e.p.c.a(this.a);
        aVar.g(0, kVar, "com.techyourchance.dialoghelper.DIALOG_TAG", 1);
        aVar.e();
    }
}
