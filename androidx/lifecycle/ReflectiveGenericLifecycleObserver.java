package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.b;
import e.s.k;
import e.s.m;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: f  reason: collision with root package name */
    public final Object f447f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f448g;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f447f = obj;
        this.f448g = b.c.b(obj.getClass());
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        b.a aVar = this.f448g;
        Object obj = this.f447f;
        b.a.a(aVar.a.get(event), mVar, event, obj);
        b.a.a(aVar.a.get(Lifecycle.Event.ON_ANY), mVar, event, obj);
    }
}
