package f.e.a.p.j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: h  reason: collision with root package name */
    public Animatable f3592h;

    public e(ImageView imageView) {
        super(imageView);
    }

    public abstract void a(Z z);

    public final void b(Z z) {
        a(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f3592h = animatable;
            animatable.start();
            return;
        }
        this.f3592h = null;
    }

    @Override // f.e.a.p.j.h
    public void onLoadCleared(Drawable drawable) {
        this.f3594g.a();
        Animatable animatable = this.f3592h;
        if (animatable != null) {
            animatable.stop();
        }
        b(null);
        ((ImageView) this.f3593f).setImageDrawable(drawable);
    }

    @Override // f.e.a.p.j.h
    public void onLoadFailed(Drawable drawable) {
        b(null);
        ((ImageView) this.f3593f).setImageDrawable(drawable);
    }

    @Override // f.e.a.p.j.h
    public void onLoadStarted(Drawable drawable) {
        b(null);
        ((ImageView) this.f3593f).setImageDrawable(drawable);
    }

    @Override // f.e.a.p.j.h
    public void onResourceReady(Z z, f.e.a.p.k.b<? super Z> bVar) {
        b(z);
    }

    @Override // f.e.a.m.m
    public void onStart() {
        Animatable animatable = this.f3592h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // f.e.a.m.m
    public void onStop() {
        Animatable animatable = this.f3592h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
