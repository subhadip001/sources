package f.h.b.c.n;

import android.view.View;
import f.h.b.c.n.d;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class h implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f5325f;

    public h(d dVar) {
        this.f5325f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.f5325f;
        d.e eVar = d.e.DAY;
        d.e eVar2 = dVar.f5316k;
        d.e eVar3 = d.e.YEAR;
        if (eVar2 == eVar3) {
            dVar.o(eVar);
        } else if (eVar2 == eVar) {
            dVar.o(eVar3);
        }
    }
}
