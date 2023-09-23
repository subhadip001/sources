package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class l implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7175f;

    public l(x xVar) {
        this.f7175f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (e eVar : this.f7175f.c()) {
            eVar.g();
        }
    }
}
