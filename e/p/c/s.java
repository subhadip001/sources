package e.p.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class s extends AnimationSet implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f2774f;

    /* renamed from: g  reason: collision with root package name */
    public final View f2775g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2776h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2777i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2778j;

    public s(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2778j = true;
        this.f2774f = viewGroup;
        this.f2775g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation) {
        this.f2778j = true;
        if (this.f2776h) {
            return !this.f2777i;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2776h = true;
            e.i.j.t.a(this.f2774f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f2776h && this.f2778j) {
            this.f2778j = false;
            this.f2774f.post(this);
            return;
        }
        this.f2774f.endViewTransition(this.f2775g);
        this.f2777i = true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f2778j = true;
        if (this.f2776h) {
            return !this.f2777i;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f2776h = true;
            e.i.j.t.a(this.f2774f, this);
        }
        return true;
    }
}
