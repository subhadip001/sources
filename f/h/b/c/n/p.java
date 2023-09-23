package f.h.b.c.n;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes.dex */
public final class p<S> extends u<S> {

    /* renamed from: g  reason: collision with root package name */
    public int f5341g;

    /* renamed from: h  reason: collision with root package name */
    public DateSelector<S> f5342h;

    /* renamed from: i  reason: collision with root package name */
    public CalendarConstraints f5343i;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes.dex */
    public class a extends t<S> {
        public a() {
        }

        @Override // f.h.b.c.n.t
        public void a(S s) {
            Iterator<t<S>> it = p.this.f5353f.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5341g = bundle.getInt("THEME_RES_ID_KEY");
        this.f5342h = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5343i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f5342h.F(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f5341g)), viewGroup, bundle, this.f5343i, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5341g);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5342h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5343i);
    }
}
