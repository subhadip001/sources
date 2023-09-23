package f.h.b.d.a.b;

import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class e2 {
    public static final f.h.b.d.a.e.f b = new f.h.b.d.a.e.f("MergeSliceTaskHandler");
    public final c0 a;

    public e2(c0 c0Var) {
        this.a = c0Var;
    }

    public static void b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (file.delete()) {
                return;
            }
            String valueOf = String.valueOf(file);
            valueOf.length();
            throw new y0("Unable to delete directory: ".concat(valueOf));
        } else if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf2 = String.valueOf(file);
            valueOf2.length();
            throw new y0("Unable to move file: ".concat(valueOf2));
        } else {
            throw new y0("File clashing with existing file from other slice: ".concat(file2.toString()));
        }
    }

    public final void a(d2 d2Var) {
        File t = this.a.t(d2Var.b, d2Var.c, d2Var.f5592d, d2Var.f5593e);
        if (t.exists()) {
            File p = this.a.p(d2Var.b, d2Var.c, d2Var.f5592d);
            if (!p.exists()) {
                p.mkdirs();
            }
            b(t, p);
            try {
                this.a.a(d2Var.b, d2Var.c, d2Var.f5592d, this.a.k(d2Var.b, d2Var.c, d2Var.f5592d) + 1);
                return;
            } catch (IOException e2) {
                b.b("Writing merge checkpoint failed with %s.", e2.getMessage());
                throw new y0("Writing merge checkpoint failed.", e2, d2Var.a);
            }
        }
        throw new y0(String.format("Cannot find verified files for slice %s.", d2Var.f5593e), d2Var.a);
    }
}
