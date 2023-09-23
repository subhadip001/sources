package f.h.b.c.n;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public class z extends RecyclerView.e<a> {
    public final d<?> a;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {
        public final TextView a;

        public a(TextView textView) {
            super(textView);
            this.a = textView;
        }
    }

    public z(d<?> dVar) {
        this.a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.a.f5314i.f1147j;
    }

    public int n(int i2) {
        return i2 - this.a.f5314i.f1143f.f1157h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        int i3 = this.a.f5314i.f1143f.f1157h + i2;
        String string = aVar2.a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        aVar2.a.setContentDescription(String.format(string, Integer.valueOf(i3)));
        b bVar = this.a.f5317l;
        Calendar d2 = x.d();
        f.h.b.c.n.a aVar3 = d2.get(1) == i3 ? bVar.f5305f : bVar.f5303d;
        for (Long l2 : this.a.f5313h.T()) {
            d2.setTimeInMillis(l2.longValue());
            if (d2.get(1) == i3) {
                aVar3 = bVar.f5304e;
            }
        }
        aVar3.b(aVar2.a);
        aVar2.a.setOnClickListener(new y(this, i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new a((TextView) f.a.b.a.a.T(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
