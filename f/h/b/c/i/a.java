package f.h.b.c.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.w.b;
import f.h.b.c.y.g;
import f.h.b.c.y.j;
import f.h.b.c.y.n;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes.dex */
public class a {
    public static final boolean t;
    public static final boolean u;
    public final MaterialButton a;
    public j b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5276d;

    /* renamed from: e  reason: collision with root package name */
    public int f5277e;

    /* renamed from: f  reason: collision with root package name */
    public int f5278f;

    /* renamed from: g  reason: collision with root package name */
    public int f5279g;

    /* renamed from: h  reason: collision with root package name */
    public int f5280h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f5281i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5282j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5283k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5284l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f5285m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    static {
        int i2 = Build.VERSION.SDK_INT;
        t = true;
        u = i2 <= 22;
    }

    public a(MaterialButton materialButton, j jVar) {
        this.a = materialButton;
        this.b = jVar;
    }

    public n a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (n) this.r.getDrawable(2);
        }
        return (n) this.r.getDrawable(1);
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (t) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (g) this.r.getDrawable(!z ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(j jVar) {
        this.b = jVar;
        if (u && !this.o) {
            MaterialButton materialButton = this.a;
            AtomicInteger atomicInteger = z.a;
            int f2 = z.e.f(materialButton);
            int paddingTop = this.a.getPaddingTop();
            int e2 = z.e.e(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            g();
            z.e.k(this.a, f2, paddingTop, e2, paddingBottom);
            return;
        }
        if (b() != null) {
            g b = b();
            b.f5480f.a = jVar;
            b.invalidateSelf();
        }
        if (d() != null) {
            g d2 = d();
            d2.f5480f.a = jVar;
            d2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void f(int i2, int i3) {
        MaterialButton materialButton = this.a;
        AtomicInteger atomicInteger = z.a;
        int f2 = z.e.f(materialButton);
        int paddingTop = this.a.getPaddingTop();
        int e2 = z.e.e(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i4 = this.f5277e;
        int i5 = this.f5278f;
        this.f5278f = i3;
        this.f5277e = i2;
        if (!this.o) {
            g();
        }
        z.e.k(this.a, f2, (paddingTop + i2) - i4, e2, (paddingBottom + i3) - i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void g() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.a;
        g gVar = new g(this.b);
        gVar.o(this.a.getContext());
        gVar.setTintList(this.f5282j);
        PorterDuff.Mode mode = this.f5281i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        gVar.v(this.f5280h, this.f5283k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.u(this.f5280h, this.n ? f.h.b.c.a.m0(this.a, R.attr.colorSurface) : 0);
        if (t) {
            g gVar3 = new g(this.b);
            this.f5285m = gVar3;
            gVar3.setTint(-1);
            ?? rippleDrawable = new RippleDrawable(b.b(this.f5284l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.c, this.f5277e, this.f5276d, this.f5278f), this.f5285m);
            this.r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            f.h.b.c.w.a aVar = new f.h.b.c.w.a(this.b);
            this.f5285m = aVar;
            aVar.setTintList(b.b(this.f5284l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f5285m});
            this.r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.c, this.f5277e, this.f5276d, this.f5278f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g b = b();
        if (b != null) {
            b.q(this.s);
        }
    }

    public final void h() {
        g b = b();
        g d2 = d();
        if (b != null) {
            b.v(this.f5280h, this.f5283k);
            if (d2 != null) {
                d2.u(this.f5280h, this.n ? f.h.b.c.a.m0(this.a, R.attr.colorSurface) : 0);
            }
        }
    }
}
