package f.h.b.d.a.b;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b3 {
    public static final f.h.b.d.a.e.f b = new f.h.b.d.a.e.f("VerifySliceTaskHandler");
    public final c0 a;

    public b3(c0 c0Var) {
        this.a = c0Var;
    }

    public final void a(a3 a3Var) {
        File s = this.a.s(a3Var.b, a3Var.c, a3Var.f5568d, a3Var.f5569e);
        if (s.exists()) {
            try {
                File r = this.a.r(a3Var.b, a3Var.c, a3Var.f5568d, a3Var.f5569e);
                if (r.exists()) {
                    try {
                        if (f.h.b.c.a.k1(z2.a(s, r)).equals(a3Var.f5570f)) {
                            b.d("Verification of slice %s of pack %s successful.", a3Var.f5569e, a3Var.b);
                            File t = this.a.t(a3Var.b, a3Var.c, a3Var.f5568d, a3Var.f5569e);
                            if (!t.exists()) {
                                t.mkdirs();
                            }
                            if (!s.renameTo(t)) {
                                throw new y0(String.format("Failed to move slice %s after verification.", a3Var.f5569e), a3Var.a);
                            }
                            return;
                        }
                        throw new y0(String.format("Verification failed for slice %s.", a3Var.f5569e), a3Var.a);
                    } catch (IOException e2) {
                        throw new y0(String.format("Could not digest file during verification for slice %s.", a3Var.f5569e), e2, a3Var.a);
                    } catch (NoSuchAlgorithmException e3) {
                        throw new y0("SHA256 algorithm not supported.", e3, a3Var.a);
                    }
                }
                throw new y0(String.format("Cannot find metadata files for slice %s.", a3Var.f5569e), a3Var.a);
            } catch (IOException e4) {
                throw new y0(String.format("Could not reconstruct slice archive during verification for slice %s.", a3Var.f5569e), e4, a3Var.a);
            }
        }
        throw new y0(String.format("Cannot find unverified files for slice %s.", a3Var.f5569e), a3Var.a);
    }
}
