package f.h.b.c.j;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.b;
import f.h.b.c.y.d;
import f.h.b.c.y.e;
import f.h.b.c.y.g;
import f.h.b.c.y.i;
import f.h.b.c.y.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes.dex */
public class a {
    public static final double u = Math.cos(Math.toRadians(45.0d));
    public static final Drawable v;
    public final MaterialCardView a;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final g f5286d;

    /* renamed from: e  reason: collision with root package name */
    public int f5287e;

    /* renamed from: f  reason: collision with root package name */
    public int f5288f;

    /* renamed from: g  reason: collision with root package name */
    public int f5289g;

    /* renamed from: h  reason: collision with root package name */
    public int f5290h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f5291i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f5292j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5293k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5294l;

    /* renamed from: m  reason: collision with root package name */
    public j f5295m;
    public ColorStateList n;
    public Drawable o;
    public LayerDrawable p;
    public g q;
    public g r;
    public boolean t;
    public final Rect b = new Rect();
    public boolean s = false;

    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: f.h.b.c.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0121a extends InsetDrawable {
        public C0121a(a aVar, Drawable drawable, int i2, int i3, int i4, int i5) {
            super(drawable, i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        v = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i2, i3);
        this.c = gVar;
        gVar.o(materialCardView.getContext());
        gVar.t(-12303292);
        j jVar = gVar.f5480f.a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, b.f5152e, i2, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            bVar.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f5286d = new g();
        i(bVar.a());
        obtainStyledAttributes.recycle();
    }

    public final float a() {
        float b = b(this.f5295m.a, this.c.m());
        d dVar = this.f5295m.b;
        g gVar = this.c;
        float max = Math.max(b, b(dVar, gVar.f5480f.a.f5501f.a(gVar.i())));
        d dVar2 = this.f5295m.c;
        g gVar2 = this.c;
        float b2 = b(dVar2, gVar2.f5480f.a.f5502g.a(gVar2.i()));
        d dVar3 = this.f5295m.f5499d;
        g gVar3 = this.c;
        return Math.max(max, Math.max(b2, b(dVar3, gVar3.f5480f.a.f5503h.a(gVar3.i()))));
    }

    public final float b(d dVar, float f2) {
        if (dVar instanceof i) {
            return (float) ((1.0d - u) * f2);
        }
        if (dVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float c() {
        return this.a.getMaxCardElevation() + (k() ? a() : 0.0f);
    }

    public final float d() {
        return (this.a.getMaxCardElevation() * 1.5f) + (k() ? a() : 0.0f);
    }

    public final Drawable e() {
        if (this.o == null) {
            int[] iArr = f.h.b.c.w.b.a;
            this.r = new g(this.f5295m);
            this.o = new RippleDrawable(this.f5293k, null, this.r);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.f5286d, this.f5292j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final Drawable f(Drawable drawable) {
        int i2;
        int i3;
        if (this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil(d());
            i2 = (int) Math.ceil(c());
            i3 = ceil;
        } else {
            i2 = 0;
            i3 = 0;
        }
        return new C0121a(this, drawable, i2, i3, i2, i3);
    }

    public void g(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.p != null) {
            if (this.a.getUseCompatPadding()) {
                i4 = (int) Math.ceil(d() * 2.0f);
                i5 = (int) Math.ceil(c() * 2.0f);
            } else {
                i4 = 0;
                i5 = 0;
            }
            int i12 = this.f5289g;
            int i13 = i12 & 8388613;
            if (i13 == 8388613) {
                i6 = ((i2 - this.f5287e) - this.f5288f) - i5;
            } else {
                i6 = this.f5287e;
            }
            int i14 = i12 & 80;
            if (i14 == 80) {
                i7 = this.f5287e;
            } else {
                i7 = ((i3 - this.f5287e) - this.f5288f) - i4;
            }
            int i15 = i7;
            if (i13 == 8388613) {
                i8 = this.f5287e;
            } else {
                i8 = ((i2 - this.f5287e) - this.f5288f) - i5;
            }
            if (i14 == 80) {
                i9 = ((i3 - this.f5287e) - this.f5288f) - i4;
            } else {
                i9 = this.f5287e;
            }
            MaterialCardView materialCardView = this.a;
            AtomicInteger atomicInteger = z.a;
            if (z.e.d(materialCardView) == 1) {
                i11 = i8;
                i10 = i6;
            } else {
                i10 = i8;
                i11 = i6;
            }
            this.p.setLayerInset(2, i11, i9, i10, i15);
        }
    }

    public void h(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = e.i.a.l0(drawable).mutate();
            this.f5292j = mutate;
            mutate.setTintList(this.f5294l);
            boolean isChecked = this.a.isChecked();
            Drawable drawable2 = this.f5292j;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? 255 : 0);
            }
        } else {
            this.f5292j = v;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f5292j);
        }
    }

    public void i(j jVar) {
        this.f5295m = jVar;
        g gVar = this.c;
        gVar.f5480f.a = jVar;
        gVar.invalidateSelf();
        g gVar2 = this.c;
        gVar2.B = !gVar2.p();
        g gVar3 = this.f5286d;
        if (gVar3 != null) {
            gVar3.f5480f.a = jVar;
            gVar3.invalidateSelf();
        }
        g gVar4 = this.r;
        if (gVar4 != null) {
            gVar4.f5480f.a = jVar;
            gVar4.invalidateSelf();
        }
        g gVar5 = this.q;
        if (gVar5 != null) {
            gVar5.f5480f.a = jVar;
            gVar5.invalidateSelf();
        }
    }

    public final boolean j() {
        return this.a.getPreventCornerOverlap() && !this.c.p();
    }

    public final boolean k() {
        return this.a.getPreventCornerOverlap() && this.c.p() && this.a.getUseCompatPadding();
    }

    public void l() {
        float f2 = 0.0f;
        float a = j() || k() ? a() : 0.0f;
        if (this.a.getPreventCornerOverlap() && this.a.getUseCompatPadding()) {
            f2 = (float) ((1.0d - u) * this.a.getCardViewRadius());
        }
        int i2 = (int) (a - f2);
        MaterialCardView materialCardView = this.a;
        Rect rect = this.b;
        materialCardView.e(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
    }

    public void m() {
        if (!this.s) {
            this.a.setBackgroundInternal(f(this.c));
        }
        this.a.setForeground(f(this.f5291i));
    }

    public final void n() {
        int[] iArr = f.h.b.c.w.b.a;
        Drawable drawable = this.o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f5293k);
            return;
        }
        g gVar = this.q;
        if (gVar != null) {
            gVar.r(this.f5293k);
        }
    }

    public void o() {
        this.f5286d.v(this.f5290h, this.n);
    }
}
