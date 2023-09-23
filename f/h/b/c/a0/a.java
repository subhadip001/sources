package f.h.b.c.a0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public class a extends c {
    public static float c(float f2) {
        return (float) (1.0d - Math.cos((f2 * 3.141592653589793d) / 2.0d));
    }

    @Override // f.h.b.c.a0.c
    public void b(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float sin;
        float c;
        RectF a = c.a(tabLayout, view);
        RectF a2 = c.a(tabLayout, view2);
        if (a.left < a2.left) {
            sin = c(f2);
            c = (float) Math.sin((f2 * 3.141592653589793d) / 2.0d);
        } else {
            sin = (float) Math.sin((f2 * 3.141592653589793d) / 2.0d);
            c = c(f2);
        }
        drawable.setBounds(f.h.b.c.c.a.c((int) a.left, (int) a2.left, sin), drawable.getBounds().top, f.h.b.c.c.a.c((int) a.right, (int) a2.right, c), drawable.getBounds().bottom);
    }
}
