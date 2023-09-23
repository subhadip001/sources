package f.h.b.b;

import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import f.h.b.b.q1;

/* compiled from: DefaultControlDispatcher.java */
/* loaded from: classes.dex */
public class j0 implements i0 {
    public final q1.c a;
    public long b;
    public long c;

    public j0() {
        this.c = 15000L;
        this.b = FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS;
        this.a = new q1.c();
    }

    public static void g(f1 f1Var, long j2) {
        long J = f1Var.J() + j2;
        long duration = f1Var.getDuration();
        if (duration != -9223372036854775807L) {
            J = Math.min(J, duration);
        }
        f1Var.g(f1Var.p(), Math.max(J, 0L));
    }

    public boolean a(f1 f1Var) {
        if (e() && f1Var.l()) {
            g(f1Var, this.c);
            return true;
        }
        return true;
    }

    public boolean b(f1 f1Var) {
        q1 D = f1Var.D();
        if (D.q() || f1Var.e()) {
            return true;
        }
        int p = f1Var.p();
        D.n(p, this.a);
        int z = f1Var.z();
        if (z != -1) {
            f1Var.g(z, -9223372036854775807L);
            return true;
        } else if (this.a.c() && this.a.f4473i) {
            f1Var.g(p, -9223372036854775807L);
            return true;
        } else {
            return true;
        }
    }

    public boolean c(f1 f1Var) {
        q1 D = f1Var.D();
        if (!D.q() && !f1Var.e()) {
            int p = f1Var.p();
            D.n(p, this.a);
            int u = f1Var.u();
            boolean z = this.a.c() && !this.a.f4472h;
            if (u != -1 && (f1Var.J() <= 3000 || z)) {
                f1Var.g(u, -9223372036854775807L);
            } else if (!z) {
                f1Var.g(p, 0L);
            }
        }
        return true;
    }

    public boolean d(f1 f1Var) {
        if (f() && f1Var.l()) {
            g(f1Var, -this.b);
            return true;
        }
        return true;
    }

    public boolean e() {
        return this.c > 0;
    }

    public boolean f() {
        return this.b > 0;
    }

    public j0(long j2, long j3) {
        this.c = j2;
        this.b = j3;
        this.a = new q1.c();
    }
}
