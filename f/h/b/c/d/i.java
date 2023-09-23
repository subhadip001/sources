package f.h.b.c.d;

import android.view.View;
import e.i.j.z;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes.dex */
public class i {
    public final View a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5241d;

    /* renamed from: e  reason: collision with root package name */
    public int f5242e;

    public i(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        z.p(view, this.f5241d - (view.getTop() - this.b));
        View view2 = this.a;
        z.o(view2, this.f5242e - (view2.getLeft() - this.c));
    }
}
