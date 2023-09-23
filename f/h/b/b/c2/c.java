package f.h.b.b.c2;

import android.graphics.Bitmap;
import android.text.Layout;
import java.util.Objects;

/* compiled from: Cue.java */
/* loaded from: classes.dex */
public final class c {
    public static final c p;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3922d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3923e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3924f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3925g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3926h;

    /* renamed from: i  reason: collision with root package name */
    public final float f3927i;

    /* renamed from: j  reason: collision with root package name */
    public final float f3928j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3929k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3930l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3931m;
    public final float n;
    public final int o;

    static {
        b bVar = new b();
        bVar.a = "";
        p = bVar.a();
    }

    public c(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, a aVar) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            f.h.b.b.e2.j.c(bitmap == null);
        }
        this.a = charSequence;
        this.b = alignment;
        this.c = bitmap;
        this.f3922d = f2;
        this.f3923e = i2;
        this.f3924f = i3;
        this.f3925g = f3;
        this.f3926h = i4;
        this.f3927i = f5;
        this.f3928j = f6;
        this.f3929k = z;
        this.f3930l = i6;
        this.f3931m = i5;
        this.n = f4;
        this.o = i7;
    }

    public b a() {
        return new b(this, null);
    }

    /* compiled from: Cue.java */
    /* loaded from: classes.dex */
    public static final class b {
        public CharSequence a;
        public Bitmap b;
        public Layout.Alignment c;

        /* renamed from: d  reason: collision with root package name */
        public float f3932d;

        /* renamed from: e  reason: collision with root package name */
        public int f3933e;

        /* renamed from: f  reason: collision with root package name */
        public int f3934f;

        /* renamed from: g  reason: collision with root package name */
        public float f3935g;

        /* renamed from: h  reason: collision with root package name */
        public int f3936h;

        /* renamed from: i  reason: collision with root package name */
        public int f3937i;

        /* renamed from: j  reason: collision with root package name */
        public float f3938j;

        /* renamed from: k  reason: collision with root package name */
        public float f3939k;

        /* renamed from: l  reason: collision with root package name */
        public float f3940l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3941m;
        public int n;
        public int o;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.f3932d = -3.4028235E38f;
            this.f3933e = Integer.MIN_VALUE;
            this.f3934f = Integer.MIN_VALUE;
            this.f3935g = -3.4028235E38f;
            this.f3936h = Integer.MIN_VALUE;
            this.f3937i = Integer.MIN_VALUE;
            this.f3938j = -3.4028235E38f;
            this.f3939k = -3.4028235E38f;
            this.f3940l = -3.4028235E38f;
            this.f3941m = false;
            this.n = -16777216;
            this.o = Integer.MIN_VALUE;
        }

        public c a() {
            return new c(this.a, this.c, this.b, this.f3932d, this.f3933e, this.f3934f, this.f3935g, this.f3936h, this.f3937i, this.f3938j, this.f3939k, this.f3940l, this.f3941m, this.n, this.o, null);
        }

        public b(c cVar, a aVar) {
            this.a = cVar.a;
            this.b = cVar.c;
            this.c = cVar.b;
            this.f3932d = cVar.f3922d;
            this.f3933e = cVar.f3923e;
            this.f3934f = cVar.f3924f;
            this.f3935g = cVar.f3925g;
            this.f3936h = cVar.f3926h;
            this.f3937i = cVar.f3931m;
            this.f3938j = cVar.n;
            this.f3939k = cVar.f3927i;
            this.f3940l = cVar.f3928j;
            this.f3941m = cVar.f3929k;
            this.n = cVar.f3930l;
            this.o = cVar.o;
        }
    }
}
