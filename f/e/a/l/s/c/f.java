package f.e.a.l.s.c;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class f implements f.e.a.l.o<Bitmap> {
    @Override // f.e.a.l.o
    public final f.e.a.l.q.v<Bitmap> b(Context context, f.e.a.l.q.v<Bitmap> vVar, int i2, int i3) {
        if (f.e.a.r.l.j(i2, i3)) {
            f.e.a.l.q.b0.d dVar = f.e.a.b.b(context).f3153f;
            Bitmap bitmap = vVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap c = c(dVar, bitmap, i2, i3);
            return bitmap.equals(c) ? vVar : e.d(c, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(f.e.a.l.q.b0.d dVar, Bitmap bitmap, int i2, int i3);
}
