package f.e.a.l.s.g;

import android.content.Context;
import android.graphics.Bitmap;
import f.e.a.l.o;
import f.e.a.l.q.v;
import java.security.MessageDigest;
import java.util.Objects;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public class f implements o<c> {
    public final o<Bitmap> b;

    public f(o<Bitmap> oVar) {
        Objects.requireNonNull(oVar, "Argument must not be null");
        this.b = oVar;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // f.e.a.l.o
    public v<c> b(Context context, v<c> vVar, int i2, int i3) {
        c cVar = vVar.get();
        v<Bitmap> eVar = new f.e.a.l.s.c.e(cVar.b(), f.e.a.b.b(context).f3153f);
        v<Bitmap> b = this.b.b(context, eVar, i2, i3);
        if (!eVar.equals(b)) {
            eVar.a();
        }
        o<Bitmap> oVar = this.b;
        cVar.f3496f.a.c(oVar, b.get());
        return vVar;
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        return this.b.hashCode();
    }
}
