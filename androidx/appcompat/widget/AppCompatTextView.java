package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e.b.h.e;
import e.b.h.l;
import e.b.h.u0;
import e.b.h.w0;
import e.b.h.x;
import e.b.h.x0;
import e.b.h.y;
import e.i.a;
import e.i.h.b;
import e.i.k.b;
import e.i.k.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements i, b {

    /* renamed from: f  reason: collision with root package name */
    public final e f179f;

    /* renamed from: g  reason: collision with root package name */
    public final y f180g;

    /* renamed from: h  reason: collision with root package name */
    public final x f181h;

    /* renamed from: i  reason: collision with root package name */
    public l f182i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f183j;

    /* renamed from: k  reason: collision with root package name */
    public Future<e.i.h.b> f184k;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private l getEmojiTextViewHelper() {
        if (this.f182i == null) {
            this.f182i = new l(this);
        }
        return this.f182i;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f179f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f180g;
        if (yVar != null) {
            return Math.round(yVar.f1862i.f1704e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f180g;
        if (yVar != null) {
            return Math.round(yVar.f1862i.f1703d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f180g;
        if (yVar != null) {
            return Math.round(yVar.f1862i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f180g;
        return yVar != null ? yVar.f1862i.f1705f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f180g;
        if (yVar != null) {
            return yVar.f1862i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.k0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f179f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f179f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x0 x0Var = this.f180g.f1861h;
        if (x0Var != null) {
            return x0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x0 x0Var = this.f180g.f1861h;
        if (x0Var != null) {
            return x0Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<e.i.h.b> future = this.f184k;
        if (future != null) {
            try {
                this.f184k = null;
                a.a0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.f181h) != null) {
            return xVar.a();
        }
        return super.getTextClassifier();
    }

    public b.a getTextMetricsParamsCompat() {
        return a.F(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f180g.g(this, onCreateInputConnection, editorInfo);
        e.b.a.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f180g;
        if (yVar == null || e.i.k.b.a) {
            return;
        }
        yVar.f1862i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future<e.i.h.b> future = this.f184k;
        if (future != null) {
            try {
                this.f184k = null;
                a.a0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f180g;
        if (yVar == null || e.i.k.b.a || !yVar.d()) {
            return;
        }
        this.f180g.f1862i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (e.i.k.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.h(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (e.i.k.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (e.i.k.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.j(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f179f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f179f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.m0(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().b.a.d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().b.a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            a.V(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            a.W(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        a.Y(this, i2);
    }

    public void setPrecomputedText(e.i.h.b bVar) {
        a.a0(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f179f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f179f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e.i.k.i
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f180g.k(colorStateList);
        this.f180g.b();
    }

    @Override // e.i.k.i
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f180g.l(mode);
        this.f180g.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.f181h) != null) {
            xVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<e.i.h.b> future) {
        this.f184k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i3 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        if (i2 < 23) {
            float textScaleX = aVar.a.getTextScaleX();
            getPaint().set(aVar.a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.f2506d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z = e.i.k.b.a;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f180g;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.f1862i.f(i2, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        if (this.f183j) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i2 > 0) {
            Context context = getContext();
            e.i.d.l lVar = e.i.d.e.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i2);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.f183j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f183j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        this.f183j = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f179f = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f180g = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        this.f181h = new x(this);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? e.b.a.b(context, i2) : null, i3 != 0 ? e.b.a.b(context, i3) : null, i4 != 0 ? e.b.a.b(context, i4) : null, i5 != 0 ? e.b.a.b(context, i5) : null);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? e.b.a.b(context, i2) : null, i3 != 0 ? e.b.a.b(context, i3) : null, i4 != 0 ? e.b.a.b(context, i4) : null, i5 != 0 ? e.b.a.b(context, i5) : null);
        y yVar = this.f180g;
        if (yVar != null) {
            yVar.b();
        }
    }
}
