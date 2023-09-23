package f.h.b.b.e2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.logging.type.LogSeverity;
import com.video_converter.video_compressor.R;
import f.h.b.b.c1;
import f.h.b.b.d1;
import f.h.b.b.e1;
import f.h.b.b.e2.n;
import f.h.b.b.f1;
import f.h.b.b.g2.b0;
import f.h.b.b.i0;
import f.h.b.b.j0;
import f.h.b.b.q1;
import f.h.b.b.r0;
import f.h.b.b.u0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PlayerControlView.java */
/* loaded from: classes.dex */
public class i extends FrameLayout {
    public static final /* synthetic */ int k0 = 0;
    public final Drawable A;
    public final Drawable B;
    public final String C;
    public final String D;
    public final String E;
    public final Drawable F;
    public final Drawable G;
    public final float H;
    public final float I;
    public final String J;
    public final String K;
    public f1 L;
    public i0 M;
    public c N;
    public d1 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public long e0;

    /* renamed from: f  reason: collision with root package name */
    public final b f4119f;
    public long[] f0;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f4120g;
    public boolean[] g0;

    /* renamed from: h  reason: collision with root package name */
    public final View f4121h;
    public long[] h0;

    /* renamed from: i  reason: collision with root package name */
    public final View f4122i;
    public boolean[] i0;

    /* renamed from: j  reason: collision with root package name */
    public final View f4123j;
    public long j0;

    /* renamed from: k  reason: collision with root package name */
    public final View f4124k;

    /* renamed from: l  reason: collision with root package name */
    public final View f4125l;

    /* renamed from: m  reason: collision with root package name */
    public final View f4126m;
    public final ImageView n;
    public final ImageView o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final n s;
    public final StringBuilder t;
    public final Formatter u;
    public final q1.b v;
    public final q1.c w;
    public final Runnable x;
    public final Runnable y;
    public final Drawable z;

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class b implements f1.a, n.a, View.OnClickListener {
        public b(a aVar) {
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void A(u0 u0Var, int i2) {
            e1.e(this, u0Var, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void G(boolean z, int i2) {
            e1.f(this, z, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void I(TrackGroupArray trackGroupArray, f.h.b.b.d2.k kVar) {
            e1.r(this, trackGroupArray, kVar);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void K(c1 c1Var) {
            e1.g(this, c1Var);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void O(boolean z) {
            e1.d(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void a() {
            e1.n(this);
        }

        @Override // f.h.b.b.e2.n.a
        public void b(n nVar, long j2) {
            i iVar = i.this;
            TextView textView = iVar.r;
            if (textView != null) {
                textView.setText(b0.t(iVar.t, iVar.u, j2));
            }
        }

        @Override // f.h.b.b.e2.n.a
        public void c(n nVar, long j2, boolean z) {
            f1 f1Var;
            i iVar = i.this;
            int i2 = 0;
            iVar.S = false;
            if (z || (f1Var = iVar.L) == null) {
                return;
            }
            q1 D = f1Var.D();
            if (iVar.R && !D.q()) {
                int p = D.p();
                while (true) {
                    long b = D.n(i2, iVar.w).b();
                    if (j2 < b) {
                        break;
                    } else if (i2 == p - 1) {
                        j2 = b;
                        break;
                    } else {
                        j2 -= b;
                        i2++;
                    }
                }
            } else {
                i2 = f1Var.p();
            }
            Objects.requireNonNull((j0) iVar.M);
            f1Var.g(i2, j2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void d(int i2) {
            e1.i(this, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void e(int i2) {
            e1.l(this, i2);
        }

        @Override // f.h.b.b.e2.n.a
        public void f(n nVar, long j2) {
            i iVar = i.this;
            iVar.S = true;
            TextView textView = iVar.r;
            if (textView != null) {
                textView.setText(b0.t(iVar.t, iVar.u, j2));
            }
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void h(List list) {
            e1.p(this, list);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void j(ExoPlaybackException exoPlaybackException) {
            e1.j(this, exoPlaybackException);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void m(boolean z) {
            e1.c(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void n(q1 q1Var, int i2) {
            e1.q(this, q1Var, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[LOOP:0: B:28:0x006c->B:45:0x008b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0089 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r9) {
            /*
                r8 = this;
                f.h.b.b.e2.i r0 = f.h.b.b.e2.i.this
                f.h.b.b.f1 r1 = r0.L
                if (r1 != 0) goto L7
                return
            L7:
                android.view.View r2 = r0.f4122i
                if (r2 != r9) goto L14
                f.h.b.b.i0 r9 = r0.M
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                r9.b(r1)
                goto Laa
            L14:
                android.view.View r2 = r0.f4121h
                if (r2 != r9) goto L21
                f.h.b.b.i0 r9 = r0.M
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                r9.c(r1)
                goto Laa
            L21:
                android.view.View r2 = r0.f4125l
                if (r2 != r9) goto L37
                int r9 = r1.v()
                r0 = 4
                if (r9 == r0) goto Laa
                f.h.b.b.e2.i r9 = f.h.b.b.e2.i.this
                f.h.b.b.i0 r9 = r9.M
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                r9.a(r1)
                goto Laa
            L37:
                android.view.View r2 = r0.f4126m
                if (r2 != r9) goto L44
                f.h.b.b.i0 r9 = r0.M
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                r9.d(r1)
                goto Laa
            L44:
                android.view.View r2 = r0.f4123j
                if (r2 != r9) goto L4c
                r0.b(r1)
                goto Laa
            L4c:
                android.view.View r2 = r0.f4124k
                r3 = 0
                if (r2 != r9) goto L5c
                f.h.b.b.i0 r9 = r0.M
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                java.util.Objects.requireNonNull(r9)
                r1.r(r3)
                goto Laa
            L5c:
                android.widget.ImageView r2 = r0.n
                r4 = 1
                if (r2 != r9) goto L97
                f.h.b.b.i0 r9 = r0.M
                int r0 = r1.C()
                f.h.b.b.e2.i r2 = f.h.b.b.e2.i.this
                int r2 = r2.V
                r5 = 1
            L6c:
                r6 = 2
                if (r5 > r6) goto L8e
                int r7 = r0 + r5
                int r7 = r7 % 3
                if (r7 == 0) goto L86
                if (r7 == r4) goto L7f
                if (r7 == r6) goto L7a
                goto L84
            L7a:
                r6 = r2 & 2
                if (r6 == 0) goto L84
                goto L86
            L7f:
                r6 = r2 & 1
                if (r6 == 0) goto L84
                goto L86
            L84:
                r6 = 0
                goto L87
            L86:
                r6 = 1
            L87:
                if (r6 == 0) goto L8b
                r0 = r7
                goto L8e
            L8b:
                int r5 = r5 + 1
                goto L6c
            L8e:
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                java.util.Objects.requireNonNull(r9)
                r1.y(r0)
                goto Laa
            L97:
                android.widget.ImageView r2 = r0.o
                if (r2 != r9) goto Laa
                f.h.b.b.i0 r9 = r0.M
                boolean r0 = r1.F()
                r0 = r0 ^ r4
                f.h.b.b.j0 r9 = (f.h.b.b.j0) r9
                java.util.Objects.requireNonNull(r9)
                r1.i(r0)
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.i.b.onClick(android.view.View):void");
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void p(int i2) {
            e1.h(this, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void t(boolean z) {
            e1.o(this, z);
        }

        @Override // f.h.b.b.f1.a
        public void u(f1 f1Var, f1.b bVar) {
            if (bVar.b(5, 6)) {
                i iVar = i.this;
                int i2 = i.k0;
                iVar.k();
            }
            if (bVar.b(5, 6, 8)) {
                i iVar2 = i.this;
                int i3 = i.k0;
                iVar2.l();
            }
            if (bVar.a(9)) {
                i iVar3 = i.this;
                int i4 = i.k0;
                iVar3.m();
            }
            if (bVar.a(10)) {
                i iVar4 = i.this;
                int i5 = i.k0;
                iVar4.n();
            }
            if (bVar.b(9, 10, 12, 0)) {
                i iVar5 = i.this;
                int i6 = i.k0;
                iVar5.j();
            }
            if (bVar.b(12, 0)) {
                i iVar6 = i.this;
                int i7 = i.k0;
                iVar6.o();
            }
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void w(boolean z) {
            e1.b(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void x(boolean z, int i2) {
            e1.k(this, z, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void z(int i2) {
            e1.m(this, i2);
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(long j2, long j3);
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public interface d {
        void g(int i2);
    }

    static {
        r0.a("goog.exo.ui");
    }

    public i(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, null, i2);
        int i3 = AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT;
        this.T = AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT;
        this.V = 0;
        this.U = LogSeverity.INFO_VALUE;
        this.e0 = -9223372036854775807L;
        this.W = true;
        this.a0 = true;
        this.b0 = true;
        this.c0 = true;
        this.d0 = false;
        int i4 = R.layout.exo_player_control_view;
        int i5 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.c, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(10, AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
                i5 = obtainStyledAttributes.getInt(6, 15000);
                this.T = obtainStyledAttributes.getInt(21, this.T);
                i4 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.V = obtainStyledAttributes.getInt(9, this.V);
                this.W = obtainStyledAttributes.getBoolean(19, this.W);
                this.a0 = obtainStyledAttributes.getBoolean(16, this.a0);
                this.b0 = obtainStyledAttributes.getBoolean(18, this.b0);
                this.c0 = obtainStyledAttributes.getBoolean(17, this.c0);
                this.d0 = obtainStyledAttributes.getBoolean(20, this.d0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(22, this.U));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f4120g = new CopyOnWriteArrayList<>();
        this.v = new q1.b();
        this.w = new q1.c();
        StringBuilder sb = new StringBuilder();
        this.t = sb;
        this.u = new Formatter(sb, Locale.getDefault());
        this.f0 = new long[0];
        this.g0 = new boolean[0];
        this.h0 = new long[0];
        this.i0 = new boolean[0];
        b bVar = new b(null);
        this.f4119f = bVar;
        this.M = new j0(i5, i3);
        this.x = new Runnable() { // from class: f.h.b.b.e2.d
            @Override // java.lang.Runnable
            public final void run() {
                i iVar = i.this;
                int i6 = i.k0;
                iVar.l();
            }
        };
        this.y = new Runnable() { // from class: f.h.b.b.e2.a
            @Override // java.lang.Runnable
            public final void run() {
                i.this.c();
            }
        };
        LayoutInflater.from(context).inflate(i4, this);
        setDescendantFocusability(262144);
        n nVar = (n) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (nVar != null) {
            this.s = nVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.s = defaultTimeBar;
        } else {
            this.s = null;
        }
        this.q = (TextView) findViewById(R.id.exo_duration);
        this.r = (TextView) findViewById(R.id.exo_position);
        n nVar2 = this.s;
        if (nVar2 != null) {
            nVar2.b(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f4123j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f4124k = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f4121h = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f4122i = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f4126m = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f4125l = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.n = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.o = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.p = findViewById8;
        setShowVrButton(false);
        i(false, false, findViewById8);
        Resources resources = context.getResources();
        this.H = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.I = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.z = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.A = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.B = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.F = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.G = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.C = resources.getString(R.string.exo_controls_repeat_off_description);
        this.D = resources.getString(R.string.exo_controls_repeat_one_description);
        this.E = resources.getString(R.string.exo_controls_repeat_all_description);
        this.J = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.K = resources.getString(R.string.exo_controls_shuffle_off_description);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        f1 f1Var = this.L;
        if (f1Var != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (f1Var.v() != 4) {
                            ((j0) this.M).a(f1Var);
                        }
                    } else if (keyCode == 89) {
                        ((j0) this.M).d(f1Var);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int v = f1Var.v();
                            if (v != 1 && v != 4 && f1Var.h()) {
                                Objects.requireNonNull((j0) this.M);
                                f1Var.r(false);
                            } else {
                                b(f1Var);
                            }
                        } else if (keyCode == 87) {
                            ((j0) this.M).b(f1Var);
                        } else if (keyCode == 88) {
                            ((j0) this.M).c(f1Var);
                        } else if (keyCode == 126) {
                            b(f1Var);
                        } else if (keyCode == 127) {
                            Objects.requireNonNull((j0) this.M);
                            f1Var.r(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b(f1 f1Var) {
        int v = f1Var.v();
        if (v == 1) {
            d1 d1Var = this.O;
            if (d1Var != null) {
                d1Var.a();
            } else {
                Objects.requireNonNull((j0) this.M);
                f1Var.d();
            }
        } else if (v == 4) {
            int p = f1Var.p();
            Objects.requireNonNull((j0) this.M);
            f1Var.g(p, -9223372036854775807L);
        }
        Objects.requireNonNull((j0) this.M);
        f1Var.r(true);
    }

    public void c() {
        if (e()) {
            setVisibility(8);
            Iterator<d> it = this.f4120g.iterator();
            while (it.hasNext()) {
                it.next().g(getVisibility());
            }
            removeCallbacks(this.x);
            removeCallbacks(this.y);
            this.e0 = -9223372036854775807L;
        }
    }

    public final void d() {
        removeCallbacks(this.y);
        if (this.T > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i2 = this.T;
            this.e0 = uptimeMillis + i2;
            if (this.P) {
                postDelayed(this.y, i2);
                return;
            }
            return;
        }
        this.e0 = -9223372036854775807L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.y);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return getVisibility() == 0;
    }

    public final void f() {
        View view;
        View view2;
        boolean g2 = g();
        if (!g2 && (view2 = this.f4123j) != null) {
            view2.requestFocus();
        } else if (!g2 || (view = this.f4124k) == null) {
        } else {
            view.requestFocus();
        }
    }

    public final boolean g() {
        f1 f1Var = this.L;
        return (f1Var == null || f1Var.v() == 4 || this.L.v() == 1 || !this.L.h()) ? false : true;
    }

    public f1 getPlayer() {
        return this.L;
    }

    public int getRepeatToggleModes() {
        return this.V;
    }

    public boolean getShowShuffleButton() {
        return this.d0;
    }

    public int getShowTimeoutMs() {
        return this.T;
    }

    public boolean getShowVrButton() {
        View view = this.p;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        k();
        j();
        m();
        n();
        o();
    }

    public final void i(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.H : this.I);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r8 = this;
            boolean r0 = r8.e()
            if (r0 == 0) goto L9e
            boolean r0 = r8.P
            if (r0 != 0) goto Lc
            goto L9e
        Lc:
            f.h.b.b.f1 r0 = r8.L
            r1 = 0
            if (r0 == 0) goto L77
            f.h.b.b.q1 r2 = r0.D()
            boolean r3 = r2.q()
            if (r3 != 0) goto L77
            boolean r3 = r0.e()
            if (r3 != 0) goto L77
            int r3 = r0.p()
            f.h.b.b.q1$c r4 = r8.w
            r2.n(r3, r4)
            f.h.b.b.q1$c r2 = r8.w
            boolean r3 = r2.f4472h
            r4 = 1
            if (r3 != 0) goto L40
            boolean r2 = r2.c()
            if (r2 == 0) goto L40
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L3e
            goto L40
        L3e:
            r2 = 0
            goto L41
        L40:
            r2 = 1
        L41:
            if (r3 == 0) goto L4f
            f.h.b.b.i0 r5 = r8.M
            f.h.b.b.j0 r5 = (f.h.b.b.j0) r5
            boolean r5 = r5.f()
            if (r5 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r3 == 0) goto L5e
            f.h.b.b.i0 r6 = r8.M
            f.h.b.b.j0 r6 = (f.h.b.b.j0) r6
            boolean r6 = r6.e()
            if (r6 == 0) goto L5e
            r6 = 1
            goto L5f
        L5e:
            r6 = 0
        L5f:
            f.h.b.b.q1$c r7 = r8.w
            boolean r7 = r7.c()
            if (r7 == 0) goto L6d
            f.h.b.b.q1$c r7 = r8.w
            boolean r7 = r7.f4473i
            if (r7 != 0) goto L73
        L6d:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L74
        L73:
            r1 = 1
        L74:
            r0 = r1
            r1 = r2
            goto L7b
        L77:
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L7b:
            boolean r2 = r8.b0
            android.view.View r4 = r8.f4121h
            r8.i(r2, r1, r4)
            boolean r1 = r8.W
            android.view.View r2 = r8.f4126m
            r8.i(r1, r5, r2)
            boolean r1 = r8.a0
            android.view.View r2 = r8.f4125l
            r8.i(r1, r6, r2)
            boolean r1 = r8.c0
            android.view.View r2 = r8.f4122i
            r8.i(r1, r0, r2)
            f.h.b.b.e2.n r0 = r8.s
            if (r0 == 0) goto L9e
            r0.setEnabled(r3)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.i.j():void");
    }

    public final void k() {
        boolean z;
        if (e() && this.P) {
            boolean g2 = g();
            View view = this.f4123j;
            boolean z2 = true;
            if (view != null) {
                z = (g2 && view.isFocused()) | false;
                this.f4123j.setVisibility(g2 ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f4124k;
            if (view2 != null) {
                z |= (g2 || !view2.isFocused()) ? false : false;
                this.f4124k.setVisibility(g2 ? 0 : 8);
            }
            if (z) {
                f();
            }
        }
    }

    public final void l() {
        long j2;
        float f2;
        if (e() && this.P) {
            f1 f1Var = this.L;
            long j3 = 0;
            if (f1Var != null) {
                j3 = this.j0 + f1Var.t();
                j2 = this.j0 + f1Var.G();
            } else {
                j2 = 0;
            }
            TextView textView = this.r;
            if (textView != null && !this.S) {
                textView.setText(b0.t(this.t, this.u, j3));
            }
            n nVar = this.s;
            if (nVar != null) {
                nVar.setPosition(j3);
                this.s.setBufferedPosition(j2);
            }
            c cVar = this.N;
            if (cVar != null) {
                cVar.a(j3, j2);
            }
            removeCallbacks(this.x);
            int v = f1Var == null ? 1 : f1Var.v();
            if (f1Var == null || !f1Var.w()) {
                if (v == 4 || v == 1) {
                    return;
                }
                postDelayed(this.x, 1000L);
                return;
            }
            n nVar2 = this.s;
            long min = Math.min(nVar2 != null ? nVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j3 % 1000));
            postDelayed(this.x, b0.i(f1Var.c().a > 0.0f ? ((float) min) / f2 : 1000L, this.U, 1000L));
        }
    }

    public final void m() {
        ImageView imageView;
        if (e() && this.P && (imageView = this.n) != null) {
            if (this.V == 0) {
                i(false, false, imageView);
                return;
            }
            f1 f1Var = this.L;
            if (f1Var == null) {
                i(true, false, imageView);
                this.n.setImageDrawable(this.z);
                this.n.setContentDescription(this.C);
                return;
            }
            i(true, true, imageView);
            int C = f1Var.C();
            if (C == 0) {
                this.n.setImageDrawable(this.z);
                this.n.setContentDescription(this.C);
            } else if (C == 1) {
                this.n.setImageDrawable(this.A);
                this.n.setContentDescription(this.D);
            } else if (C == 2) {
                this.n.setImageDrawable(this.B);
                this.n.setContentDescription(this.E);
            }
            this.n.setVisibility(0);
        }
    }

    public final void n() {
        ImageView imageView;
        String str;
        if (e() && this.P && (imageView = this.o) != null) {
            f1 f1Var = this.L;
            if (!this.d0) {
                i(false, false, imageView);
            } else if (f1Var == null) {
                i(true, false, imageView);
                this.o.setImageDrawable(this.G);
                this.o.setContentDescription(this.K);
            } else {
                i(true, true, imageView);
                this.o.setImageDrawable(f1Var.F() ? this.F : this.G);
                ImageView imageView2 = this.o;
                if (f1Var.F()) {
                    str = this.J;
                } else {
                    str = this.K;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.e2.i.o():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        long j2 = this.e0;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.y, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P = false;
        removeCallbacks(this.x);
        removeCallbacks(this.y);
    }

    public void setControlDispatcher(i0 i0Var) {
        if (this.M != i0Var) {
            this.M = i0Var;
            j();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i2) {
        i0 i0Var = this.M;
        if (i0Var instanceof j0) {
            ((j0) i0Var).c = i2;
            j();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(d1 d1Var) {
        this.O = d1Var;
    }

    public void setPlayer(f1 f1Var) {
        boolean z = true;
        j.g(Looper.myLooper() == Looper.getMainLooper());
        if (f1Var != null && f1Var.E() != Looper.getMainLooper()) {
            z = false;
        }
        j.c(z);
        f1 f1Var2 = this.L;
        if (f1Var2 == f1Var) {
            return;
        }
        if (f1Var2 != null) {
            f1Var2.o(this.f4119f);
        }
        this.L = f1Var;
        if (f1Var != null) {
            f1Var.m(this.f4119f);
        }
        h();
    }

    public void setProgressUpdateListener(c cVar) {
        this.N = cVar;
    }

    public void setRepeatToggleModes(int i2) {
        this.V = i2;
        f1 f1Var = this.L;
        if (f1Var != null) {
            int C = f1Var.C();
            if (i2 == 0 && C != 0) {
                i0 i0Var = this.M;
                f1 f1Var2 = this.L;
                Objects.requireNonNull((j0) i0Var);
                f1Var2.y(0);
            } else if (i2 == 1 && C == 2) {
                i0 i0Var2 = this.M;
                f1 f1Var3 = this.L;
                Objects.requireNonNull((j0) i0Var2);
                f1Var3.y(1);
            } else if (i2 == 2 && C == 1) {
                i0 i0Var3 = this.M;
                f1 f1Var4 = this.L;
                Objects.requireNonNull((j0) i0Var3);
                f1Var4.y(2);
            }
        }
        m();
    }

    @Deprecated
    public void setRewindIncrementMs(int i2) {
        i0 i0Var = this.M;
        if (i0Var instanceof j0) {
            ((j0) i0Var).b = i2;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.a0 = z;
        j();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.Q = z;
        o();
    }

    public void setShowNextButton(boolean z) {
        this.c0 = z;
        j();
    }

    public void setShowPreviousButton(boolean z) {
        this.b0 = z;
        j();
    }

    public void setShowRewindButton(boolean z) {
        this.W = z;
        j();
    }

    public void setShowShuffleButton(boolean z) {
        this.d0 = z;
        n();
    }

    public void setShowTimeoutMs(int i2) {
        this.T = i2;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.p;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.U = b0.h(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.p;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            i(getShowVrButton(), onClickListener != null, this.p);
        }
    }
}
