package f.n.a.v.k;

import android.content.Context;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import com.video_converter.video_compressor.R;
import e.b.g.a;
import f.n.a.v.k.h;
import java.util.Objects;

/* compiled from: Toolbar_ActionMode_Callback.java */
/* loaded from: classes2.dex */
public class l implements a.InterfaceC0026a {
    public d a;
    public h.b b;

    public l(Context context, h.b bVar, d dVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @Override // e.b.g.a.InterfaceC0026a
    public void a(e.b.g.a aVar) {
        d dVar = this.a;
        Objects.requireNonNull(dVar);
        dVar.b = new SparseBooleanArray();
        dVar.notifyDataSetChanged();
        this.b.l();
    }

    @Override // e.b.g.a.InterfaceC0026a
    public boolean b(e.b.g.a aVar, Menu menu) {
        aVar.f().inflate(R.menu.output_menu, menu);
        return true;
    }

    @Override // e.b.g.a.InterfaceC0026a
    public boolean c(e.b.g.a aVar, Menu menu) {
        menu.findItem(R.id.action_delete).setShowAsAction(2);
        menu.findItem(R.id.action_copy).setShowAsAction(2);
        menu.findItem(R.id.action_share).setShowAsAction(2);
        return true;
    }

    @Override // e.b.g.a.InterfaceC0026a
    public boolean d(e.b.g.a aVar, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete) {
            this.b.m(this.a.o());
            Log.d("TEST", "onActionItemClicked: action delete");
            return false;
        } else if (itemId != R.id.action_share) {
            return false;
        } else {
            this.b.p(this.a.o());
            return false;
        }
    }
}
