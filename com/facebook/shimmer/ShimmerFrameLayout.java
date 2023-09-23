package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import f.g.a.a;
import f.g.a.b;
import f.g.a.c;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public final Paint f696f;

    /* renamed from: g  reason: collision with root package name */
    public final c f697g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f698h;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f696f = new Paint();
        c cVar = new c();
        this.f697g = cVar;
        this.f698h = true;
        setWillNotDraw(false);
        cVar.setCallback(this);
        if (attributeSet == null) {
            a(new b.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            a(((obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) ? new b.c() : new b.a()).b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShimmerFrameLayout a(b bVar) {
        boolean z;
        c cVar = this.f697g;
        cVar.f3638f = bVar;
        if (bVar != null) {
            cVar.b.setXfermode(new PorterDuffXfermode(cVar.f3638f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        cVar.c();
        if (cVar.f3638f != null) {
            ValueAnimator valueAnimator = cVar.f3637e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                cVar.f3637e.cancel();
                cVar.f3637e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            b bVar2 = cVar.f3638f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (bVar2.t / bVar2.s)) + 1.0f);
            cVar.f3637e = ofFloat;
            ofFloat.setRepeatMode(cVar.f3638f.r);
            cVar.f3637e.setRepeatCount(cVar.f3638f.q);
            ValueAnimator valueAnimator2 = cVar.f3637e;
            b bVar3 = cVar.f3638f;
            valueAnimator2.setDuration(bVar3.s + bVar3.t);
            cVar.f3637e.addUpdateListener(cVar.a);
            if (z) {
                cVar.f3637e.start();
            }
        }
        cVar.invalidateSelf();
        if (bVar != null && bVar.n) {
            setLayerType(2, this.f696f);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f698h) {
            this.f697g.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f697g.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f697g;
        ValueAnimator valueAnimator = cVar.f3637e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        cVar.f3637e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f697g.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f697g;
    }
}
