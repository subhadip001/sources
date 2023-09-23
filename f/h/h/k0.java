package f.h.h;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes2.dex */
public final class k0 {
    public static final i0 a;
    public static final i0 b;

    static {
        i0 i0Var;
        try {
            i0Var = (i0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            i0Var = null;
        }
        a = i0Var;
        b = new j0();
    }
}
