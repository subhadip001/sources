package f.n.a.v.o;

import android.view.View;

/* compiled from: SelectableListScreenView.java */
/* loaded from: classes2.dex */
public class e implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f7367f;

    public e(f fVar) {
        this.f7367f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (c cVar : this.f7367f.c()) {
            cVar.b();
        }
    }
}
