package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.h;
import e.s.k;
import e.s.m;

/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements k {

    /* renamed from: f  reason: collision with root package name */
    public final h f454f;

    public SingleGeneratedAdapterObserver(h hVar) {
        this.f454f = hVar;
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        this.f454f.a(mVar, event, false, null);
        this.f454f.a(mVar, event, true, null);
    }
}
