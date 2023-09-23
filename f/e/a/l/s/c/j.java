package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public class j extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.e.a.l.j.a);

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // f.e.a.l.s.c.f
    public Bitmap c(f.e.a.l.q.b0.d dVar, Bitmap bitmap, int i2, int i3) {
        Paint paint = x.a;
        if (bitmap.getWidth() <= i2 && bitmap.getHeight() <= i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return x.b(dVar, bitmap, i2, i3);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return -670243078;
    }
}
