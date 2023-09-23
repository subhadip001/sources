package f.h.b.c.t;

import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import com.video_converter.video_compressor.R;
import e.b.g.i.g;
import f.n.a.v.h.d;
import f.n.a.v.h.i;

/* compiled from: NavigationView.java */
/* loaded from: classes.dex */
public class a implements g.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NavigationView f5446f;

    public a(NavigationView navigationView) {
        this.f5446f = navigationView;
    }

    @Override // e.b.g.i.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        NavigationView.a aVar = this.f5446f.f1178m;
        if (aVar != null) {
            i iVar = (i) aVar;
            iVar.a.o.c(false);
            for (d dVar : iVar.a.c()) {
                switch (menuItem.getItemId()) {
                    case R.id.action_app_store /* 2131361855 */:
                        dVar.l();
                        break;
                    case R.id.action_contribute /* 2131361865 */:
                        dVar.g();
                        break;
                    case R.id.action_mail /* 2131361874 */:
                        dVar.a();
                        break;
                    case R.id.action_privacy_policy /* 2131361881 */:
                        dVar.b();
                        break;
                    case R.id.action_rate /* 2131361882 */:
                        dVar.c();
                        break;
                    case R.id.action_setting /* 2131361884 */:
                        dVar.o();
                        break;
                    case R.id.action_share_app /* 2131361886 */:
                        dVar.j();
                        break;
                    case R.id.bg_process_enable /* 2131361970 */:
                        dVar.d();
                        break;
                    case R.id.purchase_screen /* 2131362599 */:
                        dVar.i();
                        break;
                }
            }
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.g.a
    public void b(g gVar) {
    }
}
