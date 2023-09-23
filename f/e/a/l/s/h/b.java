package f.e.a.l.s.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import f.e.a.l.l;
import f.e.a.l.q.v;
import f.e.a.l.s.c.s;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(Resources resources) {
        this.a = resources;
    }

    @Override // f.e.a.l.s.h.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, l lVar) {
        return s.d(this.a, vVar);
    }
}
