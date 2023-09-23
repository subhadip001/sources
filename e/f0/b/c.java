package e.f0.b;

import androidx.viewpager2.adapter.FragmentStateAdapter;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2009f;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f2009f = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f2009f;
        fragmentStateAdapter.f606g = false;
        fragmentStateAdapter.q();
    }
}
