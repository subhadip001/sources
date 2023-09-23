package f.h.b.d.a.b;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class q2 {
    public static final f.h.b.d.a.e.f c = new f.h.b.d.a.e.f("PatchSliceTaskHandler");
    public final c0 a;
    public final f.h.b.d.a.e.u b;

    public q2(c0 c0Var, f.h.b.d.a.e.u uVar) {
        this.a = c0Var;
        this.b = uVar;
    }

    public final void a(p2 p2Var) {
        File n = this.a.n(p2Var.b, p2Var.c, p2Var.f5678d);
        File file = new File(this.a.o(p2Var.b, p2Var.c, p2Var.f5678d), p2Var.f5682h);
        try {
            InputStream inputStream = p2Var.f5684j;
            if (p2Var.f5681g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            f0 f0Var = new f0(n, file);
            File s = this.a.s(p2Var.b, p2Var.f5679e, p2Var.f5680f, p2Var.f5682h);
            if (!s.exists()) {
                s.mkdirs();
            }
            x2 x2Var = new x2(this.a, p2Var.b, p2Var.f5679e, p2Var.f5680f, p2Var.f5682h);
            f.h.b.c.a.g1(f0Var, inputStream, new b1(s, x2Var), p2Var.f5683i);
            x2Var.h(0);
            inputStream.close();
            c.d("Patching and extraction finished for slice %s of pack %s.", p2Var.f5682h, p2Var.b);
            ((u3) this.b.zza()).c(p2Var.a, p2Var.b, p2Var.f5682h, 0);
            try {
                p2Var.f5684j.close();
            } catch (IOException unused) {
                c.e("Could not close file for slice %s of pack %s.", p2Var.f5682h, p2Var.b);
            }
        } catch (IOException e2) {
            c.b("IOException during patching %s.", e2.getMessage());
            throw new y0(String.format("Error patching slice %s of pack %s.", p2Var.f5682h, p2Var.b), e2, p2Var.a);
        }
    }
}
