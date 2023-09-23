package f.d.a;

import f.d.a.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AbstractExceptions.java */
/* loaded from: classes.dex */
public abstract class a {
    public static final Set<String> a = Collections.synchronizedSet(new HashSet());
    public static final Set<String> b = Collections.synchronizedSet(new HashSet());
    public static final Set<String> c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d  reason: collision with root package name */
    public static final Set<String> f3150d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e  reason: collision with root package name */
    public static b f3151e;

    public static int a(StringBuilder sb, String str, int i2, StackTraceElement stackTraceElement) {
        if (i2 > 0) {
            b bVar = f3151e;
            if (bVar != null) {
                sb.append(i2 == 1 ? ((a.C0066a) bVar).a(stackTraceElement) : String.format("%s%s ... %d more", "", str, Integer.valueOf(i2 - 1)));
            } else {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
        }
        return 0;
    }

    public static boolean b(String str, Set<String> set) {
        return c(str, set) != null;
    }

    public static String c(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static String d(Throwable th, boolean z, Set<String> set, Set<String> set2, Set<String> set3, int i2, boolean z2) {
        StackTraceElement[] stackTrace;
        StackTraceElement[] stackTraceElementArr;
        StringBuilder sb = new StringBuilder();
        if (th == null) {
            return "";
        }
        String name = th.getClass().getName();
        if (i2 > 0) {
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            for (int i3 = 0; i3 < stackTrace2.length && i3 < i2; i3++) {
                arrayList.add(stackTrace2[i3]);
            }
            stackTraceElementArr = (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (!e(className)) {
                    if (c(className, set) != null) {
                        arrayList2.addAll(arrayList3);
                        arrayList2.add(stackTraceElement);
                    } else {
                        if (!(c(className, set3) != null)) {
                            arrayList3.add(stackTraceElement);
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(arrayList3);
            }
            stackTraceElementArr = (StackTraceElement[]) arrayList2.toArray(new StackTraceElement[0]);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (e(localizedMessage)) {
            localizedMessage = th.getMessage();
        }
        if (z) {
            sb.append(System.lineSeparator());
            sb.append("Caused by: ");
            sb.append(name);
            if (!e(localizedMessage)) {
                sb.append(": ");
                sb.append(localizedMessage);
            }
        } else {
            sb.append(System.lineSeparator());
            sb.append(name);
            if (!e(localizedMessage)) {
                sb.append(": ");
                sb.append(localizedMessage);
            }
        }
        String str = null;
        int i4 = 0;
        StackTraceElement stackTraceElement2 = null;
        for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
            String c2 = c(stackTraceElement3.getClassName(), set2);
            if (c2 != null) {
                if (c2.equals(str)) {
                    i4++;
                } else {
                    a(sb, str, i4, stackTraceElement2);
                    sb.append(System.lineSeparator());
                    sb.append("\tat ");
                    stackTraceElement2 = stackTraceElement3;
                    str = c2;
                    i4 = 1;
                }
            } else {
                a(sb, str, i4, stackTraceElement2);
                sb.append(System.lineSeparator());
                sb.append("\tat ");
                b bVar = f3151e;
                if (bVar != null) {
                    sb.append(((a.C0066a) bVar).a(stackTraceElement3));
                    str = null;
                    i4 = 0;
                } else {
                    throw new IllegalArgumentException("Stack trace element serializer not initialized.");
                }
            }
        }
        a(sb, str, i4, stackTraceElement2);
        Throwable cause = th.getCause();
        if (cause != null && !b(name, f3150d) && !z2) {
            sb.append(d(cause, true, set, set2, set3, i2, z2));
        }
        return sb.toString();
    }

    public static boolean e(String str) {
        return str == null || str.trim().length() == 0;
    }
}
