package i.l.b;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes2.dex */
public class p {
    public String a(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
