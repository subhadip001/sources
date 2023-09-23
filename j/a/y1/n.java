package j.a.y1;

import j.a.j1;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class n {
    public static final n a;
    public static final boolean b;
    public static final j1 c;

    static {
        Object obj;
        j1 createDispatcher;
        n nVar = new n();
        a = nVar;
        b = f.n.a.n.i.a0("kotlinx.coroutines.fast.service.loader", true);
        Objects.requireNonNull(nVar);
        List<? extends m> f0 = f.n.a.n.i.f0(f.n.a.n.i.f(defpackage.a.b()));
        Iterator it = f0.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((m) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((m) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        m mVar = (m) obj;
        if (mVar != null && (createDispatcher = mVar.createDispatcher(f0)) != null) {
            c = createDispatcher;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
