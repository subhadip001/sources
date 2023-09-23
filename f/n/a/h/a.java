package f.n.a.h;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BaseObservable.java */
/* loaded from: classes2.dex */
public abstract class a<LISTENER_CLASS> {

    /* renamed from: f  reason: collision with root package name */
    public final Set<LISTENER_CLASS> f6940f = Collections.newSetFromMap(new ConcurrentHashMap(1));

    public final Set<LISTENER_CLASS> b() {
        return Collections.unmodifiableSet(this.f6940f);
    }
}
