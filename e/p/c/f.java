package e.p.c;

import android.view.View;
import android.view.ViewGroup;
import e.i.f.b;
import e.p.c.b;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class f implements b.a {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ b.C0053b c;

    public f(b bVar, View view, ViewGroup viewGroup, b.C0053b c0053b) {
        this.a = view;
        this.b = viewGroup;
        this.c = c0053b;
    }

    @Override // e.i.f.b.a
    public void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.a();
    }
}
