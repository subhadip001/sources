package e.i.j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class d {
    public a a;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public d(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.a != null) {
            StringBuilder A = f.a.b.a.a.A("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            A.append(getClass().getSimpleName());
            A.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", A.toString());
        }
        this.a = aVar;
    }
}
