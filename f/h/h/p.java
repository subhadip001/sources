package f.h.h;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes2.dex */
public final class p {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
