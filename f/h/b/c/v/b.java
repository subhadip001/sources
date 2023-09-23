package f.h.b.c.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import e.i.c.d.j;

/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public class b {
    public final ColorStateList a;
    public final String b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5451d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5452e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5453f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5454g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5455h;

    /* renamed from: i  reason: collision with root package name */
    public final float f5456i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5457j;

    /* renamed from: k  reason: collision with root package name */
    public float f5458k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5459l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5460m = false;
    public Typeface n;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes.dex */
    public class a extends j.c {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // e.i.c.d.j.c
        public void d(int i2) {
            b.this.f5460m = true;
            this.a.a(i2);
        }

        @Override // e.i.c.d.j.c
        public void e(Typeface typeface) {
            b bVar = b.this;
            bVar.n = Typeface.create(typeface, bVar.c);
            b bVar2 = b.this;
            bVar2.f5460m = true;
            this.a.b(bVar2.n, false);
        }
    }

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, f.h.b.c.b.H);
        this.f5458k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f5457j = f.h.b.c.a.n0(context, obtainStyledAttributes, 3);
        f.h.b.c.a.n0(context, obtainStyledAttributes, 4);
        f.h.b.c.a.n0(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.f5451d = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f5459l = obtainStyledAttributes.getResourceId(i3, 0);
        this.b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = f.h.b.c.a.n0(context, obtainStyledAttributes, 6);
        this.f5452e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f5453f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f5454g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, f.h.b.c.b.x);
        this.f5455h = obtainStyledAttributes2.hasValue(0);
        this.f5456i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.n == null && (str = this.b) != null) {
            this.n = Typeface.create(str, this.c);
        }
        if (this.n == null) {
            int i2 = this.f5451d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, this.c);
        }
    }

    public Typeface b(Context context) {
        if (this.f5460m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = j.a(context, this.f5459l);
                this.n = a2;
                if (a2 != null) {
                    this.n = Typeface.create(a2, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                StringBuilder A = f.a.b.a.a.A("Error loading font ");
                A.append(this.b);
                Log.d("TextAppearance", A.toString(), e2);
            }
        }
        a();
        this.f5460m = true;
        return this.n;
    }

    public void c(Context context, d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f5459l;
        if (i2 == 0) {
            this.f5460m = true;
        }
        if (this.f5460m) {
            dVar.b(this.n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = j.a;
            if (context.isRestricted()) {
                aVar.a(-4, null);
            } else {
                j.b(context, i2, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f5460m = true;
            dVar.a(1);
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("Error loading font ");
            A.append(this.b);
            Log.d("TextAppearance", A.toString(), e2);
            this.f5460m = true;
            dVar.a(-3);
        }
    }

    public final boolean d(Context context) {
        int i2 = this.f5459l;
        Typeface typeface = null;
        if (i2 != 0) {
            ThreadLocal<TypedValue> threadLocal = j.a;
            if (!context.isRestricted()) {
                typeface = j.b(context, i2, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f5457j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f5454g;
        float f3 = this.f5452e;
        float f4 = this.f5453f;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface H0 = f.h.b.c.a.H0(context.getResources().getConfiguration(), typeface);
        if (H0 != null) {
            typeface = H0;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f5458k);
        if (this.f5455h) {
            textPaint.setLetterSpacing(this.f5456i);
        }
    }
}
