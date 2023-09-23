package f.e.a.l.r.y;

import f.e.a.l.l;
import f.e.a.l.r.g;
import f.e.a.l.r.n;
import f.e.a.l.r.o;
import f.e.a.l.r.r;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public class e implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    /* compiled from: UrlLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // f.e.a.l.r.o
        public n<URL, InputStream> b(r rVar) {
            return new e(rVar.b(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a<InputStream> b(URL url, int i2, int i3, l lVar) {
        return this.a.b(new g(url), i2, i3, lVar);
    }
}
