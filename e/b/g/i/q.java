package e.b.g.i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.video_converter.video_compressor.R;
import e.b.g.i.m;
import e.b.h.l0;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: g  reason: collision with root package name */
    public final Context f1690g;

    /* renamed from: h  reason: collision with root package name */
    public final g f1691h;

    /* renamed from: i  reason: collision with root package name */
    public final f f1692i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1693j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1694k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1695l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1696m;
    public final l0 n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public m.a t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final ViewTreeObserver.OnGlobalLayoutListener o = new a();
    public final View.OnAttachStateChangeListener p = new b();
    public int y = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (qVar.n.D) {
                    return;
                }
                View view = qVar.s;
                if (view != null && view.isShown()) {
                    q.this.n.h();
                } else {
                    q.this.dismiss();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.u = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.u.removeGlobalOnLayoutListener(qVar.o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f1690g = context;
        this.f1691h = gVar;
        this.f1693j = z;
        this.f1692i = new f(gVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f1695l = i2;
        this.f1696m = i3;
        Resources resources = context.getResources();
        this.f1694k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new l0(context, null, i2, i3);
        gVar.b(this, context);
    }

    @Override // e.b.g.i.p
    public boolean a() {
        return !this.v && this.n.a();
    }

    @Override // e.b.g.i.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f1691h) {
            return;
        }
        dismiss();
        m.a aVar = this.t;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // e.b.g.i.m
    public void c(boolean z) {
        this.w = false;
        f fVar = this.f1692i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // e.b.g.i.m
    public boolean d() {
        return false;
    }

    @Override // e.b.g.i.p
    public void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // e.b.g.i.m
    public void g(m.a aVar) {
        this.t = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    @Override // e.b.g.i.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc7
        Lb:
            boolean r0 = r7.v
            if (r0 != 0) goto Lc7
            android.view.View r0 = r7.r
            if (r0 != 0) goto L15
            goto Lc7
        L15:
            r7.s = r0
            e.b.h.l0 r0 = r7.n
            android.widget.PopupWindow r0 = r0.E
            r0.setOnDismissListener(r7)
            e.b.h.l0 r0 = r7.n
            r0.v = r7
            r0.s(r2)
            android.view.View r0 = r7.s
            android.view.ViewTreeObserver r3 = r7.u
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.u = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.o
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.p
            r0.addOnAttachStateChangeListener(r3)
            e.b.h.l0 r3 = r7.n
            r3.u = r0
            int r0 = r7.y
            r3.q = r0
            boolean r0 = r7.w
            r3 = 0
            if (r0 != 0) goto L5b
            e.b.g.i.f r0 = r7.f1692i
            android.content.Context r4 = r7.f1690g
            int r5 = r7.f1694k
            int r0 = e.b.g.i.k.p(r0, r3, r4, r5)
            r7.x = r0
            r7.w = r2
        L5b:
            e.b.h.l0 r0 = r7.n
            int r4 = r7.x
            r0.r(r4)
            e.b.h.l0 r0 = r7.n
            r4 = 2
            android.widget.PopupWindow r0 = r0.E
            r0.setInputMethodMode(r4)
            e.b.h.l0 r0 = r7.n
            android.graphics.Rect r4 = r7.f1678f
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L79
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L7a
        L79:
            r5 = r3
        L7a:
            r0.C = r5
            e.b.h.l0 r0 = r7.n
            r0.h()
            e.b.h.l0 r0 = r7.n
            e.b.h.f0 r0 = r0.f1799h
            r0.setOnKeyListener(r7)
            boolean r4 = r7.z
            if (r4 == 0) goto Lb9
            e.b.g.i.g r4 = r7.f1691h
            java.lang.CharSequence r4 = r4.f1660m
            if (r4 == 0) goto Lb9
            android.content.Context r4 = r7.f1690g
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131558418(0x7f0d0012, float:1.8742151E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb3
            e.b.g.i.g r6 = r7.f1691h
            java.lang.CharSequence r6 = r6.f1660m
            r5.setText(r6)
        Lb3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb9:
            e.b.h.l0 r0 = r7.n
            e.b.g.i.f r1 = r7.f1692i
            r0.p(r1)
            e.b.h.l0 r0 = r7.n
            r0.h()
            goto L8
        Lc7:
            if (r1 == 0) goto Lca
            return
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.q.h():void");
    }

    @Override // e.b.g.i.m
    public void j(Parcelable parcelable) {
    }

    @Override // e.b.g.i.p
    public ListView k() {
        return this.n.f1799h;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // e.b.g.i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(e.b.g.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            e.b.g.i.l r0 = new e.b.g.i.l
            android.content.Context r3 = r9.f1690g
            android.view.View r5 = r9.s
            boolean r6 = r9.f1693j
            int r7 = r9.f1695l
            int r8 = r9.f1696m
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            e.b.g.i.m$a r2 = r9.t
            r0.d(r2)
            boolean r2 = e.b.g.i.k.x(r10)
            r0.f1683h = r2
            e.b.g.i.k r3 = r0.f1685j
            if (r3 == 0) goto L2a
            r3.r(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.q
            r0.f1686k = r2
            r2 = 0
            r9.q = r2
            e.b.g.i.g r2 = r9.f1691h
            r2.c(r1)
            e.b.h.l0 r2 = r9.n
            int r3 = r2.f1802k
            boolean r4 = r2.n
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.f1803l
        L42:
            int r4 = r9.y
            android.view.View r5 = r9.r
            java.util.concurrent.atomic.AtomicInteger r6 = e.i.j.z.a
            int r5 = e.i.j.z.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.r
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f1681f
            if (r4 != 0) goto L6a
            r0 = 0
            goto L6e
        L6a:
            r0.e(r3, r2, r5, r5)
        L6d:
            r0 = 1
        L6e:
            if (r0 == 0) goto L78
            e.b.g.i.m$a r0 = r9.t
            if (r0 == 0) goto L77
            r0.c(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.i.q.l(e.b.g.i.r):boolean");
    }

    @Override // e.b.g.i.m
    public Parcelable m() {
        return null;
    }

    @Override // e.b.g.i.k
    public void n(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.v = true;
        this.f1691h.c(true);
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.k
    public void q(View view) {
        this.r = view;
    }

    @Override // e.b.g.i.k
    public void r(boolean z) {
        this.f1692i.f1647h = z;
    }

    @Override // e.b.g.i.k
    public void s(int i2) {
        this.y = i2;
    }

    @Override // e.b.g.i.k
    public void t(int i2) {
        this.n.f1802k = i2;
    }

    @Override // e.b.g.i.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // e.b.g.i.k
    public void v(boolean z) {
        this.z = z;
    }

    @Override // e.b.g.i.k
    public void w(int i2) {
        l0 l0Var = this.n;
        l0Var.f1803l = i2;
        l0Var.n = true;
    }
}
