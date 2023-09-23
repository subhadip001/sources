package e.p.c;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import e.p.c.l0;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class k0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n0 f2740f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.f.a f2741g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f2742h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l0.b f2743i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2744j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f2745k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Fragment f2746l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Fragment f2747m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Rect q;

    public k0(n0 n0Var, e.f.a aVar, Object obj, l0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f2740f = n0Var;
        this.f2741g = aVar;
        this.f2742h = obj;
        this.f2743i = bVar;
        this.f2744j = arrayList;
        this.f2745k = view;
        this.f2746l = fragment;
        this.f2747m = fragment2;
        this.n = z;
        this.o = arrayList2;
        this.p = obj2;
        this.q = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        e.f.a<String, View> e2 = l0.e(this.f2740f, this.f2741g, this.f2742h, this.f2743i);
        if (e2 != null) {
            this.f2744j.addAll(e2.values());
            this.f2744j.add(this.f2745k);
        }
        l0.c(this.f2746l, this.f2747m, this.n, e2, false);
        Object obj = this.f2742h;
        if (obj != null) {
            this.f2740f.x(obj, this.o, this.f2744j);
            View l2 = l0.l(e2, this.f2743i, this.p, this.n);
            if (l2 != null) {
                this.f2740f.j(l2, this.q);
            }
        }
    }
}
