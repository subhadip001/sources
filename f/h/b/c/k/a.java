package f.h.b.c.k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.video_converter.video_compressor.R;
import f.h.b.c.b;
import f.h.b.c.s.r;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes.dex */
public class a extends AppCompatCheckBox {

    /* renamed from: m  reason: collision with root package name */
    public static final int[][] f5296m = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5297j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5298k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5299l;

    public a(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.checkboxStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d2 = r.d(context2, attributeSet, b.u, R.attr.checkboxStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(f.h.b.c.a.n0(context2, d2, 0));
        }
        this.f5298k = d2.getBoolean(2, false);
        this.f5299l = d2.getBoolean(1, true);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5297j == null) {
            int[][] iArr = f5296m;
            int[] iArr2 = new int[iArr.length];
            int m0 = f.h.b.c.a.m0(this, R.attr.colorControlActivated);
            int m02 = f.h.b.c.a.m0(this, R.attr.colorSurface);
            int m03 = f.h.b.c.a.m0(this, R.attr.colorOnSurface);
            iArr2[0] = f.h.b.c.a.D0(m02, m0, 1.0f);
            iArr2[1] = f.h.b.c.a.D0(m02, m03, 0.54f);
            iArr2[2] = f.h.b.c.a.D0(m02, m03, 0.38f);
            iArr2[3] = f.h.b.c.a.D0(m02, m03, 0.38f);
            this.f5297j = new ColorStateList(iArr, iArr2);
        }
        return this.f5297j;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5298k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable y;
        if (this.f5299l && TextUtils.isEmpty(getText()) && (y = e.i.a.y(this)) != null) {
            int width = ((getWidth() - y.getIntrinsicWidth()) / 2) * (f.h.b.c.a.y0(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = y.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f5299l = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f5298k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
