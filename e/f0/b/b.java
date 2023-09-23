package e.f0.b;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public class b extends FragmentManager.k {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FragmentStateAdapter c;

    public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.c = fragmentStateAdapter;
        this.a = fragment;
        this.b = frameLayout;
    }
}
