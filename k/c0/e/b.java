package k.c0.e;

import k.s;
import k.y;

/* compiled from: CacheInterceptor.java */
/* loaded from: classes2.dex */
public final class b implements s {
    public final g a;

    public b(g gVar) {
        this.a = gVar;
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static y d(y yVar) {
        if (yVar == null || yVar.f9186l == null) {
            return yVar;
        }
        y.a aVar = new y.a(yVar);
        aVar.f9191g = null;
        return aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0221, code lost:
        if (r3 > 0) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v37, types: [k.v, k.y] */
    /* JADX WARN: Type inference failed for: r3v44 */
    @Override // k.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k.y a(k.s.a r26) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.e.b.a(k.s$a):k.y");
    }
}
