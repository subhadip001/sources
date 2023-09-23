package e.u.b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class r extends RecyclerView.w {

    /* renamed from: k  reason: collision with root package name */
    public PointF f2929k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2930l;
    public float n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2927i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2928j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f2931m = false;
    public int o = 0;
    public int p = 0;

    public r(Context context) {
        this.f2930l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f2929k;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i4 > 0 ? 1 : -1;
        RecyclerView.m mVar = this.c;
        if (mVar == null || !mVar.g()) {
            i2 = 0;
        } else {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            i2 = e(mVar.E(view) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, mVar.H(view) + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.P(), mVar.p - mVar.Q(), i6);
        }
        PointF pointF2 = this.f2929k;
        int i7 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.m mVar2 = this.c;
        if (mVar2 != null && mVar2.h()) {
            RecyclerView.n nVar2 = (RecyclerView.n) view.getLayoutParams();
            i5 = e(mVar2.I(view) - ((ViewGroup.MarginLayoutParams) nVar2).topMargin, mVar2.D(view) + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin, mVar2.R(), mVar2.q - mVar2.O(), i7);
        }
        int ceil = (int) Math.ceil(g((int) Math.sqrt((i5 * i5) + (i2 * i2))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i2, -i5, ceil, this.f2928j);
        }
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 == 1) {
                    return i5 - i3;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        }
        return i4 - i2;
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i2) {
        float abs = Math.abs(i2);
        if (!this.f2931m) {
            this.n = f(this.f2930l);
            this.f2931m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }
}
