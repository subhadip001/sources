package f.e.a.l.s.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public class m implements f.e.a.l.o<Drawable> {
    public final f.e.a.l.o<Bitmap> b;
    public final boolean c;

    public m(f.e.a.l.o<Bitmap> oVar, boolean z) {
        this.b = oVar;
        this.c = z;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // f.e.a.l.o
    public f.e.a.l.q.v<Drawable> b(Context context, f.e.a.l.q.v<Drawable> vVar, int i2, int i3) {
        f.e.a.l.q.b0.d dVar = f.e.a.b.b(context).f3153f;
        Drawable drawable = vVar.get();
        f.e.a.l.q.v<Bitmap> a = l.a(dVar, drawable, i2, i3);
        if (a == null) {
            if (this.c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return vVar;
        }
        f.e.a.l.q.v<Bitmap> b = this.b.b(context, a, i2, i3);
        if (b.equals(a)) {
            b.a();
            return vVar;
        }
        return s.d(context.getResources(), b);
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.b.equals(((m) obj).b);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return this.b.hashCode();
    }
}
