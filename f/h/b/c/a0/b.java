package f.h.b.c.a0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public class b extends c {
    @Override // f.h.b.c.a0.c
    public void b(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float b;
        int i2 = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        if (i2 >= 0) {
            view = view2;
        }
        RectF a = c.a(tabLayout, view);
        if (i2 < 0) {
            b = f.h.b.c.c.a.b(1.0f, 0.0f, 0.0f, 0.5f, f2);
        } else {
            b = f.h.b.c.c.a.b(0.0f, 1.0f, 0.5f, 1.0f, f2);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}
