package f.d.a.c;

import f.d.a.b;

/* compiled from: Exceptions.java */
/* loaded from: classes.dex */
public class a {
    public static final /* synthetic */ int a = 0;

    /* compiled from: Exceptions.java */
    /* renamed from: f.d.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0066a implements b {
        public String a(StackTraceElement stackTraceElement) {
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                sb.append("(Native Method)");
            } else if (stackTraceElement.getFileName() != null && stackTraceElement.getFileName().length() > 0) {
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                if (stackTraceElement.getLineNumber() >= 0) {
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                }
                sb.append(")");
            } else {
                sb.append("(Unknown Source)");
            }
            return sb.toString();
        }
    }

    static {
        f.d.a.a.f3151e = new C0066a();
    }

    public static String a(Throwable th) {
        return f.d.a.a.d(th, false, f.d.a.a.a, f.d.a.a.b, f.d.a.a.c, 0, false);
    }
}
