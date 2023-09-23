package f.g.a;

import android.content.res.TypedArray;
import android.graphics.RectF;

/* compiled from: Shimmer.java */
/* loaded from: classes.dex */
public class b {
    public final float[] a = new float[4];
    public final int[] b = new int[4];
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3626d;

    /* renamed from: e  reason: collision with root package name */
    public int f3627e;

    /* renamed from: f  reason: collision with root package name */
    public int f3628f;

    /* renamed from: g  reason: collision with root package name */
    public int f3629g;

    /* renamed from: h  reason: collision with root package name */
    public int f3630h;

    /* renamed from: i  reason: collision with root package name */
    public float f3631i;

    /* renamed from: j  reason: collision with root package name */
    public float f3632j;

    /* renamed from: k  reason: collision with root package name */
    public float f3633k;

    /* renamed from: l  reason: collision with root package name */
    public float f3634l;

    /* renamed from: m  reason: collision with root package name */
    public float f3635m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public long s;
    public long t;

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static class a extends AbstractC0094b<a> {
        public a() {
            this.a.p = true;
        }

        @Override // f.g.a.b.AbstractC0094b
        public a c() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: f.g.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0094b<T extends AbstractC0094b<T>> {
        public final b a = new b();

        public b a() {
            b bVar = this.a;
            int i2 = bVar.f3628f;
            if (i2 != 1) {
                int[] iArr = bVar.b;
                int i3 = bVar.f3627e;
                iArr[0] = i3;
                int i4 = bVar.f3626d;
                iArr[1] = i4;
                iArr[2] = i4;
                iArr[3] = i3;
            } else {
                int[] iArr2 = bVar.b;
                int i5 = bVar.f3626d;
                iArr2[0] = i5;
                iArr2[1] = i5;
                int i6 = bVar.f3627e;
                iArr2[2] = i6;
                iArr2[3] = i6;
            }
            if (i2 != 1) {
                bVar.a[0] = Math.max(((1.0f - bVar.f3633k) - bVar.f3634l) / 2.0f, 0.0f);
                bVar.a[1] = Math.max(((1.0f - bVar.f3633k) - 0.001f) / 2.0f, 0.0f);
                bVar.a[2] = Math.min(((bVar.f3633k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                bVar.a[3] = Math.min(((bVar.f3633k + 1.0f) + bVar.f3634l) / 2.0f, 1.0f);
            } else {
                float[] fArr = bVar.a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(bVar.f3633k, 1.0f);
                bVar.a[2] = Math.min(bVar.f3633k + bVar.f3634l, 1.0f);
                bVar.a[3] = 1.0f;
            }
            return this.a;
        }

        public T b(TypedArray typedArray) {
            if (typedArray.hasValue(3)) {
                this.a.n = typedArray.getBoolean(3, this.a.n);
                c();
            }
            if (typedArray.hasValue(0)) {
                this.a.o = typedArray.getBoolean(0, this.a.o);
                c();
            }
            if (typedArray.hasValue(1)) {
                b bVar = this.a;
                bVar.f3627e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bVar.f3627e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                b bVar2 = this.a;
                bVar2.f3626d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & bVar2.f3626d);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j2 = typedArray.getInt(7, (int) this.a.s);
                if (j2 >= 0) {
                    this.a.s = j2;
                    c();
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.l("Given a negative duration: ", j2));
                }
            }
            if (typedArray.hasValue(14)) {
                this.a.q = typedArray.getInt(14, this.a.q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j3 = typedArray.getInt(15, (int) this.a.t);
                if (j3 >= 0) {
                    this.a.t = j3;
                    c();
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.l("Given a negative repeat delay: ", j3));
                }
            }
            if (typedArray.hasValue(16)) {
                this.a.r = typedArray.getInt(16, this.a.r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i2 = typedArray.getInt(5, this.a.c);
                if (i2 == 1) {
                    d(1);
                } else if (i2 == 2) {
                    d(2);
                } else if (i2 != 3) {
                    d(0);
                } else {
                    d(3);
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, this.a.f3628f) != 1) {
                    this.a.f3628f = 0;
                    c();
                } else {
                    this.a.f3628f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f2 = typedArray.getFloat(6, this.a.f3634l);
                if (f2 >= 0.0f) {
                    this.a.f3634l = f2;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f2);
                }
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, this.a.f3629g);
                if (dimensionPixelSize >= 0) {
                    this.a.f3629g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.i("Given invalid width: ", dimensionPixelSize));
                }
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, this.a.f3630h);
                if (dimensionPixelSize2 >= 0) {
                    this.a.f3630h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.i("Given invalid height: ", dimensionPixelSize2));
                }
            }
            if (typedArray.hasValue(13)) {
                float f3 = typedArray.getFloat(13, this.a.f3633k);
                if (f3 >= 0.0f) {
                    this.a.f3633k = f3;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f3);
                }
            }
            if (typedArray.hasValue(19)) {
                float f4 = typedArray.getFloat(19, this.a.f3631i);
                if (f4 >= 0.0f) {
                    this.a.f3631i = f4;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f4);
                }
            }
            if (typedArray.hasValue(10)) {
                float f5 = typedArray.getFloat(10, this.a.f3632j);
                if (f5 >= 0.0f) {
                    this.a.f3632j = f5;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f5);
                }
            }
            if (typedArray.hasValue(18)) {
                this.a.f3635m = typedArray.getFloat(18, this.a.f3635m);
                c();
            }
            return c();
        }

        public abstract T c();

        public T d(int i2) {
            this.a.c = i2;
            return c();
        }
    }

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static class c extends AbstractC0094b<c> {
        public c() {
            this.a.p = false;
        }

        @Override // f.g.a.b.AbstractC0094b
        public c b(TypedArray typedArray) {
            super.b(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.a.f3627e);
                b bVar = this.a;
                bVar.f3627e = (color & 16777215) | (bVar.f3627e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                this.a.f3626d = typedArray.getColor(12, this.a.f3626d);
            }
            return this;
        }

        @Override // f.g.a.b.AbstractC0094b
        public c c() {
            return this;
        }
    }

    public b() {
        new RectF();
        this.c = 0;
        this.f3626d = -1;
        this.f3627e = 1291845631;
        this.f3628f = 0;
        this.f3629g = 0;
        this.f3630h = 0;
        this.f3631i = 1.0f;
        this.f3632j = 1.0f;
        this.f3633k = 0.0f;
        this.f3634l = 0.5f;
        this.f3635m = 20.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = -1;
        this.r = 1;
        this.s = 1000L;
    }
}
