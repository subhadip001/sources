package f.h.b.b.h2.x;

import f.h.b.b.e2.j;

/* compiled from: Projection.java */
/* loaded from: classes.dex */
public final class d {
    public final a a;
    public final a b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4384d;

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }
    }

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f4385d;

        public b(int i2, float[] fArr, float[] fArr2, int i3) {
            this.a = i2;
            j.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.f4385d = fArr2;
            this.b = i3;
        }
    }

    public d(a aVar, int i2) {
        this.a = aVar;
        this.b = aVar;
        this.c = i2;
        this.f4384d = aVar == aVar;
    }

    public d(a aVar, a aVar2, int i2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i2;
        this.f4384d = aVar == aVar2;
    }
}
