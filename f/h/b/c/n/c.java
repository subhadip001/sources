package f.h.b.c.n;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes.dex */
public class c extends BaseAdapter {

    /* renamed from: i  reason: collision with root package name */
    public static final int f5308i;

    /* renamed from: f  reason: collision with root package name */
    public final Calendar f5309f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5310g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5311h;

    static {
        f5308i = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public c() {
        Calendar e2 = x.e();
        this.f5309f = e2;
        this.f5310g = e2.getMaximum(7);
        this.f5311h = e2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5310g;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        int i3 = this.f5310g;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f5311h;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) f.a.b.a.a.T(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f5309f;
        int i3 = i2 + this.f5311h;
        int i4 = this.f5310g;
        if (i3 > i4) {
            i3 -= i4;
        }
        calendar.set(7, i3);
        textView.setText(this.f5309f.getDisplayName(7, f5308i, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f5309f.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
