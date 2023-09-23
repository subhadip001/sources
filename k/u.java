package k;

import java.util.ArrayList;

/* compiled from: RealCall.java */
/* loaded from: classes2.dex */
public final class u implements e {

    /* renamed from: f  reason: collision with root package name */
    public final t f9169f;

    /* renamed from: g  reason: collision with root package name */
    public final k.c0.g.h f9170g;

    /* renamed from: h  reason: collision with root package name */
    public n f9171h;

    /* renamed from: i  reason: collision with root package name */
    public final v f9172i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9173j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9174k;

    /* compiled from: RealCall.java */
    /* loaded from: classes2.dex */
    public final class a extends k.c0.b {
        @Override // k.c0.b
        public void a() {
            throw null;
        }
    }

    public u(t tVar, v vVar, boolean z) {
        this.f9169f = tVar;
        this.f9172i = vVar;
        this.f9173j = z;
        this.f9170g = new k.c0.g.h(tVar, z);
    }

    public y a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9169f.f9154i);
        arrayList.add(this.f9170g);
        arrayList.add(new k.c0.g.a(this.f9169f.f9158m));
        c cVar = this.f9169f.n;
        arrayList.add(new k.c0.e.b(cVar != null ? cVar.f8854f : null));
        arrayList.add(new k.c0.f.a(this.f9169f));
        if (!this.f9173j) {
            arrayList.addAll(this.f9169f.f9155j);
        }
        arrayList.add(new k.c0.g.b(this.f9173j));
        v vVar = this.f9172i;
        n nVar = this.f9171h;
        t tVar = this.f9169f;
        return new k.c0.g.f(arrayList, null, null, null, 0, vVar, this, nVar, tVar.A, tVar.B, tVar.C).a(vVar);
    }

    public Object clone() {
        t tVar = this.f9169f;
        u uVar = new u(tVar, this.f9172i, this.f9173j);
        uVar.f9171h = ((o) tVar.f9156k).a;
        return uVar;
    }
}
