package e.g0.t.t;

import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.java */
/* loaded from: classes.dex */
public class f {
    public final WorkDatabase a;

    public f(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public final int a(String str) {
        this.a.c();
        try {
            Long a = ((e.g0.t.s.f) this.a.n()).a(str);
            int i2 = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            ((e.g0.t.s.f) this.a.n()).b(new e.g0.t.s.d(str, i2));
            this.a.l();
            return intValue;
        } finally {
            this.a.g();
        }
    }

    public int b(int i2, int i3) {
        synchronized (f.class) {
            int a = a("next_job_scheduler_id");
            if (a >= i2 && a <= i3) {
                i2 = a;
            }
            ((e.g0.t.s.f) this.a.n()).b(new e.g0.t.s.d("next_job_scheduler_id", i2 + 1));
        }
        return i2;
    }
}
