package e.p.c;

import e.p.c.s0;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s0.d f2709f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s0.d f2710g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f2711h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e.f.a f2712i;

    public g(b bVar, s0.d dVar, s0.d dVar2, boolean z, e.f.a aVar) {
        this.f2709f = dVar;
        this.f2710g = dVar2;
        this.f2711h = z;
        this.f2712i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l0.c(this.f2709f.c, this.f2710g.c, this.f2711h, this.f2712i, false);
    }
}
