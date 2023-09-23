package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.video_converter.video_compressor.R;
import e.b.h.e;
import e.b.h.l;
import e.b.h.u0;
import e.b.h.w0;
import e.b.h.x0;
import e.b.h.y;
import e.i.a;
import e.i.k.b;
import e.i.k.i;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements b, i {

    /* renamed from: f  reason: collision with root package name */
    public final e f152f;

    /* renamed from: g  reason: collision with root package name */
    public final y f153g;

    /* renamed from: h  reason: collision with root package name */
    public l f154h;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f154h == null) {
            this.f154h = new l(this);
        }
        return this.f154h;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f152f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f153g;
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
        y yVar = this.f153g;
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
        y yVar = this.f153g;
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
        y yVar = this.f153g;
        return yVar != null ? yVar.f1862i.f1705f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f153g;
        if (yVar != null) {
            return yVar.f1862i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.k0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f152f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f152f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        x0 x0Var = this.f153g.f1861h;
        if (x0Var != null) {
            return x0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        x0 x0Var = this.f153g.f1861h;
        if (x0Var != null) {
            return x0Var.b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f153g;
        if (yVar == null || b.a) {
            return;
        }
        yVar.f1862i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f153g;
        if (yVar == null || b.a || !yVar.d()) {
            return;
        }
        this.f153g.f1862i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.h(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.j(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f152f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f152f;
        if (eVar != null) {
            eVar.f(i2);
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

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f152f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f152f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // e.i.k.i
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f153g.k(colorStateList);
        this.f153g.b();
    }

    @Override // e.i.k.i
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f153g.l(mode);
        this.f153g.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f153g;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z = b.a;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f153g;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.f1862i.f(i2, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f152f = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f153g = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }
}
