package f.e.a.m;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public class s {
    public final Set<f.e.a.p.d> a = Collections.newSetFromMap(new WeakHashMap());
    public final Set<f.e.a.p.d> b = new HashSet();
    public boolean c;

    public boolean a(f.e.a.p.d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.a.remove(dVar);
        if (!this.b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
