package f.h.b.b.y1.f0;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import com.google.logging.type.LogSeverity;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.n;
import f.h.b.b.g2.r;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.w;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: MatroskaExtractor.java */
/* loaded from: classes.dex */
public class e implements h {
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final UUID e0;
    public static final Map<String, Integer> f0;
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final f.h.b.b.y1.f0.d a;
    public j a0;
    public final g b;
    public final SparseArray<c> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4745d;

    /* renamed from: e  reason: collision with root package name */
    public final t f4746e;

    /* renamed from: f  reason: collision with root package name */
    public final t f4747f;

    /* renamed from: g  reason: collision with root package name */
    public final t f4748g;

    /* renamed from: h  reason: collision with root package name */
    public final t f4749h;

    /* renamed from: i  reason: collision with root package name */
    public final t f4750i;

    /* renamed from: j  reason: collision with root package name */
    public final t f4751j;

    /* renamed from: k  reason: collision with root package name */
    public final t f4752k;

    /* renamed from: l  reason: collision with root package name */
    public final t f4753l;

    /* renamed from: m  reason: collision with root package name */
    public final t f4754m;
    public final t n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public c u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public final class b implements f.h.b.b.y1.f0.c {
        public b(a aVar) {
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final byte[] a = new byte[10];
        public boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public long f4765d;

        /* renamed from: e  reason: collision with root package name */
        public int f4766e;

        /* renamed from: f  reason: collision with root package name */
        public int f4767f;

        /* renamed from: g  reason: collision with root package name */
        public int f4768g;

        public void a(c cVar) {
            if (this.c > 0) {
                cVar.X.d(this.f4765d, this.f4766e, this.f4767f, this.f4768g, cVar.f4761j);
                this.c = 0;
            }
        }
    }

    static {
        f.h.b.b.y1.f0.a aVar = new l() { // from class: f.h.b.b.y1.f0.a
            @Override // f.h.b.b.y1.l
            public final h[] a() {
                return new h[]{new e(0)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
        b0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        c0 = b0.v("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        e0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f0 = Collections.unmodifiableMap(hashMap);
    }

    public e(int i2) {
        f.h.b.b.y1.f0.b bVar = new f.h.b.b.y1.f0.b();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = bVar;
        bVar.f4741d = new b(null);
        this.f4745d = (i2 & 1) == 0;
        this.b = new g();
        this.c = new SparseArray<>();
        this.f4748g = new t(4);
        this.f4749h = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f4750i = new t(4);
        this.f4746e = new t(r.a);
        this.f4747f = new t(4);
        this.f4751j = new t();
        this.f4752k = new t();
        this.f4753l = new t(8);
        this.f4754m = new t();
        this.n = new t();
        this.L = new int[1];
    }

    public static int[] i(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    public static byte[] j(long j2, String str, long j3) {
        f.h.b.b.e2.j.c(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * SettingsJsonConstants.SETTINGS_CACHE_DURATION_DEFAULT) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return b0.v(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    public final void a(int i2) {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw new ParserException(sb.toString());
        }
    }

    @Override // f.h.b.b.y1.h
    public final boolean b(i iVar) {
        long a2;
        int i2;
        f fVar = new f();
        long a3 = iVar.a();
        long j2 = 1024;
        int i3 = (a3 > (-1L) ? 1 : (a3 == (-1L) ? 0 : -1));
        if (i3 != 0 && a3 <= 1024) {
            j2 = a3;
        }
        int i4 = (int) j2;
        iVar.o(fVar.a.a, 0, 4);
        fVar.b = 4;
        for (long s = fVar.a.s(); s != 440786851; s = ((s << 8) & (-256)) | (fVar.a.a[0] & 255)) {
            int i5 = fVar.b + 1;
            fVar.b = i5;
            if (i5 == i4) {
                return false;
            }
            iVar.o(fVar.a.a, 0, 1);
        }
        long a4 = fVar.a(iVar);
        long j3 = fVar.b;
        if (a4 == Long.MIN_VALUE) {
            return false;
        }
        if (i3 != 0 && j3 + a4 >= a3) {
            return false;
        }
        while (true) {
            int i6 = (fVar.b > (j3 + a4) ? 1 : (fVar.b == (j3 + a4) ? 0 : -1));
            if (i6 >= 0) {
                return i6 == 0;
            } else if (fVar.a(iVar) == Long.MIN_VALUE || (a2 = fVar.a(iVar)) < 0 || a2 > 2147483647L) {
                return false;
            } else {
                if (i2 != 0) {
                    int i7 = (int) a2;
                    iVar.g(i7);
                    fVar.b += i7;
                }
            }
        }
    }

    public final void c(int i2) {
        if (this.u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw new ParserException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(f.h.b.b.y1.f0.e.c r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.f0.e.d(f.h.b.b.y1.f0.e$c, long, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0427, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x079d, code lost:
        if (r4 != 7) goto L319;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08fd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v155 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v88 */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(f.h.b.b.y1.i r27, f.h.b.b.y1.s r28) {
        /*
            Method dump skipped, instructions count: 2894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.f0.e.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public final void f(j jVar) {
        this.a0 = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.B = -9223372036854775807L;
        this.G = 0;
        f.h.b.b.y1.f0.b bVar = (f.h.b.b.y1.f0.b) this.a;
        bVar.f4742e = 0;
        bVar.b.clear();
        g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        g gVar2 = this.b;
        gVar2.b = 0;
        gVar2.c = 0;
        l();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            d dVar = this.c.valueAt(i2).T;
            if (dVar != null) {
                dVar.b = false;
                dVar.c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0812, code lost:
        if (r3.l() == r5.getLeastSignificantBits()) goto L334;
     */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0a75  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(int r23) {
        /*
            Method dump skipped, instructions count: 3224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.f0.e.h(int):void");
    }

    public final void k(i iVar, int i2) {
        t tVar = this.f4748g;
        if (tVar.c >= i2) {
            return;
        }
        byte[] bArr = tVar.a;
        if (bArr.length < i2) {
            tVar.b(Math.max(bArr.length * 2, i2));
        }
        t tVar2 = this.f4748g;
        byte[] bArr2 = tVar2.a;
        int i3 = tVar2.c;
        iVar.readFully(bArr2, i3, i2 - i3);
        this.f4748g.B(i2);
    }

    public final void l() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f4751j.y(0);
    }

    public final long m(long j2) {
        long j3 = this.r;
        if (j3 != -9223372036854775807L) {
            return b0.E(j2, j3, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    public final int n(i iVar, c cVar, int i2) {
        int i3;
        int i4;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            o(iVar, b0, i2);
            int i5 = this.S;
            l();
            return i5;
        } else if ("S_TEXT/ASS".equals(cVar.b)) {
            o(iVar, d0, i2);
            int i6 = this.S;
            l();
            return i6;
        } else {
            w wVar = cVar.X;
            if (!this.U) {
                if (cVar.f4759h) {
                    this.O &= -1073741825;
                    if (!this.V) {
                        iVar.readFully(this.f4748g.a, 0, 1);
                        this.R++;
                        byte[] bArr = this.f4748g.a;
                        if ((bArr[0] & 128) != 128) {
                            this.Y = bArr[0];
                            this.V = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.Y;
                    if ((b2 & 1) == 1) {
                        boolean z = (b2 & 2) == 2;
                        this.O |= CommonUtils.BYTES_IN_A_GIGABYTE;
                        if (!this.Z) {
                            iVar.readFully(this.f4753l.a, 0, 8);
                            this.R += 8;
                            this.Z = true;
                            t tVar = this.f4748g;
                            tVar.a[0] = (byte) ((z ? 128 : 0) | 8);
                            tVar.C(0);
                            wVar.f(this.f4748g, 1, 1);
                            this.S++;
                            this.f4753l.C(0);
                            wVar.f(this.f4753l, 8, 1);
                            this.S += 8;
                        }
                        if (z) {
                            if (!this.W) {
                                iVar.readFully(this.f4748g.a, 0, 1);
                                this.R++;
                                this.f4748g.C(0);
                                this.X = this.f4748g.r();
                                this.W = true;
                            }
                            int i7 = this.X * 4;
                            this.f4748g.y(i7);
                            iVar.readFully(this.f4748g.a, 0, i7);
                            this.R += i7;
                            short s = (short) ((this.X / 2) + 1);
                            int i8 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.o = ByteBuffer.allocate(i8);
                            }
                            this.o.position(0);
                            this.o.putShort(s);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i4 = this.X;
                                if (i9 >= i4) {
                                    break;
                                }
                                int u = this.f4748g.u();
                                if (i9 % 2 == 0) {
                                    this.o.putShort((short) (u - i10));
                                } else {
                                    this.o.putInt(u - i10);
                                }
                                i9++;
                                i10 = u;
                            }
                            int i11 = (i2 - this.R) - i10;
                            if (i4 % 2 == 1) {
                                this.o.putInt(i11);
                            } else {
                                this.o.putShort((short) i11);
                                this.o.putInt(0);
                            }
                            this.f4754m.A(this.o.array(), i8);
                            wVar.f(this.f4754m, i8, 1);
                            this.S += i8;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f4760i;
                    if (bArr2 != null) {
                        t tVar2 = this.f4751j;
                        int length = bArr2.length;
                        tVar2.a = bArr2;
                        tVar2.c = length;
                        tVar2.b = 0;
                    }
                }
                if (cVar.f4757f > 0) {
                    this.O |= 268435456;
                    this.n.y(0);
                    this.f4748g.y(4);
                    t tVar3 = this.f4748g;
                    byte[] bArr3 = tVar3.a;
                    bArr3[0] = (byte) ((i2 >> 24) & 255);
                    bArr3[1] = (byte) ((i2 >> 16) & 255);
                    bArr3[2] = (byte) ((i2 >> 8) & 255);
                    bArr3[3] = (byte) (i2 & 255);
                    wVar.f(tVar3, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int i12 = i2 + this.f4751j.c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
                if (cVar.T != null) {
                    f.h.b.b.e2.j.g(this.f4751j.c == 0);
                    d dVar = cVar.T;
                    if (!dVar.b) {
                        iVar.o(dVar.a, 0, 10);
                        iVar.l();
                        byte[] bArr4 = dVar.a;
                        if (bArr4[4] == -8 && bArr4[5] == 114 && bArr4[6] == 111 && (bArr4[7] & 254) == 186) {
                            i3 = 40 << ((bArr4[(bArr4[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
                        } else {
                            i3 = 0;
                        }
                        if (i3 != 0) {
                            dVar.b = true;
                        }
                    }
                }
                while (true) {
                    int i13 = this.R;
                    if (i13 >= i12) {
                        break;
                    }
                    int p = p(iVar, wVar, i12 - i13);
                    this.R += p;
                    this.S += p;
                }
            } else {
                byte[] bArr5 = this.f4747f.a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i14 = cVar.Y;
                int i15 = 4 - i14;
                while (this.R < i12) {
                    int i16 = this.T;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.f4751j.a());
                        iVar.readFully(bArr5, i15 + min, i14 - min);
                        if (min > 0) {
                            t tVar4 = this.f4751j;
                            System.arraycopy(tVar4.a, tVar4.b, bArr5, i15, min);
                            tVar4.b += min;
                        }
                        this.R += i14;
                        this.f4747f.C(0);
                        this.T = this.f4747f.u();
                        this.f4746e.C(0);
                        wVar.c(this.f4746e, 4);
                        this.S += 4;
                    } else {
                        int p2 = p(iVar, wVar, i16);
                        this.R += p2;
                        this.S += p2;
                        this.T -= p2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.b)) {
                this.f4749h.C(0);
                wVar.c(this.f4749h, 4);
                this.S += 4;
            }
            int i17 = this.S;
            l();
            return i17;
        }
    }

    public final void o(i iVar, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        t tVar = this.f4752k;
        byte[] bArr2 = tVar.a;
        if (bArr2.length < length) {
            tVar.z(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iVar.readFully(this.f4752k.a, bArr.length, i2);
        this.f4752k.C(0);
        this.f4752k.B(length);
    }

    public final int p(i iVar, w wVar, int i2) {
        int a2 = this.f4751j.a();
        if (a2 > 0) {
            int min = Math.min(i2, a2);
            wVar.c(this.f4751j, min);
            return min;
        }
        return wVar.b(iVar, i2, false);
    }

    @Override // f.h.b.b.y1.h
    public final void release() {
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public static final class c {
        public byte[] N;
        public d T;
        public boolean U;
        public w X;
        public int Y;
        public String a;
        public String b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4755d;

        /* renamed from: e  reason: collision with root package name */
        public int f4756e;

        /* renamed from: f  reason: collision with root package name */
        public int f4757f;

        /* renamed from: g  reason: collision with root package name */
        public int f4758g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4759h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f4760i;

        /* renamed from: j  reason: collision with root package name */
        public w.a f4761j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f4762k;

        /* renamed from: l  reason: collision with root package name */
        public DrmInitData f4763l;

        /* renamed from: m  reason: collision with root package name */
        public int f4764m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = 0;
        public int r = -1;
        public float s = 0.0f;
        public float t = 0.0f;
        public float u = 0.0f;
        public byte[] v = null;
        public int w = -1;
        public boolean x = false;
        public int y = -1;
        public int z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = LogSeverity.INFO_VALUE;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public c() {
        }

        public final byte[] a(String str) {
            byte[] bArr = this.f4762k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                throw new ParserException(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "));
            }
            return bArr;
        }

        public c(a aVar) {
        }
    }
}
