package f.h.b.c.a0;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes.dex */
public class e implements View.OnLayoutChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f5144f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f5145g;

    public e(TabLayout.i iVar, View view) {
        this.f5145g = iVar;
        this.f5144f = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.f5144f.getVisibility() == 0) {
            TabLayout.i iVar = this.f5145g;
            View view2 = this.f5144f;
            int i10 = TabLayout.i.q;
            iVar.e(view2);
        }
    }
}
