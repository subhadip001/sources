package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import f.h.b.c.a;
import f.h.b.c.b;
import f.h.b.c.d0.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ClockFaceView extends c implements ClockHandView.c {
    public final ClockHandView C;
    public final Rect D;
    public final RectF E;
    public final SparseArray<TextView> F;
    public final e.i.j.c G;
    public final int[] H;
    public final float[] I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public String[] N;
    public float O;
    public final ColorStateList P;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.D = new Rect();
        this.E = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.F = sparseArray;
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f5155h, R.attr.materialClockStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList n0 = a.n0(context, obtainStyledAttributes, 1);
        this.P = n0;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.C = clockHandView;
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = n0.getColorForState(new int[]{16842913}, n0.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, n0.getDefaultColor()};
        clockHandView.f1249k.add(this);
        int defaultColor = e.i.c.a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList n02 = a.n0(context, obtainStyledAttributes, 0);
        setBackgroundColor(n02 != null ? n02.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new f.h.b.c.d0.a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.G = new f.h.b.c.d0.b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.N = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.N.length, size); i2++) {
            TextView textView = this.F.get(i2);
            if (i2 >= this.N.length) {
                removeView(textView);
                this.F.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.F.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.N[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                z.w(textView, this.G);
                textView.setTextColor(this.P);
            }
        }
        this.K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.M = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f2, boolean z) {
        if (Math.abs(this.O - f2) > 0.001f) {
            this.O = f2;
            t();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, this.N.length, false, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.M / Math.max(Math.max(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, CommonUtils.BYTES_IN_A_GIGABYTE);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RectF rectF = this.C.o;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            TextView textView = this.F.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.D);
                offsetDescendantRectToMyCoords(textView, this.D);
                textView.setSelected(rectF.contains(this.D.centerX(), this.D.centerY()));
                this.E.set(this.D);
                this.E.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.E) ? null : new RadialGradient(rectF.centerX() - this.E.left, rectF.centerY() - this.E.top, 0.5f * rectF.width(), this.H, this.I, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
