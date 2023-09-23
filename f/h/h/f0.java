package f.h.h;

import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes2.dex */
public final class f0 implements b1 {
    public static final m0 b = new a();
    public final m0 a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes2.dex */
    public static class a implements m0 {
        @Override // f.h.h.m0
        public l0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // f.h.h.m0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes2.dex */
    public static class b implements m0 {
        public m0[] a;

        public b(m0... m0VarArr) {
            this.a = m0VarArr;
        }

        @Override // f.h.h.m0
        public l0 a(Class<?> cls) {
            m0[] m0VarArr;
            for (m0 m0Var : this.a) {
                if (m0Var.b(cls)) {
                    return m0Var.a(cls);
                }
            }
            StringBuilder A = f.a.b.a.a.A("No factory is available for message type: ");
            A.append(cls.getName());
            throw new UnsupportedOperationException(A.toString());
        }

        @Override // f.h.h.m0
        public boolean b(Class<?> cls) {
            for (m0 m0Var : this.a) {
                if (m0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public f0() {
        m0 m0Var;
        m0[] m0VarArr = new m0[2];
        m0VarArr[0] = w.a;
        try {
            m0Var = (m0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            m0Var = b;
        }
        m0VarArr[1] = m0Var;
        b bVar = new b(m0VarArr);
        Charset charset = y.a;
        this.a = bVar;
    }
}
