package f.n.a.v.k;

import android.view.View;
import f.n.a.v.k.d;

/* compiled from: OutputFileListAdapter.java */
/* loaded from: classes2.dex */
public class b implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7255f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f7256g;

    public b(d dVar, int i2) {
        this.f7256g = dVar;
        this.f7255f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.a aVar = this.f7256g.f7258e;
        int i2 = this.f7255f;
        f fVar = (f) aVar;
        fVar.a.f7263f.moveToPosition(i2);
        h hVar = fVar.a;
        if (hVar.f7266i != null) {
            h.i(hVar, i2);
        } else {
            h.k(hVar, i2);
        }
    }
}
