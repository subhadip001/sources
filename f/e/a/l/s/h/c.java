package f.e.a.l.s.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import f.e.a.l.l;
import f.e.a.l.q.v;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {
    public final f.e.a.l.q.b0.d a;
    public final e<Bitmap, byte[]> b;
    public final e<f.e.a.l.s.g.c, byte[]> c;

    public c(f.e.a.l.q.b0.d dVar, e<Bitmap, byte[]> eVar, e<f.e.a.l.s.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // f.e.a.l.s.h.e
    public v<byte[]> a(v<Drawable> vVar, l lVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(f.e.a.l.s.c.e.d(((BitmapDrawable) drawable).getBitmap(), this.a), lVar);
        }
        if (drawable instanceof f.e.a.l.s.g.c) {
            return this.c.a(vVar, lVar);
        }
        return null;
    }
}
