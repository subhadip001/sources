package f.n.a.v.e;

import android.view.View;
import android.widget.CheckBox;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class h implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7171f;

    public h(x xVar) {
        this.f7171f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CheckBox checkBox = this.f7171f.I;
        checkBox.setChecked(!checkBox.isChecked());
        if (this.f7171f.I.isChecked()) {
            this.f7171f.B.setEnabled(false);
            if (this.f7171f.t.getVisibility() == 0) {
                this.f7171f.t.setVisibility(8);
                this.f7171f.q.setRotation(0.0f);
                return;
            }
            return;
        }
        this.f7171f.B.setEnabled(true);
    }
}
