package f.e.a.l.s.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import f.e.a.l.o;
import f.e.a.l.s.g.g;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: f  reason: collision with root package name */
    public final a f3496f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3497g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3498h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3499i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3500j;

    /* renamed from: k  reason: collision with root package name */
    public int f3501k;

    /* renamed from: l  reason: collision with root package name */
    public int f3502l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3503m;
    public Paint n;
    public Rect o;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        public final g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, f.e.a.k.a aVar, o<Bitmap> oVar, int i2, int i3, Bitmap bitmap) {
        a aVar2 = new a(new g(f.e.a.b.b(context), aVar, i2, i3, oVar, bitmap));
        this.f3500j = true;
        this.f3502l = -1;
        this.f3496f = aVar2;
    }

    @Override // f.e.a.l.s.g.g.b
    public void a() {
        g gVar;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.f3496f.a.f3509i;
        if ((aVar != null ? aVar.f3515g : -1) == gVar.a.c() - 1) {
            this.f3501k++;
        }
        int i2 = this.f3502l;
        if (i2 == -1 || this.f3501k < i2) {
            return;
        }
        stop();
    }

    public Bitmap b() {
        return this.f3496f.a.f3512l;
    }

    public final Paint c() {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        return this.n;
    }

    public final void d() {
        f.c.a.a.i.d(!this.f3499i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3496f.a.a.c() == 1) {
            invalidateSelf();
        } else if (this.f3497g) {
        } else {
            this.f3497g = true;
            g gVar = this.f3496f.a;
            if (!gVar.f3510j) {
                if (!gVar.c.contains(this)) {
                    boolean isEmpty = gVar.c.isEmpty();
                    gVar.c.add(this);
                    if (isEmpty && !gVar.f3506f) {
                        gVar.f3506f = true;
                        gVar.f3510j = false;
                        gVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f3499i) {
            return;
        }
        if (this.f3503m) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.o == null) {
                this.o = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.o);
            this.f3503m = false;
        }
        g gVar = this.f3496f.a;
        g.a aVar = gVar.f3509i;
        if (aVar != null) {
            bitmap = aVar.f3517i;
        } else {
            bitmap = gVar.f3512l;
        }
        if (this.o == null) {
            this.o = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.o, c());
    }

    public final void e() {
        this.f3497g = false;
        g gVar = this.f3496f.a;
        gVar.c.remove(this);
        if (gVar.c.isEmpty()) {
            gVar.f3506f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3496f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3496f.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3496f.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3497g;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3503m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        f.c.a.a.i.d(!this.f3499i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3500j = z;
        if (!z) {
            e();
        } else if (this.f3498h) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3498h = true;
        this.f3501k = 0;
        if (this.f3500j) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3498h = false;
        e();
    }

    public c(a aVar) {
        this.f3500j = true;
        this.f3502l = -1;
        this.f3496f = aVar;
    }
}
