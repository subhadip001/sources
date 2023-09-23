package f.f.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.util.Objects;

/* compiled from: CrossPromoFragment.java */
/* loaded from: classes.dex */
public class b implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f3606f;

    public b(e eVar) {
        this.f3606f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e eVar = this.f3606f;
        int i2 = e.f3609l;
        Objects.requireNonNull(eVar);
        new AlertDialog.Builder(eVar.getContext()).setTitle("Warning").setMessage("Are you sure you want to hide Recommended Apps?").setPositiveButton(17039379, new c(eVar)).setNegativeButton(17039369, (DialogInterface.OnClickListener) null).setIcon(17301543).show();
    }
}
