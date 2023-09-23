package e.p.c;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class j0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f2730f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Fragment f2731g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f2732h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e.f.a f2733i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f2734j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ n0 f2735k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Rect f2736l;

    public j0(Fragment fragment, Fragment fragment2, boolean z, e.f.a aVar, View view, n0 n0Var, Rect rect) {
        this.f2730f = fragment;
        this.f2731g = fragment2;
        this.f2732h = z;
        this.f2733i = aVar;
        this.f2734j = view;
        this.f2735k = n0Var;
        this.f2736l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        l0.c(this.f2730f, this.f2731g, this.f2732h, this.f2733i, false);
        View view = this.f2734j;
        if (view != null) {
            this.f2735k.j(view, this.f2736l);
        }
    }
}
