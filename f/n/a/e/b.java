package f.n.a.e;

import android.view.View;
import android.widget.CheckBox;
import e.b.c.h;
import f.n.a.e.a;

/* compiled from: BgProcessEnableHandler.java */
/* loaded from: classes2.dex */
public class b implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.c f6934f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ CheckBox f6935g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f6936h;

    public b(a aVar, a.c cVar, CheckBox checkBox) {
        this.f6936h = aVar;
        this.f6934f = cVar;
        this.f6935g = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h hVar = this.f6936h.b;
        if (hVar != null) {
            hVar.dismiss();
        }
        a.c cVar = this.f6934f;
        if (cVar != null) {
            cVar.b();
        }
        f.l.b.c.j(this.f6936h.a, Boolean.class, "bg_dialog_enable", Boolean.valueOf(!this.f6935g.isChecked()));
    }
}
