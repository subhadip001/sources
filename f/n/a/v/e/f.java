package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class f implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7169f;

    public f(x xVar) {
        this.f7169f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7169f.H.isChecked()) {
            this.f7169f.f7183i.setEnabled(true);
            this.f7169f.H.setChecked(false);
            return;
        }
        this.f7169f.H.setChecked(true);
        this.f7169f.f7183i.setEnabled(false);
    }
}
