package f.l.a.c;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: NcFragmentMediaPickerBinding.java */
/* loaded from: classes2.dex */
public final class e implements e.d0.a {
    public final LinearLayout a;
    public final TextView b;
    public final TabLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager2 f6620d;

    public e(LinearLayout linearLayout, TextView textView, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = tabLayout;
        this.f6620d = viewPager2;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
