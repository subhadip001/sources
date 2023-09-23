package k.c0.g;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import k.q;
import k.y;

/* compiled from: HttpHeaders.java */
/* loaded from: classes2.dex */
public final class e {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(y yVar) {
        String a2 = yVar.f9185k.a("Content-Length");
        if (a2 != null) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(y yVar) {
        if (yVar.f9180f.b.equals("HEAD")) {
            return false;
        }
        int i2 = yVar.f9182h;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(yVar) == -1) {
            String a2 = yVar.f9185k.a("Transfer-Encoding");
            if (a2 == null) {
                a2 = null;
            }
            if (!"chunked".equalsIgnoreCase(a2)) {
                return false;
            }
        }
        return true;
    }

    public static int c(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c7, code lost:
        if (r13 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d6, code lost:
        if (r13 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d8, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r20 <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0196, code lost:
        if ((r0.equals(r10) || (r0.endsWith(r10) && r0.charAt((r0.length() - r10.length()) - 1) == '.' && !k.c0.c.f8882g.matcher(r0).matches())) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0323 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(k.k r34, k.r r35, k.q r36) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.g.e.d(k.k, k.r, k.q):void");
    }

    public static int e(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static Set<String> f(q qVar) {
        Set<String> emptySet = Collections.emptySet();
        int d2 = qVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            if ("Vary".equalsIgnoreCase(qVar.b(i2))) {
                String e2 = qVar.e(i2);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : e2.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }
}
