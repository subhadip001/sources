package f.e.a.l.r.y;

import android.content.Context;
import android.net.Uri;
import f.c.a.a.i;
import f.e.a.l.l;
import f.e.a.l.p.o.b;
import f.e.a.l.r.n;
import f.e.a.l.r.o;
import f.e.a.l.r.r;
import f.e.a.l.s.c.z;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes.dex */
public class c implements n<Uri, InputStream> {
    public final Context a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // f.e.a.l.r.o
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return i.u(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // f.e.a.l.r.n
    public n.a<InputStream> b(Uri uri, int i2, int i3, l lVar) {
        Uri uri2 = uri;
        if (i.v(i2, i3)) {
            Long l2 = (Long) lVar.c(z.f3484d);
            if (l2 != null && l2.longValue() == -1) {
                f.e.a.q.d dVar = new f.e.a.q.d(uri2);
                Context context = this.a;
                return new n.a<>(dVar, f.e.a.l.p.o.b.c(context, uri2, new b.C0070b(context.getContentResolver())));
            }
        }
        return null;
    }
}
