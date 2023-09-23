package f.h.b.c.c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming.java */
/* loaded from: classes.dex */
public class h {
    public long a;
    public long b;
    public TimeInterpolator c;

    /* renamed from: d  reason: collision with root package name */
    public int f5225d;

    /* renamed from: e  reason: collision with root package name */
    public int f5226e;

    public h(long j2, long j3) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.f5225d = 0;
        this.f5226e = 1;
        this.a = j2;
        this.b = j3;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f5225d);
            valueAnimator.setRepeatMode(this.f5226e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a == hVar.a && this.b == hVar.b && this.f5225d == hVar.f5225d && this.f5226e == hVar.f5226e) {
                return b().getClass().equals(hVar.b().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f5225d) * 31) + this.f5226e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f5225d);
        sb.append(" repeatMode: ");
        return f.a.b.a.a.t(sb, this.f5226e, "}\n");
    }

    public h(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.f5225d = 0;
        this.f5226e = 1;
        this.a = j2;
        this.b = j3;
        this.c = timeInterpolator;
    }
}
