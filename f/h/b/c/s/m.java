package f.h.b.c.s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.arthenica.ffmpegkit.R;
import e.i.j.f0;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ScrimInsetsFrameLayout.java */
/* loaded from: classes.dex */
public class m extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public Drawable f5424f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f5425g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f5426h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5427i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5428j;

    /* compiled from: ScrimInsetsFrameLayout.java */
    /* loaded from: classes.dex */
    public class a implements e.i.j.q {
        public a() {
        }

        @Override // e.i.j.q
        public f0 a(View view, f0 f0Var) {
            m mVar = m.this;
            if (mVar.f5425g == null) {
                mVar.f5425g = new Rect();
            }
            m.this.f5425g.set(f0Var.d(), f0Var.f(), f0Var.e(), f0Var.c());
            m.this.a(f0Var);
            m mVar2 = m.this;
            boolean z = true;
            if ((!f0Var.a.j().equals(e.i.d.b.f2450e)) && m.this.f5424f != null) {
                z = false;
            }
            mVar2.setWillNotDraw(z);
            m mVar3 = m.this;
            AtomicInteger atomicInteger = z.a;
            z.d.k(mVar3);
            return f0Var.a();
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(f0 f0Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f5425g == null || this.f5424f == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f5427i) {
            this.f5426h.set(0, 0, width, this.f5425g.top);
            this.f5424f.setBounds(this.f5426h);
            this.f5424f.draw(canvas);
        }
        if (this.f5428j) {
            this.f5426h.set(0, height - this.f5425g.bottom, width, height);
            this.f5424f.setBounds(this.f5426h);
            this.f5424f.draw(canvas);
        }
        Rect rect = this.f5426h;
        Rect rect2 = this.f5425g;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f5424f.setBounds(this.f5426h);
        this.f5424f.draw(canvas);
        Rect rect3 = this.f5426h;
        Rect rect4 = this.f5425g;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f5424f.setBounds(this.f5426h);
        this.f5424f.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f5424f;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f5424f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f5428j = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f5427i = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f5424f = drawable;
    }

    public m(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5426h = new Rect();
        this.f5427i = true;
        this.f5428j = true;
        int[] iArr = f.h.b.c.b.C;
        r.a(context, attributeSet, i2, R.style.Widget_Design_ScrimInsetsFrameLayout);
        r.b(context, attributeSet, iArr, i2, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.f5424f = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        AtomicInteger atomicInteger = z.a;
        z.i.u(this, aVar);
    }
}
