package f.m.b;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: DeferredRequestCreator.java */
/* loaded from: classes2.dex */
public class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final w f6842f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference<ImageView> f6843g;

    /* renamed from: h  reason: collision with root package name */
    public e f6844h;

    public h(w wVar, ImageView imageView, e eVar) {
        this.f6842f = wVar;
        this.f6843g = new WeakReference<>(imageView);
        this.f6844h = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f6843g.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width > 0 && height > 0) {
                imageView.removeOnAttachStateChangeListener(this);
                viewTreeObserver.removeOnPreDrawListener(this);
                this.f6843g.clear();
                w wVar = this.f6842f;
                wVar.c = false;
                wVar.b.a(width, height);
                wVar.d(imageView, this.f6844h);
            }
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
