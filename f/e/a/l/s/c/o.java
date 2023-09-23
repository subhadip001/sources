package f.e.a.l.s.c;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public class o extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.e.a.l.j.a);

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // f.e.a.l.s.c.f
    public Bitmap c(f.e.a.l.q.b0.d dVar, Bitmap bitmap, int i2, int i3) {
        return x.b(dVar, bitmap, i2, i3);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        return obj instanceof o;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return 1572326941;
    }
}
