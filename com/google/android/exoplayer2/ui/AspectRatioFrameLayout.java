package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.h.b.b.e2.k;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public final c f934f;

    /* renamed from: g  reason: collision with root package name */
    public b f935g;

    /* renamed from: h  reason: collision with root package name */
    public float f936h;

    /* renamed from: i  reason: collision with root package name */
    public int f937i;

    /* loaded from: classes.dex */
    public interface b {
        void a(float f2, float f3, boolean z);
    }

    /* loaded from: classes.dex */
    public final class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public float f938f;

        /* renamed from: g  reason: collision with root package name */
        public float f939g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f940h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f941i;

        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f941i = false;
            b bVar = AspectRatioFrameLayout.this.f935g;
            if (bVar == null) {
                return;
            }
            bVar.a(this.f938f, this.f939g, this.f940h);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f937i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.a, 0, 0);
            try {
                this.f937i = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f934f = new c(null);
    }

    public int getResizeMode() {
        return this.f937i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.f936h <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = f4 / f5;
        float f7 = (this.f936h / f6) - 1.0f;
        if (Math.abs(f7) <= 0.01f) {
            c cVar = this.f934f;
            cVar.f938f = this.f936h;
            cVar.f939g = f6;
            cVar.f940h = false;
            if (cVar.f941i) {
                return;
            }
            cVar.f941i = true;
            AspectRatioFrameLayout.this.post(cVar);
            return;
        }
        int i4 = this.f937i;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f2 = this.f936h;
                } else if (i4 == 4) {
                    if (f7 > 0.0f) {
                        f2 = this.f936h;
                    } else {
                        f3 = this.f936h;
                    }
                }
                measuredWidth = (int) (f5 * f2);
            } else {
                f3 = this.f936h;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f7 > 0.0f) {
            f3 = this.f936h;
            measuredHeight = (int) (f4 / f3);
        } else {
            f2 = this.f936h;
            measuredWidth = (int) (f5 * f2);
        }
        c cVar2 = this.f934f;
        cVar2.f938f = this.f936h;
        cVar2.f939g = f6;
        cVar2.f940h = true;
        if (!cVar2.f941i) {
            cVar2.f941i = true;
            AspectRatioFrameLayout.this.post(cVar2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(measuredHeight, CommonUtils.BYTES_IN_A_GIGABYTE));
    }

    public void setAspectRatio(float f2) {
        if (this.f936h != f2) {
            this.f936h = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f935g = bVar;
    }

    public void setResizeMode(int i2) {
        if (this.f937i != i2) {
            this.f937i = i2;
            requestLayout();
        }
    }
}
