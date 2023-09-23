package f.h.b.c.g;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f5258f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5259g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f5260h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5261i;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.f5261i = bottomAppBar;
        this.f5258f = actionMenuView;
        this.f5259g = i2;
        this.f5260h = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionMenuView actionMenuView = this.f5258f;
        actionMenuView.setTranslationX(this.f5261i.E(actionMenuView, this.f5259g, this.f5260h));
    }
}
