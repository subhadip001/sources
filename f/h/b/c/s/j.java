package f.h.b.c.s;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: NavigationMenu.java */
/* loaded from: classes.dex */
public class j extends e.b.g.i.g {
    public j(Context context) {
        super(context);
    }

    @Override // e.b.g.i.g, android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        e.b.g.i.i iVar = (e.b.g.i.i) a(i2, i3, i4, charSequence);
        l lVar = new l(this.a, this, iVar);
        iVar.o = lVar;
        lVar.setHeaderTitle(iVar.f1665e);
        return lVar;
    }
}
