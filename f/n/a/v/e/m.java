package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class m implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7176f;

    public m(x xVar) {
        this.f7176f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7176f.N.isChecked()) {
            this.f7176f.h(false);
        } else {
            this.f7176f.h(true);
        }
    }
}
