package e.i.d.m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
public class c extends Drawable implements Drawable.Callback, b, a {

    /* renamed from: l  reason: collision with root package name */
    public static final PorterDuff.Mode f2464l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    public int f2465f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2466g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2467h;

    /* renamed from: i  reason: collision with root package name */
    public e f2468i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2469j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2470k;

    public c(e eVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f2468i = eVar;
        if (eVar == null || (constantState = eVar.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    @Override // e.i.d.m.b
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2470k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2470k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.f2468i;
            if (eVar != null) {
                eVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // e.i.d.m.b
    public final Drawable b() {
        return this.f2470k;
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            e eVar = this.f2468i;
            ColorStateList colorStateList = eVar.c;
            PorterDuff.Mode mode = eVar.f2472d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2467h || colorForState != this.f2465f || mode != this.f2466g) {
                    setColorFilter(colorForState, mode);
                    this.f2465f = colorForState;
                    this.f2466g = mode;
                    this.f2467h = true;
                    return true;
                }
            } else {
                this.f2467h = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2470k.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.f2468i;
        return changingConfigurations | (eVar != null ? eVar.getChangingConfigurations() : 0) | this.f2470k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        e eVar = this.f2468i;
        if (eVar != null) {
            if (eVar.b != null) {
                eVar.a = getChangingConfigurations();
                return this.f2468i;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2470k.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2470k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2470k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return e.i.a.A(this.f2470k);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2470k.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2470k.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2470k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2470k.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2470k.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2470k.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2470k.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        e eVar;
        ColorStateList colorStateList = (!c() || (eVar = this.f2468i) == null) ? null : eVar.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2470k.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2470k.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2469j && super.mutate() == this) {
            this.f2468i = new e(this.f2468i);
            Drawable drawable = this.f2470k;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.f2468i;
            if (eVar != null) {
                Drawable drawable2 = this.f2470k;
                eVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2469j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2470k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return e.i.a.X(this.f2470k, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        return this.f2470k.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2470k.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f2470k.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f2470k.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2470k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f2470k.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f2470k.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f2470k.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2470k.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public c(Drawable drawable) {
        this.f2468i = new e(this.f2468i);
        a(drawable);
    }
}
