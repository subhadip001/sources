package e.b.g.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final e.i.e.a.a f1689d;

    public o(Context context, e.i.e.a.a aVar) {
        super(context);
        if (aVar != null) {
            this.f1689d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f1689d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1689d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = c(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f1689d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e.f.h<e.i.e.a.b, MenuItem> hVar = this.b;
        if (hVar != null) {
            hVar.clear();
        }
        e.f.h<e.i.e.a.c, SubMenu> hVar2 = this.c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f1689d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1689d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return c(this.f1689d.findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return c(this.f1689d.getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1689d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f1689d.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return this.f1689d.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f1689d.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (true) {
                e.f.h<e.i.e.a.b, MenuItem> hVar = this.b;
                if (i3 >= hVar.f2001h) {
                    break;
                }
                if (hVar.h(i3).getGroupId() == i2) {
                    this.b.j(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f1689d.removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (true) {
                e.f.h<e.i.e.a.b, MenuItem> hVar = this.b;
                if (i3 >= hVar.f2001h) {
                    break;
                } else if (hVar.h(i3).getItemId() == i2) {
                    this.b.j(i3);
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f1689d.removeItem(i2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f1689d.setGroupCheckable(i2, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        this.f1689d.setGroupEnabled(i2, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        this.f1689d.setGroupVisible(i2, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1689d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1689d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return c(this.f1689d.add(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return d(this.f1689d.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return c(this.f1689d.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return d(this.f1689d.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return c(this.f1689d.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return d(this.f1689d.addSubMenu(i2, i3, i4, i5));
    }
}
