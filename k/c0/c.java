package k.c0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.a0;
import k.r;
import k.z;
import l.f;
import l.i;
import l.y;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class c {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final a0 c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f8879d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f8880e;

    /* renamed from: f  reason: collision with root package name */
    public static final Comparator<String> f8881f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f8882g;

    /* compiled from: Util.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        f fVar = new f();
        fVar.d0(bArr);
        c = new z(bArr.length, fVar);
        c(bArr.length, 0, bArr.length);
        i.f("efbbbf");
        i.f("feff");
        i.f("fffe");
        i.f("0000ffff");
        i.f("ffff0000");
        f8879d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        f8880e = TimeZone.getTimeZone("GMT");
        f8881f = new a();
        f8882g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.c.b(java.lang.String):java.lang.String");
    }

    public static void c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!r(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
        if (r7 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00da, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f5, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress g(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.c.g(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int h(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int i(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean j(y yVar, int i2, TimeUnit timeUnit) {
        try {
            return t(yVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String m(r rVar, boolean z) {
        String str;
        if (rVar.f9134d.contains(":")) {
            str = f.a.b.a.a.u(f.a.b.a.a.A("["), rVar.f9134d, "]");
        } else {
            str = rVar.f9134d;
        }
        if (z || rVar.f9135e != r.c(rVar.a)) {
            StringBuilder D = f.a.b.a.a.D(str, ":");
            D.append(rVar.f9135e);
            return D.toString();
        }
        return str;
    }

    public static <T> List<T> n(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> o(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int p(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] q(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean r(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean s(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean t(y yVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = yVar.d().e() ? yVar.d().c() - nanoTime : Long.MAX_VALUE;
        yVar.d().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            f fVar = new f();
            while (yVar.a0(fVar, 8192L) != -1) {
                fVar.a();
            }
            if (c2 == Long.MAX_VALUE) {
                yVar.d().a();
            } else {
                yVar.d().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                yVar.d().a();
            } else {
                yVar.d().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                yVar.d().a();
            } else {
                yVar.d().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int u(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int v(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String w(String str, int i2, int i3) {
        int u = u(str, i2, i3);
        return str.substring(u, v(str, u, i3));
    }
}
