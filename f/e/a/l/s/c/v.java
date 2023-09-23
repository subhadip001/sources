package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public class v implements f.e.a.l.m<Uri, Bitmap> {
    public final f.e.a.l.s.e.e a;
    public final f.e.a.l.q.b0.d b;

    public v(f.e.a.l.s.e.e eVar, f.e.a.l.q.b0.d dVar) {
        this.a = eVar;
        this.b = dVar;
    }

    @Override // f.e.a.l.m
    public boolean a(Uri uri, f.e.a.l.l lVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(Uri uri, int i2, int i3, f.e.a.l.l lVar) {
        f.e.a.l.q.v c = this.a.c(uri, lVar);
        if (c == null) {
            return null;
        }
        return l.a(this.b, (Drawable) ((f.e.a.l.s.e.c) c).get(), i2, i3);
    }
}
