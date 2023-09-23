package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class g implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7170f;

    public g(x xVar) {
        this.f7170f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7170f.H.isChecked()) {
            this.f7170f.f7183i.setEnabled(false);
        } else {
            this.f7170f.f7183i.setEnabled(true);
        }
    }
}
