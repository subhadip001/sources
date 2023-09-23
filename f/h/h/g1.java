package f.h.h;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Writer;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes2.dex */
public abstract class g1<T, B> {
    public abstract void a(B b, int i2, int i3);

    public abstract void b(B b, int i2, long j2);

    public abstract void c(B b, int i2, T t);

    public abstract void d(B b, int i2, j jVar);

    public abstract void e(B b, int i2, long j2);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract T k(T t, T t2);

    public final boolean l(B b, z0 z0Var) {
        int a = z0Var.a();
        int i2 = a >>> 3;
        int i3 = a & 7;
        if (i3 == 0) {
            e(b, i2, z0Var.N());
            return true;
        } else if (i3 == 1) {
            b(b, i2, z0Var.d());
            return true;
        } else if (i3 == 2) {
            d(b, i2, z0Var.G());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    a(b, i2, z0Var.j());
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
            return false;
        } else {
            B m2 = m();
            int i4 = 4 | (i2 << 3);
            while (z0Var.B() != Integer.MAX_VALUE && l(m2, z0Var)) {
            }
            if (i4 == z0Var.a()) {
                c(b, i2, q(m2));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    public abstract B m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract boolean p(z0 z0Var);

    public abstract T q(B b);

    public abstract void r(T t, Writer writer);

    public abstract void s(T t, Writer writer);
}
