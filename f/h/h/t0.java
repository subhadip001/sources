package f.h.h;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes2.dex */
public final class t0 {
    public static final r0 a;
    public static final r0 b;

    static {
        r0 r0Var;
        try {
            r0Var = (r0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0Var = null;
        }
        a = r0Var;
        b = new s0();
    }
}
