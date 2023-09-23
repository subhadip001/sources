package f.h.b.c.y;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f.h.b.c.y.g;
import f.h.b.c.y.m;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes.dex */
public class k {
    public final m[] a = new m[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f5517d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f5518e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f5519f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f5520g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f5521h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f5522i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f5523j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f5524k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f5525l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final k a = new k();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public k() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    public void a(j jVar, float f2, RectF rectF, Path path) {
        b(jVar, f2, rectF, null, path);
    }

    public void b(j jVar, float f2, RectF rectF, b bVar, Path path) {
        float[] fArr;
        float abs;
        f fVar;
        c cVar;
        d dVar;
        path.rewind();
        this.f5518e.rewind();
        this.f5519f.rewind();
        this.f5519f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (i2 < 4) {
            if (i2 == 1) {
                cVar = jVar.f5502g;
            } else if (i2 == 2) {
                cVar = jVar.f5503h;
            } else if (i2 != 3) {
                cVar = jVar.f5501f;
            } else {
                cVar = jVar.f5500e;
            }
            if (i2 == 1) {
                dVar = jVar.c;
            } else if (i2 == 2) {
                dVar = jVar.f5499d;
            } else if (i2 != 3) {
                dVar = jVar.b;
            } else {
                dVar = jVar.a;
            }
            m mVar = this.a[i2];
            Objects.requireNonNull(dVar);
            dVar.a(mVar, 90.0f, f2, cVar.a(rectF));
            int i3 = i2 + 1;
            float f3 = i3 * 90;
            this.b[i2].reset();
            PointF pointF = this.f5517d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.b[i2];
            PointF pointF2 = this.f5517d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i2].preRotate(f3);
            float[] fArr2 = this.f5521h;
            m[] mVarArr = this.a;
            fArr2[0] = mVarArr[i2].c;
            fArr2[1] = mVarArr[i2].f5526d;
            this.b[i2].mapPoints(fArr2);
            this.c[i2].reset();
            Matrix matrix2 = this.c[i2];
            float[] fArr3 = this.f5521h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.c[i2].preRotate(f3);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr4 = this.f5521h;
            m[] mVarArr2 = this.a;
            fArr4[0] = mVarArr2[i4].a;
            fArr4[1] = mVarArr2[i4].b;
            this.b[i4].mapPoints(fArr4);
            if (i4 == 0) {
                float[] fArr5 = this.f5521h;
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                float[] fArr6 = this.f5521h;
                path.lineTo(fArr6[0], fArr6[1]);
            }
            this.a[i4].c(this.b[i4], path);
            if (bVar != null) {
                m mVar2 = this.a[i4];
                Matrix matrix3 = this.b[i4];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f5483i;
                Objects.requireNonNull(mVar2);
                bitSet.set(i4, false);
                m.f[] fVarArr = g.this.f5481g;
                mVar2.b(mVar2.f5528f);
                fVarArr[i4] = new l(mVar2, new ArrayList(mVar2.f5530h), new Matrix(matrix3));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr7 = this.f5521h;
            m[] mVarArr3 = this.a;
            fArr7[0] = mVarArr3[i4].c;
            fArr7[1] = mVarArr3[i4].f5526d;
            this.b[i4].mapPoints(fArr7);
            float[] fArr8 = this.f5522i;
            m[] mVarArr4 = this.a;
            fArr8[0] = mVarArr4[i6].a;
            fArr8[1] = mVarArr4[i6].b;
            this.b[i6].mapPoints(fArr8);
            float f4 = this.f5521h[0];
            float[] fArr9 = this.f5522i;
            float max = Math.max(((float) Math.hypot(f4 - fArr9[0], fArr[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.f5521h;
            m[] mVarArr5 = this.a;
            fArr10[0] = mVarArr5[i4].c;
            fArr10[1] = mVarArr5[i4].f5526d;
            this.b[i4].mapPoints(fArr10);
            if (i4 != 1 && i4 != 3) {
                abs = Math.abs(rectF.centerY() - this.f5521h[1]);
            } else {
                abs = Math.abs(rectF.centerX() - this.f5521h[0]);
            }
            this.f5520g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                fVar = jVar.f5506k;
            } else if (i4 == 2) {
                fVar = jVar.f5507l;
            } else if (i4 != 3) {
                fVar = jVar.f5505j;
            } else {
                fVar = jVar.f5504i;
            }
            fVar.a(max, abs, f2, this.f5520g);
            this.f5523j.reset();
            this.f5520g.c(this.c[i4], this.f5523j);
            if (this.f5525l && (c(this.f5523j, i4) || c(this.f5523j, i6))) {
                Path path2 = this.f5523j;
                path2.op(path2, this.f5519f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f5521h;
                m mVar3 = this.f5520g;
                fArr11[0] = mVar3.a;
                fArr11[1] = mVar3.b;
                this.c[i4].mapPoints(fArr11);
                Path path3 = this.f5518e;
                float[] fArr12 = this.f5521h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.f5520g.c(this.c[i4], this.f5518e);
            } else {
                this.f5520g.c(this.c[i4], path);
            }
            if (bVar != null) {
                m mVar4 = this.f5520g;
                Matrix matrix4 = this.c[i4];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(mVar4);
                g.this.f5483i.set(i4 + 4, false);
                m.f[] fVarArr2 = g.this.f5482h;
                mVar4.b(mVar4.f5528f);
                fVarArr2[i4] = new l(mVar4, new ArrayList(mVar4.f5530h), new Matrix(matrix4));
            }
            i4 = i5;
        }
        path.close();
        this.f5518e.close();
        if (this.f5518e.isEmpty()) {
            return;
        }
        path.op(this.f5518e, Path.Op.UNION);
    }

    public final boolean c(Path path, int i2) {
        this.f5524k.reset();
        this.a[i2].c(this.b[i2], this.f5524k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5524k.computeBounds(rectF, true);
        path.op(this.f5524k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
