package f.h.b.b.b2;

import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.h.b.b.b2.e0;
import f.h.b.b.s0;
import f.h.b.b.x1.a;
import f.h.b.b.y1.w;
import java.io.EOFException;
import java.util.Objects;

/* compiled from: SampleQueue.java */
/* loaded from: classes.dex */
public class f0 implements f.h.b.b.y1.w {
    public Format A;
    public Format B;
    public Format C;
    public boolean D;
    public boolean E;
    public final e0 a;
    public final f.h.b.b.x1.c c;

    /* renamed from: d  reason: collision with root package name */
    public final a.C0110a f3854d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f3855e;

    /* renamed from: f  reason: collision with root package name */
    public b f3856f;

    /* renamed from: g  reason: collision with root package name */
    public Format f3857g;

    /* renamed from: h  reason: collision with root package name */
    public DrmSession f3858h;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean x;
    public final a b = new a();

    /* renamed from: i  reason: collision with root package name */
    public int f3859i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3860j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f3861k = new long[1000];
    public long[] n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f3863m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f3862l = new int[1000];
    public w.a[] o = new w.a[1000];
    public Format[] p = new Format[1000];
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean z = true;
    public boolean y = true;

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public long b;
        public w.a c;
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public f0(f.h.b.b.f2.k kVar, Looper looper, f.h.b.b.x1.c cVar, a.C0110a c0110a) {
        this.f3855e = looper;
        this.c = cVar;
        this.f3854d = c0110a;
        this.a = new e0(kVar);
    }

    @Override // f.h.b.b.y1.w
    public final int a(f.h.b.b.f2.f fVar, int i2, boolean z, int i3) {
        e0 e0Var = this.a;
        int c = e0Var.c(i2);
        e0.a aVar = e0Var.f3846f;
        int b2 = fVar.b(aVar.f3848d.a, aVar.a(e0Var.f3847g), c);
        if (b2 != -1) {
            e0Var.b(b2);
            return b2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // f.h.b.b.y1.w
    public /* synthetic */ int b(f.h.b.b.f2.f fVar, int i2, boolean z) {
        return f.h.b.b.y1.v.a(this, fVar, i2, z);
    }

    @Override // f.h.b.b.y1.w
    public /* synthetic */ void c(f.h.b.b.g2.t tVar, int i2) {
        f.h.b.b.y1.v.b(this, tVar, i2);
    }

    @Override // f.h.b.b.y1.w
    public void d(long j2, int i2, int i3, int i4, w.a aVar) {
        int i5 = i2 & 1;
        boolean z = i5 != 0;
        if (this.y) {
            if (!z) {
                return;
            }
            this.y = false;
        }
        long j3 = j2 + 0;
        if (this.D) {
            if (j3 < this.u) {
                return;
            }
            if (i5 == 0) {
                if (!this.E) {
                    String valueOf = String.valueOf(this.B);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.E = true;
                }
                i2 |= 1;
            }
        }
        long j4 = (this.a.f3847g - i3) - i4;
        synchronized (this) {
            int i6 = this.q;
            if (i6 > 0) {
                int k2 = k(i6 - 1);
                f.h.b.b.e2.j.c(this.f3861k[k2] + ((long) this.f3862l[k2]) <= j4);
            }
            this.x = (536870912 & i2) != 0;
            this.w = Math.max(this.w, j3);
            int k3 = k(this.q);
            this.n[k3] = j3;
            long[] jArr = this.f3861k;
            jArr[k3] = j4;
            this.f3862l[k3] = i3;
            this.f3863m[k3] = i2;
            this.o[k3] = aVar;
            Format[] formatArr = this.p;
            Format format = this.B;
            formatArr[k3] = format;
            this.f3860j[k3] = 0;
            this.C = format;
            int i7 = this.q + 1;
            this.q = i7;
            int i8 = this.f3859i;
            if (i7 == i8) {
                int i9 = i8 + 1000;
                int[] iArr = new int[i9];
                long[] jArr2 = new long[i9];
                long[] jArr3 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                w.a[] aVarArr = new w.a[i9];
                Format[] formatArr2 = new Format[i9];
                int i10 = this.s;
                int i11 = i8 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy(this.n, this.s, jArr3, 0, i11);
                System.arraycopy(this.f3863m, this.s, iArr2, 0, i11);
                System.arraycopy(this.f3862l, this.s, iArr3, 0, i11);
                System.arraycopy(this.o, this.s, aVarArr, 0, i11);
                System.arraycopy(this.p, this.s, formatArr2, 0, i11);
                System.arraycopy(this.f3860j, this.s, iArr, 0, i11);
                int i12 = this.s;
                System.arraycopy(this.f3861k, 0, jArr2, i11, i12);
                System.arraycopy(this.n, 0, jArr3, i11, i12);
                System.arraycopy(this.f3863m, 0, iArr2, i11, i12);
                System.arraycopy(this.f3862l, 0, iArr3, i11, i12);
                System.arraycopy(this.o, 0, aVarArr, i11, i12);
                System.arraycopy(this.p, 0, formatArr2, i11, i12);
                System.arraycopy(this.f3860j, 0, iArr, i11, i12);
                this.f3861k = jArr2;
                this.n = jArr3;
                this.f3863m = iArr2;
                this.f3862l = iArr3;
                this.o = aVarArr;
                this.p = formatArr2;
                this.f3860j = iArr;
                this.s = 0;
                this.f3859i = i9;
            }
        }
    }

    @Override // f.h.b.b.y1.w
    public final void e(Format format) {
        boolean z;
        this.A = format;
        synchronized (this) {
            z = false;
            this.z = false;
            if (!f.h.b.b.g2.b0.a(format, this.B)) {
                if (f.h.b.b.g2.b0.a(format, this.C)) {
                    this.B = this.C;
                } else {
                    this.B = format;
                }
                Format format2 = this.B;
                this.D = f.h.b.b.g2.p.a(format2.q, format2.n);
                this.E = false;
                z = true;
            }
        }
        b bVar = this.f3856f;
        if (bVar == null || !z) {
            return;
        }
        c0 c0Var = (c0) bVar;
        c0Var.u.post(c0Var.s);
    }

    @Override // f.h.b.b.y1.w
    public final void f(f.h.b.b.g2.t tVar, int i2, int i3) {
        e0 e0Var = this.a;
        Objects.requireNonNull(e0Var);
        while (i2 > 0) {
            int c = e0Var.c(i2);
            e0.a aVar = e0Var.f3846f;
            tVar.e(aVar.f3848d.a, aVar.a(e0Var.f3847g), c);
            i2 -= c;
            e0Var.b(c);
        }
    }

    public final long g(int i2) {
        int i3;
        this.v = Math.max(this.v, j(i2));
        int i4 = this.q - i2;
        this.q = i4;
        this.r += i2;
        int i5 = this.s + i2;
        this.s = i5;
        int i6 = this.f3859i;
        if (i5 >= i6) {
            this.s = i5 - i6;
        }
        int i7 = this.t - i2;
        this.t = i7;
        if (i7 < 0) {
            this.t = 0;
        }
        if (i4 == 0) {
            int i8 = this.s;
            if (i8 != 0) {
                i6 = i8;
            }
            return this.f3861k[i6 - 1] + this.f3862l[i3];
        }
        return this.f3861k[this.s];
    }

    public final void h() {
        long g2;
        e0 e0Var = this.a;
        synchronized (this) {
            int i2 = this.q;
            g2 = i2 == 0 ? -1L : g(i2);
        }
        e0Var.a(g2);
    }

    public final int i(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long[] jArr = this.n;
            if (jArr[i2] > j2) {
                return i4;
            }
            if (!z || (this.f3863m[i2] & 1) != 0) {
                if (jArr[i2] == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f3859i) {
                i2 = 0;
            }
        }
        return i4;
    }

    public final long j(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int k2 = k(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.n[k2]);
            if ((this.f3863m[k2] & 1) != 0) {
                break;
            }
            k2--;
            if (k2 == -1) {
                k2 = this.f3859i - 1;
            }
        }
        return j2;
    }

    public final int k(int i2) {
        int i3 = this.s + i2;
        int i4 = this.f3859i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final synchronized Format l() {
        return this.z ? null : this.B;
    }

    public final boolean m() {
        return this.t != this.q;
    }

    public synchronized boolean n(boolean z) {
        Format format;
        boolean z2 = true;
        if (!m()) {
            if (!z && !this.x && ((format = this.B) == null || format == this.f3857g)) {
                z2 = false;
            }
            return z2;
        }
        int k2 = k(this.t);
        if (this.p[k2] != this.f3857g) {
            return true;
        }
        return o(k2);
    }

    public final boolean o(int i2) {
        DrmSession drmSession = this.f3858h;
        if (drmSession != null) {
            Objects.requireNonNull(drmSession);
            if ((this.f3863m[i2] & CommonUtils.BYTES_IN_A_GIGABYTE) == 0) {
                Objects.requireNonNull(this.f3858h);
            }
            return false;
        }
        return true;
    }

    public final void p(Format format, s0 s0Var) {
        Format format2;
        Format format3 = this.f3857g;
        boolean z = format3 == null;
        DrmInitData drmInitData = z ? null : format3.t;
        this.f3857g = format;
        DrmInitData drmInitData2 = format.t;
        f.h.b.b.x1.c cVar = this.c;
        if (cVar != null) {
            Class<? extends Object> b2 = cVar.b(format);
            Format.b b3 = format.b();
            b3.D = b2;
            format2 = b3.a();
        } else {
            format2 = format;
        }
        s0Var.b = format2;
        s0Var.a = this.f3858h;
        if (this.c == null) {
            return;
        }
        if (z || !f.h.b.b.g2.b0.a(drmInitData, drmInitData2)) {
            f.h.b.b.x1.c cVar2 = this.c;
            Looper looper = this.f3855e;
            Objects.requireNonNull(looper);
            DrmSession a2 = cVar2.a(looper, this.f3854d, format);
            this.f3858h = a2;
            s0Var.a = a2;
        }
    }

    public void q(boolean z) {
        e0 e0Var = this.a;
        e0.a aVar = e0Var.f3844d;
        if (aVar.c) {
            e0.a aVar2 = e0Var.f3846f;
            int i2 = (((int) (aVar2.a - aVar.a)) / e0Var.b) + (aVar2.c ? 1 : 0);
            f.h.b.b.f2.c[] cVarArr = new f.h.b.b.f2.c[i2];
            int i3 = 0;
            while (i3 < i2) {
                cVarArr[i3] = aVar.f3848d;
                aVar.f3848d = null;
                e0.a aVar3 = aVar.f3849e;
                aVar.f3849e = null;
                i3++;
                aVar = aVar3;
            }
            e0Var.a.a(cVarArr);
        }
        e0.a aVar4 = new e0.a(0L, e0Var.b);
        e0Var.f3844d = aVar4;
        e0Var.f3845e = aVar4;
        e0Var.f3846f = aVar4;
        e0Var.f3847g = 0L;
        e0Var.a.c();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.y = true;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.x = false;
        this.C = null;
        if (z) {
            this.A = null;
            this.B = null;
            this.z = true;
        }
    }

    public final synchronized boolean r(long j2, boolean z) {
        synchronized (this) {
            this.t = 0;
            e0 e0Var = this.a;
            e0Var.f3845e = e0Var.f3844d;
        }
        int k2 = k(0);
        if (m() && j2 >= this.n[k2] && (j2 <= this.w || z)) {
            int i2 = i(k2, this.q - this.t, j2, true);
            if (i2 == -1) {
                return false;
            }
            this.u = j2;
            this.t += i2;
            return true;
        }
        return false;
    }
}
