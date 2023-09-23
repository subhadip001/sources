package f.h.b.b.y1.h0;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.r;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h0.d;
import f.h.b.b.y1.w;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes.dex */
public class g implements f.h.b.b.y1.h {
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format G;
    public boolean A;
    public f.h.b.b.y1.j B;
    public w[] C;
    public w[] D;
    public boolean E;
    public final int a;
    public final List<Format> b;
    public final SparseArray<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final t f4791d;

    /* renamed from: e  reason: collision with root package name */
    public final t f4792e;

    /* renamed from: f  reason: collision with root package name */
    public final t f4793f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f4794g;

    /* renamed from: h  reason: collision with root package name */
    public final t f4795h;

    /* renamed from: i  reason: collision with root package name */
    public final f.h.b.b.a2.i.b f4796i;

    /* renamed from: j  reason: collision with root package name */
    public final t f4797j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque<d.a> f4798k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque<a> f4799l;

    /* renamed from: m  reason: collision with root package name */
    public int f4800m;
    public int n;
    public long o;
    public int p;
    public t q;
    public long r;
    public int s;
    public long t;
    public long u;
    public long v;
    public b w;
    public int x;
    public int y;
    public int z;

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j2, int i2) {
            this.a = j2;
            this.b = i2;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final w a;

        /* renamed from: d  reason: collision with root package name */
        public p f4801d;

        /* renamed from: e  reason: collision with root package name */
        public f f4802e;

        /* renamed from: f  reason: collision with root package name */
        public int f4803f;

        /* renamed from: g  reason: collision with root package name */
        public int f4804g;

        /* renamed from: h  reason: collision with root package name */
        public int f4805h;

        /* renamed from: i  reason: collision with root package name */
        public int f4806i;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4809l;
        public final o b = new o();
        public final t c = new t();

        /* renamed from: j  reason: collision with root package name */
        public final t f4807j = new t(1);

        /* renamed from: k  reason: collision with root package name */
        public final t f4808k = new t();

        public b(w wVar, p pVar, f fVar) {
            this.a = wVar;
            this.f4801d = pVar;
            this.f4802e = fVar;
            this.f4801d = pVar;
            this.f4802e = fVar;
            wVar.e(pVar.a.f4825f);
            e();
        }

        public long a() {
            if (!this.f4809l) {
                return this.f4801d.c[this.f4803f];
            }
            return this.b.f4835f[this.f4805h];
        }

        public n b() {
            if (this.f4809l) {
                o oVar = this.b;
                f fVar = oVar.a;
                int i2 = b0.a;
                int i3 = fVar.a;
                n nVar = oVar.n;
                if (nVar == null) {
                    nVar = this.f4801d.a.a(i3);
                }
                if (nVar == null || !nVar.a) {
                    return null;
                }
                return nVar;
            }
            return null;
        }

        public boolean c() {
            this.f4803f++;
            if (this.f4809l) {
                int i2 = this.f4804g + 1;
                this.f4804g = i2;
                int[] iArr = this.b.f4836g;
                int i3 = this.f4805h;
                if (i2 == iArr[i3]) {
                    this.f4805h = i3 + 1;
                    this.f4804g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int d(int i2, int i3) {
            t tVar;
            n b = b();
            if (b == null) {
                return 0;
            }
            int i4 = b.f4831d;
            if (i4 != 0) {
                tVar = this.b.o;
            } else {
                byte[] bArr = b.f4832e;
                int i5 = b0.a;
                t tVar2 = this.f4808k;
                int length = bArr.length;
                tVar2.a = bArr;
                tVar2.c = length;
                tVar2.b = 0;
                i4 = bArr.length;
                tVar = tVar2;
            }
            o oVar = this.b;
            boolean z = oVar.f4841l && oVar.f4842m[this.f4803f];
            boolean z2 = z || i3 != 0;
            t tVar3 = this.f4807j;
            tVar3.a[0] = (byte) ((z2 ? 128 : 0) | i4);
            tVar3.C(0);
            this.a.f(this.f4807j, 1, 1);
            this.a.f(tVar, i4, 1);
            if (z2) {
                if (!z) {
                    this.c.y(8);
                    t tVar4 = this.c;
                    byte[] bArr2 = tVar4.a;
                    bArr2[0] = 0;
                    bArr2[1] = 1;
                    bArr2[2] = (byte) ((i3 >> 8) & 255);
                    bArr2[3] = (byte) (i3 & 255);
                    bArr2[4] = (byte) ((i2 >> 24) & 255);
                    bArr2[5] = (byte) ((i2 >> 16) & 255);
                    bArr2[6] = (byte) ((i2 >> 8) & 255);
                    bArr2[7] = (byte) (i2 & 255);
                    this.a.f(tVar4, 8, 1);
                    return i4 + 1 + 8;
                }
                t tVar5 = this.b.o;
                int w = tVar5.w();
                tVar5.D(-2);
                int i6 = (w * 6) + 2;
                if (i3 != 0) {
                    this.c.y(i6);
                    byte[] bArr3 = this.c.a;
                    tVar5.e(bArr3, 0, i6);
                    int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
                    bArr3[2] = (byte) ((i7 >> 8) & 255);
                    bArr3[3] = (byte) (i7 & 255);
                    tVar5 = this.c;
                }
                this.a.f(tVar5, i6, 1);
                return i4 + 1 + i6;
            }
            return i4 + 1;
        }

        public void e() {
            o oVar = this.b;
            oVar.f4833d = 0;
            oVar.q = 0L;
            oVar.r = false;
            oVar.f4841l = false;
            oVar.p = false;
            oVar.n = null;
            this.f4803f = 0;
            this.f4805h = 0;
            this.f4804g = 0;
            this.f4806i = 0;
            this.f4809l = false;
        }
    }

    static {
        Format.b bVar = new Format.b();
        bVar.f722k = "application/x-emsg";
        G = bVar.a();
    }

    public g(int i2) {
        List emptyList = Collections.emptyList();
        this.a = i2;
        this.b = Collections.unmodifiableList(emptyList);
        this.f4796i = new f.h.b.b.a2.i.b();
        this.f4797j = new t(16);
        this.f4791d = new t(r.a);
        this.f4792e = new t(5);
        this.f4793f = new t();
        byte[] bArr = new byte[16];
        this.f4794g = bArr;
        this.f4795h = new t(bArr);
        this.f4798k = new ArrayDeque<>();
        this.f4799l = new ArrayDeque<>();
        this.c = new SparseArray<>();
        this.u = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = f.h.b.b.y1.j.b;
        this.C = new w[0];
        this.D = new w[0];
    }

    public static int a(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new ParserException(f.a.b.a.a.d(38, "Unexpected negative value: ", i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.drm.DrmInitData h(java.util.List<f.h.b.b.y1.h0.d.b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r2
        L8:
            if (r3 >= r0) goto Laf
            java.lang.Object r5 = r14.get(r3)
            f.h.b.b.y1.h0.d$b r5 = (f.h.b.b.y1.h0.d.b) r5
            int r6 = r5.a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lab
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            f.h.b.b.g2.t r5 = r5.b
            byte[] r5 = r5.a
            f.h.b.b.g2.t r6 = new f.h.b.b.g2.t
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2e
            goto L7c
        L2e:
            r6.C(r1)
            int r8 = r6.f()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L3e
            goto L7c
        L3e:
            int r8 = r6.f()
            if (r8 == r7) goto L45
            goto L7c
        L45:
            int r7 = r6.f()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            if (r7 <= r8) goto L5a
            r6 = 37
            java.lang.String r8 = "Unsupported pssh version: "
            java.lang.String r9 = "PsshAtomUtil"
            f.a.b.a.a.G(r6, r8, r7, r9)
            goto L7c
        L5a:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.l()
            long r12 = r6.l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L72
            int r8 = r6.u()
            int r8 = r8 * 16
            r6.D(r8)
        L72:
            int r8 = r6.u()
            int r10 = r6.a()
            if (r8 == r10) goto L7e
        L7c:
            r6 = r2
            goto L91
        L7e:
            byte[] r10 = new byte[r8]
            byte[] r11 = r6.a
            int r12 = r6.b
            java.lang.System.arraycopy(r11, r12, r10, r1, r8)
            int r11 = r6.b
            int r11 = r11 + r8
            r6.b = r11
            f.h.b.b.y1.h0.j r6 = new f.h.b.b.y1.h0.j
            r6.<init>(r9, r7, r10)
        L91:
            if (r6 != 0) goto L95
            r6 = r2
            goto L97
        L95:
            java.util.UUID r6 = r6.a
        L97:
            if (r6 != 0) goto La1
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lab
        La1:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lab:
            int r3 = r3 + 1
            goto L8
        Laf:
            if (r4 != 0) goto Lb2
            goto Lc0
        Lb2:
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r1]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r0
            r14.<init>(r2, r1, r0)
            r2 = r14
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.g.h(java.util.List):com.google.android.exoplayer2.drm.DrmInitData");
    }

    public static void i(t tVar, int i2, o oVar) {
        tVar.C(i2 + 8);
        int f2 = tVar.f() & 16777215;
        if ((f2 & 1) == 0) {
            boolean z = (f2 & 2) != 0;
            int u = tVar.u();
            if (u == 0) {
                Arrays.fill(oVar.f4842m, 0, oVar.f4834e, false);
                return;
            } else if (u == oVar.f4834e) {
                Arrays.fill(oVar.f4842m, 0, u, z);
                int a2 = tVar.a();
                t tVar2 = oVar.o;
                byte[] bArr = tVar2.a;
                if (bArr.length < a2) {
                    bArr = new byte[a2];
                }
                tVar2.a = bArr;
                tVar2.c = a2;
                tVar2.b = 0;
                oVar.f4841l = true;
                oVar.p = true;
                tVar.e(bArr, 0, a2);
                oVar.o.C(0);
                oVar.p = false;
                return;
            } else {
                throw new ParserException(f.a.b.a.a.e(80, "Senc sample count ", u, " is different from fragment sample count", oVar.f4834e));
            }
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        return l.a(iVar, true, false);
    }

    public final void c() {
        this.f4800m = 0;
        this.p = 0;
    }

    public final f d(SparseArray<f> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        f fVar = sparseArray.get(i2);
        Objects.requireNonNull(fVar);
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:352:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x079f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07a1 A[SYNTHETIC] */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r29, f.h.b.b.y1.s r30) {
        /*
            Method dump skipped, instructions count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.g.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        int i2;
        this.B = jVar;
        c();
        w[] wVarArr = new w[2];
        this.C = wVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((this.a & 4) != 0) {
            wVarArr[0] = this.B.p(100, 5);
            i3 = 101;
            i2 = 1;
        } else {
            i2 = 0;
        }
        w[] wVarArr2 = (w[]) b0.C(this.C, i2);
        this.C = wVarArr2;
        for (w wVar : wVarArr2) {
            wVar.e(G);
        }
        this.D = new w[this.b.size()];
        while (i4 < this.D.length) {
            w p = this.B.p(i3, 3);
            p.e(this.b.get(i4));
            this.D[i4] = p;
            i4++;
            i3++;
        }
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.c.valueAt(i2).e();
        }
        this.f4799l.clear();
        this.s = 0;
        this.t = j3;
        this.f4798k.clear();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r48) {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.g.j(long):void");
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
