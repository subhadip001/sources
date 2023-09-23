package f.h.b.c.d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.video_converter.video_compressor.R;
import e.g.c.c;
import e.i.j.z;
import f.h.b.c.y.g;
import f.h.b.c.y.h;
import f.h.b.c.y.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes.dex */
public class c extends ConstraintLayout {
    public int A;
    public g B;
    public final Runnable z;

    /* compiled from: RadialViewGroup.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = z.a;
            view.setId(z.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.z);
            handler.post(this.z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.z);
            handler.post(this.z);
        }
    }

    public void s() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if ("skip".equals(getChildAt(i3).getTag())) {
                i2++;
            }
        }
        e.g.c.c cVar = new e.g.c.c();
        cVar.c(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.A;
                if (!cVar.c.containsKey(Integer.valueOf(id))) {
                    cVar.c.put(Integer.valueOf(id), new c.a());
                }
                c.b bVar = cVar.c.get(Integer.valueOf(id)).f2130d;
                bVar.A = R.id.circle_center;
                bVar.B = i5;
                bVar.C = f2;
                f2 = (360.0f / (childCount - i2)) + f2;
            }
        }
        cVar.b(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.B.r(ColorStateList.valueOf(i2));
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.B = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f5480f.a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        bVar.f5509e = hVar;
        bVar.f5510f = hVar;
        bVar.f5511g = hVar;
        bVar.f5512h = hVar;
        gVar.f5480f.a = bVar.a();
        gVar.invalidateSelf();
        this.B.r(ColorStateList.valueOf(-1));
        g gVar2 = this.B;
        AtomicInteger atomicInteger = z.a;
        z.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.B, i2, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.z = new a();
        obtainStyledAttributes.recycle();
    }
}
