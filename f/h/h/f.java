package f.h.h;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import f.h.h.g0;
import f.h.h.j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
/* loaded from: classes2.dex */
public abstract class f implements z0 {

    /* compiled from: BinaryReader.java */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public final boolean a;
        public final byte[] b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f6351d;

        /* renamed from: e  reason: collision with root package name */
        public int f6352e;

        /* renamed from: f  reason: collision with root package name */
        public int f6353f;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.a = z;
            this.b = byteBuffer.array();
            this.c = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f6351d = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        @Override // f.h.h.z0
        @Deprecated
        public <T> T A(Class<T> cls, q qVar) {
            g0(3);
            return (T) T(w0.c.a(cls), qVar);
        }

        @Override // f.h.h.z0
        public int B() {
            if (Q()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int b0 = b0();
            this.f6352e = b0;
            return b0 == this.f6353f ? Api.BaseClientBuilder.API_PRIORITY_OTHER : b0 >>> 3;
        }

        @Override // f.h.h.z0
        public void C(List<String> list) {
            a0(list, false);
        }

        @Override // f.h.h.z0
        public <T> T D(a1<T> a1Var, q qVar) {
            g0(2);
            return (T) Y(a1Var, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.z0
        public <K, V> void E(Map<K, V> map, g0.a<K, V> aVar, q qVar) {
            g0(2);
            int b0 = b0();
            e0(b0);
            int i2 = this.f6351d;
            this.f6351d = this.c + b0;
            try {
                Object obj = aVar.b;
                Object obj2 = aVar.f6357d;
                while (true) {
                    int B = B();
                    if (B == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (B == 1) {
                        obj = S(aVar.a, null, null);
                    } else if (B != 2) {
                        try {
                            if (!J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = S(aVar.c, aVar.f6357d.getClass(), qVar);
                    }
                }
            } finally {
                this.f6351d = i2;
            }
        }

        @Override // f.h.h.z0
        public void F(List<String> list) {
            a0(list, true);
        }

        @Override // f.h.h.z0
        public j G() {
            j c;
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return j.f6366g;
            }
            e0(b0);
            if (this.a) {
                byte[] bArr = this.b;
                int i2 = this.c;
                j jVar = j.f6366g;
                c = new j.c(bArr, i2, b0);
            } else {
                c = j.c(this.b, this.c, b0);
            }
            this.c += b0;
            return c;
        }

        @Override // f.h.h.z0
        public void H(List<Float> list) {
            int i2;
            int i3;
            if (list instanceof v) {
                v vVar = (v) list;
                int i4 = this.f6352e & 7;
                if (i4 == 2) {
                    int b0 = b0();
                    i0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        vVar.b(Float.intBitsToFloat(V()));
                    }
                    return;
                } else if (i4 == 5) {
                    do {
                        vVar.b(readFloat());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 2) {
                int b02 = b0();
                i0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Float.valueOf(Float.intBitsToFloat(V())));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public int I() {
            g0(0);
            return b0();
        }

        @Override // f.h.h.z0
        public boolean J() {
            int i2;
            int i3;
            if (Q() || (i2 = this.f6352e) == (i3 = this.f6353f)) {
                return false;
            }
            int i4 = i2 & 7;
            if (i4 == 0) {
                int i5 = this.f6351d;
                int i6 = this.c;
                if (i5 - i6 >= 10) {
                    byte[] bArr = this.b;
                    int i7 = 0;
                    while (i7 < 10) {
                        int i8 = i6 + 1;
                        if (bArr[i6] >= 0) {
                            this.c = i8;
                            break;
                        }
                        i7++;
                        i6 = i8;
                    }
                }
                for (int i9 = 0; i9 < 10; i9++) {
                    if (R() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            } else if (i4 == 1) {
                h0(8);
                return true;
            } else if (i4 == 2) {
                h0(b0());
                return true;
            } else if (i4 != 3) {
                if (i4 == 5) {
                    h0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            } else {
                this.f6353f = ((i2 >>> 3) << 3) | 4;
                while (B() != Integer.MAX_VALUE && J()) {
                }
                if (this.f6352e == this.f6353f) {
                    this.f6353f = i3;
                    return true;
                }
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // f.h.h.z0
        public int K() {
            g0(5);
            return U();
        }

        @Override // f.h.h.z0
        public void L(List<j> list) {
            int i2;
            if ((this.f6352e & 7) == 2) {
                do {
                    list.add(G());
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // f.h.h.z0
        public void M(List<Double> list) {
            int i2;
            int i3;
            if (list instanceof n) {
                n nVar = (n) list;
                int i4 = this.f6352e & 7;
                if (i4 == 1) {
                    do {
                        nVar.b(readDouble());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = b0();
                    j0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        nVar.b(Double.longBitsToDouble(X()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i6 == 2) {
                int b02 = b0();
                j0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Double.valueOf(Double.longBitsToDouble(X())));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public long N() {
            g0(0);
            return c0();
        }

        @Override // f.h.h.z0
        public String O() {
            return Z(true);
        }

        @Override // f.h.h.z0
        public void P(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int i4 = this.f6352e & 7;
                if (i4 == 1) {
                    do {
                        e0Var.b(d());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = b0();
                    j0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        e0Var.b(X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(d()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i6 == 2) {
                int b02 = b0();
                j0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Long.valueOf(X()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final boolean Q() {
            return this.c == this.f6351d;
        }

        public final byte R() {
            int i2 = this.c;
            if (i2 != this.f6351d) {
                byte[] bArr = this.b;
                this.c = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.h();
        }

        public final Object S(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, q qVar) {
            switch (wireFormat$FieldType.ordinal()) {
                case 0:
                    return Double.valueOf(readDouble());
                case 1:
                    return Float.valueOf(readFloat());
                case 2:
                    return Long.valueOf(N());
                case 3:
                    return Long.valueOf(c());
                case 4:
                    return Integer.valueOf(I());
                case 5:
                    return Long.valueOf(d());
                case 6:
                    return Integer.valueOf(j());
                case 7:
                    return Boolean.valueOf(k());
                case 8:
                    return Z(true);
                case 9:
                default:
                    throw new RuntimeException("unsupported field type.");
                case 10:
                    return i(cls, qVar);
                case 11:
                    return G();
                case 12:
                    return Integer.valueOf(p());
                case 13:
                    return Integer.valueOf(u());
                case 14:
                    return Integer.valueOf(K());
                case 15:
                    return Long.valueOf(m());
                case 16:
                    return Integer.valueOf(w());
                case 17:
                    return Long.valueOf(x());
            }
        }

        public final <T> T T(a1<T> a1Var, q qVar) {
            int i2 = this.f6353f;
            this.f6353f = ((this.f6352e >>> 3) << 3) | 4;
            try {
                T i3 = a1Var.i();
                a1Var.e(i3, this, qVar);
                a1Var.c(i3);
                if (this.f6352e == this.f6353f) {
                    return i3;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f6353f = i2;
            }
        }

        public final int U() {
            e0(4);
            return V();
        }

        public final int V() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public final long W() {
            e0(8);
            return X();
        }

        public final long X() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        public final <T> T Y(a1<T> a1Var, q qVar) {
            int b0 = b0();
            e0(b0);
            int i2 = this.f6351d;
            int i3 = this.c + b0;
            this.f6351d = i3;
            try {
                T i4 = a1Var.i();
                a1Var.e(i4, this, qVar);
                a1Var.c(i4);
                if (this.c == i3) {
                    return i4;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f6351d = i2;
            }
        }

        public String Z(boolean z) {
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return "";
            }
            e0(b0);
            if (z) {
                byte[] bArr = this.b;
                int i2 = this.c;
                if (!l1.h(bArr, i2, i2 + b0)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.b, this.c, b0, y.a);
            this.c += b0;
            return str;
        }

        @Override // f.h.h.z0
        public int a() {
            return this.f6352e;
        }

        public void a0(List<String> list, boolean z) {
            int i2;
            int i3;
            if ((this.f6352e & 7) == 2) {
                if ((list instanceof c0) && !z) {
                    c0 c0Var = (c0) list;
                    do {
                        c0Var.q(G());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                }
                do {
                    list.add(Z(z));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // f.h.h.z0
        public void b(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.b(k.b(b0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    xVar.b(w());
                    if (Q()) {
                        return;
                    }
                    i3 = this.c;
                } while (b0() == this.f6352e);
                this.c = i3;
                return;
            }
            int i5 = this.f6352e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(k.b(b0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(w()));
                if (Q()) {
                    return;
                }
                i2 = this.c;
            } while (b0() == this.f6352e);
            this.c = i2;
        }

        public final int b0() {
            int i2;
            int i3 = this.c;
            int i4 = this.f6351d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.c = i5;
                    return b;
                } else if (i4 - i5 < 9) {
                    return (int) d0();
                } else {
                    int i6 = i5 + 1;
                    int i7 = b ^ (bArr[i5] << 7);
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i6 + 1;
                        int i9 = i7 ^ (bArr[i6] << 14);
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            i6 = i8 + 1;
                            int i10 = i9 ^ (bArr[i8] << 21);
                            if (i10 < 0) {
                                i2 = i10 ^ (-2080896);
                            } else {
                                i8 = i6 + 1;
                                byte b2 = bArr[i6];
                                i2 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i6 = i8 + 1;
                                    if (bArr[i8] < 0) {
                                        i8 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i8 + 1;
                                            if (bArr[i8] < 0) {
                                                i8 = i6 + 1;
                                                if (bArr[i6] < 0) {
                                                    i6 = i8 + 1;
                                                    if (bArr[i8] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6 = i8;
                    }
                    this.c = i6;
                    return i2;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // f.h.h.z0
        public long c() {
            g0(0);
            return c0();
        }

        public long c0() {
            long j2;
            long j3;
            long j4;
            int i2;
            int i3 = this.c;
            int i4 = this.f6351d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.c = i5;
                    return b;
                } else if (i4 - i5 < 9) {
                    return d0();
                } else {
                    int i6 = i5 + 1;
                    int i7 = b ^ (bArr[i5] << 7);
                    if (i7 >= 0) {
                        int i8 = i6 + 1;
                        int i9 = i7 ^ (bArr[i6] << 14);
                        if (i9 >= 0) {
                            i6 = i8;
                            j2 = i9 ^ 16256;
                        } else {
                            i6 = i8 + 1;
                            int i10 = i9 ^ (bArr[i8] << 21);
                            if (i10 < 0) {
                                i2 = i10 ^ (-2080896);
                            } else {
                                long j5 = i10;
                                int i11 = i6 + 1;
                                long j6 = j5 ^ (bArr[i6] << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    i6 = i11 + 1;
                                    long j7 = j6 ^ (bArr[i11] << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i11 = i6 + 1;
                                        j6 = j7 ^ (bArr[i6] << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i6 = i11 + 1;
                                            j7 = j6 ^ (bArr[i11] << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                int i12 = i6 + 1;
                                                long j8 = (j7 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    i6 = i12 + 1;
                                                    if (bArr[i12] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i6 = i12;
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                }
                                j2 = j6 ^ j4;
                                i6 = i11;
                            }
                        }
                        this.c = i6;
                        return j2;
                    }
                    i2 = i7 ^ (-128);
                    j2 = i2;
                    this.c = i6;
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // f.h.h.z0
        public long d() {
            g0(1);
            return W();
        }

        public final long d0() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte R = R();
                j2 |= (R & Byte.MAX_VALUE) << i2;
                if ((R & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // f.h.h.z0
        public void e(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 == 2) {
                    int b0 = b0();
                    i0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        xVar.b(V());
                    }
                    return;
                } else if (i4 == 5) {
                    do {
                        xVar.b(K());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 2) {
                int b02 = b0();
                i0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Integer.valueOf(V()));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(K()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final void e0(int i2) {
            if (i2 < 0 || i2 > this.f6351d - this.c) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // f.h.h.z0
        public void f(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int i4 = this.f6352e & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            e0Var.b(k.c(c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    e0Var.b(x());
                    if (Q()) {
                        return;
                    }
                    i3 = this.c;
                } while (b0() == this.f6352e);
                this.c = i3;
                return;
            }
            int i5 = this.f6352e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Long.valueOf(k.c(c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(x()));
                if (Q()) {
                    return;
                }
                i2 = this.c;
            } while (b0() == this.f6352e);
            this.c = i2;
        }

        public final void f0(int i2) {
            if (this.c != i2) {
                throw InvalidProtocolBufferException.h();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.z0
        @Deprecated
        public <T> void g(List<T> list, a1<T> a1Var, q qVar) {
            int i2;
            int i3 = this.f6352e;
            if ((i3 & 7) == 3) {
                do {
                    list.add(T(a1Var, qVar));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == i3);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void g0(int i2) {
            if ((this.f6352e & 7) != i2) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public void h(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.b(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    xVar.b(p());
                    if (Q()) {
                        return;
                    }
                    i3 = this.c;
                } while (b0() == this.f6352e);
                this.c = i3;
                return;
            }
            int i5 = this.f6352e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(p()));
                if (Q()) {
                    return;
                }
                i2 = this.c;
            } while (b0() == this.f6352e);
            this.c = i2;
        }

        public final void h0(int i2) {
            e0(i2);
            this.c += i2;
        }

        @Override // f.h.h.z0
        public <T> T i(Class<T> cls, q qVar) {
            g0(2);
            return (T) Y(w0.c.a(cls), qVar);
        }

        public final void i0(int i2) {
            e0(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // f.h.h.z0
        public int j() {
            g0(5);
            return U();
        }

        public final void j0(int i2) {
            e0(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // f.h.h.z0
        public boolean k() {
            g0(0);
            return b0() != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.h.h.z0
        public <T> void l(List<T> list, a1<T> a1Var, q qVar) {
            int i2;
            int i3 = this.f6352e;
            if ((i3 & 7) == 2) {
                do {
                    list.add(Y(a1Var, qVar));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == i3);
                this.c = i2;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // f.h.h.z0
        public long m() {
            g0(1);
            return W();
        }

        @Override // f.h.h.z0
        public void n(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int i4 = this.f6352e & 7;
                if (i4 == 0) {
                    do {
                        e0Var.b(c());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = this.c + b0();
                    while (this.c < b0) {
                        e0Var.b(c0());
                    }
                    f0(b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i5 = this.f6352e & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(c()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i5 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Long.valueOf(c0()));
                }
                f0(b02);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        @Deprecated
        public <T> T o(a1<T> a1Var, q qVar) {
            g0(3);
            return (T) T(a1Var, qVar);
        }

        @Override // f.h.h.z0
        public int p() {
            g0(0);
            return b0();
        }

        @Override // f.h.h.z0
        public void q(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int i4 = this.f6352e & 7;
                if (i4 == 0) {
                    do {
                        e0Var.b(N());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = this.c + b0();
                    while (this.c < b0) {
                        e0Var.b(c0());
                    }
                    f0(b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i5 = this.f6352e & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(N()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i5 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Long.valueOf(c0()));
                }
                f0(b02);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public void r(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                int i4 = this.f6352e & 7;
                if (i4 == 1) {
                    do {
                        e0Var.b(m());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = b0();
                    j0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        e0Var.b(X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(m()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i6 == 2) {
                int b02 = b0();
                j0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Long.valueOf(X()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public double readDouble() {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // f.h.h.z0
        public float readFloat() {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // f.h.h.z0
        public void s(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 == 0) {
                    do {
                        xVar.b(I());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else if (i4 == 2) {
                    int b0 = this.c + b0();
                    while (this.c < b0) {
                        xVar.b(b0());
                    }
                    f0(b0);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i5 = this.f6352e & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(I()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else if (i5 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Integer.valueOf(b0()));
                }
                f0(b02);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public void t(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.b(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    xVar.b(u());
                    if (Q()) {
                        return;
                    }
                    i3 = this.c;
                } while (b0() == this.f6352e);
                this.c = i3;
                return;
            }
            int i5 = this.f6352e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(u()));
                if (Q()) {
                    return;
                }
                i2 = this.c;
            } while (b0() == this.f6352e);
            this.c = i2;
        }

        @Override // f.h.h.z0
        public int u() {
            g0(0);
            return b0();
        }

        @Override // f.h.h.z0
        public void v(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int i4 = this.f6352e & 7;
                if (i4 == 2) {
                    int b0 = b0();
                    i0(b0);
                    int i5 = this.c + b0;
                    while (this.c < i5) {
                        xVar.b(V());
                    }
                    return;
                } else if (i4 == 5) {
                    do {
                        xVar.b(j());
                        if (Q()) {
                            return;
                        }
                        i3 = this.c;
                    } while (b0() == this.f6352e);
                    this.c = i3;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int i6 = this.f6352e & 7;
            if (i6 == 2) {
                int b02 = b0();
                i0(b02);
                int i7 = this.c + b02;
                while (this.c < i7) {
                    list.add(Integer.valueOf(V()));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(j()));
                    if (Q()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f6352e);
                this.c = i2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // f.h.h.z0
        public int w() {
            g0(0);
            return k.b(b0());
        }

        @Override // f.h.h.z0
        public long x() {
            g0(0);
            return k.c(c0());
        }

        @Override // f.h.h.z0
        public void y(List<Boolean> list) {
            int i2;
            int i3;
            if (list instanceof g) {
                g gVar = (g) list;
                int i4 = this.f6352e & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            gVar.b(b0() != 0);
                        }
                        f0(b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    gVar.b(k());
                    if (Q()) {
                        return;
                    }
                    i3 = this.c;
                } while (b0() == this.f6352e);
                this.c = i3;
                return;
            }
            int i5 = this.f6352e & 7;
            if (i5 != 0) {
                if (i5 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                    f0(b02);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Boolean.valueOf(k()));
                if (Q()) {
                    return;
                }
                i2 = this.c;
            } while (b0() == this.f6352e);
            this.c = i2;
        }

        @Override // f.h.h.z0
        public String z() {
            return Z(false);
        }
    }

    public f(a aVar) {
    }
}
