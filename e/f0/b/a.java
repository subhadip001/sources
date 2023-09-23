package e.f0.b;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public class a implements View.OnLayoutChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2006f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f2007g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2008h;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f2008h = fragmentStateAdapter;
        this.f2006f = frameLayout;
        this.f2007g = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.f2006f.getParent() != null) {
            this.f2006f.removeOnLayoutChangeListener(this);
            this.f2008h.t(this.f2007g);
        }
    }
}
