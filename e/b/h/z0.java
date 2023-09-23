package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.i.c.d.j;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class z0 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public z0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static z0 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 q(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0 || (colorStateList = e.i.c.a.getColorStateList(this.a, resourceId)) == null) ? this.b.getColorStateList(i2) : colorStateList;
    }

    public float d(int i2, float f2) {
        return this.b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (this.b.hasValue(i2) && (resourceId = this.b.getResourceId(i2, 0)) != 0) {
            return e.b.a.b(this.a, resourceId);
        }
        return this.b.getDrawable(i2);
    }

    public Drawable h(int i2) {
        int resourceId;
        Drawable g2;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        i a = i.a();
        Context context = this.a;
        synchronized (a) {
            g2 = a.a.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface i(int i2, int i3, j.c cVar) {
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        Context context = this.a;
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = e.i.c.d.j.a;
        if (context.isRestricted()) {
            return null;
        }
        return e.i.c.d.j.b(context, resourceId, typedValue, i3, cVar, null, true, false);
    }

    public int j(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String m(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence n(int i2) {
        return this.b.getText(i2);
    }

    public boolean o(int i2) {
        return this.b.hasValue(i2);
    }
}
