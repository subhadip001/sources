package e.g0;

import android.os.Build;
import androidx.work.ListenableWorker;
import e.g0.l;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class q {
    public UUID a;
    public e.g0.t.s.p b;
    public Set<String> c;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends q> {
        public e.g0.t.s.p b;
        public Set<String> c = new HashSet();
        public UUID a = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.b = new e.g0.t.s.p(this.a.toString(), cls.getName());
            this.c.add(cls.getName());
        }

        public final W a() {
            l lVar = new l((l.a) this);
            c cVar = this.b.f2342j;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = (i2 >= 24 && cVar.a()) || cVar.f2196d || cVar.b || (i2 >= 23 && cVar.c);
            if (this.b.q && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.a = UUID.randomUUID();
            e.g0.t.s.p pVar = new e.g0.t.s.p(this.b);
            this.b = pVar;
            pVar.a = this.a.toString();
            return lVar;
        }
    }

    public q(UUID uuid, e.g0.t.s.p pVar, Set<String> set) {
        this.a = uuid;
        this.b = pVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }
}
