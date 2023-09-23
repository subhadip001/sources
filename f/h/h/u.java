package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import f.h.h.n0;
import f.h.h.u.a;
import f.h.h.y;
import f.h.h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet.java */
/* loaded from: classes2.dex */
public final class u<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final u f6426d = new u(true);
    public final e1<T, Object> a;
    public boolean b;
    public boolean c;

    /* compiled from: FieldSet.java */
    /* loaded from: classes2.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        boolean b();

        WireFormat$FieldType c();

        n0.a e(n0.a aVar, n0 n0Var);

        int getNumber();

        WireFormat$JavaType h();

        boolean isPacked();
    }

    public u(boolean z) {
        int i2 = e1.f6331m;
        this.a = new d1(0);
        n();
        n();
    }

    public static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int d(WireFormat$FieldType wireFormat$FieldType, int i2, Object obj) {
        int y = CodedOutputStream.y(i2);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            y *= 2;
        }
        return e(wireFormat$FieldType, obj) + y;
    }

    public static int e(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.b;
                return 4;
            case 2:
                return CodedOutputStream.C(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.C(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.b;
                return 1;
            case 8:
                if (obj instanceof j) {
                    return CodedOutputStream.e((j) obj);
                }
                return CodedOutputStream.x((String) obj);
            case 9:
                Logger logger6 = CodedOutputStream.b;
                return ((n0) obj).getSerializedSize();
            case 10:
                if (obj instanceof z) {
                    return CodedOutputStream.o((z) obj);
                }
                Logger logger7 = CodedOutputStream.b;
                return CodedOutputStream.p(((n0) obj).getSerializedSize());
            case 11:
                if (obj instanceof j) {
                    return CodedOutputStream.e((j) obj);
                }
                Logger logger8 = CodedOutputStream.b;
                return CodedOutputStream.p(((byte[]) obj).length);
            case 12:
                return CodedOutputStream.A(((Integer) obj).intValue());
            case 13:
                if (obj instanceof y.c) {
                    return CodedOutputStream.m(((y.c) obj).getNumber());
                }
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = CodedOutputStream.b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = CodedOutputStream.b;
                return 8;
            case 16:
                return CodedOutputStream.t(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.v(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(a<?> aVar, Object obj) {
        WireFormat$FieldType c = aVar.c();
        int number = aVar.getNumber();
        if (aVar.b()) {
            int i2 = 0;
            if (aVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i2 += e(c, obj2);
                }
                return CodedOutputStream.A(i2) + CodedOutputStream.y(number) + i2;
            }
            for (Object obj3 : (List) obj) {
                i2 += d(c, number, obj3);
            }
            return i2;
        }
        return d(c, number, obj);
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.h() == WireFormat$JavaType.MESSAGE) {
            if (key.b()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!l(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return l(entry.getValue());
        }
        return true;
    }

    public static boolean l(Object obj) {
        if (obj instanceof o0) {
            return ((o0) obj).isInitialized();
        }
        if (obj instanceof z) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i2, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.Y(i2, 3);
            ((n0) obj).writeTo(codedOutputStream);
            codedOutputStream.Y(i2, 4);
            return;
        }
        codedOutputStream.Y(i2, wireFormat$FieldType.getWireType());
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                codedOutputStream.P(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.N(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.c0(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.R(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.P(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.N(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.H(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof j) {
                    codedOutputStream.L((j) obj);
                    return;
                } else {
                    codedOutputStream.X((String) obj);
                    return;
                }
            case 9:
                ((n0) obj).writeTo(codedOutputStream);
                return;
            case 10:
                codedOutputStream.T((n0) obj);
                return;
            case 11:
                if (obj instanceof j) {
                    codedOutputStream.L((j) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.J(bArr, 0, bArr.length);
                return;
            case 12:
                codedOutputStream.a0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof y.c) {
                    codedOutputStream.R(((y.c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.R(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.N(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.P(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.a0(CodedOutputStream.D(((Integer) obj).intValue()));
                return;
            case 17:
                codedOutputStream.c0(CodedOutputStream.E(((Long) obj).longValue()));
                return;
            default:
                return;
        }
    }

    public void a(T t, Object obj) {
        List list;
        if (((GeneratedMessageLite.d) t).f1300i) {
            q(t, obj);
            Object g2 = g(t);
            if (g2 == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) g2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public u<T> clone() {
        u<T> uVar = new u<>();
        for (int i2 = 0; i2 < this.a.d(); i2++) {
            Map.Entry<T, Object> c = this.a.c(i2);
            uVar.p(c.getKey(), c.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.e()) {
            uVar.p(entry.getKey(), entry.getValue());
        }
        uVar.c = this.c;
        return uVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.a.equals(((u) obj).a);
        }
        return false;
    }

    public Object g(T t) {
        Object obj = this.a.get(t);
        return obj instanceof z ? ((z) obj).c() : obj;
    }

    public final int h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.h() == WireFormat$JavaType.MESSAGE && !key.b() && !key.isPacked()) {
            if (value instanceof z) {
                return CodedOutputStream.o((z) value) + CodedOutputStream.y(3) + CodedOutputStream.z(2, entry.getKey().getNumber()) + (CodedOutputStream.y(1) * 2);
            }
            return CodedOutputStream.p(((n0) value).getSerializedSize()) + CodedOutputStream.y(3) + CodedOutputStream.z(2, entry.getKey().getNumber()) + (CodedOutputStream.y(1) * 2);
        }
        return f(key, value);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        return this.a.isEmpty();
    }

    public boolean j() {
        for (int i2 = 0; i2 < this.a.d(); i2++) {
            if (!k(this.a.c(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.e()) {
            if (!k(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> m() {
        if (this.c) {
            return new z.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void n() {
        if (this.b) {
            return;
        }
        this.a.g();
        this.b = true;
    }

    public final void o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof z) {
            value = ((z) value).c();
        }
        if (key.b()) {
            Object g2 = g(key);
            if (g2 == null) {
                g2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) g2).add(c(obj));
            }
            this.a.put(key, g2);
        } else if (key.h() == WireFormat$JavaType.MESSAGE) {
            Object g3 = g(key);
            if (g3 == null) {
                this.a.put(key, c(value));
                return;
            }
            this.a.put(key, key.e(((n0) g3).toBuilder(), (n0) value).build());
        } else {
            this.a.put(key, c(value));
        }
    }

    public void p(T t, Object obj) {
        if (t.b()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q(t, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            q(t, obj);
        }
        if (obj instanceof z) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((r7 instanceof f.h.h.y.c) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        if ((r7 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if ((r7 instanceof f.h.h.z) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.google.protobuf.WireFormat$FieldType r0 = r6.c()
            java.nio.charset.Charset r1 = f.h.h.y.a
            java.util.Objects.requireNonNull(r7)
            com.google.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L45
        L17:
            boolean r0 = r7 instanceof f.h.h.n0
            if (r0 != 0) goto L31
            boolean r0 = r7 instanceof f.h.h.z
            if (r0 == 0) goto L45
            goto L31
        L20:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L31
            boolean r0 = r7 instanceof f.h.h.y.c
            if (r0 == 0) goto L45
            goto L31
        L29:
            boolean r0 = r7 instanceof f.h.h.j
            if (r0 != 0) goto L31
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L45
        L31:
            r0 = 1
            goto L46
        L33:
            boolean r0 = r7 instanceof java.lang.String
            goto L46
        L36:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L46
        L39:
            boolean r0 = r7 instanceof java.lang.Double
            goto L46
        L3c:
            boolean r0 = r7 instanceof java.lang.Float
            goto L46
        L3f:
            boolean r0 = r7 instanceof java.lang.Long
            goto L46
        L42:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L46
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.getNumber()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.google.protobuf.WireFormat$FieldType r6 = r6.c()
            com.google.protobuf.WireFormat$JavaType r6 = r6.getJavaType()
            r3[r2] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.h.u.q(f.h.h.u$a, java.lang.Object):void");
    }

    public u() {
        int i2 = e1.f6331m;
        this.a = new d1(16);
    }
}
