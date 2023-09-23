package f.h.b.c.y;

import android.graphics.Canvas;
import android.graphics.Matrix;
import f.h.b.c.y.m;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class l extends m.f {
    public final /* synthetic */ List b;
    public final /* synthetic */ Matrix c;

    public l(m mVar, List list, Matrix matrix) {
        this.b = list;
        this.c = matrix;
    }

    @Override // f.h.b.c.y.m.f
    public void a(Matrix matrix, f.h.b.c.x.a aVar, int i2, Canvas canvas) {
        for (m.f fVar : this.b) {
            fVar.a(this.c, aVar, i2, canvas);
        }
    }
}
