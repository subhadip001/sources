package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: f  reason: collision with root package name */
    public final e f1721f;

    /* renamed from: g  reason: collision with root package name */
    public final y f1722g;

    /* renamed from: h  reason: collision with root package name */
    public l f1723h;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1721f = eVar;
        eVar.d(attributeSet, 16842827);
        y yVar = new y(this);
        this.f1722g = yVar;
        yVar.e(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private l getEmojiTextViewHelper() {
        if (this.f1723h == null) {
            this.f1723h = new l(this);
        }
        return this.f1723h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1721f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1722g;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1721f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1721f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1721f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1721f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().b.a.d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().b.a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1721f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1721f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
