package f.h.h;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes2.dex */
public final class t {
    public static final r<?> a = new s();
    public static final r<?> b;

    static {
        r<?> rVar;
        try {
            rVar = (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rVar = null;
        }
        b = rVar;
    }
}
