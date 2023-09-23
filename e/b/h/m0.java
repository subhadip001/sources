package e.b.h;

import android.view.MenuItem;
import e.b.g.i.g;
import e.b.h.o0;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public class m0 implements g.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f1811f;

    public m0(o0 o0Var) {
        this.f1811f = o0Var;
    }

    @Override // e.b.g.i.g.a
    public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
        o0.a aVar = this.f1811f.f1819e;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    @Override // e.b.g.i.g.a
    public void b(e.b.g.i.g gVar) {
    }
}
