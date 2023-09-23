package e.f0.c;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public class g extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public g(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void a(int i2) {
        if (i2 == 0) {
            this.a.e();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void c(int i2) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.f619i != i2) {
            viewPager2.f619i = i2;
            viewPager2.y.b();
        }
    }
}
