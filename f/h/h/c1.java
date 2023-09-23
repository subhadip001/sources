package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Writer;
import f.h.h.u;
import f.h.h.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: SchemaUtil.java */
/* loaded from: classes2.dex */
public final class c1 {
    public static final Class<?> a;
    public static final g1<?, ?> b;
    public static final g1<?, ?> c;

    /* renamed from: d  reason: collision with root package name */
    public static final g1<?, ?> f6326d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = A(false);
        c = A(true);
        f6326d = new i1();
    }

    public static g1<?, ?> A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends u.a<FT>> void B(r<FT> rVar, T t, T t2) {
        u<FT> c2 = rVar.c(t2);
        if (c2.i()) {
            return;
        }
        u<FT> d2 = rVar.d(t);
        Objects.requireNonNull(d2);
        for (int i2 = 0; i2 < c2.a.d(); i2++) {
            d2.o(c2.a.c(i2));
        }
        for (Map.Entry<FT, Object> entry : c2.a.e()) {
            d2.o(entry);
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(int i2, int i3, UB ub, g1<UT, UB> g1Var) {
        if (ub == null) {
            ub = g1Var.m();
        }
        g1Var.e(ub, i2, i3);
        return ub;
    }

    public static void E(int i2, List<Boolean> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).booleanValue();
                Logger logger = CodedOutputStream.b;
                i4++;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.H(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.I(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    public static void F(int i2, List<j> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        for (int i3 = 0; i3 < list.size(); i3++) {
            mVar.a.K(i2, list.get(i3));
        }
    }

    public static void G(int i2, List<Double> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).doubleValue();
                Logger logger = CodedOutputStream.b;
                i4 += 8;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                CodedOutputStream codedOutputStream = mVar.a;
                double doubleValue = list.get(i3).doubleValue();
                Objects.requireNonNull(codedOutputStream);
                codedOutputStream.P(Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            CodedOutputStream codedOutputStream2 = mVar.a;
            double doubleValue2 = list.get(i3).doubleValue();
            Objects.requireNonNull(codedOutputStream2);
            codedOutputStream2.O(i2, Double.doubleToRawLongBits(doubleValue2));
            i3++;
        }
    }

    public static void H(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.m(list.get(i5).intValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.R(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.Q(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public static void I(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).intValue();
                Logger logger = CodedOutputStream.b;
                i4 += 4;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.N(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.M(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public static void J(int i2, List<Long> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).longValue();
                Logger logger = CodedOutputStream.b;
                i4 += 8;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.P(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.O(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public static void K(int i2, List<Float> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).floatValue();
                Logger logger = CodedOutputStream.b;
                i4 += 4;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                CodedOutputStream codedOutputStream = mVar.a;
                float floatValue = list.get(i3).floatValue();
                Objects.requireNonNull(codedOutputStream);
                codedOutputStream.N(Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            CodedOutputStream codedOutputStream2 = mVar.a;
            float floatValue2 = list.get(i3).floatValue();
            Objects.requireNonNull(codedOutputStream2);
            codedOutputStream2.M(i2, Float.floatToRawIntBits(floatValue2));
            i3++;
        }
    }

    public static void L(int i2, List<?> list, Writer writer, a1 a1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        for (int i3 = 0; i3 < list.size(); i3++) {
            mVar.c(i2, list.get(i3), a1Var);
        }
    }

    public static void M(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.m(list.get(i5).intValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.R(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.Q(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public static void N(int i2, List<Long> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.C(list.get(i5).longValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.c0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.b0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public static void O(int i2, List<?> list, Writer writer, a1 a1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        for (int i3 = 0; i3 < list.size(); i3++) {
            mVar.a.S(i2, (n0) list.get(i3), a1Var);
        }
    }

    public static void P(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).intValue();
                Logger logger = CodedOutputStream.b;
                i4 += 4;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.N(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.M(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public static void Q(int i2, List<Long> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).longValue();
                Logger logger = CodedOutputStream.b;
                i4 += 8;
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.P(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.O(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public static void R(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.t(list.get(i5).intValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.a0(CodedOutputStream.D(list.get(i3).intValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.Z(i2, CodedOutputStream.D(list.get(i3).intValue()));
            i3++;
        }
    }

    public static void S(int i2, List<Long> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.v(list.get(i5).longValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.c0(CodedOutputStream.E(list.get(i3).longValue()));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.b0(i2, CodedOutputStream.E(list.get(i3).longValue()));
            i3++;
        }
    }

    public static void T(int i2, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            while (i3 < list.size()) {
                Object d0 = c0Var.d0(i3);
                if (d0 instanceof String) {
                    mVar.a.W(i2, (String) d0);
                } else {
                    mVar.a.K(i2, (j) d0);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.W(i2, list.get(i3));
            i3++;
        }
    }

    public static void U(int i2, List<Integer> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.A(list.get(i5).intValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.a0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.Z(i2, list.get(i3).intValue());
            i3++;
        }
    }

    public static void V(int i2, List<Long> list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        int i3 = 0;
        if (z) {
            mVar.a.Y(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.C(list.get(i5).longValue());
            }
            mVar.a.a0(i4);
            while (i3 < list.size()) {
                mVar.a.c0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            mVar.a.b0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    public static int a(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.p(size) + CodedOutputStream.y(i2);
        }
        return CodedOutputStream.c(i2, true) * size;
    }

    public static int b(int i2, List<j> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = CodedOutputStream.y(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            y += CodedOutputStream.e(list.get(i3));
        }
        return y;
    }

    public static int c(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d2 = d(list);
        if (z) {
            return CodedOutputStream.p(d2) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + d2;
    }

    public static int d(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m(xVar.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int e(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.p(size * 4) + CodedOutputStream.y(i2);
        }
        return CodedOutputStream.h(i2, 0) * size;
    }

    public static int f(List<?> list) {
        return list.size() * 4;
    }

    public static int g(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.p(size * 8) + CodedOutputStream.y(i2);
        }
        return CodedOutputStream.i(i2, 0L) * size;
    }

    public static int h(List<?> list) {
        return list.size() * 8;
    }

    public static int i(int i2, List<n0> list, a1 a1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += CodedOutputStream.k(i2, list.get(i4), a1Var);
        }
        return i3;
    }

    public static int j(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k2 = k(list);
        if (z) {
            return CodedOutputStream.p(k2) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + k2;
    }

    public static int k(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m(xVar.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.m(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int l(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int m2 = m(list);
        if (z) {
            return CodedOutputStream.p(m2) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * list.size()) + m2;
    }

    public static int m(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.C(e0Var.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.C(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int n(int i2, Object obj, a1 a1Var) {
        int y;
        int p;
        if (obj instanceof a0) {
            y = CodedOutputStream.y(i2);
            p = CodedOutputStream.o((a0) obj);
        } else {
            y = CodedOutputStream.y(i2);
            p = CodedOutputStream.p(((a) ((n0) obj)).getSerializedSize(a1Var));
        }
        return p + y;
    }

    public static int o(int i2, List<?> list, a1 a1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = CodedOutputStream.y(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof a0) {
                y = CodedOutputStream.o((a0) obj) + y;
            } else {
                y += CodedOutputStream.p(((a) ((n0) obj)).getSerializedSize(a1Var));
            }
        }
        return y;
    }

    public static int p(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int q = q(list);
        if (z) {
            return CodedOutputStream.p(q) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + q;
    }

    public static int q(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.t(xVar.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.t(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int r(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = s(list);
        if (z) {
            return CodedOutputStream.p(s) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + s;
    }

    public static int s(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.v(e0Var.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.v(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int t(int i2, List<?> list) {
        int x;
        int x2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int y = CodedOutputStream.y(i2) * size;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            while (i3 < size) {
                Object d0 = c0Var.d0(i3);
                if (d0 instanceof j) {
                    x2 = CodedOutputStream.e((j) d0);
                } else {
                    x2 = CodedOutputStream.x((String) d0);
                }
                y = x2 + y;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof j) {
                    x = CodedOutputStream.e((j) obj);
                } else {
                    x = CodedOutputStream.x((String) obj);
                }
                y = x + y;
                i3++;
            }
        }
        return y;
    }

    public static int u(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v = v(list);
        if (z) {
            return CodedOutputStream.p(v) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + v;
    }

    public static int v(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.A(xVar.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.A(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int w(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x = x(list);
        if (z) {
            return CodedOutputStream.p(x) + CodedOutputStream.y(i2);
        }
        return (CodedOutputStream.y(i2) * size) + x;
    }

    public static int x(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.C(e0Var.d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += CodedOutputStream.C(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static <UT, UB> UB y(int i2, List<Integer> list, y.d<?> dVar, UB ub, g1<UT, UB> g1Var) {
        if (dVar == null) {
            return ub;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (dVar.findValueByNumber(intValue) != null) {
                if (i4 != i3) {
                    list.set(i3, Integer.valueOf(intValue));
                }
                i3++;
            } else {
                if (ub == null) {
                    ub = g1Var.m();
                }
                g1Var.e(ub, i2, intValue);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return ub;
    }

    public static <UT, UB> UB z(int i2, List<Integer> list, y.e eVar, UB ub, g1<UT, UB> g1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    if (ub == null) {
                        ub = g1Var.m();
                    }
                    g1Var.e(ub, i2, intValue);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    if (ub == null) {
                        ub = g1Var.m();
                    }
                    g1Var.e(ub, i2, intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
