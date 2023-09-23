package e.b.g.i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.video_converter.video_compressor.R;
import e.b.g.i.m;
import e.i.j.z;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {
    public final Context a;
    public final g b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1679d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1680e;

    /* renamed from: f  reason: collision with root package name */
    public View f1681f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1683h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1684i;

    /* renamed from: j  reason: collision with root package name */
    public k f1685j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1686k;

    /* renamed from: g  reason: collision with root package name */
    public int f1682g = 8388611;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f1687l = new a();

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.a = context;
        this.b = gVar;
        this.f1681f = view;
        this.c = z;
        this.f1679d = i2;
        this.f1680e = i3;
    }

    public k a() {
        k qVar;
        if (this.f1685j == null) {
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                qVar = new d(this.a, this.f1681f, this.f1679d, this.f1680e, this.c);
            } else {
                qVar = new q(this.a, this.b, this.f1681f, this.f1679d, this.f1680e, this.c);
            }
            qVar.n(this.b);
            qVar.u(this.f1687l);
            qVar.q(this.f1681f);
            qVar.g(this.f1684i);
            qVar.r(this.f1683h);
            qVar.s(this.f1682g);
            this.f1685j = qVar;
        }
        return this.f1685j;
    }

    public boolean b() {
        k kVar = this.f1685j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.f1685j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1686k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.f1684i = aVar;
        k kVar = this.f1685j;
        if (kVar != null) {
            kVar.g(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.v(z2);
        if (z) {
            int i4 = this.f1682g;
            View view = this.f1681f;
            AtomicInteger atomicInteger = z.a;
            if ((Gravity.getAbsoluteGravity(i4, z.e.d(view)) & 7) == 5) {
                i2 -= this.f1681f.getWidth();
            }
            a2.t(i2);
            a2.w(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f1678f = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.h();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f1681f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
