package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.b;
import f.h.b.c.c0.a.a;
import f.h.b.c.s.r;
import f.h.b.c.s.s;
import f.h.b.c.y.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;
    public boolean a0;
    public boolean b0;
    public ImageView.ScaleType c0;
    public Boolean d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Toolbar), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray d2 = r.d(context2, attributeSet, b.z, R.attr.toolbarStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (d2.hasValue(2)) {
            setNavigationIconTint(d2.getColor(2, -1));
        }
        this.a0 = d2.getBoolean(4, false);
        this.b0 = d2.getBoolean(3, false);
        int i2 = d2.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = e0;
            if (i2 < scaleTypeArr.length) {
                this.c0 = scaleTypeArr[i2];
            }
        }
        if (d2.hasValue(0)) {
            this.d0 = Boolean.valueOf(d2.getBoolean(0, false));
        }
        d2.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.r(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.f5480f.b = new f.h.b.c.p.a(context2);
            gVar.z();
            AtomicInteger atomicInteger = z.a;
            gVar.q(z.i.i(this));
            z.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            f.h.b.c.a.V0(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.a0 || this.b0) {
            List<TextView> a = s.a(this, getTitle());
            TextView textView = ((ArrayList) a).isEmpty() ? null : (TextView) Collections.min(a, s.a);
            List<TextView> a2 = s.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a2).isEmpty() ? null : (TextView) Collections.max(a2, s.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.a0 && textView != null) {
                    x(textView, pair);
                }
                if (this.b0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f.h.b.c.a.T0(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.d0;
        if (bool == null || bool.booleanValue() != z) {
            this.d0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.c0 != scaleType) {
            this.c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = e.i.a.l0(drawable.mutate());
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.W = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            requestLayout();
        }
    }

    public final void x(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, CommonUtils.BYTES_IN_A_GIGABYTE), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }
}
