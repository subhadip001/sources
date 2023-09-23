package e.z.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CircleImageView.java */
/* loaded from: classes.dex */
public class a extends ImageView {

    /* renamed from: f  reason: collision with root package name */
    public Animation.AnimationListener f3014f;

    /* renamed from: g  reason: collision with root package name */
    public int f3015g;

    /* renamed from: h  reason: collision with root package name */
    public int f3016h;

    public a(Context context) {
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        this.f3015g = (int) (3.5f * f2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(e.z.a.a);
        this.f3016h = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AtomicInteger atomicInteger = z.a;
        z.i.s(this, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(this.f3016h);
        z.d.q(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f3014f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f3014f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
            this.f3016h = i2;
        }
    }
}
