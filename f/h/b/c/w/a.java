package f.h.b.c.w;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.n;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes.dex */
public class a extends Drawable implements n, e.i.d.m.a {

    /* renamed from: f  reason: collision with root package name */
    public b f5462f;

    public a(j jVar) {
        this.f5462f = new b(new g(jVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f5462f;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5462f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5462f.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5462f = new b(this.f5462f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5462f.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f5462f.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c = f.h.b.c.w.b.c(iArr);
        b bVar = this.f5462f;
        if (bVar.b != c) {
            bVar.b = c;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f5462f.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5462f.a.setColorFilter(colorFilter);
    }

    @Override // f.h.b.c.y.n
    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.f5462f.a;
        gVar.f5480f.a = jVar;
        gVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        this.f5462f.a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5462f.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5462f.a.setTintMode(mode);
    }

    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {
        public g a;
        public boolean b;

        public b(g gVar) {
            this.a = gVar;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(new b(this), null);
        }

        public b(b bVar) {
            this.a = (g) bVar.a.f5480f.newDrawable();
            this.b = bVar.b;
        }
    }

    public a(b bVar, C0128a c0128a) {
        this.f5462f = bVar;
    }
}
