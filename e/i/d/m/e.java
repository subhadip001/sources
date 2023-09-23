package e.i.d.m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f2472d;

    public e(e eVar) {
        this.c = null;
        this.f2472d = c.f2464l;
        if (eVar != null) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.f2472d = eVar.f2472d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new d(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new d(this, resources);
    }
}
