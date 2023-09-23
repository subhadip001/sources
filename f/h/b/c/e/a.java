package f.h.b.c.e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.arthenica.ffmpegkit.R;
import com.google.android.material.badge.BadgeState;
import e.i.j.z;
import f.h.b.c.s.p;
import f.h.b.c.s.r;
import f.h.b.c.v.b;
import f.h.b.c.y.g;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements p.b {

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<Context> f5248f;

    /* renamed from: g  reason: collision with root package name */
    public final g f5249g;

    /* renamed from: h  reason: collision with root package name */
    public final p f5250h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f5251i;

    /* renamed from: j  reason: collision with root package name */
    public final BadgeState f5252j;

    /* renamed from: k  reason: collision with root package name */
    public float f5253k;

    /* renamed from: l  reason: collision with root package name */
    public float f5254l;

    /* renamed from: m  reason: collision with root package name */
    public int f5255m;
    public float n;
    public float o;
    public float p;
    public WeakReference<View> q;
    public WeakReference<FrameLayout> r;

    public a(Context context, int i2, int i3, int i4, BadgeState.State state) {
        b bVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f5248f = weakReference;
        r.c(context, r.b, "Theme.MaterialComponents");
        this.f5251i = new Rect();
        g gVar = new g();
        this.f5249g = gVar;
        p pVar = new p(this);
        this.f5250h = pVar;
        pVar.a.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && pVar.f5442f != (bVar = new b(context3, R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = weakReference.get()) != null) {
            pVar.b(bVar, context2);
            g();
        }
        BadgeState badgeState = new BadgeState(context, i2, i3, i4, null);
        this.f5252j = badgeState;
        this.f5255m = ((int) Math.pow(10.0d, badgeState.b.f1068k - 1.0d)) - 1;
        pVar.f5440d = true;
        g();
        invalidateSelf();
        pVar.f5440d = true;
        g();
        invalidateSelf();
        pVar.a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState.b.f1064g.intValue());
        if (gVar.f5480f.f5488d != valueOf) {
            gVar.r(valueOf);
            invalidateSelf();
        }
        pVar.a.setColor(badgeState.b.f1065h.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.q;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.q.get();
            WeakReference<FrameLayout> weakReference3 = this.r;
            f(view, weakReference3 != null ? weakReference3.get() : null);
        }
        g();
        setVisible(badgeState.b.q.booleanValue(), false);
    }

    @Override // f.h.b.c.s.p.b
    public void a() {
        invalidateSelf();
    }

    public final String b() {
        if (d() <= this.f5255m) {
            return NumberFormat.getInstance(this.f5252j.b.f1069l).format(d());
        }
        Context context = this.f5248f.get();
        return context == null ? "" : String.format(this.f5252j.b.f1069l, context.getString(com.video_converter.video_compressor.R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f5255m), "+");
    }

    public FrameLayout c() {
        WeakReference<FrameLayout> weakReference = this.r;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int d() {
        if (e()) {
            return this.f5252j.b.f1067j;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f5249g.draw(canvas);
        if (e()) {
            Rect rect = new Rect();
            String b = b();
            this.f5250h.a.getTextBounds(b, 0, b.length(), rect);
            canvas.drawText(b, this.f5253k, this.f5254l + (rect.height() / 2), this.f5250h.a);
        }
    }

    public boolean e() {
        return this.f5252j.b.f1067j != -1;
    }

    public void f(View view, FrameLayout frameLayout) {
        this.q = new WeakReference<>(view);
        this.r = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        int intValue;
        int intValue2;
        float f2;
        float f3;
        Context context = this.f5248f.get();
        WeakReference<View> weakReference = this.q;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f5251i);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.r;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        if (e()) {
            intValue = this.f5252j.b.u.intValue();
        } else {
            intValue = this.f5252j.b.s.intValue();
        }
        int intValue3 = this.f5252j.b.w.intValue() + intValue;
        int intValue4 = this.f5252j.b.p.intValue();
        if (intValue4 != 8388691 && intValue4 != 8388693) {
            this.f5254l = rect2.top + intValue3;
        } else {
            this.f5254l = rect2.bottom - intValue3;
        }
        if (d() <= 9) {
            float f4 = !e() ? this.f5252j.c : this.f5252j.f1061d;
            this.n = f4;
            this.p = f4;
            this.o = f4;
        } else {
            float f5 = this.f5252j.f1061d;
            this.n = f5;
            this.p = f5;
            this.o = (this.f5250h.a(b()) / 2.0f) + this.f5252j.f1062e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(e() ? com.video_converter.video_compressor.R.dimen.mtrl_badge_text_horizontal_edge_offset : com.video_converter.video_compressor.R.dimen.mtrl_badge_horizontal_edge_offset);
        if (e()) {
            intValue2 = this.f5252j.b.t.intValue();
        } else {
            intValue2 = this.f5252j.b.r.intValue();
        }
        int intValue5 = this.f5252j.b.v.intValue() + intValue2;
        int intValue6 = this.f5252j.b.p.intValue();
        if (intValue6 != 8388659 && intValue6 != 8388691) {
            AtomicInteger atomicInteger = z.a;
            if (z.e.d(view) == 0) {
                f3 = ((rect2.right + this.o) - dimensionPixelSize) - intValue5;
            } else {
                f3 = (rect2.left - this.o) + dimensionPixelSize + intValue5;
            }
            this.f5253k = f3;
        } else {
            AtomicInteger atomicInteger2 = z.a;
            if (z.e.d(view) == 0) {
                f2 = (rect2.left - this.o) + dimensionPixelSize + intValue5;
            } else {
                f2 = ((rect2.right + this.o) - dimensionPixelSize) - intValue5;
            }
            this.f5253k = f2;
        }
        Rect rect3 = this.f5251i;
        float f6 = this.f5253k;
        float f7 = this.f5254l;
        float f8 = this.o;
        float f9 = this.p;
        rect3.set((int) (f6 - f8), (int) (f7 - f9), (int) (f6 + f8), (int) (f7 + f9));
        g gVar = this.f5249g;
        gVar.f5480f.a = gVar.f5480f.a.e(this.n);
        gVar.invalidateSelf();
        if (rect.equals(this.f5251i)) {
            return;
        }
        this.f5249g.setBounds(this.f5251i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5252j.b.f1066i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5251i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5251i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, f.h.b.c.s.p.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        BadgeState badgeState = this.f5252j;
        badgeState.a.f1066i = i2;
        badgeState.b.f1066i = i2;
        this.f5250h.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
