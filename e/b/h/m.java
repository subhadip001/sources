package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.video_converter.video_compressor.R;

/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class m extends ImageButton {

    /* renamed from: f  reason: collision with root package name */
    public final e f1808f;

    /* renamed from: g  reason: collision with root package name */
    public final n f1809g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1810h;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1808f;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f1809g;
        if (nVar != null) {
            nVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1808f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1808f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x0 x0Var;
        n nVar = this.f1809g;
        if (nVar == null || (x0Var = nVar.b) == null) {
            return null;
        }
        return x0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x0 x0Var;
        n nVar = this.f1809g;
        if (nVar == null || (x0Var = nVar.b) == null) {
            return null;
        }
        return x0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f1809g.a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1808f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1808f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f1809g;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n nVar = this.f1809g;
        if (nVar != null && drawable != null && !this.f1810h) {
            nVar.f1812d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        n nVar2 = this.f1809g;
        if (nVar2 != null) {
            nVar2.a();
            if (this.f1810h) {
                return;
            }
            n nVar3 = this.f1809g;
            if (nVar3.a.getDrawable() != null) {
                nVar3.a.getDrawable().setLevel(nVar3.f1812d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f1810h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f1809g.c(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f1809g;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1808f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1808f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f1809g;
        if (nVar != null) {
            nVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f1809g;
        if (nVar != null) {
            nVar.e(mode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        this.f1810h = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1808f = eVar;
        eVar.d(attributeSet, i2);
        n nVar = new n(this);
        this.f1809g = nVar;
        nVar.b(attributeSet, i2);
    }
}
