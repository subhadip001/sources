package e.g0;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager.java */
/* loaded from: classes.dex */
public abstract class p {
    public final m a(q qVar) {
        List singletonList = Collections.singletonList(qVar);
        e.g0.t.l lVar = (e.g0.t.l) this;
        if (!singletonList.isEmpty()) {
            e.g0.t.g gVar = new e.g0.t.g(lVar, singletonList);
            if (!gVar.f2219h) {
                e.g0.t.t.e eVar = new e.g0.t.t.e(gVar);
                ((e.g0.t.t.t.b) gVar.a.f2228d).a.execute(eVar);
                gVar.f2220i = eVar.f2362g;
            } else {
                k.c().f(e.g0.t.g.f2214j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", gVar.f2216e)), new Throwable[0]);
            }
            return gVar.f2220i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}
