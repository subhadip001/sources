package e.b.h;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class i0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j0 f1791f;

    public i0(j0 j0Var) {
        this.f1791f = j0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        f0 f0Var;
        if (i2 == -1 || (f0Var = this.f1791f.f1799h) == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
