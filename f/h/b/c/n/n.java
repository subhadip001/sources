package f.h.b.c.n;

import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public class n implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f5340f;

    public n(l lVar) {
        this.f5340f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l lVar = this.f5340f;
        lVar.z.setEnabled(lVar.i().O());
        this.f5340f.x.toggle();
        l lVar2 = this.f5340f;
        lVar2.r(lVar2.x);
        this.f5340f.o();
    }
}
