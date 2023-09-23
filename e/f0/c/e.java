package e.f0.c;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class e extends ViewPager2.e {
    public final LinearLayoutManager a;
    public ViewPager2.g b;

    public e(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void a(int i2) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void b(int i2, float f2, int i3) {
        if (this.b == null) {
            return;
        }
        float f3 = -f2;
        for (int i4 = 0; i4 < this.a.A(); i4++) {
            View z = this.a.z(i4);
            if (z != null) {
                this.b.a(z, (this.a.S(z) - i2) + f3);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i4), Integer.valueOf(this.a.A())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void c(int i2) {
    }
}
