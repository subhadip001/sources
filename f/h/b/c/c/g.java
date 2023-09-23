package f.h.b.c.c;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec.java */
/* loaded from: classes.dex */
public class g {
    public final e.f.h<String, h> a = new e.f.h<>();
    public final e.f.h<String, PropertyValuesHolder[]> b = new e.f.h<>();

    public static g a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return c(arrayList);
            }
            return null;
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("Can't load animation resource ID #0x");
            A.append(Integer.toHexString(i2));
            Log.w("MotionSpec", A.toString(), e2);
            return null;
        }
    }

    public static g c(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f5223d;
                    }
                } else {
                    interpolator = a.b;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f5225d = objectAnimator.getRepeatCount();
                hVar.f5226e = objectAnimator.getRepeatMode();
                gVar.a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public h d(String str) {
        if (this.a.getOrDefault(str, null) != null) {
            return this.a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.a.equals(((g) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
