package f.h.b.c.n;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import com.video_converter.video_compressor.R;
import f.h.b.c.n.d;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public class s extends RecyclerView.e<a> {
    public final CalendarConstraints a;
    public final DateSelector<?> b;
    public final d.f c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5352d;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {
        public final TextView a;
        public final MaterialCalendarGridView b;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.a = textView;
            AtomicInteger atomicInteger = e.i.j.z.a;
            new e.i.j.y(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public s(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, d.f fVar) {
        Month month = calendarConstraints.f1143f;
        Month month2 = calendarConstraints.f1144g;
        Month month3 = calendarConstraints.f1146i;
        if (month.compareTo(month3) <= 0) {
            if (month3.compareTo(month2) <= 0) {
                int i2 = q.f5344k;
                int i3 = d.q;
                this.f5352d = (i2 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (l.l(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
                this.a = calendarConstraints;
                this.b = dateSelector;
                this.c = fVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.a.f1148k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long getItemId(int i2) {
        return this.a.f1143f.k(i2).f1155f.getTimeInMillis();
    }

    public Month n(int i2) {
        return this.a.f1143f.k(i2);
    }

    public int o(Month month) {
        return this.a.f1143f.m(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        Month k2 = this.a.f1143f.k(i2);
        aVar2.a.setText(k2.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && k2.equals(materialCalendarGridView.getAdapter2().f5345f)) {
            materialCalendarGridView.invalidate();
            q adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l2 : adapter2.f5347h) {
                adapter2.f(materialCalendarGridView, l2.longValue());
            }
            DateSelector<?> dateSelector = adapter2.f5346g;
            if (dateSelector != null) {
                for (Long l3 : dateSelector.T()) {
                    adapter2.f(materialCalendarGridView, l3.longValue());
                }
                adapter2.f5347h = adapter2.f5346g.T();
            }
        } else {
            q qVar = new q(k2, this.b, this.a);
            materialCalendarGridView.setNumColumns(k2.f1158i);
            materialCalendarGridView.setAdapter((ListAdapter) qVar);
        }
        materialCalendarGridView.setOnItemClickListener(new r(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) f.a.b.a.a.T(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (l.l(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f5352d));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
