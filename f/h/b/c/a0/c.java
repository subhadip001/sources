package f.h.b.c.a0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public class c {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.G && (view instanceof TabLayout.i)) {
            TabLayout.i iVar = (TabLayout.i) view;
            int contentWidth = iVar.getContentWidth();
            int contentHeight = iVar.getContentHeight();
            int h0 = (int) f.h.b.c.a.h0(iVar.getContext(), 24);
            if (contentWidth < h0) {
                contentWidth = h0;
            }
            int right = (iVar.getRight() + iVar.getLeft()) / 2;
            int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
            int i2 = contentWidth / 2;
            return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(f.h.b.c.c.a.c((int) a.left, (int) a2.left, f2), drawable.getBounds().top, f.h.b.c.c.a.c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
