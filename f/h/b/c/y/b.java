package f.h.b.c.y;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes.dex */
public final class b implements c {
    public final c a;
    public final float b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).b;
        }
        this.a = cVar;
        this.b = f2;
    }

    @Override // f.h.b.c.y.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
