package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class t implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7179f;

    public t(x xVar) {
        this.f7179f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7179f.v.getVisibility() == 0) {
            this.f7179f.v.setVisibility(8);
            this.f7179f.s.setRotation(0.0f);
        } else {
            this.f7179f.s.setRotation(90.0f);
            this.f7179f.v.setVisibility(0);
        }
        x xVar = this.f7179f;
        x.d(xVar, xVar.v);
    }
}
