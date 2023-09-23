package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public class i extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.e.a.l.j.a);

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // f.e.a.l.s.c.f
    public Bitmap c(f.e.a.l.q.b0.d dVar, Bitmap bitmap, int i2, int i3) {
        float width;
        float height;
        Paint paint = x.a;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            width = i3 / bitmap.getHeight();
            f2 = (i2 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f2 + 0.5f), (int) (height + 0.5f));
        Bitmap e2 = dVar.e(i2, i3, x.c(bitmap));
        e2.setHasAlpha(bitmap.hasAlpha());
        x.a(bitmap, e2, matrix);
        return e2;
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return -599754482;
    }
}
