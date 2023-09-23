package f.m.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class v {
    public static final long s = TimeUnit.SECONDS.toNanos(5);
    public int a;
    public long b;
    public final Uri c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6880d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b0> f6881e = null;

    /* renamed from: f  reason: collision with root package name */
    public final int f6882f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6883g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6884h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6885i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6886j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6887k;

    /* renamed from: l  reason: collision with root package name */
    public final float f6888l;

    /* renamed from: m  reason: collision with root package name */
    public final float f6889m;
    public final float n;
    public final boolean o;
    public final boolean p;
    public final Bitmap.Config q;
    public final Picasso.Priority r;

    /* compiled from: Request.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public Uri a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f6890d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6891e;

        /* renamed from: f  reason: collision with root package name */
        public int f6892f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap.Config f6893g;

        /* renamed from: h  reason: collision with root package name */
        public Picasso.Priority f6894h;

        public b(Uri uri, int i2, Bitmap.Config config) {
            this.a = uri;
            this.b = i2;
            this.f6893g = config;
        }

        public b a(int i2, int i3) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    if (i3 == 0 && i2 == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.c = i2;
                    this.f6890d = i3;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
    }

    public v(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, int i5, boolean z3, float f2, float f3, float f4, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority, a aVar) {
        this.c = uri;
        this.f6880d = i2;
        this.f6882f = i3;
        this.f6883g = i4;
        this.f6884h = z;
        this.f6886j = z2;
        this.f6885i = i5;
        this.f6887k = z3;
        this.f6888l = f2;
        this.f6889m = f3;
        this.n = f4;
        this.o = z4;
        this.p = z5;
        this.q = config;
        this.r = priority;
    }

    public boolean a() {
        return (this.f6882f == 0 && this.f6883g == 0) ? false : true;
    }

    public String b() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > s) {
            return d() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return d() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public boolean c() {
        return a() || this.f6888l != 0.0f;
    }

    public String d() {
        StringBuilder A = f.a.b.a.a.A("[R");
        A.append(this.a);
        A.append(']');
        return A.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.f6880d;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.c);
        }
        List<b0> list = this.f6881e;
        if (list != null && !list.isEmpty()) {
            for (b0 b0Var : this.f6881e) {
                sb.append(' ');
                sb.append(b0Var.b());
            }
        }
        if (this.f6882f > 0) {
            sb.append(" resize(");
            sb.append(this.f6882f);
            sb.append(',');
            sb.append(this.f6883g);
            sb.append(')');
        }
        if (this.f6884h) {
            sb.append(" centerCrop");
        }
        if (this.f6886j) {
            sb.append(" centerInside");
        }
        if (this.f6888l != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f6888l);
            if (this.o) {
                sb.append(" @ ");
                sb.append(this.f6889m);
                sb.append(',');
                sb.append(this.n);
            }
            sb.append(')');
        }
        if (this.p) {
            sb.append(" purgeable");
        }
        if (this.q != null) {
            sb.append(' ');
            sb.append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }
}
