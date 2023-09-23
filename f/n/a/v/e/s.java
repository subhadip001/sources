package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class s implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7178f;

    public s(x xVar) {
        this.f7178f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7178f.u.getVisibility() == 0) {
            this.f7178f.u.setVisibility(8);
            this.f7178f.r.setRotation(0.0f);
        } else {
            this.f7178f.r.setRotation(90.0f);
            this.f7178f.u.setVisibility(0);
        }
        x xVar = this.f7178f;
        x.d(xVar, xVar.u);
    }
}
