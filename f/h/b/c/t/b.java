package f.h.b.c.t;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;
import f.h.b.c.s.k;

/* compiled from: NavigationView.java */
/* loaded from: classes.dex */
public class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NavigationView f5447f;

    public b(NavigationView navigationView) {
        this.f5447f = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f5447f;
        navigationView.getLocationOnScreen(navigationView.o);
        NavigationView navigationView2 = this.f5447f;
        boolean z = true;
        boolean z2 = navigationView2.o[1] == 0;
        k kVar = navigationView2.f1177l;
        if (kVar.A != z2) {
            kVar.A = z2;
            kVar.k();
        }
        NavigationView navigationView3 = this.f5447f;
        navigationView3.setDrawTopInsetForeground(z2 && navigationView3.r);
        Context context = this.f5447f.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            boolean z3 = activity.findViewById(16908290).getHeight() == this.f5447f.getHeight();
            boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView4 = this.f5447f;
            navigationView4.setDrawBottomInsetForeground((z3 && z4 && navigationView4.s) ? false : false);
        }
    }
}
