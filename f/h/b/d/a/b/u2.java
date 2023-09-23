package f.h.b.d.a.b;

import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class u2 {
    public final c0 a;
    public final f.h.b.d.a.e.u b;
    public final r1 c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5732d;

    /* renamed from: e  reason: collision with root package name */
    public final c1 f5733e;

    public u2(c0 c0Var, f.h.b.d.a.e.u uVar, r1 r1Var, f.h.b.d.a.e.u uVar2, c1 c1Var) {
        this.a = c0Var;
        this.b = uVar;
        this.c = r1Var;
        this.f5732d = uVar2;
        this.f5733e = c1Var;
    }

    public final void a(final s2 s2Var) {
        File n = this.a.n(s2Var.b, s2Var.c, s2Var.f5716e);
        if (n.exists()) {
            File n2 = this.a.n(s2Var.b, s2Var.f5715d, s2Var.f5716e);
            n2.mkdirs();
            if (n.renameTo(n2)) {
                ((Executor) this.f5732d.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2 u2Var = u2.this;
                        s2 s2Var2 = s2Var;
                        u2Var.a.b(s2Var2.b, s2Var2.f5715d, s2Var2.f5716e);
                    }
                });
                r1 r1Var = this.c;
                r1Var.b(new j1(r1Var, s2Var.b, s2Var.f5715d, s2Var.f5716e));
                this.f5733e.a(s2Var.b);
                ((u3) this.b.zza()).a(s2Var.a, s2Var.b);
                return;
            }
            throw new y0(String.format("Cannot promote pack %s from %s to %s", s2Var.b, n.getAbsolutePath(), n2.getAbsolutePath()), s2Var.a);
        }
        throw new y0(String.format("Cannot find pack files to promote for pack %s at %s", s2Var.b, n.getAbsolutePath()), s2Var.a);
    }
}
