package f.h.b.b.y1.j0;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import f.h.b.b.y1.j0.i0;
import f.h.b.b.y1.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: TsExtractor.java */
/* loaded from: classes.dex */
public final class h0 implements f.h.b.b.y1.h {
    public final int a;
    public final int b;
    public final List<f.h.b.b.g2.a0> c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.g2.t f4913d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f4914e;

    /* renamed from: f  reason: collision with root package name */
    public final i0.c f4915f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<i0> f4916g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f4917h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f4918i;

    /* renamed from: j  reason: collision with root package name */
    public final g0 f4919j;

    /* renamed from: k  reason: collision with root package name */
    public f0 f4920k;

    /* renamed from: l  reason: collision with root package name */
    public f.h.b.b.y1.j f4921l;

    /* renamed from: m  reason: collision with root package name */
    public int f4922m;
    public boolean n;
    public boolean o;
    public boolean p;
    public i0 q;
    public int r;
    public int s;

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class a implements c0 {
        public final f.h.b.b.g2.s a = new f.h.b.b.g2.s(new byte[4]);

        public a() {
        }

        @Override // f.h.b.b.y1.j0.c0
        public void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, i0.d dVar) {
        }

        @Override // f.h.b.b.y1.j0.c0
        public void b(f.h.b.b.g2.t tVar) {
            if (tVar.r() == 0 && (tVar.r() & 128) != 0) {
                tVar.D(6);
                int a = tVar.a() / 4;
                for (int i2 = 0; i2 < a; i2++) {
                    tVar.d(this.a, 4);
                    int g2 = this.a.g(16);
                    this.a.m(3);
                    if (g2 == 0) {
                        this.a.m(13);
                    } else {
                        int g3 = this.a.g(13);
                        if (h0.this.f4916g.get(g3) == null) {
                            h0 h0Var = h0.this;
                            h0Var.f4916g.put(g3, new d0(new b(g3)));
                            h0.this.f4922m++;
                        }
                    }
                }
                h0 h0Var2 = h0.this;
                if (h0Var2.a != 2) {
                    h0Var2.f4916g.remove(0);
                }
            }
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class b implements c0 {
        public final f.h.b.b.g2.s a = new f.h.b.b.g2.s(new byte[5]);
        public final SparseArray<i0> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        public final int f4923d;

        public b(int i2) {
            this.f4923d = i2;
        }

        @Override // f.h.b.b.y1.j0.c0
        public void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, i0.d dVar) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
            if (r24.r() == r13) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x022d  */
        @Override // f.h.b.b.y1.j0.c0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(f.h.b.b.g2.t r24) {
            /*
                Method dump skipped, instructions count: 749
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.h0.b.b(f.h.b.b.g2.t):void");
        }
    }

    static {
        e eVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.j0.e
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new h0(1, 0, 112800)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    public h0(int i2, int i3, int i4) {
        f.h.b.b.g2.a0 a0Var = new f.h.b.b.g2.a0(0L);
        l lVar = new l(i3);
        this.f4915f = lVar;
        this.b = i4;
        this.a = i2;
        if (i2 != 1 && i2 != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(a0Var);
        } else {
            this.c = Collections.singletonList(a0Var);
        }
        this.f4913d = new f.h.b.b.g2.t(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4917h = sparseBooleanArray;
        this.f4918i = new SparseBooleanArray();
        SparseArray<i0> sparseArray = new SparseArray<>();
        this.f4916g = sparseArray;
        this.f4914e = new SparseIntArray();
        this.f4919j = new g0(i4);
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<i0> b2 = lVar.b();
        int size = b2.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4916g.put(b2.keyAt(i5), b2.valueAt(i5));
        }
        this.f4916g.put(0, new d0(new a()));
        this.q = null;
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        boolean z;
        byte[] bArr = this.f4913d.a;
        iVar.o(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                iVar.m(i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // f.h.b.b.y1.h
    public int e(f.h.b.b.y1.i iVar, f.h.b.b.y1.s sVar) {
        ?? r3;
        ?? r4;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        long a2 = iVar.a();
        if (this.n) {
            long j2 = -9223372036854775807L;
            if ((a2 == -1 || this.a == 2) ? false : true) {
                g0 g0Var = this.f4919j;
                if (!g0Var.f4907d) {
                    int i4 = this.s;
                    if (i4 <= 0) {
                        g0Var.a(iVar);
                        return 0;
                    }
                    if (!g0Var.f4909f) {
                        long a3 = iVar.a();
                        int min = (int) Math.min(g0Var.a, a3);
                        long j3 = a3 - min;
                        if (iVar.getPosition() != j3) {
                            sVar.a = j3;
                        } else {
                            g0Var.c.y(min);
                            iVar.l();
                            iVar.o(g0Var.c.a, 0, min);
                            f.h.b.b.g2.t tVar = g0Var.c;
                            int i5 = tVar.b;
                            int i6 = tVar.c;
                            while (true) {
                                i6--;
                                if (i6 < i5) {
                                    break;
                                } else if (tVar.a[i6] == 71) {
                                    long C = f.c.a.a.i.C(tVar, i6, i4);
                                    if (C != -9223372036854775807L) {
                                        j2 = C;
                                        break;
                                    }
                                }
                            }
                            g0Var.f4911h = j2;
                            g0Var.f4909f = true;
                            return 0;
                        }
                    } else if (g0Var.f4911h == -9223372036854775807L) {
                        g0Var.a(iVar);
                        return 0;
                    } else if (!g0Var.f4908e) {
                        int min2 = (int) Math.min(g0Var.a, iVar.a());
                        long j4 = 0;
                        if (iVar.getPosition() != j4) {
                            sVar.a = j4;
                        } else {
                            g0Var.c.y(min2);
                            iVar.l();
                            iVar.o(g0Var.c.a, 0, min2);
                            f.h.b.b.g2.t tVar2 = g0Var.c;
                            int i7 = tVar2.b;
                            int i8 = tVar2.c;
                            while (true) {
                                if (i7 >= i8) {
                                    break;
                                }
                                if (tVar2.a[i7] == 71) {
                                    long C2 = f.c.a.a.i.C(tVar2, i7, i4);
                                    if (C2 != -9223372036854775807L) {
                                        j2 = C2;
                                        break;
                                    }
                                }
                                i7++;
                            }
                            g0Var.f4910g = j2;
                            g0Var.f4908e = true;
                            return 0;
                        }
                    } else {
                        long j5 = g0Var.f4910g;
                        if (j5 == -9223372036854775807L) {
                            g0Var.a(iVar);
                            return 0;
                        }
                        g0Var.f4912i = g0Var.b.b(g0Var.f4911h) - g0Var.b.b(j5);
                        g0Var.a(iVar);
                        return 0;
                    }
                    return 1;
                }
            }
            if (!this.o) {
                this.o = true;
                g0 g0Var2 = this.f4919j;
                long j6 = g0Var2.f4912i;
                if (j6 != -9223372036854775807L) {
                    f0 f0Var = new f0(g0Var2.b, j6, a2, this.s, this.b);
                    this.f4920k = f0Var;
                    this.f4921l.a(f0Var.a);
                } else {
                    this.f4921l.a(new t.b(j6, 0L));
                }
            }
            if (this.p) {
                z2 = false;
                this.p = false;
                g(0L, 0L);
                if (iVar.getPosition() != 0) {
                    sVar.a = 0L;
                    return 1;
                }
            } else {
                z2 = false;
            }
            r4 = 1;
            r4 = 1;
            f0 f0Var2 = this.f4920k;
            r3 = z2;
            if (f0Var2 != null) {
                r3 = z2;
                if (f0Var2.b()) {
                    return this.f4920k.a(iVar, sVar);
                }
            }
        } else {
            r3 = 0;
            r4 = 1;
        }
        f.h.b.b.g2.t tVar3 = this.f4913d;
        byte[] bArr = tVar3.a;
        if (9400 - tVar3.b < 188) {
            int a4 = tVar3.a();
            if (a4 > 0) {
                System.arraycopy(bArr, this.f4913d.b, bArr, r3, a4);
            }
            this.f4913d.A(bArr, a4);
        }
        while (true) {
            if (this.f4913d.a() >= 188) {
                i2 = -1;
                z = true;
                break;
            }
            int i9 = this.f4913d.c;
            int b2 = iVar.b(bArr, i9, 9400 - i9);
            i2 = -1;
            if (b2 == -1) {
                z = false;
                break;
            }
            this.f4913d.B(i9 + b2);
        }
        if (z) {
            f.h.b.b.g2.t tVar4 = this.f4913d;
            int i10 = tVar4.b;
            int i11 = tVar4.c;
            byte[] bArr2 = tVar4.a;
            int i12 = i10;
            while (i12 < i11 && bArr2[i12] != 71) {
                i12++;
            }
            this.f4913d.C(i12);
            int i13 = i12 + 188;
            if (i13 > i11) {
                int i14 = (i12 - i10) + this.r;
                this.r = i14;
                i3 = 2;
                if (this.a == 2 && i14 > 376) {
                    throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
                }
            } else {
                i3 = 2;
                this.r = r3;
            }
            f.h.b.b.g2.t tVar5 = this.f4913d;
            int i15 = tVar5.c;
            if (i13 > i15) {
                return r3;
            }
            int f2 = tVar5.f();
            if ((8388608 & f2) != 0) {
                this.f4913d.C(i13);
                return r3;
            }
            int i16 = ((4194304 & f2) != 0 ? 1 : 0) | r3;
            int i17 = (2096896 & f2) >> 8;
            boolean z3 = (f2 & 32) != 0;
            i0 i0Var = (f2 & 16) != 0 ? this.f4916g.get(i17) : null;
            if (i0Var == null) {
                this.f4913d.C(i13);
                return r3;
            }
            if (this.a != i3) {
                int i18 = f2 & 15;
                int i19 = this.f4914e.get(i17, i18 - 1);
                this.f4914e.put(i17, i18);
                if (i19 == i18) {
                    this.f4913d.C(i13);
                    return r3;
                } else if (i18 != ((i19 + r4) & 15)) {
                    i0Var.c();
                }
            }
            if (z3) {
                int r = this.f4913d.r();
                i16 |= (this.f4913d.r() & 64) != 0 ? 2 : 0;
                this.f4913d.D(r - r4);
            }
            boolean z4 = this.n;
            if (this.a == i3 || z4 || !this.f4918i.get(i17, r3)) {
                this.f4913d.B(i13);
                i0Var.b(this.f4913d, i16);
                this.f4913d.B(i15);
            }
            if (this.a != i3 && !z4 && this.n && a2 != -1) {
                this.p = r4;
            }
            this.f4913d.C(i13);
            return r3;
        }
        return i2;
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.f4921l = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        f0 f0Var;
        f.h.b.b.e2.j.g(this.a != 2);
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            f.h.b.b.g2.a0 a0Var = this.c.get(i2);
            if ((a0Var.c() == -9223372036854775807L) || (a0Var.c() != 0 && a0Var.a != j3)) {
                a0Var.c = -9223372036854775807L;
                a0Var.d(j3);
            }
        }
        if (j3 != 0 && (f0Var = this.f4920k) != null) {
            f0Var.e(j3);
        }
        this.f4913d.y(0);
        this.f4914e.clear();
        for (int i3 = 0; i3 < this.f4916g.size(); i3++) {
            this.f4916g.valueAt(i3).c();
        }
        this.r = 0;
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
