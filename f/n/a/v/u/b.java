package f.n.a.v.u;

import android.view.View;
import f.n.a.v.u.c;

/* compiled from: VideoTrimAdapter.java */
/* loaded from: classes2.dex */
public class b implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.n.a.m.c.a f7484f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7485g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f7486h;

    public b(c cVar, f.n.a.m.c.a aVar, int i2) {
        this.f7486h = cVar;
        this.f7484f = aVar;
        this.f7485g = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c.a aVar = this.f7486h.c;
        f.n.a.m.c.a aVar2 = this.f7484f;
        int i2 = this.f7485g;
        for (d dVar : ((i) aVar).c()) {
            dVar.l(aVar2, i2);
        }
    }
}
