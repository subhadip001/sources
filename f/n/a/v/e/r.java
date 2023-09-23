package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class r implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7177f;

    public r(x xVar) {
        this.f7177f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7177f.t.getVisibility() == 0) {
            this.f7177f.t.setVisibility(8);
            this.f7177f.q.setRotation(0.0f);
        } else {
            this.f7177f.q.setRotation(90.0f);
            this.f7177f.t.setVisibility(0);
        }
        x xVar = this.f7177f;
        x.d(xVar, xVar.t);
    }
}
