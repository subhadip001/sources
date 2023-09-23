package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.video_converter.video_compressor.R;
import e.e.c.b;
import e.e.c.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final c IMPL = new e.e.c.a();
    private final b mCardViewDelegate;
    private boolean mCompatPadding;
    public final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    public final Rect mShadowBounds;
    public int mUserSetMinHeight;
    public int mUserSetMinWidth;

    /* loaded from: classes.dex */
    public class a implements b {
        public Drawable a;

        public a() {
        }

        public boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void b(int i2, int i3, int i4, int i5) {
            CardView.this.mShadowBounds.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.h(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.c(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.g(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.d(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        c cVar = IMPL;
        if (!(cVar instanceof e.e.c.a)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.k(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        IMPL.m(this.mCardViewDelegate, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        IMPL.f(this.mCardViewDelegate, f2);
    }

    public void setContentPadding(int i2, int i3, int i4, int i5) {
        this.mContentPadding.set(i2, i3, i4, i5);
        IMPL.i(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f2) {
        IMPL.n(this.mCardViewDelegate, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.mUserSetMinHeight = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.mUserSetMinWidth = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.l(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f2) {
        IMPL.b(this.mCardViewDelegate, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.e(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.m(this.mCardViewDelegate, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a();
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.e.b.a, i2, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        IMPL.a(aVar, context, colorStateList, dimension, dimension2, f2);
    }
}
