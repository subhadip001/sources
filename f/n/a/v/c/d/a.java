package f.n.a.v.c.d;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BaseObservableView.java */
/* loaded from: classes2.dex */
public abstract class a<ListenerType> extends b {

    /* renamed from: g  reason: collision with root package name */
    public Set<ListenerType> f7130g = new HashSet();

    public final Set<ListenerType> c() {
        return Collections.unmodifiableSet(this.f7130g);
    }
}
