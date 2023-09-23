package e.i.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final View f2545f;

    /* renamed from: g  reason: collision with root package name */
    public ViewTreeObserver f2546g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2547h;

    public t(View view, Runnable runnable) {
        this.f2545f = view;
        this.f2546g = view.getViewTreeObserver();
        this.f2547h = runnable;
    }

    public static t a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        t tVar = new t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tVar);
        view.addOnAttachStateChangeListener(tVar);
        return tVar;
    }

    public void b() {
        if (this.f2546g.isAlive()) {
            this.f2546g.removeOnPreDrawListener(this);
        } else {
            this.f2545f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2545f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2547h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2546g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
