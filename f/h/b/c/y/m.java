package f.h.b.c.y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class m {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f5526d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f5527e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f5528f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f5529g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f5530h = new ArrayList();

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class a extends f {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        @Override // f.h.b.c.y.m.f
        public void a(Matrix matrix, f.h.b.c.x.a aVar, int i2, Canvas canvas) {
            c cVar = this.b;
            float f2 = cVar.f5535f;
            float f3 = cVar.f5536g;
            c cVar2 = this.b;
            RectF rectF = new RectF(cVar2.b, cVar2.c, cVar2.f5533d, cVar2.f5534e);
            boolean z = f3 < 0.0f;
            Path path = aVar.f5478g;
            if (z) {
                int[] iArr = f.h.b.c.x.a.f5473k;
                iArr[0] = 0;
                iArr[1] = aVar.f5477f;
                iArr[2] = aVar.f5476e;
                iArr[3] = aVar.f5475d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = -i2;
                rectF.inset(f4, f4);
                int[] iArr2 = f.h.b.c.x.a.f5473k;
                iArr2[0] = 0;
                iArr2[1] = aVar.f5475d;
                iArr2[2] = aVar.f5476e;
                iArr2[3] = aVar.f5477f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f5 = 1.0f - (i2 / width);
            float b = f.a.b.a.a.b(1.0f, f5, 2.0f, f5);
            float[] fArr = f.h.b.c.x.a.f5474l;
            fArr[1] = f5;
            fArr[2] = b;
            aVar.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f.h.b.c.x.a.f5473k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f5479h);
            }
            canvas.drawArc(rectF, f2, f3, true, aVar.b);
            canvas.restore();
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        public final d b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5531d;

        public b(d dVar, float f2, float f3) {
            this.b = dVar;
            this.c = f2;
            this.f5531d = f3;
        }

        @Override // f.h.b.c.y.m.f
        public void a(Matrix matrix, f.h.b.c.x.a aVar, int i2, Canvas canvas) {
            d dVar = this.b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.c - this.f5531d, dVar.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.f5531d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i2;
            rectF.offset(0.0f, -i2);
            int[] iArr = f.h.b.c.x.a.f5471i;
            iArr[0] = aVar.f5477f;
            iArr[1] = aVar.f5476e;
            iArr[2] = aVar.f5475d;
            Paint paint = aVar.c;
            float f2 = rectF.left;
            paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f.h.b.c.x.a.f5472j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.c);
            canvas.restore();
        }

        public float b() {
            d dVar = this.b;
            return (float) Math.toDegrees(Math.atan((dVar.c - this.f5531d) / (dVar.b - this.c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f5532h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f5533d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f5534e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f5535f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f5536g;

        public c(float f2, float f3, float f4, float f5) {
            this.b = f2;
            this.c = f3;
            this.f5533d = f4;
            this.f5534e = f5;
        }

        @Override // f.h.b.c.y.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5532h;
            rectF.set(this.b, this.c, this.f5533d, this.f5534e);
            path.arcTo(rectF, this.f5535f, this.f5536g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public float b;
        public float c;

        @Override // f.h.b.c.y.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, f.h.b.c.x.a aVar, int i2, Canvas canvas);
    }

    public m() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f5535f = f6;
        cVar.f5536g = f7;
        this.f5529g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.f5530h.add(aVar);
        this.f5527e = f9;
        double d2 = f8;
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f5526d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.f5527e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.c;
        float f6 = this.f5526d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f5535f = this.f5527e;
        cVar.f5536g = f4;
        this.f5530h.add(new a(cVar));
        this.f5527e = f2;
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f5529g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5529g.get(i2).a(matrix, path);
        }
    }

    public void d(float f2, float f3) {
        d dVar = new d();
        dVar.b = f2;
        dVar.c = f3;
        this.f5529g.add(dVar);
        b bVar = new b(dVar, this.c, this.f5526d);
        b(bVar.b() + 270.0f);
        this.f5530h.add(bVar);
        this.f5527e = bVar.b() + 270.0f;
        this.c = f2;
        this.f5526d = f3;
    }

    public void e(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.f5526d = f3;
        this.f5527e = f4;
        this.f5528f = (f4 + f5) % 360.0f;
        this.f5529g.clear();
        this.f5530h.clear();
    }
}
