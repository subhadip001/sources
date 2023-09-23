package f.h.b.c.n;

import android.view.View;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class j implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f5328f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f5329g;

    public j(d dVar, s sVar) {
        this.f5329g = dVar;
        this.f5328f = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int o1 = this.f5329g.k().o1() - 1;
        if (o1 >= 0) {
            this.f5329g.m(this.f5328f.n(o1));
        }
    }
}
