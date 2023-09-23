package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.c.d;
import f.h.b.c.c.g;
import f.h.b.c.c.h;
import f.h.b.c.c.i;
import f.h.b.c.e0.e;
import f.h.b.c.m.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f1257d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f1258e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1259f;

    /* renamed from: g  reason: collision with root package name */
    public float f1260g;

    /* renamed from: h  reason: collision with root package name */
    public float f1261h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public g a;
        public i b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.f1257d = new RectF();
        this.f1258e = new RectF();
        this.f1259f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList;
        b bVar;
        c cVar;
        Animator animator;
        ArrayList arrayList2;
        ObjectAnimator ofInt;
        b N = N(view2.getContext(), z);
        if (z) {
            this.f1260g = view.getTranslationX();
            this.f1261h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        L(view, view2, z, z2, N, arrayList3);
        RectF rectF = this.f1257d;
        M(view, view2, z, z2, N, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        float F = F(view, view2, N.b);
        float G = G(view, view2, N.b);
        Pair<h, h> E = E(F, G, z, N);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            F = this.f1260g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            G = this.f1261h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z3 = view2 instanceof c;
        if (z3 && (view instanceof ImageView)) {
            c cVar2 = (c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, d.b, 0);
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, d.b, 255);
                }
                ofInt.addUpdateListener(new f.h.b.c.e0.a(this, view2));
                N.a.d("iconFade").a(ofInt);
                arrayList3.add(ofInt);
                arrayList4.add(new f.h.b.c.e0.b(this, cVar2, drawable));
            }
        }
        if (z3) {
            c cVar3 = (c) view2;
            i iVar = N.b;
            RectF rectF2 = this.f1257d;
            RectF rectF3 = this.f1258e;
            I(view, rectF2);
            rectF2.offset(this.f1260g, this.f1261h);
            I(view2, rectF3);
            rectF3.offset(-F(view, view2, iVar), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            i iVar2 = N.b;
            RectF rectF4 = this.f1257d;
            RectF rectF5 = this.f1258e;
            I(view, rectF4);
            rectF4.offset(this.f1260g, this.f1261h);
            I(view2, rectF5);
            rectF5.offset(0.0f, -G(view, view2, iVar2));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).g(this.c);
            float width2 = this.c.width() / 2.0f;
            h d2 = N.a.d("expansion");
            if (z) {
                if (!z2) {
                    cVar3.setRevealInfo(new c.e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = cVar3.getRevealInfo().c;
                }
                float g0 = f.h.b.c.a.g0(centerX, centerY, 0.0f, 0.0f);
                float g02 = f.h.b.c.a.g0(centerX, centerY, width, 0.0f);
                float g03 = f.h.b.c.a.g0(centerX, centerY, width, height);
                float g04 = f.h.b.c.a.g0(centerX, centerY, 0.0f, height);
                if (g0 <= g02 || g0 <= g03 || g0 <= g04) {
                    g0 = (g02 <= g03 || g02 <= g04) ? g03 > g04 ? g03 : g04 : g02;
                }
                animator = f.h.b.c.a.G(cVar3, centerX, centerY, g0);
                animator.addListener(new f.h.b.c.e0.c(this, cVar3));
                long j2 = d2.a;
                int i2 = (int) centerX;
                int i3 = (int) centerY;
                if (j2 > 0) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, width2, width2);
                    createCircularReveal.setStartDelay(0L);
                    createCircularReveal.setDuration(j2);
                    arrayList3.add(createCircularReveal);
                }
                cVar = cVar3;
                arrayList = arrayList4;
                bVar = N;
            } else {
                float f2 = cVar3.getRevealInfo().c;
                Animator G2 = f.h.b.c.a.G(cVar3, centerX, centerY, width2);
                long j3 = d2.a;
                int i4 = (int) centerX;
                int i5 = (int) centerY;
                if (j3 > 0) {
                    Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f2, f2);
                    createCircularReveal2.setStartDelay(0L);
                    createCircularReveal2.setDuration(j3);
                    arrayList3.add(createCircularReveal2);
                }
                long j4 = d2.a;
                long j5 = d2.b;
                g gVar = N.a;
                int i6 = gVar.a.f2001h;
                arrayList = arrayList4;
                bVar = N;
                int i7 = 0;
                long j6 = 0;
                while (i7 < i6) {
                    int i8 = i6;
                    h l2 = gVar.a.l(i7);
                    j6 = Math.max(j6, l2.a + l2.b);
                    i7++;
                    i6 = i8;
                    cVar3 = cVar3;
                    i4 = i4;
                    gVar = gVar;
                }
                cVar = cVar3;
                int i9 = i4;
                long j7 = j4 + j5;
                if (j7 < j6) {
                    Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i9, i5, width2, width2);
                    createCircularReveal3.setStartDelay(j7);
                    createCircularReveal3.setDuration(j6 - j7);
                    arrayList3.add(createCircularReveal3);
                }
                animator = G2;
            }
            d2.a(animator);
            arrayList3.add(animator);
            arrayList2 = arrayList;
            arrayList2.add(new f.h.b.c.m.a(cVar));
        } else {
            bVar = N;
            arrayList2 = arrayList4;
        }
        K(view, view2, z, z2, bVar, arrayList3);
        J(view2, z, z2, bVar, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        f.h.b.c.a.K0(animatorSet, arrayList3);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final Pair<h, h> E(float f2, float f3, boolean z, b bVar) {
        h d2;
        h d3;
        int i2;
        if (f2 == 0.0f || f3 == 0.0f) {
            d2 = bVar.a.d("translationXLinear");
            d3 = bVar.a.d("translationYLinear");
        } else if ((z && f3 < 0.0f) || (!z && i2 > 0)) {
            d2 = bVar.a.d("translationXCurveUpwards");
            d3 = bVar.a.d("translationYCurveUpwards");
        } else {
            d2 = bVar.a.d("translationXCurveDownwards");
            d3 = bVar.a.d("translationYCurveDownwards");
        }
        return new Pair<>(d2, d3);
    }

    public final float F(View view, View view2, i iVar) {
        RectF rectF = this.f1257d;
        RectF rectF2 = this.f1258e;
        I(view, rectF);
        rectF.offset(this.f1260g, this.f1261h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, i iVar) {
        RectF rectF = this.f1257d;
        RectF rectF2 = this.f1258e;
        I(view, rectF);
        rectF.offset(this.f1260g, this.f1261h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float H(b bVar, h hVar, float f2, float f3) {
        long j2 = hVar.a;
        long j3 = hVar.b;
        h d2 = bVar.a.d("expansion");
        return f.h.b.c.c.a.a(f2, f3, hVar.b().getInterpolation(((float) (((d2.a + d2.b) + 17) - j2)) / ((float) j3)));
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f1259f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void J(View view, boolean z, boolean z2, b bVar, List list) {
        ViewGroup O;
        ObjectAnimator ofFloat;
        if (view instanceof ViewGroup) {
            boolean z3 = view instanceof c;
            View findViewById = view.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                O = O(findViewById);
            } else if (!(view instanceof e) && !(view instanceof f.h.b.c.e0.d)) {
                O = O(view);
            } else {
                O = O(((ViewGroup) view).getChildAt(0));
            }
            if (O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    f.h.b.c.c.c.a.set(O, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(O, f.h.b.c.c.c.a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(O, f.h.b.c.c.c.a, 0.0f);
            }
            bVar.a.d("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofInt;
        if (view2 instanceof c) {
            c cVar = (c) view2;
            AtomicInteger atomicInteger = z.a;
            ColorStateList g2 = z.i.g(view);
            int colorForState = g2 != null ? g2.getColorForState(view.getDrawableState(), g2.getDefaultColor()) : 0;
            int i2 = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(colorForState);
                }
                ofInt = ObjectAnimator.ofInt(cVar, c.d.a, i2);
            } else {
                ofInt = ObjectAnimator.ofInt(cVar, c.d.a, colorForState);
            }
            ofInt.setEvaluator(f.h.b.c.c.b.a);
            bVar.a.d("color").a(ofInt);
            list.add(ofInt);
        }
    }

    public final void L(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        AtomicInteger atomicInteger = z.a;
        float i2 = z.i.i(view2) - z.i.i(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-i2);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -i2);
        }
        bVar.a.d("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void M(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float F = F(view, view2, bVar.b);
        float G = G(view, view2, bVar.b);
        Pair<h, h> E = E(F, G, z, bVar);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float H = H(bVar, hVar, -F, 0.0f);
            float H2 = H(bVar, hVar2, -G, 0.0f);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f1257d;
            rectF2.set(rect);
            RectF rectF3 = this.f1258e;
            I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -F);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -G);
        }
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public abstract b N(Context context, boolean z);

    public final ViewGroup O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        if (fVar.f319h == 0) {
            fVar.f319h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f1257d = new RectF();
        this.f1258e = new RectF();
        this.f1259f = new int[2];
    }
}
