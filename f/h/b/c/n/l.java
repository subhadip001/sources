package f.h.b.c.n;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import com.video_converter.video_compressor.R;
import e.i.j.g0;
import e.i.j.z;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class l<S> extends e.p.c.k {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<o<? super S>> f5330f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f5331g = new LinkedHashSet<>();

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f5332h = new LinkedHashSet<>();

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f5333i = new LinkedHashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public int f5334j;

    /* renamed from: k  reason: collision with root package name */
    public DateSelector<S> f5335k;

    /* renamed from: l  reason: collision with root package name */
    public u<S> f5336l;

    /* renamed from: m  reason: collision with root package name */
    public CalendarConstraints f5337m;
    public d<S> n;
    public int o;
    public CharSequence p;
    public boolean q;
    public int r;
    public int s;
    public CharSequence t;
    public int u;
    public CharSequence v;
    public TextView w;
    public CheckableImageButton x;
    public f.h.b.c.y.g y;
    public Button z;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<o<? super S>> it = l.this.f5330f.iterator();
            while (it.hasNext()) {
                it.next().a((S) l.this.i().X());
            }
            l.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = l.this.f5331g.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            l.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes.dex */
    public class c extends t<S> {
        public c() {
        }

        @Override // f.h.b.c.n.t
        public void a(S s) {
            l lVar = l.this;
            int i2 = l.B;
            lVar.p();
            l lVar2 = l.this;
            lVar2.z.setEnabled(lVar2.i().O());
        }
    }

    public static int k(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d2 = x.d();
        d2.set(5, 1);
        Calendar b2 = x.b(d2);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean l(Context context) {
        return m(context, 16843277);
    }

    public static boolean m(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.h.b.c.a.R0(context, R.attr.materialCalendarStyle, d.class.getCanonicalName()), new int[]{i2});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final DateSelector<S> i() {
        if (this.f5335k == null) {
            this.f5335k = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f5335k;
    }

    public final void o() {
        u<S> uVar;
        Context requireContext = requireContext();
        int i2 = this.f5334j;
        if (i2 == 0) {
            i2 = i().M(requireContext);
        }
        DateSelector<S> i3 = i();
        CalendarConstraints calendarConstraints = this.f5337m;
        d<S> dVar = new d<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", i3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f1146i);
        dVar.setArguments(bundle);
        this.n = dVar;
        if (this.x.isChecked()) {
            DateSelector<S> i4 = i();
            CalendarConstraints calendarConstraints2 = this.f5337m;
            uVar = new p<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", i4);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            uVar.setArguments(bundle2);
        } else {
            uVar = this.n;
        }
        this.f5336l = uVar;
        p();
        e.p.c.a aVar = new e.p.c.a(getChildFragmentManager());
        aVar.h(R.id.mtrl_calendar_frame, this.f5336l, null);
        aVar.f();
        this.f5336l.i(new c());
    }

    @Override // e.p.c.k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f5332h.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5334j = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f5335k = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5337m = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.o = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.p = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.r = bundle.getInt("INPUT_MODE_KEY");
        this.s = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.t = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.u = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // e.p.c.k
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i2 = this.f5334j;
        if (i2 == 0) {
            i2 = i().M(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i2);
        Context context = dialog.getContext();
        this.q = l(context);
        int R0 = f.h.b.c.a.R0(context, R.attr.colorSurface, l.class.getCanonicalName());
        f.h.b.c.y.g gVar = new f.h.b.c.y.g(context, null, R.attr.materialCalendarStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_MaterialCalendar);
        this.y = gVar;
        gVar.o(context);
        this.y.r(ColorStateList.valueOf(R0));
        f.h.b.c.y.g gVar2 = this.y;
        View decorView = dialog.getWindow().getDecorView();
        AtomicInteger atomicInteger = e.i.j.z.a;
        gVar2.q(z.i.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.q ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.q) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(k(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(k(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.w = textView;
        AtomicInteger atomicInteger = e.i.j.z.a;
        z.g.f(textView, 1);
        this.x = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.o);
        }
        this.x.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.x;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.b.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.b.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.x.setChecked(this.r != 0);
        e.i.j.z.w(this.x, null);
        r(this.x);
        this.x.setOnClickListener(new n(this));
        this.z = (Button) inflate.findViewById(R.id.confirm_button);
        if (i().O()) {
            this.z.setEnabled(true);
        } else {
            this.z.setEnabled(false);
        }
        this.z.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.t;
        if (charSequence2 != null) {
            this.z.setText(charSequence2);
        } else {
            int i2 = this.s;
            if (i2 != 0) {
                this.z.setText(i2);
            }
        }
        this.z.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.v;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.u;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // e.p.c.k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f5333i.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5334j);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5335k);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f5337m);
        Month month = this.n.f5315j;
        if (month != null) {
            bVar.c = Long.valueOf(month.f1160k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1151d);
        Month g2 = Month.g(bVar.a);
        Month g3 = Month.g(bVar.b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = bVar.c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(g2, g3, dateValidator, l2 == null ? null : Month.g(l2.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.s);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.t);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.q) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.y);
            if (!this.A) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                g0 g0Var = null;
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int l0 = f.h.b.c.a.l0(window.getContext(), 16842801, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(l0);
                }
                Integer valueOf2 = Integer.valueOf(l0);
                if (i2 >= 30) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                int e2 = i2 < 23 ? e.i.d.a.e(f.h.b.c.a.l0(window.getContext(), 16843857, -16777216), 128) : 0;
                int e3 = i2 < 27 ? e.i.d.a.e(f.h.b.c.a.l0(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(e2);
                window.setNavigationBarColor(e3);
                boolean z3 = f.h.b.c.a.u0(e2) || (e2 == 0 && f.h.b.c.a.u0(valueOf.intValue()));
                boolean u0 = f.h.b.c.a.u0(valueOf2.intValue());
                if (f.h.b.c.a.u0(e3) || (e3 == 0 && u0)) {
                    z = true;
                }
                View decorView2 = window.getDecorView();
                if (i2 >= 30) {
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        g0Var = new g0(insetsController);
                    }
                } else {
                    g0Var = new g0(window, decorView2);
                }
                if (g0Var != null) {
                    g0Var.a.b(z3);
                    g0Var.a.a(z);
                }
                m mVar = new m(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                AtomicInteger atomicInteger = e.i.j.z.a;
                z.i.u(findViewById, mVar);
                this.A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.y, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new f.h.b.c.o.a(requireDialog(), rect));
        }
        o();
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStop() {
        this.f5336l.f5353f.clear();
        super.onStop();
    }

    public final void p() {
        String a2 = i().a(getContext());
        this.w.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), a2));
        this.w.setText(a2);
    }

    public final void r(CheckableImageButton checkableImageButton) {
        String string;
        if (this.x.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.x.setContentDescription(string);
    }
}
