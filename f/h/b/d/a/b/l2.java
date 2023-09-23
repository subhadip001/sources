package f.h.b.d.a.b;

import f.h.b.d.a.c.b;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: d  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5660d = new f.h.b.d.a.e.f("PackMetadataManager");
    public final c0 a;
    public final n2 b;
    public final b c;

    public l2(c0 c0Var, n2 n2Var, b bVar) {
        this.a = c0Var;
        this.b = n2Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            f.h.b.d.a.c.b r0 = r7.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L6c
            f.h.b.d.a.b.c0 r0 = r7.a
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            r2 = 1
            java.lang.String r0 = r0.u(r8)     // Catch: java.io.IOException -> L17
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L6c
        L1b:
            f.h.b.d.a.b.n2 r0 = r7.b
            int r0 = r0.a()
            f.h.b.d.a.b.c0 r3 = r7.a
            long r4 = r3.l(r8)
            java.io.File r6 = new java.io.File
            java.io.File r3 = r3.o(r8, r0, r4)
            java.lang.String r4 = "properties.dat"
            r6.<init>(r3, r4)
            boolean r3 = r6.exists()     // Catch: java.io.IOException -> L61
            if (r3 != 0) goto L3d
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L61
            goto L5b
        L3d:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L61
            r3.<init>(r6)     // Catch: java.io.IOException -> L61
            java.util.Properties r4 = new java.util.Properties     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            r4.load(r3)     // Catch: java.lang.Throwable -> L5c
            r3.close()     // Catch: java.io.IOException -> L61
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r3 = r4.getProperty(r3)     // Catch: java.io.IOException -> L61
            if (r3 != 0) goto L5a
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L61
            goto L5b
        L5a:
            r8 = r3
        L5b:
            return r8
        L5c:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L60
        L60:
            throw r0     // Catch: java.io.IOException -> L61
        L61:
            f.h.b.d.a.e.f r0 = f.h.b.d.a.b.l2.f5660d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            java.lang.String r8 = "Failed to read pack version tag for pack %s"
            r0.b(r8, r2)
        L6c:
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.d.a.b.l2.a(java.lang.String):java.lang.String");
    }

    public final void b(String str, int i2, long j2, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i2);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        c0 c0Var = this.a;
        Objects.requireNonNull(c0Var);
        File file = new File(c0Var.o(str, i2, j2), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
