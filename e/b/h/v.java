package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
public class v extends q {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1850d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1851e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1852f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1853g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1854h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1855i;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.f1852f = null;
        this.f1853g = null;
        this.f1854h = false;
        this.f1855i = false;
        this.f1850d = seekBar;
    }

    @Override // e.b.h.q
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f1850d.getContext();
        int[] iArr = e.b.b.f1461g;
        z0 q = z0.q(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1850d;
        e.i.j.z.v(seekBar, seekBar.getContext(), iArr, attributeSet, q.b, i2, 0);
        Drawable h2 = q.h(0);
        if (h2 != null) {
            this.f1850d.setThumb(h2);
        }
        Drawable g2 = q.g(1);
        Drawable drawable = this.f1851e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1851e = g2;
        if (g2 != null) {
            g2.setCallback(this.f1850d);
            SeekBar seekBar2 = this.f1850d;
            AtomicInteger atomicInteger = e.i.j.z.a;
            e.i.a.X(g2, z.e.d(seekBar2));
            if (g2.isStateful()) {
                g2.setState(this.f1850d.getDrawableState());
            }
            c();
        }
        this.f1850d.invalidate();
        if (q.o(3)) {
            this.f1853g = e0.e(q.j(3, -1), this.f1853g);
            this.f1855i = true;
        }
        if (q.o(2)) {
            this.f1852f = q.c(2);
            this.f1854h = true;
        }
        q.b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1851e;
        if (drawable != null) {
            if (this.f1854h || this.f1855i) {
                Drawable l0 = e.i.a.l0(drawable.mutate());
                this.f1851e = l0;
                if (this.f1854h) {
                    l0.setTintList(this.f1852f);
                }
                if (this.f1855i) {
                    this.f1851e.setTintMode(this.f1853g);
                }
                if (this.f1851e.isStateful()) {
                    this.f1851e.setState(this.f1850d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1851e != null) {
            int max = this.f1850d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1851e.getIntrinsicWidth();
                int intrinsicHeight = this.f1851e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1851e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1850d.getWidth() - this.f1850d.getPaddingLeft()) - this.f1850d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1850d.getPaddingLeft(), this.f1850d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1851e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
