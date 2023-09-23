package f.e.a.l.r.y;

import f.e.a.l.k;
import f.e.a.l.l;
import f.e.a.l.p.j;
import f.e.a.l.r.g;
import f.e.a.l.r.m;
import f.e.a.l.r.n;
import f.e.a.l.r.o;
import f.e.a.l.r.r;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public class a implements n<g, InputStream> {
    public static final k<Integer> b = k.b("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final m<g, g> a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: f.e.a.l.r.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0083a implements o<g, InputStream> {
        public final m<g, g> a = new m<>(500);

        @Override // f.e.a.l.r.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }
    }

    public a(m<g, g> mVar) {
        this.a = mVar;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(g gVar) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a<InputStream> b(g gVar, int i2, int i3, l lVar) {
        g gVar2 = gVar;
        m<g, g> mVar = this.a;
        if (mVar != null) {
            m.b<g> a = m.b.a(gVar2, 0, 0);
            g a2 = mVar.a.a(a);
            Queue<m.b<?>> queue = m.b.f3428d;
            synchronized (queue) {
                queue.offer(a);
            }
            g gVar3 = a2;
            if (gVar3 == null) {
                m<g, g> mVar2 = this.a;
                Objects.requireNonNull(mVar2);
                mVar2.a.d(m.b.a(gVar2, 0, 0), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new n.a<>(gVar2, new j(gVar2, ((Integer) lVar.c(b)).intValue()));
    }
}
