package e.b.g.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {
    public final Context a;
    public e.f.h<e.i.e.a.b, MenuItem> b;
    public e.f.h<e.i.e.a.c, SubMenu> c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof e.i.e.a.b) {
            e.i.e.a.b bVar = (e.i.e.a.b) menuItem;
            if (this.b == null) {
                this.b = new e.f.h<>();
            }
            MenuItem orDefault = this.b.getOrDefault(menuItem, null);
            if (orDefault == null) {
                j jVar = new j(this.a, bVar);
                this.b.put(bVar, jVar);
                return jVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof e.i.e.a.c) {
            e.i.e.a.c cVar = (e.i.e.a.c) subMenu;
            if (this.c == null) {
                this.c = new e.f.h<>();
            }
            SubMenu subMenu2 = this.c.get(cVar);
            if (subMenu2 == null) {
                s sVar = new s(this.a, cVar);
                this.c.put(cVar, sVar);
                return sVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
