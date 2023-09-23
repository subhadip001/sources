package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import e.i.c.d.j;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class y {
    public final TextView a;
    public x0 b;
    public x0 c;

    /* renamed from: d  reason: collision with root package name */
    public x0 f1857d;

    /* renamed from: e  reason: collision with root package name */
    public x0 f1858e;

    /* renamed from: f  reason: collision with root package name */
    public x0 f1859f;

    /* renamed from: g  reason: collision with root package name */
    public x0 f1860g;

    /* renamed from: h  reason: collision with root package name */
    public x0 f1861h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f1862i;

    /* renamed from: j  reason: collision with root package name */
    public int f1863j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1864k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1865l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1866m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends j.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.c = weakReference;
        }

        @Override // e.i.c.d.j.c
        public void d(int i2) {
        }

        @Override // e.i.c.d.j.c
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            y yVar = y.this;
            WeakReference weakReference = this.c;
            if (yVar.f1866m) {
                yVar.f1865l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    AtomicInteger atomicInteger = e.i.j.z.a;
                    if (z.g.b(textView)) {
                        textView.post(new z(yVar, textView, typeface, yVar.f1863j));
                    } else {
                        textView.setTypeface(typeface, yVar.f1863j);
                    }
                }
            }
        }
    }

    public y(TextView textView) {
        this.a = textView;
        this.f1862i = new a0(textView);
    }

    public static x0 c(Context context, i iVar, int i2) {
        ColorStateList d2 = iVar.d(context, i2);
        if (d2 != null) {
            x0 x0Var = new x0();
            x0Var.f1856d = true;
            x0Var.a = d2;
            return x0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        i.f(drawable, x0Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.f1857d != null || this.f1858e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f1857d);
            a(compoundDrawables[3], this.f1858e);
        }
        if (this.f1859f == null && this.f1860g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1859f);
        a(compoundDrawablesRelative[2], this.f1860g);
    }

    public boolean d() {
        a0 a0Var = this.f1862i;
        return a0Var.i() && a0Var.a != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.y.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String m2;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        z0 z0Var = new z0(context, context.obtainStyledAttributes(i2, e.b.b.y));
        if (z0Var.o(14)) {
            this.a.setAllCaps(z0Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (z0Var.o(3) && (c3 = z0Var.c(3)) != null) {
                this.a.setTextColor(c3);
            }
            if (z0Var.o(5) && (c2 = z0Var.c(5)) != null) {
                this.a.setLinkTextColor(c2);
            }
            if (z0Var.o(4) && (c = z0Var.c(4)) != null) {
                this.a.setHintTextColor(c);
            }
        }
        if (z0Var.o(0) && z0Var.f(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        m(context, z0Var);
        if (i3 >= 26 && z0Var.o(13) && (m2 = z0Var.m(13)) != null) {
            this.a.setFontVariationSettings(m2);
        }
        z0Var.b.recycle();
        Typeface typeface = this.f1865l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f1863j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        CharSequence subSequence;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
        int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
        int length = text.length();
        if (i5 >= 0 && i6 <= length) {
            int i7 = editorInfo.inputType & 4095;
            if (i7 == 129 || i7 == 225 || i7 == 18) {
                e.i.j.i0.a.b(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                e.i.j.i0.a.b(editorInfo, text, i5, i6);
                return;
            } else {
                int i8 = i6 - i5;
                int i9 = i8 > 1024 ? 0 : i8;
                int i10 = 2048 - i9;
                int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (i10 * 0.8d)));
                int min2 = Math.min(i5, i10 - min);
                int i11 = i5 - min2;
                if (e.i.j.i0.a.a(text, i11, 0)) {
                    i11++;
                    min2--;
                }
                if (e.i.j.i0.a.a(text, (i6 + min) - 1, 1)) {
                    min--;
                }
                int i12 = min2 + i9 + min;
                if (i9 != i8) {
                    subSequence = TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6));
                } else {
                    subSequence = text.subSequence(i11, i12 + i11);
                }
                int i13 = min2 + 0;
                e.i.j.i0.a.b(editorInfo, subSequence, i13, i9 + i13);
                return;
            }
        }
        e.i.j.i0.a.b(editorInfo, null, 0, 0);
    }

    public void h(int i2, int i3, int i4, int i5) {
        a0 a0Var = this.f1862i;
        if (a0Var.i()) {
            DisplayMetrics displayMetrics = a0Var.f1709j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void i(int[] iArr, int i2) {
        a0 a0Var = this.f1862i;
        if (a0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.f1709j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                a0Var.f1705f = a0Var.b(iArr2);
                if (!a0Var.h()) {
                    StringBuilder A = f.a.b.a.a.A("None of the preset sizes is valid: ");
                    A.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(A.toString());
                }
            } else {
                a0Var.f1706g = false;
            }
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void j(int i2) {
        a0 a0Var = this.f1862i;
        if (a0Var.i()) {
            if (i2 == 0) {
                a0Var.a = 0;
                a0Var.f1703d = -1.0f;
                a0Var.f1704e = -1.0f;
                a0Var.c = -1.0f;
                a0Var.f1705f = new int[0];
                a0Var.b = false;
            } else if (i2 == 1) {
                DisplayMetrics displayMetrics = a0Var.f1709j.getResources().getDisplayMetrics();
                a0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (a0Var.g()) {
                    a0Var.a();
                }
            } else {
                throw new IllegalArgumentException(f.a.b.a.a.i("Unknown auto-size text type: ", i2));
            }
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f1861h == null) {
            this.f1861h = new x0();
        }
        x0 x0Var = this.f1861h;
        x0Var.a = colorStateList;
        x0Var.f1856d = colorStateList != null;
        this.b = x0Var;
        this.c = x0Var;
        this.f1857d = x0Var;
        this.f1858e = x0Var;
        this.f1859f = x0Var;
        this.f1860g = x0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f1861h == null) {
            this.f1861h = new x0();
        }
        x0 x0Var = this.f1861h;
        x0Var.b = mode;
        x0Var.c = mode != null;
        this.b = x0Var;
        this.c = x0Var;
        this.f1857d = x0Var;
        this.f1858e = x0Var;
        this.f1859f = x0Var;
        this.f1860g = x0Var;
    }

    public final void m(Context context, z0 z0Var) {
        String m2;
        this.f1863j = z0Var.j(2, this.f1863j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int j2 = z0Var.j(11, -1);
            this.f1864k = j2;
            if (j2 != -1) {
                this.f1863j = (this.f1863j & 2) | 0;
            }
        }
        if (!z0Var.o(10) && !z0Var.o(12)) {
            if (z0Var.o(1)) {
                this.f1866m = false;
                int j3 = z0Var.j(1, 1);
                if (j3 == 1) {
                    this.f1865l = Typeface.SANS_SERIF;
                    return;
                } else if (j3 == 2) {
                    this.f1865l = Typeface.SERIF;
                    return;
                } else if (j3 != 3) {
                    return;
                } else {
                    this.f1865l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1865l = null;
        int i3 = z0Var.o(12) ? 12 : 10;
        int i4 = this.f1864k;
        int i5 = this.f1863j;
        if (!context.isRestricted()) {
            try {
                Typeface i6 = z0Var.i(i3, this.f1863j, new a(i4, i5, new WeakReference(this.a)));
                if (i6 != null) {
                    if (i2 >= 28 && this.f1864k != -1) {
                        this.f1865l = Typeface.create(Typeface.create(i6, 0), this.f1864k, (this.f1863j & 2) != 0);
                    } else {
                        this.f1865l = i6;
                    }
                }
                this.f1866m = this.f1865l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1865l != null || (m2 = z0Var.m(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1864k != -1) {
            this.f1865l = Typeface.create(Typeface.create(m2, 0), this.f1864k, (this.f1863j & 2) != 0);
        } else {
            this.f1865l = Typeface.create(m2, this.f1863j);
        }
    }
}
