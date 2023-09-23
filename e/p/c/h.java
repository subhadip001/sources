package e.p.c;

import android.graphics.Rect;
import android.view.View;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n0 f2714f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f2715g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Rect f2716h;

    public h(b bVar, n0 n0Var, View view, Rect rect) {
        this.f2714f = n0Var;
        this.f2715g = view;
        this.f2716h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2714f.j(this.f2715g, this.f2716h);
    }
}
