package e.f0.c;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public class h extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public h(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void c(int i2) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.o.requestFocus(2);
        }
    }
}
