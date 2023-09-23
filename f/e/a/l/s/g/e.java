package f.e.a.l.s.g;

import android.graphics.Bitmap;
import f.e.a.l.q.r;
import f.e.a.l.s.g.g;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public class e extends f.e.a.l.s.e.c<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // f.e.a.l.q.v
    public void a() {
        ((c) this.f3490f).stop();
        c cVar = (c) this.f3490f;
        cVar.f3499i = true;
        g gVar = cVar.f3496f.a;
        gVar.c.clear();
        Bitmap bitmap = gVar.f3512l;
        if (bitmap != null) {
            gVar.f3505e.d(bitmap);
            gVar.f3512l = null;
        }
        gVar.f3506f = false;
        g.a aVar = gVar.f3509i;
        if (aVar != null) {
            gVar.f3504d.b(aVar);
            gVar.f3509i = null;
        }
        g.a aVar2 = gVar.f3511k;
        if (aVar2 != null) {
            gVar.f3504d.b(aVar2);
            gVar.f3511k = null;
        }
        g.a aVar3 = gVar.n;
        if (aVar3 != null) {
            gVar.f3504d.b(aVar3);
            gVar.n = null;
        }
        gVar.a.clear();
        gVar.f3510j = true;
    }

    @Override // f.e.a.l.q.v
    public int b() {
        g gVar = ((c) this.f3490f).f3496f.a;
        return gVar.a.g() + gVar.o;
    }

    @Override // f.e.a.l.q.v
    public Class<c> c() {
        return c.class;
    }

    @Override // f.e.a.l.s.e.c, f.e.a.l.q.r
    public void initialize() {
        ((c) this.f3490f).b().prepareToDraw();
    }
}
