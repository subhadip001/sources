package k.c0.f;

import java.util.LinkedHashSet;
import java.util.Set;
import k.b0;

/* compiled from: RouteDatabase.java */
/* loaded from: classes2.dex */
public final class d {
    public final Set<b0> a = new LinkedHashSet();

    public synchronized void a(b0 b0Var) {
        this.a.remove(b0Var);
    }
}
