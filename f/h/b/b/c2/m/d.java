package f.h.b.b.c2.m;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import f.h.b.b.c2.i;
import f.h.b.b.e2.j;
import f.h.b.b.g2.s;
import f.h.b.b.g2.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: Cea708Decoder.java */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: g  reason: collision with root package name */
    public final t f3958g = new t();

    /* renamed from: h  reason: collision with root package name */
    public final s f3959h = new s();

    /* renamed from: i  reason: collision with root package name */
    public int f3960i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f3961j;

    /* renamed from: k  reason: collision with root package name */
    public final b[] f3962k;

    /* renamed from: l  reason: collision with root package name */
    public b f3963l;

    /* renamed from: m  reason: collision with root package name */
    public List<f.h.b.b.c2.c> f3964m;
    public List<f.h.b.b.c2.c> n;
    public c o;
    public int p;

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final f.h.b.b.c2.c a;
        public final int b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
            boolean z2;
            int i7;
            if (z) {
                i7 = i5;
                z2 = true;
            } else {
                z2 = false;
                i7 = -16777216;
            }
            this.a = new f.h.b.b.c2.c(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, f4, -3.4028235E38f, z2, i7, Integer.MIN_VALUE, null);
            this.b = i6;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;
        public static final int w = d(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        public static final int[] z;
        public final List<SpannableString> a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3965d;

        /* renamed from: e  reason: collision with root package name */
        public int f3966e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3967f;

        /* renamed from: g  reason: collision with root package name */
        public int f3968g;

        /* renamed from: h  reason: collision with root package name */
        public int f3969h;

        /* renamed from: i  reason: collision with root package name */
        public int f3970i;

        /* renamed from: j  reason: collision with root package name */
        public int f3971j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3972k;

        /* renamed from: l  reason: collision with root package name */
        public int f3973l;

        /* renamed from: m  reason: collision with root package name */
        public int f3974m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int d2 = d(0, 0, 0, 0);
            x = d2;
            int d3 = d(0, 0, 0, 3);
            y = d3;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{d2, d3, d2, d2, d3, d2, d2};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{d2, d2, d2, d2, d2, d3, d3};
        }

        public b() {
            f();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int d(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                f.h.b.b.e2.j.f(r4, r0, r1)
                f.h.b.b.e2.j.f(r5, r0, r1)
                f.h.b.b.e2.j.f(r6, r0, r1)
                f.h.b.b.e2.j.f(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.m.d.b.d(int, int, int, int):int");
        }

        public void a(char c) {
            if (c == '\n') {
                this.a.add(b());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((!this.f3972k || this.a.size() < this.f3971j) && this.a.size() < 15) {
                        return;
                    }
                    this.a.remove(0);
                }
            } else {
                this.b.append(c);
            }
        }

        public SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void c() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public boolean e() {
            return !this.c || (this.a.isEmpty() && this.b.length() == 0);
        }

        public void f() {
            c();
            this.c = false;
            this.f3965d = false;
            this.f3966e = 4;
            this.f3967f = false;
            this.f3968g = 0;
            this.f3969h = 0;
            this.f3970i = 0;
            this.f3971j = 15;
            this.f3972k = true;
            this.f3973l = 0;
            this.f3974m = 0;
            this.n = 0;
            int i2 = x;
            this.o = i2;
            this.s = w;
            this.u = i2;
        }

        public void g(boolean z2, boolean z3) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.b.length();
                }
            } else if (z3) {
            } else {
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void h(int i2, int i3) {
            if (this.r != -1 && this.s != i2) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i2 != w) {
                this.r = this.b.length();
                this.s = i2;
            }
            if (this.t != -1 && this.u != i3) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i3 != x) {
                this.t = this.b.length();
                this.u = i3;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;

        /* renamed from: d  reason: collision with root package name */
        public int f3975d = 0;

        public c(int i2, int i3) {
            this.a = i2;
            this.b = i3;
            this.c = new byte[(i3 * 2) - 1];
        }
    }

    public d(int i2, List<byte[]> list) {
        this.f3961j = i2 == -1 ? 1 : i2;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f3962k = new b[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f3962k[i3] = new b();
        }
        this.f3963l = this.f3962k[0];
    }

    @Override // f.h.b.b.c2.m.e
    public f.h.b.b.c2.f e() {
        List<f.h.b.b.c2.c> list = this.f3964m;
        this.n = list;
        Objects.requireNonNull(list);
        return new f(list);
    }

    @Override // f.h.b.b.c2.m.e
    public void f(i iVar) {
        ByteBuffer byteBuffer = iVar.f752h;
        Objects.requireNonNull(byteBuffer);
        this.f3958g.A(byteBuffer.array(), byteBuffer.limit());
        while (this.f3958g.a() >= 3) {
            int r = this.f3958g.r() & 7;
            int i2 = r & 3;
            boolean z = (r & 4) == 4;
            byte r2 = (byte) this.f3958g.r();
            byte r3 = (byte) this.f3958g.r();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        j();
                        int i3 = (r2 & 192) >> 6;
                        int i4 = this.f3960i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            l();
                            Log.w("Cea708Decoder", f.a.b.a.a.e(71, "Sequence number discontinuity. previous=", this.f3960i, " current=", i3));
                        }
                        this.f3960i = i3;
                        int i5 = r2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        c cVar = new c(i3, i5);
                        this.o = cVar;
                        byte[] bArr = cVar.c;
                        int i6 = cVar.f3975d;
                        cVar.f3975d = i6 + 1;
                        bArr[i6] = r3;
                    } else {
                        j.c(i2 == 2);
                        c cVar2 = this.o;
                        if (cVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i7 = cVar2.f3975d;
                            int i8 = i7 + 1;
                            cVar2.f3975d = i8;
                            bArr2[i7] = r2;
                            cVar2.f3975d = i8 + 1;
                            bArr2[i8] = r3;
                        }
                    }
                    c cVar3 = this.o;
                    if (cVar3.f3975d == (cVar3.b * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // f.h.b.b.c2.m.e, f.h.b.b.v1.c
    public void flush() {
        super.flush();
        this.f3964m = null;
        this.n = null;
        this.p = 0;
        this.f3963l = this.f3962k[0];
        l();
        this.o = null;
    }

    @Override // f.h.b.b.c2.m.e
    public boolean h() {
        return this.f3964m != this.n;
    }

    public final void j() {
        b bVar;
        c cVar = this.o;
        if (cVar == null) {
            return;
        }
        int i2 = cVar.f3975d;
        int i3 = (cVar.b * 2) - 1;
        if (i2 != i3) {
            int i4 = cVar.a;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(i3);
            sb.append(", but current index is ");
            sb.append(i2);
            sb.append(" (sequence number ");
            sb.append(i4);
            sb.append(");");
            Log.d("Cea708Decoder", sb.toString());
        }
        s sVar = this.f3959h;
        c cVar2 = this.o;
        sVar.j(cVar2.c, cVar2.f3975d);
        int i5 = 3;
        int g2 = this.f3959h.g(3);
        int g3 = this.f3959h.g(5);
        int i6 = 7;
        int i7 = 6;
        if (g2 == 7) {
            this.f3959h.m(2);
            g2 = this.f3959h.g(6);
            if (g2 < 7) {
                f.a.b.a.a.G(44, "Invalid extended service number: ", g2, "Cea708Decoder");
            }
        }
        if (g3 == 0) {
            if (g2 != 0) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("serviceNumber is non-zero (");
                sb2.append(g2);
                sb2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb2.toString());
            }
        } else if (g2 == this.f3961j) {
            boolean z = false;
            while (this.f3959h.b() > 0) {
                int g4 = this.f3959h.g(8);
                if (g4 == 16) {
                    int g5 = this.f3959h.g(8);
                    if (g5 > 31) {
                        if (g5 <= 127) {
                            if (g5 == 32) {
                                this.f3963l.a(' ');
                            } else if (g5 == 33) {
                                this.f3963l.a((char) 160);
                            } else if (g5 == 37) {
                                this.f3963l.a((char) 8230);
                            } else if (g5 == 42) {
                                this.f3963l.a((char) 352);
                            } else if (g5 == 44) {
                                this.f3963l.a((char) 338);
                            } else if (g5 == 63) {
                                this.f3963l.a((char) 376);
                            } else if (g5 == 57) {
                                this.f3963l.a((char) 8482);
                            } else if (g5 == 58) {
                                this.f3963l.a((char) 353);
                            } else if (g5 == 60) {
                                this.f3963l.a((char) 339);
                            } else if (g5 != 61) {
                                switch (g5) {
                                    case 48:
                                        this.f3963l.a((char) 9608);
                                        break;
                                    case 49:
                                        this.f3963l.a((char) 8216);
                                        break;
                                    case 50:
                                        this.f3963l.a((char) 8217);
                                        break;
                                    case 51:
                                        this.f3963l.a((char) 8220);
                                        break;
                                    case 52:
                                        this.f3963l.a((char) 8221);
                                        break;
                                    case 53:
                                        this.f3963l.a((char) 8226);
                                        break;
                                    default:
                                        switch (g5) {
                                            case 118:
                                                this.f3963l.a((char) 8539);
                                                break;
                                            case 119:
                                                this.f3963l.a((char) 8540);
                                                break;
                                            case 120:
                                                this.f3963l.a((char) 8541);
                                                break;
                                            case 121:
                                                this.f3963l.a((char) 8542);
                                                break;
                                            case 122:
                                                this.f3963l.a((char) 9474);
                                                break;
                                            case 123:
                                                this.f3963l.a((char) 9488);
                                                break;
                                            case 124:
                                                this.f3963l.a((char) 9492);
                                                break;
                                            case 125:
                                                this.f3963l.a((char) 9472);
                                                break;
                                            case 126:
                                                this.f3963l.a((char) 9496);
                                                break;
                                            case 127:
                                                this.f3963l.a((char) 9484);
                                                break;
                                            default:
                                                f.a.b.a.a.G(33, "Invalid G2 character: ", g5, "Cea708Decoder");
                                                break;
                                        }
                                }
                            } else {
                                this.f3963l.a((char) 8480);
                            }
                        } else if (g5 <= 159) {
                            if (g5 <= 135) {
                                this.f3959h.m(32);
                            } else if (g5 <= 143) {
                                this.f3959h.m(40);
                            } else if (g5 <= 159) {
                                this.f3959h.m(2);
                                this.f3959h.m(this.f3959h.g(6) * 8);
                            }
                        } else if (g5 > 255) {
                            f.a.b.a.a.G(37, "Invalid extended command: ", g5, "Cea708Decoder");
                        } else if (g5 == 160) {
                            this.f3963l.a((char) 13252);
                        } else {
                            f.a.b.a.a.G(33, "Invalid G3 character: ", g5, "Cea708Decoder");
                            this.f3963l.a('_');
                        }
                        z = true;
                    } else if (g5 > 7) {
                        if (g5 <= 15) {
                            this.f3959h.m(8);
                        } else if (g5 <= 23) {
                            this.f3959h.m(16);
                        } else if (g5 <= 31) {
                            this.f3959h.m(24);
                        }
                    }
                } else if (g4 > 31) {
                    if (g4 <= 127) {
                        if (g4 == 127) {
                            this.f3963l.a((char) 9835);
                        } else {
                            this.f3963l.a((char) (g4 & 255));
                        }
                    } else if (g4 <= 159) {
                        switch (g4) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i8 = g4 - 128;
                                if (this.p != i8) {
                                    this.p = i8;
                                    this.f3963l = this.f3962k[i8];
                                    break;
                                }
                                break;
                            case 136:
                                for (int i9 = 1; i9 <= 8; i9++) {
                                    if (this.f3959h.f()) {
                                        this.f3962k[8 - i9].c();
                                    }
                                }
                                break;
                            case 137:
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    if (this.f3959h.f()) {
                                        this.f3962k[8 - i10].f3965d = true;
                                    }
                                }
                                break;
                            case 138:
                                for (int i11 = 1; i11 <= 8; i11++) {
                                    if (this.f3959h.f()) {
                                        this.f3962k[8 - i11].f3965d = false;
                                    }
                                }
                                break;
                            case 139:
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (this.f3959h.f()) {
                                        this.f3962k[8 - i12].f3965d = !bVar.f3965d;
                                    }
                                }
                                break;
                            case 140:
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    if (this.f3959h.f()) {
                                        this.f3962k[8 - i13].f();
                                    }
                                }
                                break;
                            case 141:
                                this.f3959h.m(8);
                                break;
                            case 142:
                                break;
                            case 143:
                                l();
                                break;
                            case 144:
                                if (!this.f3963l.c) {
                                    this.f3959h.m(16);
                                    break;
                                } else {
                                    this.f3959h.g(4);
                                    this.f3959h.g(2);
                                    this.f3959h.g(2);
                                    boolean f2 = this.f3959h.f();
                                    boolean f3 = this.f3959h.f();
                                    this.f3959h.g(3);
                                    this.f3959h.g(3);
                                    this.f3963l.g(f2, f3);
                                    break;
                                }
                            case 145:
                                if (!this.f3963l.c) {
                                    this.f3959h.m(24);
                                    break;
                                } else {
                                    int d2 = b.d(this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2));
                                    int d3 = b.d(this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2));
                                    this.f3959h.m(2);
                                    b.d(this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2), 0);
                                    this.f3963l.h(d2, d3);
                                    break;
                                }
                            case 146:
                                if (!this.f3963l.c) {
                                    this.f3959h.m(16);
                                    break;
                                } else {
                                    this.f3959h.m(4);
                                    int g6 = this.f3959h.g(4);
                                    this.f3959h.m(2);
                                    this.f3959h.g(6);
                                    b bVar2 = this.f3963l;
                                    if (bVar2.v != g6) {
                                        bVar2.a('\n');
                                    }
                                    bVar2.v = g6;
                                    break;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w("Cea708Decoder", f.a.b.a.a.d(31, "Invalid C1 command: ", g4));
                                break;
                            case 151:
                                if (!this.f3963l.c) {
                                    this.f3959h.m(32);
                                    break;
                                } else {
                                    int d4 = b.d(this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2));
                                    this.f3959h.g(2);
                                    b.d(this.f3959h.g(2), this.f3959h.g(2), this.f3959h.g(2), 0);
                                    this.f3959h.f();
                                    this.f3959h.f();
                                    this.f3959h.g(2);
                                    this.f3959h.g(2);
                                    int g7 = this.f3959h.g(2);
                                    this.f3959h.m(8);
                                    b bVar3 = this.f3963l;
                                    bVar3.o = d4;
                                    bVar3.f3973l = g7;
                                    break;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i14 = g4 - 152;
                                b bVar4 = this.f3962k[i14];
                                this.f3959h.m(2);
                                boolean f4 = this.f3959h.f();
                                boolean f5 = this.f3959h.f();
                                this.f3959h.f();
                                int g8 = this.f3959h.g(i5);
                                boolean f6 = this.f3959h.f();
                                int g9 = this.f3959h.g(i6);
                                int g10 = this.f3959h.g(8);
                                int g11 = this.f3959h.g(4);
                                int g12 = this.f3959h.g(4);
                                this.f3959h.m(2);
                                this.f3959h.g(i7);
                                this.f3959h.m(2);
                                int g13 = this.f3959h.g(i5);
                                int g14 = this.f3959h.g(i5);
                                bVar4.c = true;
                                bVar4.f3965d = f4;
                                bVar4.f3972k = f5;
                                bVar4.f3966e = g8;
                                bVar4.f3967f = f6;
                                bVar4.f3968g = g9;
                                bVar4.f3969h = g10;
                                bVar4.f3970i = g11;
                                int i15 = g12 + 1;
                                if (bVar4.f3971j != i15) {
                                    bVar4.f3971j = i15;
                                    while (true) {
                                        if ((f5 && bVar4.a.size() >= bVar4.f3971j) || bVar4.a.size() >= 15) {
                                            bVar4.a.remove(0);
                                        }
                                    }
                                }
                                if (g13 != 0 && bVar4.f3974m != g13) {
                                    bVar4.f3974m = g13;
                                    int i16 = g13 - 1;
                                    int i17 = b.D[i16];
                                    boolean z2 = b.C[i16];
                                    int i18 = b.A[i16];
                                    int i19 = b.B[i16];
                                    int i20 = b.z[i16];
                                    bVar4.o = i17;
                                    bVar4.f3973l = i20;
                                }
                                if (g14 != 0 && bVar4.n != g14) {
                                    bVar4.n = g14;
                                    int i21 = g14 - 1;
                                    int i22 = b.F[i21];
                                    int i23 = b.E[i21];
                                    bVar4.g(false, false);
                                    bVar4.h(b.w, b.G[i21]);
                                }
                                if (this.p != i14) {
                                    this.p = i14;
                                    this.f3963l = this.f3962k[i14];
                                    break;
                                }
                                break;
                        }
                    } else if (g4 <= 255) {
                        this.f3963l.a((char) (g4 & 255));
                    } else {
                        f.a.b.a.a.G(33, "Invalid base command: ", g4, "Cea708Decoder");
                    }
                    z = true;
                } else if (g4 != 0) {
                    if (g4 == i5) {
                        this.f3964m = k();
                    } else if (g4 != 8) {
                        switch (g4) {
                            case 12:
                                l();
                                continue;
                            case 13:
                                this.f3963l.a('\n');
                                continue;
                            case 14:
                                break;
                            default:
                                if (g4 < 17 || g4 > 23) {
                                    if (g4 >= 24 && g4 <= 31) {
                                        f.a.b.a.a.G(54, "Currently unsupported COMMAND_P16 Command: ", g4, "Cea708Decoder");
                                        this.f3959h.m(16);
                                        break;
                                    } else {
                                        f.a.b.a.a.G(31, "Invalid C0 command: ", g4, "Cea708Decoder");
                                        break;
                                    }
                                } else {
                                    f.a.b.a.a.G(55, "Currently unsupported COMMAND_EXT1 Command: ", g4, "Cea708Decoder");
                                    this.f3959h.m(8);
                                    continue;
                                }
                        }
                    } else {
                        b bVar5 = this.f3963l;
                        int length = bVar5.b.length();
                        if (length > 0) {
                            bVar5.b.delete(length - 1, length);
                        }
                    }
                }
                i5 = 3;
                i6 = 7;
                i7 = 6;
            }
            if (z) {
                this.f3964m = k();
            }
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<f.h.b.b.c2.c> k() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.m.d.k():java.util.List");
    }

    public final void l() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f3962k[i2].f();
        }
    }
}
