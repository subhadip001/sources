package f.h.b.c.n;

import android.view.View;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class i implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f5326f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f5327g;

    public i(d dVar, s sVar) {
        this.f5327g = dVar;
        this.f5326f = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1 = this.f5327g.k().m1() + 1;
        if (m1 < this.f5327g.n.getAdapter().getItemCount()) {
            this.f5327g.m(this.f5326f.n(m1));
        }
    }
}
