package f.h.b.c.r;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;
import f.h.b.c.y.j;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes.dex */
public class h extends e {

    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes.dex */
    public static class a extends f.h.b.c.y.g {
        public a(j jVar) {
            super(jVar);
        }

        @Override // f.h.b.c.y.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public h(FloatingActionButton floatingActionButton, f.h.b.c.x.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // f.h.b.c.r.e
    public float e() {
        return this.w.getElevation();
    }

    @Override // f.h.b.c.r.e
    public void f(Rect rect) {
        if (FloatingActionButton.this.q) {
            super.f(rect);
        } else if (!v()) {
            int sizeDimension = (this.f5381k - this.w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // f.h.b.c.r.e
    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable drawable;
        j jVar = this.a;
        Objects.requireNonNull(jVar);
        a aVar = new a(jVar);
        this.b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.o(this.w.getContext());
        if (i2 > 0) {
            Context context = this.w.getContext();
            j jVar2 = this.a;
            Objects.requireNonNull(jVar2);
            f.h.b.c.r.a aVar2 = new f.h.b.c.r.a(jVar2);
            int color = e.i.c.a.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = e.i.c.a.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = e.i.c.a.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = e.i.c.a.getColor(context, R.color.design_fab_stroke_end_outer_color);
            aVar2.f5368i = color;
            aVar2.f5369j = color2;
            aVar2.f5370k = color3;
            aVar2.f5371l = color4;
            float f2 = i2;
            if (aVar2.f5367h != f2) {
                aVar2.f5367h = f2;
                aVar2.b.setStrokeWidth(f2 * 1.3333f);
                aVar2.n = true;
                aVar2.invalidateSelf();
            }
            aVar2.b(colorStateList);
            this.f5374d = aVar2;
            f.h.b.c.r.a aVar3 = this.f5374d;
            Objects.requireNonNull(aVar3);
            f.h.b.c.y.g gVar = this.b;
            Objects.requireNonNull(gVar);
            drawable = new LayerDrawable(new Drawable[]{aVar3, gVar});
        } else {
            this.f5374d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(f.h.b.c.w.b.b(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.f5375e = rippleDrawable;
    }

    @Override // f.h.b.c.r.e
    public void j() {
    }

    @Override // f.h.b.c.r.e
    public void k() {
        x();
    }

    @Override // f.h.b.c.r.e
    public void l(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.w.isEnabled()) {
                this.w.setElevation(this.f5378h);
                if (this.w.isPressed()) {
                    this.w.setTranslationZ(this.f5380j);
                    return;
                } else if (!this.w.isFocused() && !this.w.isHovered()) {
                    this.w.setTranslationZ(0.0f);
                    return;
                } else {
                    this.w.setTranslationZ(this.f5379i);
                    return;
                }
            }
            this.w.setElevation(0.0f);
            this.w.setTranslationZ(0.0f);
        }
    }

    @Override // f.h.b.c.r.e
    public void m(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(e.E, z(f2, f4));
            stateListAnimator.addState(e.F, z(f2, f3));
            stateListAnimator.addState(e.G, z(f2, f3));
            stateListAnimator.addState(e.H, z(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.w, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(e.D);
            stateListAnimator.addState(e.I, animatorSet);
            stateListAnimator.addState(e.J, z(0.0f, 0.0f));
            this.w.setStateListAnimator(stateListAnimator);
        }
        if (t()) {
            x();
        }
    }

    @Override // f.h.b.c.r.e
    public boolean p() {
        return false;
    }

    @Override // f.h.b.c.r.e
    public void r(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(f.h.b.c.w.b.b(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(f.h.b.c.w.b.b(colorStateList));
        }
    }

    @Override // f.h.b.c.r.e
    public boolean t() {
        return FloatingActionButton.this.q || !v();
    }

    @Override // f.h.b.c.r.e
    public void w() {
    }

    public final Animator z(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.w, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.w, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(e.D);
        return animatorSet;
    }
}
