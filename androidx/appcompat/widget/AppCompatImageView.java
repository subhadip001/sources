package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.b.h.e;
import e.b.h.n;
import e.b.h.u0;
import e.b.h.w0;
import e.b.h.x0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final n mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x0 x0Var;
        n nVar = this.mImageHelper;
        if (nVar == null || (x0Var = nVar.b) == null) {
            return null;
        }
        return x0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x0 x0Var;
        n nVar = this.mImageHelper;
        if (nVar == null || (x0Var = nVar.b) == null) {
            return null;
        }
        return x0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.mImageHelper;
        if (nVar != null && drawable != null && !this.mHasLevel) {
            nVar.f1812d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        n nVar2 = this.mImageHelper;
        if (nVar2 != null) {
            nVar2.a();
            if (this.mHasLevel) {
                return;
            }
            n nVar3 = this.mImageHelper;
            if (nVar3.a.getDrawable() != null) {
                nVar3.a.getDrawable().setLevel(nVar3.f1812d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.mImageHelper;
        if (nVar != null) {
            nVar.e(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        this.mHasLevel = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i2);
        n nVar = new n(this);
        this.mImageHelper = nVar;
        nVar.b(attributeSet, i2);
    }
}
