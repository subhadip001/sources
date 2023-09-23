package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.video_converter.video_compressor.R;
import f.h.b.b.b2.k0.b;
import f.h.b.b.c1;
import f.h.b.b.c2.c;
import f.h.b.b.c2.k;
import f.h.b.b.d1;
import f.h.b.b.e1;
import f.h.b.b.e2.i;
import f.h.b.b.e2.r.g;
import f.h.b.b.e2.r.h;
import f.h.b.b.f1;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.j;
import f.h.b.b.h2.p;
import f.h.b.b.h2.u;
import f.h.b.b.h2.v;
import f.h.b.b.i0;
import f.h.b.b.o1;
import f.h.b.b.q1;
import f.h.b.b.u0;
import f.h.c.b.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;

    /* renamed from: f  reason: collision with root package name */
    public final a f951f;

    /* renamed from: g  reason: collision with root package name */
    public final AspectRatioFrameLayout f952g;

    /* renamed from: h  reason: collision with root package name */
    public final View f953h;

    /* renamed from: i  reason: collision with root package name */
    public final View f954i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f955j;

    /* renamed from: k  reason: collision with root package name */
    public final SubtitleView f956k;

    /* renamed from: l  reason: collision with root package name */
    public final View f957l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f958m;
    public final i n;
    public final FrameLayout o;
    public final FrameLayout p;
    public f1 q;
    public boolean r;
    public i.d s;
    public boolean t;
    public Drawable u;
    public int v;
    public boolean w;
    public boolean x;
    public j<? super ExoPlaybackException> y;
    public CharSequence z;

    /* loaded from: classes.dex */
    public final class a implements f1.a, k, v, View.OnLayoutChangeListener, g, i.d {

        /* renamed from: f  reason: collision with root package name */
        public final q1.b f959f = new q1.b();

        /* renamed from: g  reason: collision with root package name */
        public Object f960g;

        public a() {
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void A(u0 u0Var, int i2) {
            e1.e(this, u0Var, i2);
        }

        @Override // f.h.b.b.f1.a
        public void G(boolean z, int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.G;
            playerView.k();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.e() && playerView2.C) {
                playerView2.d();
            } else {
                playerView2.f(false);
            }
        }

        @Override // f.h.b.b.f1.a
        public void I(TrackGroupArray trackGroupArray, f.h.b.b.d2.k kVar) {
            f1 f1Var = PlayerView.this.q;
            Objects.requireNonNull(f1Var);
            q1 D = f1Var.D();
            if (D.q()) {
                this.f960g = null;
            } else if (!f1Var.B().c()) {
                this.f960g = D.g(f1Var.k(), this.f959f, true).b;
            } else {
                Object obj = this.f960g;
                if (obj != null) {
                    int b = D.b(obj);
                    if (b != -1) {
                        if (f1Var.p() == D.f(b, this.f959f).c) {
                            return;
                        }
                    }
                    this.f960g = null;
                }
            }
            PlayerView.this.n(false);
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

        @Override // f.h.b.b.h2.v
        public void b(int i2, int i3, int i4, float f2) {
            float f3 = (i3 == 0 || i2 == 0) ? 1.0f : (i2 * f2) / i3;
            PlayerView playerView = PlayerView.this;
            View view = playerView.f954i;
            if (view instanceof TextureView) {
                if (i4 == 90 || i4 == 270) {
                    f3 = 1.0f / f3;
                }
                if (playerView.E != 0) {
                    view.removeOnLayoutChangeListener(this);
                }
                PlayerView playerView2 = PlayerView.this;
                playerView2.E = i4;
                if (i4 != 0) {
                    playerView2.f954i.addOnLayoutChangeListener(this);
                }
                PlayerView playerView3 = PlayerView.this;
                PlayerView.a((TextureView) playerView3.f954i, playerView3.E);
            }
            PlayerView playerView4 = PlayerView.this;
            AspectRatioFrameLayout aspectRatioFrameLayout = playerView4.f952g;
            View view2 = playerView4.f954i;
            if (aspectRatioFrameLayout != null) {
                if (view2 instanceof h) {
                    f3 = 0.0f;
                }
                aspectRatioFrameLayout.setAspectRatio(f3);
            }
        }

        @Override // f.h.b.b.h2.v
        public void c() {
            View view = PlayerView.this.f953h;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void d(int i2) {
            e1.i(this, i2);
        }

        @Override // f.h.b.b.f1.a
        public void e(int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.G;
            if (playerView.e()) {
                PlayerView playerView2 = PlayerView.this;
                if (playerView2.C) {
                    playerView2.d();
                }
            }
        }

        @Override // f.h.b.b.h2.v
        public /* synthetic */ void f(int i2, int i3) {
            u.a(this, i2, i3);
        }

        @Override // f.h.b.b.e2.i.d
        public void g(int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.G;
            playerView.l();
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void h(List list) {
            e1.p(this, list);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void j(ExoPlaybackException exoPlaybackException) {
            e1.j(this, exoPlaybackException);
        }

        @Override // f.h.b.b.c2.k
        public void l(List<c> list) {
            SubtitleView subtitleView = PlayerView.this.f956k;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void m(boolean z) {
            e1.c(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void n(q1 q1Var, int i2) {
            e1.q(this, q1Var, i2);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            PlayerView.a((TextureView) view, PlayerView.this.E);
        }

        @Override // f.h.b.b.f1.a
        public void p(int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.G;
            playerView.k();
            PlayerView.this.m();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.e() && playerView2.C) {
                playerView2.d();
            } else {
                playerView2.f(false);
            }
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void t(boolean z) {
            e1.o(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void u(f1 f1Var, f1.b bVar) {
            e1.a(this, f1Var, bVar);
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

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        a aVar = new a();
        this.f951f = aVar;
        if (isInEditMode()) {
            this.f952g = null;
            this.f953h = null;
            this.f954i = null;
            this.f955j = null;
            this.f956k = null;
            this.f957l = null;
            this.f958m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            ImageView imageView = new ImageView(context);
            if (b0.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i8 = R.layout.exo_player_view;
        this.x = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.h.b.b.e2.k.f4128d, 0, 0);
            try {
                z4 = obtainStyledAttributes.hasValue(25);
                i5 = obtainStyledAttributes.getColor(25, 0);
                i8 = obtainStyledAttributes.getResourceId(13, R.layout.exo_player_view);
                z5 = obtainStyledAttributes.getBoolean(30, true);
                i6 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z7 = obtainStyledAttributes.getBoolean(31, true);
                i3 = obtainStyledAttributes.getInt(26, 1);
                i4 = obtainStyledAttributes.getInt(15, 0);
                int i9 = obtainStyledAttributes.getInt(24, AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
                boolean z8 = obtainStyledAttributes.getBoolean(9, true);
                boolean z9 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(22, 0);
                this.w = obtainStyledAttributes.getBoolean(10, this.w);
                boolean z10 = obtainStyledAttributes.getBoolean(8, true);
                this.x = obtainStyledAttributes.getBoolean(32, this.x);
                obtainStyledAttributes.recycle();
                z = z8;
                z3 = z9;
                i2 = integer;
                z6 = z7;
                i7 = i9;
                z2 = z10;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            i2 = 0;
            i3 = 1;
            i4 = 0;
            z2 = true;
            z3 = true;
            i5 = 0;
            z4 = false;
            z5 = true;
            i6 = 0;
            i7 = AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f952g = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i4);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f953h = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f954i = new TextureView(context);
            } else if (i3 == 3) {
                h hVar = new h(context);
                hVar.setSingleTapListener(aVar);
                hVar.setUseSensorRotation(this.x);
                this.f954i = hVar;
            } else if (i3 != 4) {
                this.f954i = new SurfaceView(context);
            } else {
                this.f954i = new p(context);
            }
            this.f954i.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.f954i, 0);
        } else {
            this.f954i = null;
        }
        this.o = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.p = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f955j = imageView2;
        this.t = z5 && imageView2 != null;
        if (i6 != 0) {
            this.u = e.i.c.a.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f956k = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f957l = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.v = i2;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f958m = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        i iVar = (i) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (iVar != null) {
            this.n = iVar;
        } else if (findViewById3 != null) {
            i iVar2 = new i(context, null, 0, attributeSet);
            this.n = iVar2;
            iVar2.setId(R.id.exo_controller);
            iVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(iVar2, indexOfChild);
        } else {
            this.n = null;
        }
        i iVar3 = this.n;
        this.A = iVar3 != null ? i7 : 0;
        this.D = z;
        this.B = z3;
        this.C = z2;
        this.r = z6 && iVar3 != null;
        d();
        l();
        i iVar4 = this.n;
        if (iVar4 != null) {
            iVar4.f4120g.add(aVar);
        }
    }

    public static void a(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    public final void b() {
        View view = this.f953h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void c() {
        ImageView imageView = this.f955j;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f955j.setVisibility(4);
        }
    }

    public void d() {
        i iVar = this.n;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f1 f1Var = this.q;
        if (f1Var != null && f1Var.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && o() && !this.n.e()) {
            f(true);
        } else {
            if (!(o() && this.n.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (z && o()) {
                    f(true);
                    return false;
                }
                return false;
            }
            f(true);
        }
        return true;
    }

    public final boolean e() {
        f1 f1Var = this.q;
        return f1Var != null && f1Var.e() && this.q.h();
    }

    public final void f(boolean z) {
        if (!(e() && this.C) && o()) {
            boolean z2 = this.n.e() && this.n.getShowTimeoutMs() <= 0;
            boolean h2 = h();
            if (z || z2 || h2) {
                i(h2);
            }
        }
    }

    public final boolean g(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f2 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f952g;
                ImageView imageView = this.f955j;
                if (aspectRatioFrameLayout != null) {
                    if (imageView instanceof h) {
                        f2 = 0.0f;
                    }
                    aspectRatioFrameLayout.setAspectRatio(f2);
                }
                this.f955j.setImageDrawable(drawable);
                this.f955j.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<b> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.p;
        if (frameLayout != null) {
            arrayList.add(new b(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        i iVar = this.n;
        if (iVar != null) {
            arrayList.add(new b(iVar, 0));
        }
        return q.m(arrayList);
    }

    @Deprecated
    public View[] getAdOverlayViews() {
        return new View[0];
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.o;
        f.h.b.b.e2.j.j(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.B;
    }

    public boolean getControllerHideOnTouch() {
        return this.D;
    }

    public int getControllerShowTimeoutMs() {
        return this.A;
    }

    public Drawable getDefaultArtwork() {
        return this.u;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.p;
    }

    public f1 getPlayer() {
        return this.q;
    }

    public int getResizeMode() {
        f.h.b.b.e2.j.i(this.f952g);
        return this.f952g.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f956k;
    }

    public boolean getUseArtwork() {
        return this.t;
    }

    public boolean getUseController() {
        return this.r;
    }

    public View getVideoSurfaceView() {
        return this.f954i;
    }

    public final boolean h() {
        f1 f1Var = this.q;
        if (f1Var == null) {
            return true;
        }
        int v = f1Var.v();
        return this.B && (v == 1 || v == 4 || !this.q.h());
    }

    public final void i(boolean z) {
        if (o()) {
            this.n.setShowTimeoutMs(z ? 0 : this.A);
            i iVar = this.n;
            if (!iVar.e()) {
                iVar.setVisibility(0);
                Iterator<i.d> it = iVar.f4120g.iterator();
                while (it.hasNext()) {
                    it.next().g(iVar.getVisibility());
                }
                iVar.h();
                iVar.f();
            }
            iVar.d();
        }
    }

    public final boolean j() {
        if (!o() || this.q == null) {
            return false;
        }
        if (!this.n.e()) {
            f(true);
        } else if (this.D) {
            this.n.c();
        }
        return true;
    }

    public final void k() {
        int i2;
        if (this.f957l != null) {
            f1 f1Var = this.q;
            boolean z = true;
            if (f1Var == null || f1Var.v() != 2 || ((i2 = this.v) != 2 && (i2 != 1 || !this.q.h()))) {
                z = false;
            }
            this.f957l.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        i iVar = this.n;
        if (iVar != null && this.r) {
            if (iVar.getVisibility() == 0) {
                setContentDescription(this.D ? getResources().getString(R.string.exo_controls_hide) : null);
                return;
            } else {
                setContentDescription(getResources().getString(R.string.exo_controls_show));
                return;
            }
        }
        setContentDescription(null);
    }

    public final void m() {
        j<? super ExoPlaybackException> jVar;
        TextView textView = this.f958m;
        if (textView != null) {
            CharSequence charSequence = this.z;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f958m.setVisibility(0);
                return;
            }
            f1 f1Var = this.q;
            ExoPlaybackException q = f1Var != null ? f1Var.q() : null;
            if (q != null && (jVar = this.y) != null) {
                this.f958m.setText((CharSequence) jVar.a(q).second);
                this.f958m.setVisibility(0);
                return;
            }
            this.f958m.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(boolean r10) {
        /*
            r9 = this;
            f.h.b.b.f1 r0 = r9.q
            if (r0 == 0) goto Laa
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r0.B()
            boolean r1 = r1.c()
            if (r1 == 0) goto L10
            goto Laa
        L10:
            if (r10 == 0) goto L19
            boolean r10 = r9.w
            if (r10 != 0) goto L19
            r9.b()
        L19:
            f.h.b.b.d2.k r10 = r0.H()
            r1 = 0
            r2 = 0
        L1f:
            int r3 = r10.a
            if (r2 >= r3) goto L37
            int r3 = r0.I(r2)
            r4 = 2
            if (r3 != r4) goto L34
            f.h.b.b.d2.j[] r3 = r10.b
            r3 = r3[r2]
            if (r3 == 0) goto L34
            r9.c()
            return
        L34:
            int r2 = r2 + 1
            goto L1f
        L37:
            r9.b()
            boolean r10 = r9.t
            if (r10 == 0) goto L45
            android.widget.ImageView r10 = r9.f955j
            f.h.b.b.e2.j.i(r10)
            r10 = 1
            goto L46
        L45:
            r10 = 0
        L46:
            if (r10 == 0) goto La6
            java.util.List r10 = r0.j()
            java.util.Iterator r10 = r10.iterator()
        L50:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r10.next()
            com.google.android.exoplayer2.metadata.Metadata r0 = (com.google.android.exoplayer2.metadata.Metadata) r0
            r2 = -1
            r3 = 0
            r4 = -1
            r5 = 0
        L60:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = r0.f770f
            int r7 = r6.length
            if (r3 >= r7) goto L9a
            r6 = r6[r3]
            boolean r7 = r6 instanceof com.google.android.exoplayer2.metadata.id3.ApicFrame
            if (r7 == 0) goto L72
            com.google.android.exoplayer2.metadata.id3.ApicFrame r6 = (com.google.android.exoplayer2.metadata.id3.ApicFrame) r6
            byte[] r7 = r6.f803j
            int r6 = r6.f802i
            goto L7c
        L72:
            boolean r7 = r6 instanceof com.google.android.exoplayer2.metadata.flac.PictureFrame
            if (r7 == 0) goto L97
            com.google.android.exoplayer2.metadata.flac.PictureFrame r6 = (com.google.android.exoplayer2.metadata.flac.PictureFrame) r6
            byte[] r7 = r6.f788m
            int r6 = r6.f781f
        L7c:
            r8 = 3
            if (r4 == r2) goto L81
            if (r6 != r8) goto L97
        L81:
            int r4 = r7.length
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r7, r1, r4)
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r9.getResources()
            r5.<init>(r7, r4)
            boolean r5 = r9.g(r5)
            if (r6 != r8) goto L96
            goto L9a
        L96:
            r4 = r6
        L97:
            int r3 = r3 + 1
            goto L60
        L9a:
            if (r5 == 0) goto L50
            return
        L9d:
            android.graphics.drawable.Drawable r10 = r9.u
            boolean r10 = r9.g(r10)
            if (r10 == 0) goto La6
            return
        La6:
            r9.c()
            return
        Laa:
            boolean r10 = r9.w
            if (r10 != 0) goto Lb4
            r9.c()
            r9.b()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.n(boolean):void");
    }

    public final boolean o() {
        if (this.r) {
            f.h.b.b.e2.j.i(this.n);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o() || this.q == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.F) {
                this.F = false;
                performClick();
                return true;
            }
            return false;
        }
        this.F = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!o() || this.q == null) {
            return false;
        }
        f(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return j();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        f.h.b.b.e2.j.i(this.f952g);
        this.f952g.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(i0 i0Var) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setControlDispatcher(i0Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.B = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.C = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.D = z;
        l();
    }

    public void setControllerShowTimeoutMs(int i2) {
        f.h.b.b.e2.j.i(this.n);
        this.A = i2;
        if (this.n.e()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(i.d dVar) {
        f.h.b.b.e2.j.i(this.n);
        i.d dVar2 = this.s;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.n.f4120g.remove(dVar2);
        }
        this.s = dVar;
        if (dVar != null) {
            i iVar = this.n;
            Objects.requireNonNull(iVar);
            iVar.f4120g.add(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        f.h.b.b.e2.j.g(this.f958m != null);
        this.z = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.u != drawable) {
            this.u = drawable;
            n(false);
        }
    }

    public void setErrorMessageProvider(j<? super ExoPlaybackException> jVar) {
        if (this.y != jVar) {
            this.y = jVar;
            m();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i2) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setFastForwardIncrementMs(i2);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.w != z) {
            this.w = z;
            n(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(d1 d1Var) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setPlaybackPreparer(d1Var);
    }

    public void setPlayer(f1 f1Var) {
        f.h.b.b.e2.j.g(Looper.myLooper() == Looper.getMainLooper());
        f.h.b.b.e2.j.c(f1Var == null || f1Var.E() == Looper.getMainLooper());
        f1 f1Var2 = this.q;
        if (f1Var2 == f1Var) {
            return;
        }
        if (f1Var2 != null) {
            f1Var2.o(this.f951f);
            f1.d s = f1Var2.s();
            if (s != null) {
                o1 o1Var = (o1) s;
                o1Var.f4421f.remove(this.f951f);
                View view = this.f954i;
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    o1Var.Z();
                    if (textureView != null && textureView == o1Var.w) {
                        o1Var.W(null);
                    }
                } else if (view instanceof h) {
                    ((h) view).setVideoComponent(null);
                } else if (view instanceof SurfaceView) {
                    o1Var.L((SurfaceView) view);
                }
            }
            f1.c K = f1Var2.K();
            if (K != null) {
                ((o1) K).f4423h.remove(this.f951f);
            }
        }
        SubtitleView subtitleView = this.f956k;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.q = f1Var;
        if (o()) {
            this.n.setPlayer(f1Var);
        }
        k();
        m();
        n(true);
        if (f1Var != null) {
            f1.d s2 = f1Var.s();
            if (s2 != null) {
                View view2 = this.f954i;
                if (view2 instanceof TextureView) {
                    ((o1) s2).W((TextureView) view2);
                } else if (view2 instanceof h) {
                    ((h) view2).setVideoComponent(s2);
                } else if (view2 instanceof SurfaceView) {
                    ((o1) s2).V((SurfaceView) view2);
                }
                a aVar = this.f951f;
                Objects.requireNonNull(aVar);
                ((o1) s2).f4421f.add(aVar);
            }
            f1.c K2 = f1Var.K();
            if (K2 != null) {
                a aVar2 = this.f951f;
                o1 o1Var2 = (o1) K2;
                Objects.requireNonNull(aVar2);
                o1Var2.f4423h.add(aVar2);
                SubtitleView subtitleView2 = this.f956k;
                if (subtitleView2 != null) {
                    o1Var2.Z();
                    subtitleView2.setCues(o1Var2.D);
                }
            }
            f1Var.m(this.f951f);
            f(false);
            return;
        }
        d();
    }

    public void setRepeatToggleModes(int i2) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        f.h.b.b.e2.j.i(this.f952g);
        this.f952g.setResizeMode(i2);
    }

    @Deprecated
    public void setRewindIncrementMs(int i2) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setRewindIncrementMs(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.v != i2) {
            this.v = i2;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        f.h.b.b.e2.j.i(this.n);
        this.n.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f953h;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z) {
        f.h.b.b.e2.j.g((z && this.f955j == null) ? false : true);
        if (this.t != z) {
            this.t = z;
            n(false);
        }
    }

    public void setUseController(boolean z) {
        f.h.b.b.e2.j.g((z && this.n == null) ? false : true);
        if (this.r == z) {
            return;
        }
        this.r = z;
        if (o()) {
            this.n.setPlayer(this.q);
        } else {
            i iVar = this.n;
            if (iVar != null) {
                iVar.c();
                this.n.setPlayer(null);
            }
        }
        l();
    }

    public void setUseSensorRotation(boolean z) {
        if (this.x != z) {
            this.x = z;
            View view = this.f954i;
            if (view instanceof h) {
                ((h) view).setUseSensorRotation(z);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f954i;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }
}
