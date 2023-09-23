package f.e.a.l.r;

import android.net.Uri;
import f.e.a.l.r.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final n<g, Data> a;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // f.e.a.l.r.o
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.a = nVar;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }

    @Override // f.e.a.l.r.n
    public n.a b(Uri uri, int i2, int i3, f.e.a.l.l lVar) {
        return this.a.b(new g(uri.toString(), h.a), i2, i3, lVar);
    }
}
