package f.h.h;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.InvalidProtocolBufferException;
import f.h.h.j;
import f.h.h.l1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: CodedInputStream.java */
/* loaded from: classes2.dex */
public abstract class k {
    public int a;
    public int b = 100;
    public int c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: d  reason: collision with root package name */
    public l f6378d;

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f6379e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6380f;

        /* renamed from: g  reason: collision with root package name */
        public int f6381g;

        /* renamed from: h  reason: collision with root package name */
        public int f6382h;

        /* renamed from: i  reason: collision with root package name */
        public int f6383i;

        /* renamed from: j  reason: collision with root package name */
        public int f6384j;

        /* renamed from: k  reason: collision with root package name */
        public int f6385k;

        /* renamed from: l  reason: collision with root package name */
        public int f6386l;

        public b(byte[] bArr, int i2, int i3, boolean z, a aVar) {
            super(null);
            this.f6386l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f6379e = bArr;
            this.f6381g = i3 + i2;
            this.f6383i = i2;
            this.f6384j = i2;
            this.f6380f = z;
        }

        @Override // f.h.h.k
        public int A() {
            if (e()) {
                this.f6385k = 0;
                return 0;
            }
            int H = H();
            this.f6385k = H;
            if ((H >>> 3) != 0) {
                return H;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // f.h.h.k
        public int B() {
            return H();
        }

        @Override // f.h.h.k
        public long C() {
            return I();
        }

        @Override // f.h.h.k
        public boolean D(int i2) {
            int A;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f6381g - this.f6383i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f6379e;
                        int i5 = this.f6383i;
                        this.f6383i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    if (E() < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            } else if (i3 == 1) {
                L(8);
                return true;
            } else if (i3 == 2) {
                L(H());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        L(4);
                        return true;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                return false;
            } else {
                do {
                    A = A();
                    if (A == 0) {
                        break;
                    }
                } while (D(A));
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
        }

        public byte E() {
            int i2 = this.f6383i;
            if (i2 != this.f6381g) {
                byte[] bArr = this.f6379e;
                this.f6383i = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.h();
        }

        public int F() {
            int i2 = this.f6383i;
            if (this.f6381g - i2 >= 4) {
                byte[] bArr = this.f6379e;
                this.f6383i = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.h();
        }

        public long G() {
            int i2 = this.f6383i;
            if (this.f6381g - i2 >= 8) {
                byte[] bArr = this.f6379e;
                this.f6383i = i2 + 8;
                return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.h();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f6383i
                int r1 = r5.f6381g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f6379e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f6383i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r1 = (int) r0
                return r1
            L70:
                r5.f6383i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long I() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k.b.I():long");
        }

        public long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte E = E();
                j2 |= (E & Byte.MAX_VALUE) << i2;
                if ((E & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void K() {
            int i2 = this.f6381g + this.f6382h;
            this.f6381g = i2;
            int i3 = i2 - this.f6384j;
            int i4 = this.f6386l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f6382h = i5;
                this.f6381g = i2 - i5;
                return;
            }
            this.f6382h = 0;
        }

        public void L(int i2) {
            if (i2 >= 0) {
                int i3 = this.f6381g;
                int i4 = this.f6383i;
                if (i2 <= i3 - i4) {
                    this.f6383i = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // f.h.h.k
        public void a(int i2) {
            if (this.f6385k != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // f.h.h.k
        public int d() {
            return this.f6383i - this.f6384j;
        }

        @Override // f.h.h.k
        public boolean e() {
            return this.f6383i == this.f6381g;
        }

        @Override // f.h.h.k
        public void i(int i2) {
            this.f6386l = i2;
            K();
        }

        @Override // f.h.h.k
        public int j(int i2) {
            if (i2 >= 0) {
                int d2 = d() + i2;
                if (d2 >= 0) {
                    int i3 = this.f6386l;
                    if (d2 <= i3) {
                        this.f6386l = d2;
                        K();
                        return i3;
                    }
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // f.h.h.k
        public boolean k() {
            return I() != 0;
        }

        @Override // f.h.h.k
        public j l() {
            byte[] bArr;
            int H = H();
            if (H > 0) {
                int i2 = this.f6381g;
                int i3 = this.f6383i;
                if (H <= i2 - i3) {
                    boolean z = this.f6380f;
                    j c = j.c(this.f6379e, i3, H);
                    this.f6383i += H;
                    return c;
                }
            }
            if (H == 0) {
                return j.f6366g;
            }
            if (H > 0) {
                int i4 = this.f6381g;
                int i5 = this.f6383i;
                if (H <= i4 - i5) {
                    int i6 = H + i5;
                    this.f6383i = i6;
                    bArr = Arrays.copyOfRange(this.f6379e, i5, i6);
                    j jVar = j.f6366g;
                    return new j.f(bArr);
                }
            }
            if (H <= 0) {
                if (H == 0) {
                    bArr = y.b;
                    j jVar2 = j.f6366g;
                    return new j.f(bArr);
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // f.h.h.k
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // f.h.h.k
        public int n() {
            return H();
        }

        @Override // f.h.h.k
        public int o() {
            return F();
        }

        @Override // f.h.h.k
        public long p() {
            return G();
        }

        @Override // f.h.h.k
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // f.h.h.k
        public int r() {
            return H();
        }

        @Override // f.h.h.k
        public long s() {
            return I();
        }

        @Override // f.h.h.k
        public int u() {
            return F();
        }

        @Override // f.h.h.k
        public long v() {
            return G();
        }

        @Override // f.h.h.k
        public int w() {
            return k.b(H());
        }

        @Override // f.h.h.k
        public long x() {
            return k.c(I());
        }

        @Override // f.h.h.k
        public String y() {
            int H = H();
            if (H > 0 && H <= this.f6381g - this.f6383i) {
                String str = new String(this.f6379e, this.f6383i, H, y.a);
                this.f6383i += H;
                return str;
            } else if (H == 0) {
                return "";
            } else {
                if (H < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // f.h.h.k
        public String z() {
            int H = H();
            if (H > 0) {
                int i2 = this.f6381g;
                int i3 = this.f6383i;
                if (H <= i2 - i3) {
                    String b = l1.b(this.f6379e, i3, H);
                    this.f6383i += H;
                    return b;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes2.dex */
    public static final class c extends k {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f6387e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f6388f;

        /* renamed from: g  reason: collision with root package name */
        public int f6389g;

        /* renamed from: h  reason: collision with root package name */
        public int f6390h;

        /* renamed from: i  reason: collision with root package name */
        public int f6391i;

        /* renamed from: j  reason: collision with root package name */
        public int f6392j;

        /* renamed from: k  reason: collision with root package name */
        public int f6393k;

        /* renamed from: l  reason: collision with root package name */
        public int f6394l;

        public c(InputStream inputStream, int i2, a aVar) {
            super(null);
            this.f6394l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Charset charset = y.a;
            this.f6387e = inputStream;
            this.f6388f = new byte[i2];
            this.f6389g = 0;
            this.f6391i = 0;
            this.f6393k = 0;
        }

        @Override // f.h.h.k
        public int A() {
            if (e()) {
                this.f6392j = 0;
                return 0;
            }
            int K = K();
            this.f6392j = K;
            if ((K >>> 3) != 0) {
                return K;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // f.h.h.k
        public int B() {
            return K();
        }

        @Override // f.h.h.k
        public long C() {
            return L();
        }

        @Override // f.h.h.k
        public boolean D(int i2) {
            int A;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f6389g - this.f6391i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f6388f;
                        int i5 = this.f6391i;
                        this.f6391i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    if (E() < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            } else if (i3 == 1) {
                P(8);
                return true;
            } else if (i3 == 2) {
                P(K());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        P(4);
                        return true;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                return false;
            } else {
                do {
                    A = A();
                    if (A == 0) {
                        break;
                    }
                } while (D(A));
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
        }

        public byte E() {
            if (this.f6391i == this.f6389g) {
                O(1);
            }
            byte[] bArr = this.f6388f;
            int i2 = this.f6391i;
            this.f6391i = i2 + 1;
            return bArr[i2];
        }

        public final byte[] F(int i2, boolean z) {
            byte[] G = G(i2);
            if (G != null) {
                return z ? (byte[]) G.clone() : G;
            }
            int i3 = this.f6391i;
            int i4 = this.f6389g;
            int i5 = i4 - i3;
            this.f6393k += i4;
            this.f6391i = 0;
            this.f6389g = 0;
            List<byte[]> H = H(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f6388f, i3, bArr, 0, i5);
            Iterator it = ((ArrayList) H).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] G(int i2) {
            if (i2 == 0) {
                return y.b;
            }
            if (i2 >= 0) {
                int i3 = this.f6393k;
                int i4 = this.f6391i;
                int i5 = i3 + i4 + i2;
                if (i5 - this.c <= 0) {
                    int i6 = this.f6394l;
                    if (i5 <= i6) {
                        int i7 = this.f6389g - i4;
                        int i8 = i2 - i7;
                        if (i8 >= 4096) {
                            try {
                                if (i8 > this.f6387e.available()) {
                                    return null;
                                }
                            } catch (InvalidProtocolBufferException e2) {
                                e2.f1304g = true;
                                throw e2;
                            }
                        }
                        byte[] bArr = new byte[i2];
                        System.arraycopy(this.f6388f, this.f6391i, bArr, 0, i7);
                        this.f6393k += this.f6389g;
                        this.f6391i = 0;
                        this.f6389g = 0;
                        while (i7 < i2) {
                            try {
                                int read = this.f6387e.read(bArr, i7, i2 - i7);
                                if (read != -1) {
                                    this.f6393k += read;
                                    i7 += read;
                                } else {
                                    throw InvalidProtocolBufferException.h();
                                }
                            } catch (InvalidProtocolBufferException e3) {
                                e3.f1304g = true;
                                throw e3;
                            }
                        }
                        return bArr;
                    }
                    P((i6 - i3) - i4);
                    throw InvalidProtocolBufferException.h();
                }
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.f();
        }

        public final List<byte[]> H(int i2) {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, 4096);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.f6387e.read(bArr, i3, min - i3);
                    if (read != -1) {
                        this.f6393k += read;
                        i3 += read;
                    } else {
                        throw InvalidProtocolBufferException.h();
                    }
                }
                i2 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int I() {
            int i2 = this.f6391i;
            if (this.f6389g - i2 < 4) {
                O(4);
                i2 = this.f6391i;
            }
            byte[] bArr = this.f6388f;
            this.f6391i = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public long J() {
            int i2 = this.f6391i;
            if (this.f6389g - i2 < 8) {
                O(8);
                i2 = this.f6391i;
            }
            byte[] bArr = this.f6388f;
            this.f6391i = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int K() {
            /*
                r5 = this;
                int r0 = r5.f6391i
                int r1 = r5.f6389g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f6388f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f6391i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.M()
                int r1 = (int) r0
                return r1
            L70:
                r5.f6391i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k.c.K():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long L() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k.c.L():long");
        }

        public long M() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte E = E();
                j2 |= (E & Byte.MAX_VALUE) << i2;
                if ((E & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void N() {
            int i2 = this.f6389g + this.f6390h;
            this.f6389g = i2;
            int i3 = this.f6393k + i2;
            int i4 = this.f6394l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f6390h = i5;
                this.f6389g = i2 - i5;
                return;
            }
            this.f6390h = 0;
        }

        public final void O(int i2) {
            if (Q(i2)) {
                return;
            }
            if (i2 > (this.c - this.f6393k) - this.f6391i) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw InvalidProtocolBufferException.h();
        }

        public void P(int i2) {
            int i3 = this.f6389g;
            int i4 = this.f6391i;
            if (i2 <= i3 - i4 && i2 >= 0) {
                this.f6391i = i4 + i2;
            } else if (i2 >= 0) {
                int i5 = this.f6393k;
                int i6 = i5 + i4;
                int i7 = i6 + i2;
                int i8 = this.f6394l;
                if (i7 <= i8) {
                    this.f6393k = i6;
                    int i9 = i3 - i4;
                    this.f6389g = 0;
                    this.f6391i = 0;
                    while (i9 < i2) {
                        try {
                            long j2 = i2 - i9;
                            try {
                                long skip = this.f6387e.skip(j2);
                                int i10 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                                if (i10 < 0 || skip > j2) {
                                    throw new IllegalStateException(this.f6387e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                                } else if (i10 == 0) {
                                    break;
                                } else {
                                    i9 += (int) skip;
                                }
                            } catch (InvalidProtocolBufferException e2) {
                                e2.f1304g = true;
                                throw e2;
                            }
                        } finally {
                            this.f6393k += i9;
                            N();
                        }
                    }
                    if (i9 >= i2) {
                        return;
                    }
                    int i11 = this.f6389g;
                    int i12 = i11 - this.f6391i;
                    this.f6391i = i11;
                    O(1);
                    while (true) {
                        int i13 = i2 - i12;
                        int i14 = this.f6389g;
                        if (i13 > i14) {
                            i12 += i14;
                            this.f6391i = i14;
                            O(1);
                        } else {
                            this.f6391i = i13;
                            return;
                        }
                    }
                } else {
                    P((i8 - i5) - i4);
                    throw InvalidProtocolBufferException.h();
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        public final boolean Q(int i2) {
            int i3 = this.f6391i;
            int i4 = i3 + i2;
            int i5 = this.f6389g;
            if (i4 > i5) {
                int i6 = this.c;
                int i7 = this.f6393k;
                if (i2 <= (i6 - i7) - i3 && i7 + i3 + i2 <= this.f6394l) {
                    if (i3 > 0) {
                        if (i5 > i3) {
                            byte[] bArr = this.f6388f;
                            System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                        }
                        this.f6393k += i3;
                        this.f6389g -= i3;
                        this.f6391i = 0;
                    }
                    InputStream inputStream = this.f6387e;
                    byte[] bArr2 = this.f6388f;
                    int i8 = this.f6389g;
                    try {
                        int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.c - this.f6393k) - i8));
                        if (read == 0 || read < -1 || read > this.f6388f.length) {
                            throw new IllegalStateException(this.f6387e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                        } else if (read > 0) {
                            this.f6389g += read;
                            N();
                            if (this.f6389g >= i2) {
                                return true;
                            }
                            return Q(i2);
                        } else {
                            return false;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f1304g = true;
                        throw e2;
                    }
                }
                return false;
            }
            throw new IllegalStateException(f.a.b.a.a.j("refillBuffer() called when ", i2, " bytes were already available in buffer"));
        }

        @Override // f.h.h.k
        public void a(int i2) {
            if (this.f6392j != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // f.h.h.k
        public int d() {
            return this.f6393k + this.f6391i;
        }

        @Override // f.h.h.k
        public boolean e() {
            return this.f6391i == this.f6389g && !Q(1);
        }

        @Override // f.h.h.k
        public void i(int i2) {
            this.f6394l = i2;
            N();
        }

        @Override // f.h.h.k
        public int j(int i2) {
            if (i2 >= 0) {
                int i3 = this.f6393k + this.f6391i + i2;
                int i4 = this.f6394l;
                if (i3 <= i4) {
                    this.f6394l = i3;
                    N();
                    return i4;
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // f.h.h.k
        public boolean k() {
            return L() != 0;
        }

        @Override // f.h.h.k
        public j l() {
            int K = K();
            int i2 = this.f6389g;
            int i3 = this.f6391i;
            if (K <= i2 - i3 && K > 0) {
                j c = j.c(this.f6388f, i3, K);
                this.f6391i += K;
                return c;
            } else if (K == 0) {
                return j.f6366g;
            } else {
                byte[] G = G(K);
                if (G != null) {
                    j jVar = j.f6366g;
                    return j.c(G, 0, G.length);
                }
                int i4 = this.f6391i;
                int i5 = this.f6389g;
                int i6 = i5 - i4;
                this.f6393k += i5;
                this.f6391i = 0;
                this.f6389g = 0;
                List<byte[]> H = H(K - i6);
                byte[] bArr = new byte[K];
                System.arraycopy(this.f6388f, i4, bArr, 0, i6);
                Iterator it = ((ArrayList) H).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                    i6 += bArr2.length;
                }
                j jVar2 = j.f6366g;
                return new j.f(bArr);
            }
        }

        @Override // f.h.h.k
        public double m() {
            return Double.longBitsToDouble(J());
        }

        @Override // f.h.h.k
        public int n() {
            return K();
        }

        @Override // f.h.h.k
        public int o() {
            return I();
        }

        @Override // f.h.h.k
        public long p() {
            return J();
        }

        @Override // f.h.h.k
        public float q() {
            return Float.intBitsToFloat(I());
        }

        @Override // f.h.h.k
        public int r() {
            return K();
        }

        @Override // f.h.h.k
        public long s() {
            return L();
        }

        @Override // f.h.h.k
        public int u() {
            return I();
        }

        @Override // f.h.h.k
        public long v() {
            return J();
        }

        @Override // f.h.h.k
        public int w() {
            return k.b(K());
        }

        @Override // f.h.h.k
        public long x() {
            return k.c(L());
        }

        @Override // f.h.h.k
        public String y() {
            int K = K();
            if (K > 0 && K <= this.f6389g - this.f6391i) {
                String str = new String(this.f6388f, this.f6391i, K, y.a);
                this.f6391i += K;
                return str;
            } else if (K == 0) {
                return "";
            } else {
                if (K <= this.f6389g) {
                    O(K);
                    String str2 = new String(this.f6388f, this.f6391i, K, y.a);
                    this.f6391i += K;
                    return str2;
                }
                return new String(F(K, false), y.a);
            }
        }

        @Override // f.h.h.k
        public String z() {
            byte[] F;
            int K = K();
            int i2 = this.f6391i;
            int i3 = this.f6389g;
            if (K <= i3 - i2 && K > 0) {
                F = this.f6388f;
                this.f6391i = i2 + K;
            } else if (K == 0) {
                return "";
            } else {
                if (K <= i3) {
                    O(K);
                    F = this.f6388f;
                    this.f6391i = K + 0;
                } else {
                    F = F(K, false);
                }
                i2 = 0;
            }
            return l1.b(F, i2, K);
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes2.dex */
    public static final class d extends k {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f6395e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6396f;

        /* renamed from: g  reason: collision with root package name */
        public final long f6397g;

        /* renamed from: h  reason: collision with root package name */
        public long f6398h;

        /* renamed from: i  reason: collision with root package name */
        public long f6399i;

        /* renamed from: j  reason: collision with root package name */
        public long f6400j;

        /* renamed from: k  reason: collision with root package name */
        public int f6401k;

        /* renamed from: l  reason: collision with root package name */
        public int f6402l;

        /* renamed from: m  reason: collision with root package name */
        public int f6403m;

        public d(ByteBuffer byteBuffer, boolean z, a aVar) {
            super(null);
            this.f6403m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f6395e = byteBuffer;
            long b = k1.b(byteBuffer);
            this.f6397g = b;
            this.f6398h = byteBuffer.limit() + b;
            long position = b + byteBuffer.position();
            this.f6399i = position;
            this.f6400j = position;
            this.f6396f = z;
        }

        @Override // f.h.h.k
        public int A() {
            if (e()) {
                this.f6402l = 0;
                return 0;
            }
            int I = I();
            this.f6402l = I;
            if ((I >>> 3) != 0) {
                return I;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // f.h.h.k
        public int B() {
            return I();
        }

        @Override // f.h.h.k
        public long C() {
            return J();
        }

        @Override // f.h.h.k
        public boolean D(int i2) {
            int A;
            int i3 = i2 & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (M() >= 10) {
                    while (i4 < 10) {
                        long j2 = this.f6399i;
                        this.f6399i = 1 + j2;
                        if (k1.i(j2) < 0) {
                            i4++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i4 < 10) {
                    if (F() < 0) {
                        i4++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            } else if (i3 == 1) {
                N(8);
                return true;
            } else if (i3 == 2) {
                N(I());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        N(4);
                        return true;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                return false;
            } else {
                do {
                    A = A();
                    if (A == 0) {
                        break;
                    }
                } while (D(A));
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
        }

        public final int E(long j2) {
            return (int) (j2 - this.f6397g);
        }

        public byte F() {
            long j2 = this.f6399i;
            if (j2 != this.f6398h) {
                this.f6399i = 1 + j2;
                return k1.i(j2);
            }
            throw InvalidProtocolBufferException.h();
        }

        public int G() {
            long j2 = this.f6399i;
            if (this.f6398h - j2 >= 4) {
                this.f6399i = 4 + j2;
                return ((k1.i(j2 + 3) & 255) << 24) | (k1.i(j2) & 255) | ((k1.i(1 + j2) & 255) << 8) | ((k1.i(2 + j2) & 255) << 16);
            }
            throw InvalidProtocolBufferException.h();
        }

        public long H() {
            long j2 = this.f6399i;
            if (this.f6398h - j2 >= 8) {
                this.f6399i = 8 + j2;
                return ((k1.i(j2 + 7) & 255) << 56) | (k1.i(j2) & 255) | ((k1.i(1 + j2) & 255) << 8) | ((k1.i(2 + j2) & 255) << 16) | ((k1.i(3 + j2) & 255) << 24) | ((k1.i(4 + j2) & 255) << 32) | ((k1.i(5 + j2) & 255) << 40) | ((k1.i(6 + j2) & 255) << 48);
            }
            throw InvalidProtocolBufferException.h();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
            if (f.h.h.k1.i(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int I() {
            /*
                r10 = this;
                long r0 = r10.f6399i
                long r2 = r10.f6398h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = f.h.h.k1.i(r0)
                if (r0 < 0) goto L17
                r10.f6399i = r4
                return r0
            L17:
                long r6 = r10.f6398h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = f.h.h.k1.i(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = f.h.h.k1.i(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = f.h.h.k1.i(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = f.h.h.k1.i(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = f.h.h.k1.i(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = f.h.h.k1.i(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = f.h.h.k1.i(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = f.h.h.k1.i(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = f.h.h.k1.i(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.K()
                int r1 = (int) r0
                return r1
            L8b:
                r10.f6399i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.h.k.d.I():int");
        }

        public long J() {
            long i2;
            long j2;
            long j3;
            int i3;
            long j4 = this.f6399i;
            if (this.f6398h != j4) {
                long j5 = j4 + 1;
                byte i4 = k1.i(j4);
                if (i4 >= 0) {
                    this.f6399i = j5;
                    return i4;
                } else if (this.f6398h - j5 >= 9) {
                    long j6 = j5 + 1;
                    int i5 = i4 ^ (k1.i(j5) << 7);
                    if (i5 >= 0) {
                        long j7 = j6 + 1;
                        int i6 = i5 ^ (k1.i(j6) << 14);
                        if (i6 >= 0) {
                            i2 = i6 ^ 16256;
                        } else {
                            j6 = j7 + 1;
                            int i7 = i6 ^ (k1.i(j7) << 21);
                            if (i7 < 0) {
                                i3 = i7 ^ (-2080896);
                            } else {
                                j7 = j6 + 1;
                                long i8 = i7 ^ (k1.i(j6) << 28);
                                if (i8 < 0) {
                                    long j8 = j7 + 1;
                                    long i9 = i8 ^ (k1.i(j7) << 35);
                                    if (i9 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        i8 = i9 ^ (k1.i(j8) << 42);
                                        if (i8 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            i9 = i8 ^ (k1.i(j7) << 49);
                                            if (i9 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                i2 = (i9 ^ (k1.i(j8) << 56)) ^ 71499008037633920L;
                                                if (i2 < 0) {
                                                    long j9 = 1 + j7;
                                                    if (k1.i(j7) >= 0) {
                                                        j6 = j9;
                                                        this.f6399i = j6;
                                                        return i2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i9 ^ j2;
                                    j6 = j8;
                                    this.f6399i = j6;
                                    return i2;
                                }
                                j3 = 266354560;
                                i2 = i8 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f6399i = j6;
                        return i2;
                    }
                    i3 = i5 ^ (-128);
                    i2 = i3;
                    this.f6399i = j6;
                    return i2;
                }
            }
            return K();
        }

        public long K() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte F = F();
                j2 |= (F & Byte.MAX_VALUE) << i2;
                if ((F & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void L() {
            long j2 = this.f6398h + this.f6401k;
            this.f6398h = j2;
            int i2 = (int) (j2 - this.f6400j);
            int i3 = this.f6403m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f6401k = i4;
                this.f6398h = j2 - i4;
                return;
            }
            this.f6401k = 0;
        }

        public final int M() {
            return (int) (this.f6398h - this.f6399i);
        }

        public void N(int i2) {
            if (i2 >= 0 && i2 <= M()) {
                this.f6399i += i2;
            } else if (i2 < 0) {
                throw InvalidProtocolBufferException.f();
            } else {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // f.h.h.k
        public void a(int i2) {
            if (this.f6402l != i2) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // f.h.h.k
        public int d() {
            return (int) (this.f6399i - this.f6400j);
        }

        @Override // f.h.h.k
        public boolean e() {
            return this.f6399i == this.f6398h;
        }

        @Override // f.h.h.k
        public void i(int i2) {
            this.f6403m = i2;
            L();
        }

        @Override // f.h.h.k
        public int j(int i2) {
            if (i2 >= 0) {
                int d2 = d() + i2;
                int i3 = this.f6403m;
                if (d2 <= i3) {
                    this.f6403m = d2;
                    L();
                    return i3;
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // f.h.h.k
        public boolean k() {
            return J() != 0;
        }

        @Override // f.h.h.k
        public j l() {
            int I = I();
            if (I <= 0 || I > M()) {
                if (I == 0) {
                    return j.f6366g;
                }
                if (I < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
            byte[] bArr = new byte[I];
            long j2 = I;
            k1.f6405e.c(this.f6399i, bArr, 0L, j2);
            this.f6399i += j2;
            j jVar = j.f6366g;
            return new j.f(bArr);
        }

        @Override // f.h.h.k
        public double m() {
            return Double.longBitsToDouble(H());
        }

        @Override // f.h.h.k
        public int n() {
            return I();
        }

        @Override // f.h.h.k
        public int o() {
            return G();
        }

        @Override // f.h.h.k
        public long p() {
            return H();
        }

        @Override // f.h.h.k
        public float q() {
            return Float.intBitsToFloat(G());
        }

        @Override // f.h.h.k
        public int r() {
            return I();
        }

        @Override // f.h.h.k
        public long s() {
            return J();
        }

        @Override // f.h.h.k
        public int u() {
            return G();
        }

        @Override // f.h.h.k
        public long v() {
            return H();
        }

        @Override // f.h.h.k
        public int w() {
            return k.b(I());
        }

        @Override // f.h.h.k
        public long x() {
            return k.c(J());
        }

        @Override // f.h.h.k
        public String y() {
            int I = I();
            if (I <= 0 || I > M()) {
                if (I == 0) {
                    return "";
                }
                if (I < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
            byte[] bArr = new byte[I];
            long j2 = I;
            k1.f6405e.c(this.f6399i, bArr, 0L, j2);
            String str = new String(bArr, y.a);
            this.f6399i += j2;
            return str;
        }

        @Override // f.h.h.k
        public String z() {
            String b;
            int I = I();
            if (I <= 0 || I > M()) {
                if (I == 0) {
                    return "";
                }
                if (I <= 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.h();
            }
            int E = E(this.f6399i);
            ByteBuffer byteBuffer = this.f6395e;
            l1.a aVar = l1.a;
            Objects.requireNonNull(aVar);
            if (byteBuffer.hasArray()) {
                b = aVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + E, I);
            } else if (byteBuffer.isDirect()) {
                b = aVar.c(byteBuffer, E, I);
            } else {
                b = aVar.b(byteBuffer, E, I);
            }
            this.f6399i += I;
            return b;
        }
    }

    public k(a aVar) {
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static k f(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = y.b;
            return h(bArr, 0, bArr.length, false);
        }
        return new c(inputStream, 4096, null);
    }

    public static k g(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return h(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        } else if (byteBuffer.isDirect() && k1.f6406f) {
            return new d(byteBuffer, z, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return h(bArr, 0, remaining, true);
        }
    }

    public static k h(byte[] bArr, int i2, int i3, boolean z) {
        b bVar = new b(bArr, i2, i3, z, null);
        try {
            bVar.j(i3);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int t(int i2, InputStream inputStream) {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.h();
            }
            i3 |= (read & 127) << i4;
            if ((read & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            if ((read2 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw InvalidProtocolBufferException.e();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i2);

    public abstract int j(int i2);

    public abstract boolean k();

    public abstract j l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
