package e.m.b;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
public class a implements View.OnApplyWindowInsetsListener {
    public a(DrawerLayout drawerLayout) {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z = true;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.C = windowInsets;
        drawerLayout.D = z2;
        drawerLayout.setWillNotDraw((z2 || drawerLayout.getBackground() != null) ? false : false);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
