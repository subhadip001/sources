package f.h.b.c.n;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import f.h.b.c.n.d;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public class y implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5354f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z f5355g;

    public y(z zVar, int i2) {
        this.f5355g = zVar;
        this.f5354f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Month f2 = Month.f(this.f5354f, this.f5355g.a.f5315j.f1156g);
        CalendarConstraints calendarConstraints = this.f5355g.a.f5314i;
        if (f2.compareTo(calendarConstraints.f1143f) < 0) {
            f2 = calendarConstraints.f1143f;
        } else if (f2.compareTo(calendarConstraints.f1144g) > 0) {
            f2 = calendarConstraints.f1144g;
        }
        this.f5355g.a.m(f2);
        this.f5355g.a.o(d.e.DAY);
    }
}
