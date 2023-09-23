package f.n.a.e;

import android.view.View;
import android.widget.CheckBox;
import e.b.c.h;
import f.n.a.e.a;

/* compiled from: BgProcessEnableHandler.java */
/* loaded from: classes2.dex */
public class d implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.c f6937f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ CheckBox f6938g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f6939h;

    public d(a aVar, a.c cVar, CheckBox checkBox) {
        this.f6939h = aVar;
        this.f6937f = cVar;
        this.f6938g = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h hVar = this.f6939h.b;
        if (hVar != null) {
            hVar.dismiss();
        }
        a.c cVar = this.f6937f;
        if (cVar != null) {
            cVar.a(true);
            this.f6937f.b();
        }
        f.l.b.c.j(this.f6939h.a, Boolean.class, "bg_dialog_enable", Boolean.valueOf(true ^ this.f6938g.isChecked()));
        a aVar = this.f6939h;
        aVar.b(aVar.a, null, this.f6937f);
    }
}
