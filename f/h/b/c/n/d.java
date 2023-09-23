package f.h.b.c.n;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.video_converter.video_compressor.R;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class d<S> extends u<S> {
    public static final /* synthetic */ int q = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f5312g;

    /* renamed from: h  reason: collision with root package name */
    public DateSelector<S> f5313h;

    /* renamed from: i  reason: collision with root package name */
    public CalendarConstraints f5314i;

    /* renamed from: j  reason: collision with root package name */
    public Month f5315j;

    /* renamed from: k  reason: collision with root package name */
    public e f5316k;

    /* renamed from: l  reason: collision with root package name */
    public f.h.b.c.n.b f5317l;

    /* renamed from: m  reason: collision with root package name */
    public RecyclerView f5318m;
    public RecyclerView n;
    public View o;
    public View p;

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f5319f;

        public a(int i2) {
            this.f5319f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.n.q0(this.f5319f);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class b extends e.i.j.c {
        public b(d dVar) {
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            dVar.m(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public class c extends v {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.G = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void b1(RecyclerView.x xVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = d.this.n.getWidth();
                iArr[1] = d.this.n.getWidth();
                return;
            }
            iArr[0] = d.this.n.getHeight();
            iArr[1] = d.this.n.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: f.h.b.c.n.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0123d implements f {
        public C0123d() {
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public enum e {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // f.h.b.c.n.u
    public boolean i(t<S> tVar) {
        return this.f5353f.add(tVar);
    }

    public LinearLayoutManager k() {
        return (LinearLayoutManager) this.n.getLayoutManager();
    }

    public final void l(int i2) {
        this.n.post(new a(i2));
    }

    public void m(Month month) {
        s sVar = (s) this.n.getAdapter();
        int m2 = sVar.a.f1143f.m(month);
        int o = m2 - sVar.o(this.f5315j);
        boolean z = Math.abs(o) > 3;
        boolean z2 = o > 0;
        this.f5315j = month;
        if (z && z2) {
            this.n.m0(m2 - 3);
            l(m2);
        } else if (z) {
            this.n.m0(m2 + 3);
            l(m2);
        } else {
            l(m2);
        }
    }

    public void o(e eVar) {
        this.f5316k = eVar;
        if (eVar == e.YEAR) {
            this.f5318m.getLayoutManager().O0(((z) this.f5318m.getAdapter()).n(this.f5315j.f1157h));
            this.o.setVisibility(0);
            this.p.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.o.setVisibility(8);
            this.p.setVisibility(0);
            m(this.f5315j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5312g = bundle.getInt("THEME_RES_ID_KEY");
        this.f5313h = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5314i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5315j = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f5312g);
        this.f5317l = new f.h.b.c.n.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f5314i.f1143f;
        if (l.l(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i4 = q.f5344k;
        int i5 = dimensionPixelOffset + dimensionPixelSize;
        inflate.setMinimumHeight(i5 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        e.i.j.z.w(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f.h.b.c.n.c());
        gridView.setNumColumns(month.f1158i);
        gridView.setEnabled(false);
        this.n = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.n.setLayoutManager(new c(getContext(), i3, false, i3));
        this.n.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f5313h, this.f5314i, new C0123d());
        this.n.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f5318m = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5318m.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f5318m.setAdapter(new z(this));
            this.f5318m.g(new f.h.b.c.n.e(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            e.i.j.z.w(materialButton, new f.h.b.c.n.f(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.o = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.p = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            o(e.DAY);
            materialButton.setText(this.f5315j.j());
            this.n.h(new g(this, sVar, materialButton));
            materialButton.setOnClickListener(new h(this));
            materialButton3.setOnClickListener(new i(this, sVar));
            materialButton2.setOnClickListener(new j(this, sVar));
        }
        if (!l.l(contextThemeWrapper)) {
            new e.u.b.x().a(this.n);
        }
        this.n.m0(sVar.o(this.f5315j));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5312g);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5313h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5314i);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5315j);
    }
}
