package f.n.a.v.a;

import android.view.MenuItem;
import e.b.h.o0;

/* compiled from: Utilities.java */
/* loaded from: classes2.dex */
public class k implements o0.a {
    public final /* synthetic */ o0.a a;

    public k(o0.a aVar) {
        this.a = aVar;
    }

    @Override // e.b.h.o0.a
    public boolean onMenuItemClick(MenuItem menuItem) {
        o0.a aVar = this.a;
        if (aVar != null) {
            aVar.onMenuItemClick(menuItem);
            return false;
        }
        return false;
    }
}
