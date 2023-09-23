package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class i implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7172f;

    public i(x xVar) {
        this.f7172f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7172f.I.isChecked()) {
            this.f7172f.B.setEnabled(false);
            if (this.f7172f.t.getVisibility() == 0) {
                this.f7172f.t.setVisibility(8);
                this.f7172f.q.setRotation(0.0f);
                return;
            }
            return;
        }
        this.f7172f.B.setEnabled(true);
    }
}
