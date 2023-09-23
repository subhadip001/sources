package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class j implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7173f;

    public j(x xVar) {
        this.f7173f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (e eVar : this.f7173f.c()) {
            eVar.a();
        }
    }
}
