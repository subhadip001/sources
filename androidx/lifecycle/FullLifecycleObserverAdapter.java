package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.g;
import e.s.k;
import e.s.m;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements k {

    /* renamed from: f  reason: collision with root package name */
    public final g f430f;

    /* renamed from: g  reason: collision with root package name */
    public final k f431g;

    public FullLifecycleObserverAdapter(g gVar, k kVar) {
        this.f430f = gVar;
        this.f431g = kVar;
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        switch (event.ordinal()) {
            case 0:
                this.f430f.b(mVar);
                break;
            case 1:
                this.f430f.onStart(mVar);
                break;
            case 2:
                this.f430f.a(mVar);
                break;
            case 3:
                this.f430f.e(mVar);
                break;
            case 4:
                this.f430f.onStop(mVar);
                break;
            case 5:
                this.f430f.onDestroy(mVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.f431g;
        if (kVar != null) {
            kVar.d(mVar, event);
        }
    }
}
