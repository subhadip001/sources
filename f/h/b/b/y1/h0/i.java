package f.h.b.b.y1.h0;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import f.h.b.b.g2.r;
import f.h.b.b.y1.h0.d;
import f.h.b.b.y1.t;
import f.h.b.b.y1.u;
import f.h.b.b.y1.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes.dex */
public final class i implements f.h.b.b.y1.h, t {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final f.h.b.b.g2.t b;
    public final f.h.b.b.g2.t c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.g2.t f4810d;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.b.g2.t f4811e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<d.a> f4812f;

    /* renamed from: g  reason: collision with root package name */
    public final k f4813g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Metadata.Entry> f4814h;

    /* renamed from: i  reason: collision with root package name */
    public int f4815i;

    /* renamed from: j  reason: collision with root package name */
    public int f4816j;

    /* renamed from: k  reason: collision with root package name */
    public long f4817k;

    /* renamed from: l  reason: collision with root package name */
    public int f4818l;

    /* renamed from: m  reason: collision with root package name */
    public f.h.b.b.g2.t f4819m;
    public int n;
    public int o;
    public int p;
    public int q;
    public f.h.b.b.y1.j r;
    public a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public MotionPhotoMetadata x;

    /* compiled from: Mp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final m a;
        public final p b;
        public final w c;

        /* renamed from: d  reason: collision with root package name */
        public int f4820d;

        public a(m mVar, p pVar, w wVar) {
            this.a = mVar;
            this.b = pVar;
            this.c = wVar;
        }
    }

    static {
        b bVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.h0.b
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new i(0)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    public i(int i2) {
        this.a = i2;
        this.f4815i = (i2 & 4) != 0 ? 3 : 0;
        this.f4813g = new k();
        this.f4814h = new ArrayList();
        this.f4811e = new f.h.b.b.g2.t(16);
        this.f4812f = new ArrayDeque<>();
        this.b = new f.h.b.b.g2.t(r.a);
        this.c = new f.h.b.b.g2.t(4);
        this.f4810d = new f.h.b.b.g2.t();
        this.n = -1;
    }

    public static long k(p pVar, long j2, long j3) {
        int a2 = pVar.a(j2);
        if (a2 == -1) {
            a2 = pVar.b(j2);
        }
        return a2 == -1 ? j3 : Math.min(pVar.c[a2], j3);
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        return l.a(iVar, false, (this.a & 2) != 0);
    }

    @Override // f.h.b.b.y1.t
    public boolean c() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:356:0x049d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0006 A[SYNTHETIC] */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r40, f.h.b.b.y1.s r41) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.i.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.r = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.f4812f.clear();
        this.f4818l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j2 == 0) {
            if (this.f4815i != 3) {
                j();
                return;
            }
            k kVar = this.f4813g;
            kVar.a.clear();
            kVar.b = 0;
            this.f4814h.clear();
            return;
        }
        a[] aVarArr = this.s;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                p pVar = aVar.b;
                int a2 = pVar.a(j3);
                if (a2 == -1) {
                    a2 = pVar.b(j3);
                }
                aVar.f4820d = a2;
            }
        }
    }

    @Override // f.h.b.b.y1.t
    public t.a h(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int b;
        long j7 = j2;
        a[] aVarArr = this.s;
        Objects.requireNonNull(aVarArr);
        if (aVarArr.length == 0) {
            return new t.a(u.c);
        }
        long j8 = -1;
        int i2 = this.u;
        if (i2 != -1) {
            p pVar = this.s[i2].b;
            int a2 = pVar.a(j7);
            if (a2 == -1) {
                a2 = pVar.b(j7);
            }
            if (a2 == -1) {
                return new t.a(u.c);
            }
            long j9 = pVar.f4845f[a2];
            j3 = pVar.c[a2];
            if (j9 >= j7 || a2 >= pVar.b - 1 || (b = pVar.b(j7)) == -1 || b == a2) {
                j6 = -9223372036854775807L;
            } else {
                long j10 = pVar.f4845f[b];
                long j11 = pVar.c[b];
                j6 = j10;
                j8 = j11;
            }
            j4 = j8;
            j5 = j6;
            j7 = j9;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.s;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.u) {
                p pVar2 = aVarArr2[i3].b;
                long k2 = k(pVar2, j7, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = k(pVar2, j5, j4);
                }
                j3 = k2;
            }
            i3++;
        }
        u uVar = new u(j7, j3);
        if (j5 == -9223372036854775807L) {
            return new t.a(uVar);
        }
        return new t.a(uVar, new u(j5, j4));
    }

    @Override // f.h.b.b.y1.t
    public long i() {
        return this.v;
    }

    public final void j() {
        this.f4815i = 0;
        this.f4818l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d0, code lost:
        r13 = r3.n(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r9 != 1851878757) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dd, code lost:
        r6 = r3.n(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
        if (r9 != 1684108385) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e9, code lost:
        r5 = r11;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ec, code lost:
        r3.D(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f1, code lost:
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f4, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f6, code lost:
        if (r13 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f8, code lost:
        if (r6 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fb, code lost:
        if (r0 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ff, code lost:
        r3.C(r0);
        r3.D(16);
        r0 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r13, r6, r3.n(r5 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0215, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0219, code lost:
        r19 = r8;
        r8 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
        if (r8 != 6516084) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0224, code lost:
        r0 = f.h.b.b.y1.h0.h.a(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x022a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0230, code lost:
        if (r8 == 7233901) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
        if (r8 != 7631467) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023c, code lost:
        if (r8 == 6516589) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0241, code lost:
        if (r8 != 7828084) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0248, code lost:
        if (r8 != 6578553) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024a, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TDRC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0255, code lost:
        if (r8 != 4280916) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0257, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TPE1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0261, code lost:
        if (r8 != 7630703) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0263, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSSE", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026d, code lost:
        if (r8 != 6384738) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026f, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TALB", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0279, code lost:
        if (r8 != 7108978) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027b, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "USLT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0285, code lost:
        if (r8 != 6776174) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0287, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TCON", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028f, code lost:
        if (r8 != 6779504) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0291, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TIT1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0298, code lost:
        r5 = java.lang.String.valueOf(f.h.b.b.y1.h0.d.a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a6, code lost:
        if (r5.length() == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a8, code lost:
        r5 = "Skipped unknown metadata entry: ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ad, code lost:
        r5 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b2, code lost:
        android.util.Log.d("MetadataUtil", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02b5, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b7, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TCOM", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02be, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TIT2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c7, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c9, code lost:
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02cc, code lost:
        r13 = null;
        r6 = r16;
        r0 = r17;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d5, code lost:
        r3.C(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d8, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d9, code lost:
        r17 = r0;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e1, code lost:
        if (r4.isEmpty() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e4, code lost:
        r0 = new com.google.android.exoplayer2.metadata.Metadata(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        r3.C(r6);
        r6 = r6 + r7;
        r3.D(r9);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r5 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r5 >= r6) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r7 = r3.f() + r5;
        r5 = r3.f();
        r9 = (r5 >> 24) & 255;
        r16 = r6;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r9 == 169) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r9 != 253) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r5 != 1735291493) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r5 = f.h.b.b.y1.h0.h.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r5 <= 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r9 = f.h.b.b.y1.h0.h.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
        if (r5 > r9.length) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
        r5 = r9[r5 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        r0 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
        if (r5 != 1684632427) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
        r0 = f.h.b.b.y1.h0.h.c(r5, "TPOS", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r5 != 1953655662) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
        r0 = f.h.b.b.y1.h0.h.c(r5, "TRCK", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
        if (r5 != 1953329263) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
        r0 = f.h.b.b.y1.h0.h.e(r5, "TBPM", r3, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011b, code lost:
        if (r5 != 1668311404) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011d, code lost:
        r0 = f.h.b.b.y1.h0.h.e(r5, "TCMP", r3, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
        if (r5 != 1668249202) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        r0 = f.h.b.b.y1.h0.h.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (r5 != 1631670868) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TPE2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r5 != 1936682605) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSOT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5 != 1936679276) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSO2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
        if (r5 != 1936679282) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSOA", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
        if (r5 != 1936679265) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSOP", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0170, code lost:
        if (r5 != 1936679791) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TSOC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017c, code lost:
        if (r5 != 1920233063) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
        r0 = f.h.b.b.y1.h0.h.e(r5, "ITUNESADVISORY", r3, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5 != 1885823344) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018c, code lost:
        r0 = f.h.b.b.y1.h0.h.e(r5, "ITUNESGAPLESS", r3, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0197, code lost:
        if (r5 != 1936683886) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TVSHOWSORT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a3, code lost:
        if (r5 != 1953919848) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
        r0 = f.h.b.b.y1.h0.h.d(r5, "TVSHOW", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ab, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b2, code lost:
        if (r5 != 757935405) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b4, code lost:
        r0 = -1;
        r5 = -1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b7, code lost:
        r9 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
        if (r9 >= r7) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
        r11 = r3.f();
        r9 = r3.f();
        r19 = r8;
        r3.D(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ce, code lost:
        if (r9 != 1835360622) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0603 A[LOOP:12: B:309:0x0600->B:311:0x0603, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x061f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(long r23) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.h0.i.l(long):void");
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
