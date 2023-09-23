package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.video_converter.video_compressor.R;
import e.b.a;
import e.b.h.e;
import e.b.h.h;
import e.b.h.l;
import e.b.h.u0;
import e.b.h.w0;
import e.b.h.y;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox {

    /* renamed from: f  reason: collision with root package name */
    public final h f155f;

    /* renamed from: g  reason: collision with root package name */
    public final e f156g;

    /* renamed from: h  reason: collision with root package name */
    public final y f157h;

    /* renamed from: i  reason: collision with root package name */
    public l f158i;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private l getEmojiTextViewHelper() {
        if (this.f158i == null) {
            this.f158i = new l(this);
        }
        return this.f158i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f156g;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f157h;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f155f;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f156g;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f156g;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f155f;
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f155f;
        if (hVar != null) {
            return hVar.c;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b.a.c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f156g;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f156g;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f155f;
        if (hVar != null) {
            if (hVar.f1777f) {
                hVar.f1777f = false;
                return;
            }
            hVar.f1777f = true;
            hVar.a();
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
        e eVar = this.f156g;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f156g;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f155f;
        if (hVar != null) {
            hVar.b = colorStateList;
            hVar.f1775d = true;
            hVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f155f;
        if (hVar != null) {
            hVar.c = mode;
            hVar.f1776e = true;
            hVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        h hVar = new h(this);
        this.f155f = hVar;
        hVar.b(attributeSet, i2);
        e eVar = new e(this);
        this.f156g = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f157h = yVar;
        yVar.e(attributeSet, i2);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.b(getContext(), i2));
    }
}
