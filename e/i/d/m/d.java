package e.i.d.m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: m  reason: collision with root package name */
    public static Method f2471m;

    public d(Drawable drawable) {
        super(drawable);
        e();
    }

    @Override // e.i.d.m.c
    public boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f2470k;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    public final void e() {
        if (f2471m == null) {
            try {
                f2471m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2470k.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2470k.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2470k;
        if (drawable != null && (method = f2471m) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        this.f2470k.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f2470k.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // e.i.d.m.c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // e.i.d.m.c, android.graphics.drawable.Drawable
    public void setTint(int i2) {
        if (c()) {
            super.setTint(i2);
        } else {
            this.f2470k.setTint(i2);
        }
    }

    @Override // e.i.d.m.c, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f2468i.c = colorStateList;
            d(getState());
            return;
        }
        this.f2470k.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f2468i.f2472d = mode;
            d(getState());
            return;
        }
        this.f2470k.setTintMode(mode);
    }

    public d(e eVar, Resources resources) {
        super(eVar, resources);
        e();
    }
}
