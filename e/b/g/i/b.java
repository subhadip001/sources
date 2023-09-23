package e.b.g.i;

import android.content.Context;
import android.view.LayoutInflater;
import e.b.g.i.m;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: f  reason: collision with root package name */
    public Context f1615f;

    /* renamed from: g  reason: collision with root package name */
    public Context f1616g;

    /* renamed from: h  reason: collision with root package name */
    public g f1617h;

    /* renamed from: i  reason: collision with root package name */
    public LayoutInflater f1618i;

    /* renamed from: j  reason: collision with root package name */
    public m.a f1619j;

    /* renamed from: k  reason: collision with root package name */
    public int f1620k;

    /* renamed from: l  reason: collision with root package name */
    public int f1621l;

    /* renamed from: m  reason: collision with root package name */
    public n f1622m;
    public int n;

    public b(Context context, int i2, int i3) {
        this.f1615f = context;
        this.f1618i = LayoutInflater.from(context);
        this.f1620k = i2;
        this.f1621l = i3;
    }

    @Override // e.b.g.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public void g(m.a aVar) {
        this.f1619j = aVar;
    }

    @Override // e.b.g.i.m
    public int getId() {
        return this.n;
    }
}
