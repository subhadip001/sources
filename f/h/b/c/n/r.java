package f.h.b.c.n;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import f.h.b.c.n.d;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public class r implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f5350f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s f5351g;

    public r(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f5351g = sVar;
        this.f5350f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        q adapter2 = this.f5350f.getAdapter2();
        if (i2 >= adapter2.b() && i2 <= adapter2.d()) {
            d.f fVar = this.f5351g.c;
            long longValue = this.f5350f.getAdapter2().getItem(i2).longValue();
            d.C0123d c0123d = (d.C0123d) fVar;
            if (d.this.f5314i.f1145h.N(longValue)) {
                d.this.f5313h.i0(longValue);
                Iterator it = d.this.f5353f.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a(d.this.f5313h.X());
                }
                d.this.n.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = d.this.f5318m;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
