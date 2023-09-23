package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.h;
import e.s.k;
import e.s.m;
import e.s.r;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements k {

    /* renamed from: f  reason: collision with root package name */
    public final h[] f429f;

    public CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.f429f = hVarArr;
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        r rVar = new r();
        for (h hVar : this.f429f) {
            hVar.a(mVar, event, false, rVar);
        }
        for (h hVar2 : this.f429f) {
            hVar2.a(mVar, event, true, rVar);
        }
    }
}
