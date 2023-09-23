package i.k;

import i.l.b.i;
import i.m.c;
import java.lang.reflect.Method;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: i.k.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0223a {
        public static final Method a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (i.l.b.i.a(r7.length == 1 ? r7[0] : null, java.lang.Throwable.class) != false) goto L11;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                i.l.b.i.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Le:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = i.l.b.i.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                i.l.b.i.d(r7, r9)
                java.lang.String r9 = "<this>"
                i.l.b.i.e(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L33
                r5 = r7[r3]
            L33:
                boolean r5 = i.l.b.i.a(r5, r0)
                if (r5 == 0) goto L3a
                goto L3b
            L3a:
                r8 = 0
            L3b:
                if (r8 == 0) goto L3f
                r5 = r6
                goto L42
            L3f:
                int r4 = r4 + 1
                goto Le
            L42:
                i.k.a.C0223a.a = r5
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = i.l.b.i.a(r2, r4)
                if (r2 == 0) goto L56
                goto L59
            L56:
                int r3 = r3 + 1
                goto L45
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.k.a.C0223a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        Method method = C0223a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new i.m.b();
    }
}
