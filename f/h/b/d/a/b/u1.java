package f.h.b.d.a.b;

import f.h.b.d.a.c.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: e  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5730e = new f.h.b.d.a.e.f("ExtractorTaskFinder");
    public final r1 a;
    public final c0 b;
    public final k0 c;

    /* renamed from: d  reason: collision with root package name */
    public final b f5731d;

    public u1(r1 r1Var, c0 c0Var, k0 k0Var, b bVar) {
        this.a = r1Var;
        this.b = c0Var;
        this.c = k0Var;
        this.f5731d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f.h.b.d.a.b.t1 a() {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.d.a.b.u1.a():f.h.b.d.a.b.t1");
    }

    public final boolean b(o1 o1Var, p1 p1Var) {
        c0 c0Var = this.b;
        n1 n1Var = o1Var.c;
        File q = c0Var.q(n1Var.a, o1Var.b, n1Var.b, p1Var.a);
        if (q.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(q);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    x2.f5761h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                    return true;
                }
            } catch (IOException e2) {
                x2.f5761h.b("Could not read checkpoint while checking if extraction finished. %s", e2);
            }
        }
        return false;
    }
}
