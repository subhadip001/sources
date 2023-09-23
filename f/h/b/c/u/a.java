package f.h.b.c.u;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.video_converter.video_compressor.R;
import e.b.h.r;
import f.h.b.c.b;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes.dex */
public class a extends r {

    /* renamed from: l  reason: collision with root package name */
    public static final int[][] f5448l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5449j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5450k;

    public a(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.radioButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d2 = f.h.b.c.s.r.d(context2, attributeSet, b.v, R.attr.radioButtonStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(f.h.b.c.a.n0(context2, d2, 0));
        }
        this.f5450k = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5449j == null) {
            int m0 = f.h.b.c.a.m0(this, R.attr.colorControlActivated);
            int m02 = f.h.b.c.a.m0(this, R.attr.colorOnSurface);
            int m03 = f.h.b.c.a.m0(this, R.attr.colorSurface);
            int[][] iArr = f5448l;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = f.h.b.c.a.D0(m03, m0, 1.0f);
            iArr2[1] = f.h.b.c.a.D0(m03, m02, 0.54f);
            iArr2[2] = f.h.b.c.a.D0(m03, m02, 0.38f);
            iArr2[3] = f.h.b.c.a.D0(m03, m02, 0.38f);
            this.f5449j = new ColorStateList(iArr, iArr2);
        }
        return this.f5449j;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5450k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5450k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
