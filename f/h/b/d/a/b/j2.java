package f.h.b.d.a.b;

import f.h.b.d.a.c.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class j2 {
    public final c0 a;
    public final f.h.b.d.a.e.u b;
    public final r1 c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5650d;

    /* renamed from: e  reason: collision with root package name */
    public final c1 f5651e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5652f;

    /* renamed from: g  reason: collision with root package name */
    public final l2 f5653g;

    public j2(c0 c0Var, f.h.b.d.a.e.u uVar, r1 r1Var, f.h.b.d.a.e.u uVar2, c1 c1Var, b bVar, l2 l2Var) {
        this.a = c0Var;
        this.b = uVar;
        this.c = r1Var;
        this.f5650d = uVar2;
        this.f5651e = c1Var;
        this.f5652f = bVar;
        this.f5653g = l2Var;
    }

    public final void a(final g2 g2Var) {
        File p = this.a.p(g2Var.b, g2Var.c, g2Var.f5613d);
        c0 c0Var = this.a;
        String str = g2Var.b;
        int i2 = g2Var.c;
        long j2 = g2Var.f5613d;
        Objects.requireNonNull(c0Var);
        File file = new File(new File(c0Var.f(str, i2, j2), "_slices"), "_metadata");
        if (p.exists() && file.exists()) {
            File n = this.a.n(g2Var.b, g2Var.c, g2Var.f5613d);
            n.mkdirs();
            if (p.renameTo(n)) {
                new File(this.a.n(g2Var.b, g2Var.c, g2Var.f5613d), "merge.tmp").delete();
                File o = this.a.o(g2Var.b, g2Var.c, g2Var.f5613d);
                o.mkdirs();
                if (file.renameTo(o)) {
                    if (this.f5652f.a()) {
                        try {
                            this.f5653g.b(g2Var.b, g2Var.c, g2Var.f5613d, g2Var.f5614e);
                            ((Executor) this.f5650d.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.i2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    j2 j2Var = j2.this;
                                    g2 g2Var2 = g2Var;
                                    j2Var.a.b(g2Var2.b, g2Var2.c, g2Var2.f5613d);
                                }
                            });
                        } catch (IOException e2) {
                            throw new y0(String.format("Could not write asset pack version tag for pack %s: %s", g2Var.b, e2.getMessage()), g2Var.a);
                        }
                    } else {
                        final c0 c0Var2 = this.a;
                        c0Var2.getClass();
                        ((Executor) this.f5650d.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.h2
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0 c0Var3;
                                Iterator it = ((ArrayList) c0.this.h()).iterator();
                                while (it.hasNext()) {
                                    File file2 = (File) it.next();
                                    if (file2.listFiles() != null) {
                                        c0.i(file2);
                                        long d2 = c0.d(file2, false);
                                        if (c0Var3.b.a() != d2) {
                                            try {
                                                new File(new File(file2, String.valueOf(d2)), "stale.tmp").createNewFile();
                                            } catch (IOException unused) {
                                                c0.c.b("Could not write staleness marker.", new Object[0]);
                                            }
                                        }
                                        for (File file3 : file2.listFiles()) {
                                            c0.i(file3);
                                        }
                                    }
                                }
                            }
                        });
                    }
                    r1 r1Var = this.c;
                    r1Var.b(new j1(r1Var, g2Var.b, g2Var.c, g2Var.f5613d));
                    this.f5651e.a(g2Var.b);
                    ((u3) this.b.zza()).a(g2Var.a, g2Var.b);
                    return;
                }
                throw new y0("Cannot move metadata files to final location.", g2Var.a);
            }
            throw new y0("Cannot move merged pack files to final location.", g2Var.a);
        }
        throw new y0(String.format("Cannot find pack files to move for pack %s.", g2Var.b), g2Var.a);
    }
}
