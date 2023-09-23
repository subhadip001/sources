package j.a;

/* compiled from: DebugStrings.kt */
/* loaded from: classes2.dex */
public final class e0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(i.j.d<?> dVar) {
        String str;
        if (dVar instanceof j.a.y1.e) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            str = f.n.a.n.i.p(th);
        }
        Throwable a = i.e.a(str);
        String str2 = str;
        if (a != null) {
            str2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str2;
    }
}
