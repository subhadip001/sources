package f.h.b.c.n;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: classes.dex */
public class q extends BaseAdapter {

    /* renamed from: k  reason: collision with root package name */
    public static final int f5344k = x.e().getMaximum(4);

    /* renamed from: f  reason: collision with root package name */
    public final Month f5345f;

    /* renamed from: g  reason: collision with root package name */
    public final DateSelector<?> f5346g;

    /* renamed from: h  reason: collision with root package name */
    public Collection<Long> f5347h;

    /* renamed from: i  reason: collision with root package name */
    public b f5348i;

    /* renamed from: j  reason: collision with root package name */
    public final CalendarConstraints f5349j;

    public q(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f5345f = month;
        this.f5346g = dateSelector;
        this.f5349j = calendarConstraints;
        this.f5347h = dateSelector.T();
    }

    public int a(int i2) {
        return b() + (i2 - 1);
    }

    public int b() {
        return this.f5345f.i();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.f5345f.i() || i2 > d()) {
            return null;
        }
        Month month = this.f5345f;
        Calendar b = x.b(month.f1155f);
        b.set(5, (i2 - month.i()) + 1);
        return Long.valueOf(b.getTimeInMillis());
    }

    public int d() {
        return (this.f5345f.i() + this.f5345f.f1159j) - 1;
    }

    public final void e(TextView textView, long j2) {
        a aVar;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.f5349j.f1145h.N(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f5346g.T().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (x.a(j2) == x.a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                aVar = this.f5348i.b;
            } else if (x.d().getTimeInMillis() == j2) {
                aVar = this.f5348i.c;
            } else {
                aVar = this.f5348i.a;
            }
        } else {
            textView.setEnabled(false);
            aVar = this.f5348i.f5306g;
        }
        aVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.g(j2).equals(this.f5345f)) {
            Calendar b = x.b(this.f5345f.f1155f);
            b.setTimeInMillis(j2);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return b() + this.f5345f.f1159j;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f5345f.f1158i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.n.q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
