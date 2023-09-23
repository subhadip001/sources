package f.h.h;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.FieldType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.Writer;
import f.h.h.g0;
import f.h.h.j;
import f.h.h.u;
import f.h.h.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes2.dex */
public final class p0<T> implements a1<T> {
    public static final int[] r = new int[0];
    public static final Unsafe s = k1.r();
    public final int[] a;
    public final Object[] b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6415d;

    /* renamed from: e  reason: collision with root package name */
    public final n0 f6416e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6417f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6418g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6419h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6420i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f6421j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6422k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6423l;

    /* renamed from: m  reason: collision with root package name */
    public final r0 f6424m;
    public final d0 n;
    public final g1<?, ?> o;
    public final r<?> p;
    public final i0 q;

    public p0(int[] iArr, Object[] objArr, int i2, int i3, n0 n0Var, boolean z, boolean z2, int[] iArr2, int i4, int i5, r0 r0Var, d0 d0Var, g1<?, ?> g1Var, r<?> rVar, i0 i0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.f6415d = i3;
        this.f6418g = n0Var instanceof GeneratedMessageLite;
        this.f6419h = z;
        this.f6417f = rVar != null && rVar.e(n0Var);
        this.f6420i = z2;
        this.f6421j = iArr2;
        this.f6422k = i4;
        this.f6423l = i5;
        this.f6424m = r0Var;
        this.n = d0Var;
        this.o = g1Var;
        this.p = rVar;
        this.f6416e = n0Var;
        this.q = i0Var;
    }

    public static p0 B(l0 l0Var, r0 r0Var, d0 d0Var, g1 g1Var, r rVar, i0 i0Var) {
        if (l0Var instanceof y0) {
            return C((y0) l0Var, r0Var, d0Var, g1Var, rVar, i0Var);
        }
        f1 f1Var = (f1) l0Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> f.h.h.p0<T> C(f.h.h.y0 r33, f.h.h.r0 r34, f.h.h.d0 r35, f.h.h.g1<?, ?> r36, f.h.h.r<?> r37, f.h.h.i0 r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.C(f.h.h.y0, f.h.h.r0, f.h.h.d0, f.h.h.g1, f.h.h.r, f.h.h.i0):f.h.h.p0");
    }

    public static long D(int i2) {
        return i2 & 1048575;
    }

    public static <T> boolean E(T t, long j2) {
        return ((Boolean) k1.q(t, j2)).booleanValue();
    }

    public static <T> double F(T t, long j2) {
        return ((Double) k1.q(t, j2)).doubleValue();
    }

    public static <T> float G(T t, long j2) {
        return ((Float) k1.q(t, j2)).floatValue();
    }

    public static <T> int H(T t, long j2) {
        return ((Integer) k1.q(t, j2)).intValue();
    }

    public static <T> long I(T t, long j2) {
        return ((Long) k1.q(t, j2)).longValue();
    }

    public static Field T(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder E = f.a.b.a.a.E("Field ", str, " for ");
            E.append(cls.getName());
            E.append(" not found. Known fields are ");
            E.append(Arrays.toString(declaredFields));
            throw new RuntimeException(E.toString());
        }
    }

    public static int X(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static h1 q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        h1 h1Var = generatedMessageLite.unknownFields;
        if (h1Var == h1.f6360f) {
            h1 e2 = h1.e();
            generatedMessageLite.unknownFields = e2;
            return e2;
        }
        return h1Var;
    }

    public static List<?> w(Object obj, long j2) {
        return (List) k1.q(obj, j2);
    }

    public final void A(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long D = D(i3);
        if (v(t2, i4, i2)) {
            Object q = v(t, i4, i2) ? k1.q(t, D) : null;
            Object q2 = k1.q(t2, D);
            if (q != null && q2 != null) {
                k1.f6405e.s(t, D, y.c(q, q2));
                V(t, i4, i2);
            } else if (q2 != null) {
                k1.f6405e.s(t, D, q2);
                V(t, i4, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    public final <K, V> int J(T t, byte[] bArr, int i2, int i3, int i4, long j2, e eVar) {
        int i5;
        Unsafe unsafe = s;
        Object obj = this.b[(i4 / 3) * 2];
        Object object = unsafe.getObject(t, j2);
        if (this.q.g(object)) {
            Object e2 = this.q.e(obj);
            this.q.a(e2, object);
            unsafe.putObject(t, j2, e2);
            object = e2;
        }
        g0.a<?, ?> c = this.q.c(obj);
        Map<?, ?> d2 = this.q.d(object);
        int d0 = f.h.b.c.a.d0(bArr, i2, eVar);
        int i6 = eVar.a;
        if (i6 >= 0 && i6 <= i3 - d0) {
            int i7 = d0 + i6;
            Object obj2 = c.b;
            Object obj3 = c.f6357d;
            while (d0 < i7) {
                int i8 = d0 + 1;
                byte b = bArr[d0];
                if (b < 0) {
                    i5 = f.h.b.c.a.c0(b, bArr, i8, eVar);
                    b = eVar.a;
                } else {
                    i5 = i8;
                }
                int i9 = b >>> 3;
                int i10 = b & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == c.c.getWireType()) {
                        d0 = l(bArr, i5, i3, c.c, c.f6357d.getClass(), eVar);
                        obj3 = eVar.c;
                    }
                    d0 = f.h.b.c.a.W0(b, bArr, i5, i3, eVar);
                } else if (i10 == c.a.getWireType()) {
                    d0 = l(bArr, i5, i3, c.a, null, eVar);
                    obj3 = obj3;
                    obj2 = eVar.c;
                } else {
                    d0 = f.h.b.c.a.W0(b, bArr, i5, i3, eVar);
                }
            }
            if (d0 == i7) {
                d2.put(obj2, obj3);
                return i7;
            }
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.h();
    }

    public final int K(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, e eVar) {
        Unsafe unsafe = s;
        long j3 = this.a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(f.h.b.c.a.M(bArr, i2))));
                    int i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(f.h.b.c.a.L(bArr, i2))));
                    int i11 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i11;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int f0 = f.h.b.c.a.f0(bArr, i2, eVar);
                    unsafe.putObject(t, j2, Long.valueOf(eVar.b));
                    unsafe.putInt(t, j3, i5);
                    return f0;
                }
                break;
            case 55:
            case 62:
                if (i6 == 0) {
                    int d0 = f.h.b.c.a.d0(bArr, i2, eVar);
                    unsafe.putObject(t, j2, Integer.valueOf(eVar.a));
                    unsafe.putInt(t, j3, i5);
                    return d0;
                }
                break;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(f.h.b.c.a.M(bArr, i2)));
                    int i12 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i12;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(f.h.b.c.a.L(bArr, i2)));
                    int i13 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i13;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int f02 = f.h.b.c.a.f0(bArr, i2, eVar);
                    unsafe.putObject(t, j2, Boolean.valueOf(eVar.b != 0));
                    unsafe.putInt(t, j3, i5);
                    return f02;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int d02 = f.h.b.c.a.d0(bArr, i2, eVar);
                    int i14 = eVar.a;
                    if (i14 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) != 0 && !l1.h(bArr, d02, d02 + i14)) {
                        throw InvalidProtocolBufferException.c();
                    } else {
                        unsafe.putObject(t, j2, new String(bArr, d02, i14, y.a));
                        d02 += i14;
                    }
                    unsafe.putInt(t, j3, i5);
                    return d02;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int O = f.h.b.c.a.O(p(i9), bArr, i2, i3, eVar);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, eVar.c);
                    } else {
                        unsafe.putObject(t, j2, y.c(object, eVar.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return O;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int J = f.h.b.c.a.J(bArr, i2, eVar);
                    unsafe.putObject(t, j2, eVar.c);
                    unsafe.putInt(t, j3, i5);
                    return J;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int d03 = f.h.b.c.a.d0(bArr, i2, eVar);
                    int i15 = eVar.a;
                    y.e eVar2 = (y.e) this.b[((i9 / 3) * 2) + 1];
                    if (eVar2 != null && !eVar2.isInRange(i15)) {
                        q(t).f(i4, Long.valueOf(i15));
                    } else {
                        unsafe.putObject(t, j2, Integer.valueOf(i15));
                        unsafe.putInt(t, j3, i5);
                    }
                    return d03;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int d04 = f.h.b.c.a.d0(bArr, i2, eVar);
                    unsafe.putObject(t, j2, Integer.valueOf(k.b(eVar.a)));
                    unsafe.putInt(t, j3, i5);
                    return d04;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int f03 = f.h.b.c.a.f0(bArr, i2, eVar);
                    unsafe.putObject(t, j2, Long.valueOf(k.c(eVar.b)));
                    unsafe.putInt(t, j3, i5);
                    return f03;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int N = f.h.b.c.a.N(p(i9), bArr, i2, i3, (i4 & (-8)) | 4, eVar);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, eVar.c);
                    } else {
                        unsafe.putObject(t, j2, y.c(object2, eVar.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return N;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int L(T r32, byte[] r33, int r34, int r35, int r36, f.h.h.e r37) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.L(java.lang.Object, byte[], int, int, int, f.h.h.e):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ab, code lost:
        if (r0 != r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02af, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e1, code lost:
        if (r0 != r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0300, code lost:
        if (r0 != r15) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0302, code lost:
        r2 = r20;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(T r29, byte[] r30, int r31, int r32, f.h.h.e r33) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.M(java.lang.Object, byte[], int, int, f.h.h.e):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x020c -> B:108:0x020d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0140 -> B:57:0x0141). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01bc -> B:87:0x01bd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int N(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, f.h.h.e r30) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.N(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, f.h.h.e):int");
    }

    public final int O(int i2) {
        if (i2 < this.c || i2 > this.f6415d) {
            return -1;
        }
        return W(i2, 0);
    }

    public final <E> void P(Object obj, long j2, z0 z0Var, a1<E> a1Var, q qVar) {
        z0Var.g(this.n.c(obj, j2), a1Var, qVar);
    }

    public final <E> void Q(Object obj, int i2, z0 z0Var, a1<E> a1Var, q qVar) {
        z0Var.l(this.n.c(obj, D(i2)), a1Var, qVar);
    }

    public final void R(Object obj, int i2, z0 z0Var) {
        if ((536870912 & i2) != 0) {
            k1.f6405e.s(obj, D(i2), z0Var.O());
        } else if (this.f6418g) {
            k1.f6405e.s(obj, D(i2), z0Var.z());
        } else {
            k1.f6405e.s(obj, D(i2), z0Var.G());
        }
    }

    public final void S(Object obj, int i2, z0 z0Var) {
        if ((536870912 & i2) != 0) {
            z0Var.F(this.n.c(obj, D(i2)));
        } else {
            z0Var.C(this.n.c(obj, D(i2)));
        }
    }

    public final void U(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        k1.f6405e.q(t, j2, (1 << (i3 >>> 20)) | k1.o(t, j2));
    }

    public final void V(T t, int i2, int i3) {
        k1.f6405e.q(t, this.a[i3 + 2] & 1048575, i2);
    }

    public final int W(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int Y(int i2) {
        return this.a[i2 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0527  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(T r18, com.google.protobuf.Writer r19) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.Z(java.lang.Object, com.google.protobuf.Writer):void");
    }

    @Override // f.h.h.a1
    public void a(T t, T t2) {
        Objects.requireNonNull(t2);
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int i3 = iArr[i2 + 1];
                long D = D(i3);
                int i4 = this.a[i2];
                switch (X(i3)) {
                    case 0:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.w(t, D, k1.m(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 1:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.p(t, D, k1.n(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 2:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.z(t, D, k1.p(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 3:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.z(t, D, k1.p(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 4:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 5:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.z(t, D, k1.p(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 6:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 7:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.m(t, D, k1.h(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 8:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.s(t, D, k1.q(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 9:
                        z(t, t2, i2);
                        break;
                    case 10:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.s(t, D, k1.q(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 11:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 12:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 13:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 14:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.z(t, D, k1.p(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 15:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.f6405e.q(t, D, k1.o(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 16:
                        if (!t(t2, i2)) {
                            break;
                        } else {
                            k1.z(t, D, k1.p(t2, D));
                            U(t, i2);
                            break;
                        }
                    case 17:
                        z(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(t, t2, D);
                        break;
                    case 50:
                        i0 i0Var = this.q;
                        Class<?> cls = c1.a;
                        k1.f6405e.s(t, D, i0Var.a(k1.q(t, D), k1.q(t2, D)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!v(t2, i4, i2)) {
                            break;
                        } else {
                            k1.f6405e.s(t, D, k1.q(t2, D));
                            V(t, i4, i2);
                            break;
                        }
                    case 60:
                        A(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!v(t2, i4, i2)) {
                            break;
                        } else {
                            k1.f6405e.s(t, D, k1.q(t2, D));
                            V(t, i4, i2);
                            break;
                        }
                    case 68:
                        A(t, t2, i2);
                        break;
                }
                i2 += 3;
            } else {
                g1<?, ?> g1Var = this.o;
                Class<?> cls2 = c1.a;
                g1Var.o(t, g1Var.k(g1Var.g(t), g1Var.g(t2)));
                if (this.f6417f) {
                    c1.B(this.p, t, t2);
                    return;
                }
                return;
            }
        }
    }

    public final <K, V> void a0(Writer writer, int i2, Object obj, int i3) {
        if (obj != null) {
            g0.a<?, ?> c = this.q.c(this.b[(i3 / 3) * 2]);
            Map<?, ?> h2 = this.q.h(obj);
            m mVar = (m) writer;
            Objects.requireNonNull(mVar.a);
            for (Map.Entry<?, ?> entry : h2.entrySet()) {
                mVar.a.Y(i2, 2);
                mVar.a.a0(g0.a(c, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStream = mVar.a;
                Object key = entry.getKey();
                Object value = entry.getValue();
                u.r(codedOutputStream, c.a, 1, key);
                u.r(codedOutputStream, c.c, 2, value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05f3 A[SYNTHETIC] */
    @Override // f.h.h.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(T r13, com.google.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 3328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.b(java.lang.Object, com.google.protobuf.Writer):void");
    }

    public final void b0(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            ((m) writer).a.W(i2, (String) obj);
            return;
        }
        ((m) writer).a.K(i2, (j) obj);
    }

    @Override // f.h.h.a1
    public void c(T t) {
        int i2;
        int i3 = this.f6422k;
        while (true) {
            i2 = this.f6423l;
            if (i3 >= i2) {
                break;
            }
            long D = D(Y(this.f6421j[i3]));
            Object q = k1.q(t, D);
            if (q != null) {
                k1.f6405e.s(t, D, this.q.b(q));
            }
            i3++;
        }
        int length = this.f6421j.length;
        while (i2 < length) {
            this.n.a(t, this.f6421j[i2]);
            i2++;
        }
        this.o.j(t);
        if (this.f6417f) {
            this.p.f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [f.h.h.a1] */
    /* JADX WARN: Type inference failed for: r0v20, types: [f.h.h.a1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [f.h.h.a1] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27, types: [f.h.h.a1] */
    /* JADX WARN: Type inference failed for: r1v34 */
    @Override // f.h.h.a1
    public final boolean d(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f6422k) {
                return !this.f6417f || this.p.c(t).j();
            }
            int i7 = this.f6421j[i6];
            int i8 = this.a[i7];
            int Y = Y(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = s.getInt(t, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if (((268435456 & Y) != 0) && !u(t, i7, i2, i3, i11)) {
                return false;
            }
            int X = X(Y);
            if (X != 9 && X != 17) {
                if (X != 27) {
                    if (X == 60 || X == 68) {
                        if (v(t, i8, i7) && !p(i7).d(k1.q(t, D(Y)))) {
                            return false;
                        }
                    } else if (X != 49) {
                        if (X != 50) {
                            continue;
                        } else {
                            Map<?, ?> h2 = this.q.h(k1.q(t, D(Y)));
                            if (!h2.isEmpty()) {
                                if (this.q.c(this.b[(i7 / 3) * 2]).c.getJavaType() == WireFormat$JavaType.MESSAGE) {
                                    a1<T> a1Var = 0;
                                    Iterator<?> it = h2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (a1Var == null) {
                                            a1Var = w0.c.a(next.getClass());
                                        }
                                        boolean d2 = a1Var.d(next);
                                        a1Var = a1Var;
                                        if (!d2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) k1.q(t, D(Y));
                if (!list.isEmpty()) {
                    ?? p = p(i7);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!p.d(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (u(t, i7, i2, i3, i11) && !p(i7).d(k1.q(t, D(Y)))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
    }

    @Override // f.h.h.a1
    public void e(T t, z0 z0Var, q qVar) {
        Objects.requireNonNull(qVar);
        x(this.o, this.p, t, z0Var, qVar);
    }

    @Override // f.h.h.a1
    public void f(T t, byte[] bArr, int i2, int i3, e eVar) {
        if (this.f6419h) {
            M(t, bArr, i2, i3, eVar);
        } else {
            L(t, bArr, i2, i3, 0, eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ae, code lost:
        if (java.lang.Float.floatToIntBits(f.h.h.k1.n(r10, r5)) == java.lang.Float.floatToIntBits(f.h.h.k1.n(r11, r5))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c9, code lost:
        if (java.lang.Double.doubleToLongBits(f.h.h.k1.m(r10, r5)) == java.lang.Double.doubleToLongBits(f.h.h.k1.m(r11, r5))) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (f.h.h.c1.C(f.h.h.k1.q(r10, r5), f.h.h.k1.q(r11, r5)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (f.h.h.c1.C(f.h.h.k1.q(r10, r5), f.h.h.k1.q(r11, r5)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (f.h.h.k1.p(r10, r5) == f.h.h.k1.p(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (f.h.h.k1.p(r10, r5) == f.h.h.k1.p(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
        if (f.h.h.c1.C(f.h.h.k1.q(r10, r5), f.h.h.k1.q(r11, r5)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
        if (f.h.h.c1.C(f.h.h.k1.q(r10, r5), f.h.h.k1.q(r11, r5)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
        if (f.h.h.c1.C(f.h.h.k1.q(r10, r5), f.h.h.k1.q(r11, r5)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0137, code lost:
        if (f.h.h.k1.h(r10, r5) == f.h.h.k1.h(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0149, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015d, code lost:
        if (f.h.h.k1.p(r10, r5) == f.h.h.k1.p(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
        if (f.h.h.k1.o(r10, r5) == f.h.h.k1.o(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0182, code lost:
        if (f.h.h.k1.p(r10, r5) == f.h.h.k1.p(r11, r5)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0195, code lost:
        if (f.h.h.k1.p(r10, r5) == f.h.h.k1.p(r11, r5)) goto L88;
     */
    @Override // f.h.h.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.g(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // f.h.h.a1
    public int h(T t) {
        return this.f6419h ? s(t) : r(t);
    }

    @Override // f.h.h.a1
    public T i() {
        return (T) this.f6424m.a(this.f6416e);
    }

    @Override // f.h.h.a1
    public int j(T t) {
        int i2;
        int b;
        int length = this.a.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int Y = Y(i4);
            int i5 = this.a[i4];
            long D = D(Y);
            int i6 = 37;
            switch (X(Y)) {
                case 0:
                    i2 = i3 * 53;
                    b = y.b(Double.doubleToLongBits(k1.m(t, D)));
                    i3 = b + i2;
                    break;
                case 1:
                    i2 = i3 * 53;
                    b = Float.floatToIntBits(k1.n(t, D));
                    i3 = b + i2;
                    break;
                case 2:
                    i2 = i3 * 53;
                    b = y.b(k1.p(t, D));
                    i3 = b + i2;
                    break;
                case 3:
                    i2 = i3 * 53;
                    b = y.b(k1.p(t, D));
                    i3 = b + i2;
                    break;
                case 4:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 5:
                    i2 = i3 * 53;
                    b = y.b(k1.p(t, D));
                    i3 = b + i2;
                    break;
                case 6:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 7:
                    i2 = i3 * 53;
                    b = y.a(k1.h(t, D));
                    i3 = b + i2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    b = ((String) k1.q(t, D)).hashCode();
                    i3 = b + i2;
                    break;
                case 9:
                    Object q = k1.q(t, D);
                    if (q != null) {
                        i6 = q.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    b = k1.q(t, D).hashCode();
                    i3 = b + i2;
                    break;
                case 11:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 14:
                    i2 = i3 * 53;
                    b = y.b(k1.p(t, D));
                    i3 = b + i2;
                    break;
                case 15:
                    i2 = i3 * 53;
                    b = k1.o(t, D);
                    i3 = b + i2;
                    break;
                case 16:
                    i2 = i3 * 53;
                    b = y.b(k1.p(t, D));
                    i3 = b + i2;
                    break;
                case 17:
                    Object q2 = k1.q(t, D);
                    if (q2 != null) {
                        i6 = q2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    b = k1.q(t, D).hashCode();
                    i3 = b + i2;
                    break;
                case 50:
                    i2 = i3 * 53;
                    b = k1.q(t, D).hashCode();
                    i3 = b + i2;
                    break;
                case 51:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(Double.doubleToLongBits(F(t, D)));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = Float.floatToIntBits(G(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(I(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(I(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(I(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.a(E(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = ((String) k1.q(t, D)).hashCode();
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = k1.q(t, D).hashCode();
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = k1.q(t, D).hashCode();
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(I(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = H(t, D);
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = y.b(I(t, D));
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(t, i5, i4)) {
                        i2 = i3 * 53;
                        b = k1.q(t, D).hashCode();
                        i3 = b + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.o.g(t).hashCode() + (i3 * 53);
        return this.f6417f ? (hashCode * 53) + this.p.c(t).hashCode() : hashCode;
    }

    public final boolean k(T t, T t2, int i2) {
        return t(t, i2) == t(t2, i2);
    }

    public final int l(byte[] bArr, int i2, int i3, WireFormat$FieldType wireFormat$FieldType, Class<?> cls, e eVar) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                eVar.c = Double.valueOf(Double.longBitsToDouble(f.h.b.c.a.M(bArr, i2)));
                return i2 + 8;
            case 1:
                eVar.c = Float.valueOf(Float.intBitsToFloat(f.h.b.c.a.L(bArr, i2)));
                return i2 + 4;
            case 2:
            case 3:
                int f0 = f.h.b.c.a.f0(bArr, i2, eVar);
                eVar.c = Long.valueOf(eVar.b);
                return f0;
            case 4:
            case 12:
            case 13:
                int d0 = f.h.b.c.a.d0(bArr, i2, eVar);
                eVar.c = Integer.valueOf(eVar.a);
                return d0;
            case 5:
            case 15:
                eVar.c = Long.valueOf(f.h.b.c.a.M(bArr, i2));
                return i2 + 8;
            case 6:
            case 14:
                eVar.c = Integer.valueOf(f.h.b.c.a.L(bArr, i2));
                return i2 + 4;
            case 7:
                int f02 = f.h.b.c.a.f0(bArr, i2, eVar);
                eVar.c = Boolean.valueOf(eVar.b != 0);
                return f02;
            case 8:
                return f.h.b.c.a.a0(bArr, i2, eVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return f.h.b.c.a.O(w0.c.a(cls), bArr, i2, i3, eVar);
            case 11:
                return f.h.b.c.a.J(bArr, i2, eVar);
            case 16:
                int d02 = f.h.b.c.a.d0(bArr, i2, eVar);
                eVar.c = Integer.valueOf(k.b(eVar.a));
                return d02;
            case 17:
                int f03 = f.h.b.c.a.f0(bArr, i2, eVar);
                eVar.c = Long.valueOf(k.c(eVar.b));
                return f03;
        }
    }

    public final <UT, UB> UB m(Object obj, int i2, UB ub, g1<UT, UB> g1Var) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        Object q = k1.q(obj, D(iArr[i2 + 1]));
        if (q == null) {
            return ub;
        }
        int i4 = (i2 / 3) * 2;
        y.e eVar = (y.e) this.b[i4 + 1];
        if (eVar == null) {
            return ub;
        }
        Map<?, ?> d2 = this.q.d(q);
        g0.a<?, ?> c = this.q.c(this.b[i4]);
        Iterator<Map.Entry<?, ?>> it = d2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = g1Var.m();
                }
                int a = g0.a(c, next.getKey(), next.getValue());
                byte[] bArr = new byte[a];
                Logger logger = CodedOutputStream.b;
                CodedOutputStream.c cVar = new CodedOutputStream.c(bArr, 0, a);
                try {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    u.r(cVar, c.a, 1, key);
                    u.r(cVar, c.c, 2, value);
                    cVar.b();
                    g1Var.d(ub, i3, new j.f(bArr));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    public final y.e n(int i2) {
        return (y.e) this.b[((i2 / 3) * 2) + 1];
    }

    public final Object o(int i2) {
        return this.b[(i2 / 3) * 2];
    }

    public final a1 p(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.b;
        a1 a1Var = (a1) objArr[i3];
        if (a1Var != null) {
            return a1Var;
        }
        a1<T> a = w0.c.a((Class) objArr[i3 + 1]);
        this.b[i3] = a;
        return a;
    }

    public final int r(T t) {
        int i2;
        int i3;
        int f2;
        int w;
        int h2;
        int y;
        int A;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (i5 < this.a.length) {
            int Y = Y(i5);
            int i9 = this.a[i5];
            int X = X(Y);
            if (X <= 17) {
                i2 = this.a[i5 + 2];
                int i10 = i4 & i2;
                i3 = 1 << (i2 >>> 20);
                if (i10 != i7) {
                    i8 = unsafe.getInt(t, i10);
                    i7 = i10;
                }
            } else {
                i2 = (!this.f6420i || X < FieldType.DOUBLE_LIST_PACKED.id() || X > FieldType.SINT64_LIST_PACKED.id()) ? 0 : i4 & this.a[i5 + 2];
                i3 = 0;
            }
            long D = D(Y);
            int i11 = i7;
            int i12 = i8;
            switch (X) {
                case 0:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.f(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.j(i9, 0.0f);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.n(i9, unsafe.getLong(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.B(i9, unsafe.getLong(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.l(i9, unsafe.getInt(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.i(i9, 0L);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.h(i9, 0);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.c(i9, true);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i3) != 0) {
                        Object object = unsafe.getObject(t, D);
                        if (object instanceof j) {
                            w = CodedOutputStream.d(i9, (j) object);
                        } else {
                            w = CodedOutputStream.w(i9, (String) object);
                        }
                        i6 += w;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i12 & i3) != 0) {
                        f2 = c1.n(i9, unsafe.getObject(t, D), p(i5));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.d(i9, (j) unsafe.getObject(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.z(i9, unsafe.getInt(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.g(i9, unsafe.getInt(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.q(i9, 0);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.r(i9, 0L);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.s(i9, unsafe.getInt(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.u(i9, unsafe.getLong(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i3) != 0) {
                        f2 = CodedOutputStream.k(i9, (n0) unsafe.getObject(t, D), p(i5));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f2 = c1.g(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 19:
                    f2 = c1.e(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 20:
                    f2 = c1.l(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 21:
                    f2 = c1.w(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 22:
                    f2 = c1.j(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 23:
                    f2 = c1.g(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 24:
                    f2 = c1.e(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 25:
                    f2 = c1.a(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 26:
                    f2 = c1.t(i9, (List) unsafe.getObject(t, D));
                    i6 += f2;
                    break;
                case 27:
                    f2 = c1.o(i9, (List) unsafe.getObject(t, D), p(i5));
                    i6 += f2;
                    break;
                case 28:
                    f2 = c1.b(i9, (List) unsafe.getObject(t, D));
                    i6 += f2;
                    break;
                case 29:
                    f2 = c1.u(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 30:
                    f2 = c1.c(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 31:
                    f2 = c1.e(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 32:
                    f2 = c1.g(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 33:
                    f2 = c1.p(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 34:
                    f2 = c1.r(i9, (List) unsafe.getObject(t, D), false);
                    i6 += f2;
                    break;
                case 35:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 36:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 37:
                    h2 = c1.m((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 38:
                    h2 = c1.x((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 39:
                    h2 = c1.k((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 40:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 41:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 42:
                    Class<?> cls = c1.a;
                    h2 = ((List) unsafe.getObject(t, D)).size();
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 43:
                    h2 = c1.v((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 44:
                    h2 = c1.d((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 45:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 46:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 47:
                    h2 = c1.q((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 48:
                    h2 = c1.s((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i2, h2);
                        }
                        y = CodedOutputStream.y(i9);
                        A = CodedOutputStream.A(h2);
                        i6 += A + y + h2;
                        break;
                    }
                case 49:
                    f2 = c1.i(i9, (List) unsafe.getObject(t, D), p(i5));
                    i6 += f2;
                    break;
                case 50:
                    f2 = this.q.f(i9, unsafe.getObject(t, D), o(i5));
                    i6 += f2;
                    break;
                case 51:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.f(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.j(i9, 0.0f);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.n(i9, I(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.B(i9, I(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.l(i9, H(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.i(i9, 0L);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.h(i9, 0);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.c(i9, true);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(t, i9, i5)) {
                        Object object2 = unsafe.getObject(t, D);
                        if (object2 instanceof j) {
                            w = CodedOutputStream.d(i9, (j) object2);
                        } else {
                            w = CodedOutputStream.w(i9, (String) object2);
                        }
                        i6 += w;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(t, i9, i5)) {
                        f2 = c1.n(i9, unsafe.getObject(t, D), p(i5));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.d(i9, (j) unsafe.getObject(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.z(i9, H(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.g(i9, H(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.q(i9, 0);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.r(i9, 0L);
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.s(i9, H(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.u(i9, I(t, D));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(t, i9, i5)) {
                        f2 = CodedOutputStream.k(i9, (n0) unsafe.getObject(t, D), p(i5));
                        i6 += f2;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
            i7 = i11;
            i8 = i12;
        }
        int i13 = 0;
        g1<?, ?> g1Var = this.o;
        int h3 = g1Var.h(g1Var.g(t)) + i6;
        if (this.f6417f) {
            u<?> c = this.p.c(t);
            for (int i14 = 0; i14 < c.a.d(); i14++) {
                Map.Entry<?, Object> c2 = c.a.c(i14);
                i13 += u.f((u.a) c2.getKey(), c2.getValue());
            }
            for (Map.Entry<?, Object> entry : c.a.e()) {
                i13 += u.f((u.a) entry.getKey(), entry.getValue());
            }
            return h3 + i13;
        }
        return h3;
    }

    public final int s(T t) {
        int f2;
        int h2;
        int y;
        int A;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int Y = Y(i3);
            int X = X(Y);
            int i4 = this.a[i3];
            long D = D(Y);
            int i5 = (X < FieldType.DOUBLE_LIST_PACKED.id() || X > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i3 + 2] & 1048575;
            switch (X) {
                case 0:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.f(i4, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.j(i4, 0.0f);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.n(i4, k1.p(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.B(i4, k1.p(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.l(i4, k1.o(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.i(i4, 0L);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.h(i4, 0);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.c(i4, true);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (t(t, i3)) {
                        Object q = k1.q(t, D);
                        if (q instanceof j) {
                            f2 = CodedOutputStream.d(i4, (j) q);
                        } else {
                            f2 = CodedOutputStream.w(i4, (String) q);
                        }
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (t(t, i3)) {
                        f2 = c1.n(i4, k1.q(t, D), p(i3));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.d(i4, (j) k1.q(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.z(i4, k1.o(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.g(i4, k1.o(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.q(i4, 0);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.r(i4, 0L);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.s(i4, k1.o(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.u(i4, k1.p(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (t(t, i3)) {
                        f2 = CodedOutputStream.k(i4, (n0) k1.q(t, D), p(i3));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    f2 = c1.g(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 19:
                    f2 = c1.e(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 20:
                    f2 = c1.l(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 21:
                    f2 = c1.w(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 22:
                    f2 = c1.j(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 23:
                    f2 = c1.g(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 24:
                    f2 = c1.e(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 25:
                    f2 = c1.a(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 26:
                    f2 = c1.t(i4, w(t, D));
                    i2 += f2;
                    break;
                case 27:
                    f2 = c1.o(i4, w(t, D), p(i3));
                    i2 += f2;
                    break;
                case 28:
                    f2 = c1.b(i4, w(t, D));
                    i2 += f2;
                    break;
                case 29:
                    f2 = c1.u(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 30:
                    f2 = c1.c(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 31:
                    f2 = c1.e(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 32:
                    f2 = c1.g(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 33:
                    f2 = c1.p(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 34:
                    f2 = c1.r(i4, w(t, D), false);
                    i2 += f2;
                    break;
                case 35:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 36:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 37:
                    h2 = c1.m((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 38:
                    h2 = c1.x((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 39:
                    h2 = c1.k((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 40:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 41:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 42:
                    Class<?> cls = c1.a;
                    h2 = ((List) unsafe.getObject(t, D)).size();
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 43:
                    h2 = c1.v((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 44:
                    h2 = c1.d((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 45:
                    h2 = c1.f((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 46:
                    h2 = c1.h((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 47:
                    h2 = c1.q((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 48:
                    h2 = c1.s((List) unsafe.getObject(t, D));
                    if (h2 <= 0) {
                        break;
                    } else {
                        if (this.f6420i) {
                            unsafe.putInt(t, i5, h2);
                        }
                        y = CodedOutputStream.y(i4);
                        A = CodedOutputStream.A(h2);
                        i2 = A + y + h2 + i2;
                        break;
                    }
                case 49:
                    f2 = c1.i(i4, w(t, D), p(i3));
                    i2 += f2;
                    break;
                case 50:
                    f2 = this.q.f(i4, k1.q(t, D), o(i3));
                    i2 += f2;
                    break;
                case 51:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.f(i4, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.j(i4, 0.0f);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.n(i4, I(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.B(i4, I(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.l(i4, H(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.i(i4, 0L);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.h(i4, 0);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.c(i4, true);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(t, i4, i3)) {
                        Object q2 = k1.q(t, D);
                        if (q2 instanceof j) {
                            f2 = CodedOutputStream.d(i4, (j) q2);
                        } else {
                            f2 = CodedOutputStream.w(i4, (String) q2);
                        }
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(t, i4, i3)) {
                        f2 = c1.n(i4, k1.q(t, D), p(i3));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.d(i4, (j) k1.q(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.z(i4, H(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.g(i4, H(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.q(i4, 0);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.r(i4, 0L);
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.s(i4, H(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.u(i4, I(t, D));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(t, i4, i3)) {
                        f2 = CodedOutputStream.k(i4, (n0) k1.q(t, D), p(i3));
                        i2 += f2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        g1<?, ?> g1Var = this.o;
        return g1Var.h(g1Var.g(t)) + i2;
    }

    public final boolean t(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 != 1048575) {
            return (k1.o(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long D = D(i4);
        switch (X(i4)) {
            case 0:
                return Double.doubleToRawLongBits(k1.m(t, D)) != 0;
            case 1:
                return Float.floatToRawIntBits(k1.n(t, D)) != 0;
            case 2:
                return k1.p(t, D) != 0;
            case 3:
                return k1.p(t, D) != 0;
            case 4:
                return k1.o(t, D) != 0;
            case 5:
                return k1.p(t, D) != 0;
            case 6:
                return k1.o(t, D) != 0;
            case 7:
                return k1.h(t, D);
            case 8:
                Object q = k1.q(t, D);
                if (q instanceof String) {
                    return !((String) q).isEmpty();
                }
                if (q instanceof j) {
                    return !j.f6366g.equals(q);
                }
                throw new IllegalArgumentException();
            case 9:
                return k1.q(t, D) != null;
            case 10:
                return !j.f6366g.equals(k1.q(t, D));
            case 11:
                return k1.o(t, D) != 0;
            case 12:
                return k1.o(t, D) != 0;
            case 13:
                return k1.o(t, D) != 0;
            case 14:
                return k1.p(t, D) != 0;
            case 15:
                return k1.o(t, D) != 0;
            case 16:
                return k1.p(t, D) != 0;
            case 17:
                return k1.q(t, D) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean u(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return t(t, i2);
        }
        return (i4 & i5) != 0;
    }

    public final boolean v(T t, int i2, int i3) {
        return k1.o(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f6422k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f6423l) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = m(r19, r16.f6421j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.n(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends f.h.h.u.a<ET>> void x(f.h.h.g1<UT, UB> r17, f.h.h.r<ET> r18, T r19, f.h.h.z0 r20, f.h.h.q r21) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.p0.x(f.h.h.g1, f.h.h.r, java.lang.Object, f.h.h.z0, f.h.h.q):void");
    }

    public final <K, V> void y(Object obj, int i2, Object obj2, q qVar, z0 z0Var) {
        long D = D(this.a[i2 + 1]);
        Object q = k1.q(obj, D);
        if (q == null) {
            q = this.q.e(obj2);
            k1.f6405e.s(obj, D, q);
        } else if (this.q.g(q)) {
            Object e2 = this.q.e(obj2);
            this.q.a(e2, q);
            k1.f6405e.s(obj, D, e2);
            q = e2;
        }
        z0Var.E(this.q.d(q), this.q.c(obj2), qVar);
    }

    public final void z(T t, T t2, int i2) {
        long D = D(this.a[i2 + 1]);
        if (t(t2, i2)) {
            Object q = k1.q(t, D);
            Object q2 = k1.q(t2, D);
            if (q != null && q2 != null) {
                k1.f6405e.s(t, D, y.c(q, q2));
                U(t, i2);
            } else if (q2 != null) {
                k1.f6405e.s(t, D, q2);
                U(t, i2);
            }
        }
    }
}
