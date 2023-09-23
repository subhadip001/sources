package f.h.b.b;

import java.util.Collection;
import java.util.HashMap;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
public final class h1 extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public final int f4313e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4314f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4315g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f4316h;

    /* renamed from: i  reason: collision with root package name */
    public final q1[] f4317i;

    /* renamed from: j  reason: collision with root package name */
    public final Object[] f4318j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<Object, Integer> f4319k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Collection<? extends z0> collection, f.h.b.b.b2.i0 i0Var) {
        super(false, i0Var);
        int i2 = 0;
        int size = collection.size();
        this.f4315g = new int[size];
        this.f4316h = new int[size];
        this.f4317i = new q1[size];
        this.f4318j = new Object[size];
        this.f4319k = new HashMap<>();
        int i3 = 0;
        int i4 = 0;
        for (z0 z0Var : collection) {
            this.f4317i[i4] = z0Var.a();
            this.f4316h[i4] = i2;
            this.f4315g[i4] = i3;
            i2 += this.f4317i[i4].p();
            i3 += this.f4317i[i4].i();
            this.f4318j[i4] = z0Var.getUid();
            this.f4319k.put(this.f4318j[i4], Integer.valueOf(i4));
            i4++;
        }
        this.f4313e = i2;
        this.f4314f = i3;
    }

    @Override // f.h.b.b.q1
    public int i() {
        return this.f4314f;
    }

    @Override // f.h.b.b.q1
    public int p() {
        return this.f4313e;
    }
}
