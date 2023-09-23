package f.h.b.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import f.h.b.b.d0;
import f.h.b.b.e0;
import f.h.b.b.f1;
import f.h.b.b.g2.l;
import f.h.b.b.p1;
import f.h.b.b.t1.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: SimpleExoPlayer.java */
/* loaded from: classes.dex */
public class o1 extends f0 implements f1, f1.d, f1.c {
    public f.h.b.b.u1.n A;
    public float B;
    public boolean C;
    public List<f.h.b.b.c2.c> D;
    public f.h.b.b.h2.s E;
    public f.h.b.b.h2.x.a F;
    public boolean G;
    public boolean H;
    public boolean I;
    public f.h.b.b.w1.a J;
    public final j1[] b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final o0 f4419d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4420e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<f.h.b.b.h2.v> f4421f;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet<f.h.b.b.u1.p> f4422g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet<f.h.b.b.c2.k> f4423h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArraySet<f.h.b.b.a2.e> f4424i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<f.h.b.b.w1.b> f4425j;

    /* renamed from: k  reason: collision with root package name */
    public final f.h.b.b.t1.w0 f4426k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f4427l;

    /* renamed from: m  reason: collision with root package name */
    public final e0 f4428m;
    public final p1 n;
    public final r1 o;
    public final s1 p;
    public final long q;
    public AudioTrack r;
    public Surface s;
    public boolean t;
    public int u;
    public SurfaceHolder v;
    public TextureView w;
    public int x;
    public int y;
    public int z;

    /* compiled from: SimpleExoPlayer.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Context a;
        public final m1 b;
        public f.h.b.b.g2.f c;

        /* renamed from: d  reason: collision with root package name */
        public f.h.b.b.d2.l f4429d;

        /* renamed from: e  reason: collision with root package name */
        public f.h.b.b.b2.b0 f4430e;

        /* renamed from: f  reason: collision with root package name */
        public l0 f4431f;

        /* renamed from: g  reason: collision with root package name */
        public f.h.b.b.f2.d f4432g;

        /* renamed from: h  reason: collision with root package name */
        public f.h.b.b.t1.w0 f4433h;

        /* renamed from: i  reason: collision with root package name */
        public Looper f4434i;

        /* renamed from: j  reason: collision with root package name */
        public f.h.b.b.u1.n f4435j;

        /* renamed from: k  reason: collision with root package name */
        public int f4436k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4437l;

        /* renamed from: m  reason: collision with root package name */
        public n1 f4438m;
        public t0 n;
        public long o;
        public long p;
        public boolean q;

        /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x01ac, TryCatch #0 {, blocks: (B:4:0x0022, B:9:0x002f, B:11:0x0034, B:13:0x003e, B:22:0x0063, B:24:0x006f, B:25:0x0073, B:27:0x007a, B:28:0x0092, B:17:0x004b, B:18:0x0052, B:21:0x005d, B:8:0x002b, B:29:0x0151), top: B:36:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x01ac, TryCatch #0 {, blocks: (B:4:0x0022, B:9:0x002f, B:11:0x0034, B:13:0x003e, B:22:0x0063, B:24:0x006f, B:25:0x0073, B:27:0x007a, B:28:0x0092, B:17:0x004b, B:18:0x0052, B:21:0x005d, B:8:0x002b, B:29:0x0151), top: B:36:0x0022 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(android.content.Context r22) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.o1.b.<init>(android.content.Context):void");
        }
    }

    /* compiled from: SimpleExoPlayer.java */
    /* loaded from: classes.dex */
    public final class c implements f.h.b.b.h2.w, f.h.b.b.u1.q, f.h.b.b.c2.k, f.h.b.b.a2.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, e0.b, d0.b, p1.b, f1.a {
        public c(a aVar) {
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void A(u0 u0Var, int i2) {
            e1.e(this, u0Var, i2);
        }

        @Override // f.h.b.b.u1.q
        public void B(boolean z) {
            o1 o1Var = o1.this;
            if (o1Var.C == z) {
                return;
            }
            o1Var.C = z;
            o1Var.f4426k.B(z);
            Iterator<f.h.b.b.u1.p> it = o1Var.f4422g.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // f.h.b.b.u1.q
        public void C(Exception exc) {
            o1.this.f4426k.C(exc);
        }

        @Override // f.h.b.b.h2.w
        public void D(f.h.b.b.v1.d dVar) {
            Objects.requireNonNull(o1.this);
            o1.this.f4426k.D(dVar);
        }

        @Override // f.h.b.b.h2.w
        public void E(Format format, f.h.b.b.v1.e eVar) {
            Objects.requireNonNull(o1.this);
            o1.this.f4426k.E(format, eVar);
        }

        @Override // f.h.b.b.u1.q
        public void F(long j2) {
            o1.this.f4426k.F(j2);
        }

        @Override // f.h.b.b.f1.a
        public void G(boolean z, int i2) {
            o1.a(o1.this);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void I(TrackGroupArray trackGroupArray, f.h.b.b.d2.k kVar) {
            e1.r(this, trackGroupArray, kVar);
        }

        @Override // f.h.b.b.h2.w
        public void J(f.h.b.b.v1.d dVar) {
            o1.this.f4426k.J(dVar);
            Objects.requireNonNull(o1.this);
            Objects.requireNonNull(o1.this);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void K(c1 c1Var) {
            e1.g(this, c1Var);
        }

        @Override // f.h.b.b.u1.q
        public void L(int i2, long j2, long j3) {
            o1.this.f4426k.L(i2, j2, j3);
        }

        @Override // f.h.b.b.h2.w
        public void N(long j2, int i2) {
            o1.this.f4426k.N(j2, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void O(boolean z) {
            e1.d(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void a() {
            e1.n(this);
        }

        @Override // f.h.b.b.h2.w
        public void b(int i2, int i3, int i4, float f2) {
            o1.this.f4426k.b(i2, i3, i4, f2);
            Iterator<f.h.b.b.h2.v> it = o1.this.f4421f.iterator();
            while (it.hasNext()) {
                it.next().b(i2, i3, i4, f2);
            }
        }

        @Override // f.h.b.b.u1.q
        public void c(f.h.b.b.v1.d dVar) {
            o1.this.f4426k.c(dVar);
            Objects.requireNonNull(o1.this);
            Objects.requireNonNull(o1.this);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void d(int i2) {
            e1.i(this, i2);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void e(int i2) {
            e1.l(this, i2);
        }

        @Override // f.h.b.b.h2.w
        public void f(String str) {
            o1.this.f4426k.f(str);
        }

        @Override // f.h.b.b.u1.q
        public void g(f.h.b.b.v1.d dVar) {
            Objects.requireNonNull(o1.this);
            o1.this.f4426k.g(dVar);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void h(List list) {
            e1.p(this, list);
        }

        @Override // f.h.b.b.h2.w
        public void i(String str, long j2, long j3) {
            o1.this.f4426k.i(str, j2, j3);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void j(ExoPlaybackException exoPlaybackException) {
            e1.j(this, exoPlaybackException);
        }

        @Override // f.h.b.b.a2.e
        public void k(final Metadata metadata) {
            f.h.b.b.t1.w0 w0Var = o1.this.f4426k;
            final x0.a P = w0Var.P();
            l.a<f.h.b.b.t1.x0> aVar = new l.a() { // from class: f.h.b.b.t1.d
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj) {
                    ((x0) obj).S();
                }
            };
            w0Var.f4493j.put(1007, P);
            f.h.b.b.g2.l<f.h.b.b.t1.x0, x0.b> lVar = w0Var.f4494k;
            lVar.b(1007, aVar);
            lVar.a();
            Iterator<f.h.b.b.a2.e> it = o1.this.f4424i.iterator();
            while (it.hasNext()) {
                it.next().k(metadata);
            }
        }

        @Override // f.h.b.b.c2.k
        public void l(List<f.h.b.b.c2.c> list) {
            o1 o1Var = o1.this;
            o1Var.D = list;
            Iterator<f.h.b.b.c2.k> it = o1Var.f4423h.iterator();
            while (it.hasNext()) {
                it.next().l(list);
            }
        }

        @Override // f.h.b.b.f1.a
        public void m(boolean z) {
            Objects.requireNonNull(o1.this);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void n(q1 q1Var, int i2) {
            e1.q(this, q1Var, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            o1.this.U(new Surface(surfaceTexture), true);
            o1.this.O(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            o1.this.U(null, true);
            o1.this.O(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            o1.this.O(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // f.h.b.b.f1.a
        public void p(int i2) {
            o1.a(o1.this);
        }

        @Override // f.h.b.b.h2.w
        public void q(Surface surface) {
            o1.this.f4426k.q(surface);
            o1 o1Var = o1.this;
            if (o1Var.s == surface) {
                Iterator<f.h.b.b.h2.v> it = o1Var.f4421f.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        @Override // f.h.b.b.u1.q
        public void r(String str) {
            o1.this.f4426k.r(str);
        }

        @Override // f.h.b.b.u1.q
        public void s(String str, long j2, long j3) {
            o1.this.f4426k.s(str, j2, j3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            o1.this.O(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            o1.this.U(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            o1.this.U(null, false);
            o1.this.O(0, 0);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void t(boolean z) {
            e1.o(this, z);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void u(f1 f1Var, f1.b bVar) {
            e1.a(this, f1Var, bVar);
        }

        @Override // f.h.b.b.h2.w
        public void v(int i2, long j2) {
            o1.this.f4426k.v(i2, j2);
        }

        @Override // f.h.b.b.f1.a
        public void w(boolean z) {
            o1.a(o1.this);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void x(boolean z, int i2) {
            e1.k(this, z, i2);
        }

        @Override // f.h.b.b.u1.q
        public void y(Format format, f.h.b.b.v1.e eVar) {
            Objects.requireNonNull(o1.this);
            o1.this.f4426k.y(format, eVar);
        }

        @Override // f.h.b.b.f1.a
        public /* synthetic */ void z(int i2) {
            e1.m(this, i2);
        }
    }

    public o1(b bVar) {
        f.h.b.b.u1.o oVar;
        int i2;
        Context applicationContext = bVar.a.getApplicationContext();
        this.c = applicationContext;
        f.h.b.b.t1.w0 w0Var = bVar.f4433h;
        this.f4426k = w0Var;
        this.A = bVar.f4435j;
        this.u = bVar.f4436k;
        this.C = false;
        this.q = bVar.p;
        c cVar = new c(null);
        this.f4420e = cVar;
        this.f4421f = new CopyOnWriteArraySet<>();
        this.f4422g = new CopyOnWriteArraySet<>();
        this.f4423h = new CopyOnWriteArraySet<>();
        this.f4424i = new CopyOnWriteArraySet<>();
        this.f4425j = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(bVar.f4434i);
        n0 n0Var = (n0) bVar.b;
        Objects.requireNonNull(n0Var);
        ArrayList arrayList = new ArrayList();
        f.h.b.b.h2.n nVar = new f.h.b.b.h2.n(n0Var.a, n0Var.b, FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS, false, handler, cVar, 50);
        nVar.B0 = false;
        nVar.C0 = false;
        nVar.D0 = false;
        arrayList.add(nVar);
        Context context = n0Var.a;
        f.h.b.b.u1.o oVar2 = f.h.b.b.u1.o.c;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i3 = f.h.b.b.g2.b0.a;
        if ((i3 >= 17 && "Amazon".equals(f.h.b.b.g2.b0.c)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            oVar = f.h.b.b.u1.o.f4578d;
        } else if (registerReceiver != null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            oVar = new f.h.b.b.u1.o(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        } else {
            oVar = f.h.b.b.u1.o.c;
        }
        f.h.b.b.u1.y yVar = new f.h.b.b.u1.y(n0Var.a, n0Var.b, false, handler, cVar, new DefaultAudioSink(oVar, new DefaultAudioSink.d(new AudioProcessor[0]), false, false, false));
        yVar.B0 = false;
        yVar.C0 = false;
        yVar.D0 = false;
        arrayList.add(yVar);
        arrayList.add(new f.h.b.b.c2.l(cVar, handler.getLooper()));
        arrayList.add(new f.h.b.b.a2.f(cVar, handler.getLooper()));
        arrayList.add(new f.h.b.b.h2.x.b());
        j1[] j1VarArr = (j1[]) arrayList.toArray(new j1[0]);
        this.b = j1VarArr;
        this.B = 1.0f;
        if (i3 < 21) {
            AudioTrack audioTrack = this.r;
            if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                this.r.release();
                this.r = null;
            }
            if (this.r == null) {
                this.r = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
            }
            this.z = this.r.getAudioSessionId();
        } else {
            UUID uuid = h0.a;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            this.z = audioManager == null ? -1 : audioManager.generateAudioSessionId();
        }
        this.D = Collections.emptyList();
        this.G = true;
        o0 o0Var = new o0(j1VarArr, bVar.f4429d, bVar.f4430e, bVar.f4431f, bVar.f4432g, w0Var, bVar.f4437l, bVar.f4438m, bVar.n, bVar.o, false, bVar.c, bVar.f4434i, this);
        this.f4419d = o0Var;
        o0Var.m(cVar);
        d0 d0Var = new d0(bVar.a, handler, cVar);
        this.f4427l = d0Var;
        d0Var.a(false);
        e0 e0Var = new e0(bVar.a, handler, cVar);
        this.f4428m = e0Var;
        if (f.h.b.b.g2.b0.a(e0Var.f4103d, null)) {
            i2 = 1;
        } else {
            e0Var.f4103d = null;
            e0Var.f4105f = 0;
            i2 = 1;
            f.h.b.b.e2.j.d(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        p1 p1Var = new p1(bVar.a, handler, cVar);
        this.n = p1Var;
        int s = f.h.b.b.g2.b0.s(this.A.c);
        if (p1Var.f4442f != s) {
            p1Var.f4442f = s;
            p1Var.c();
            c cVar2 = (c) p1Var.c;
            f.h.b.b.w1.a M = M(o1.this.n);
            if (!M.equals(o1.this.J)) {
                o1 o1Var = o1.this;
                o1Var.J = M;
                Iterator<f.h.b.b.w1.b> it = o1Var.f4425j.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
        r1 r1Var = new r1(bVar.a);
        this.o = r1Var;
        r1Var.c = false;
        r1Var.a();
        s1 s1Var = new s1(bVar.a);
        this.p = s1Var;
        s1Var.c = false;
        s1Var.a();
        this.J = M(this.n);
        Q(i2, 102, Integer.valueOf(this.z));
        Q(2, 102, Integer.valueOf(this.z));
        Q(i2, 3, this.A);
        Q(2, 4, Integer.valueOf(this.u));
        Q(i2, 101, Boolean.valueOf(this.C));
    }

    public static f.h.b.b.w1.a M(p1 p1Var) {
        Objects.requireNonNull(p1Var);
        return new f.h.b.b.w1.a(0, f.h.b.b.g2.b0.a >= 28 ? p1Var.f4440d.getStreamMinVolume(p1Var.f4442f) : 0, p1Var.f4440d.getStreamMaxVolume(p1Var.f4442f));
    }

    public static int N(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    public static void a(o1 o1Var) {
        int v = o1Var.v();
        boolean z = true;
        if (v != 1) {
            if (v == 2 || v == 3) {
                o1Var.Z();
                boolean z2 = o1Var.f4419d.x.o;
                r1 r1Var = o1Var.o;
                r1Var.f4478d = (!o1Var.h() || z2) ? false : false;
                r1Var.a();
                s1 s1Var = o1Var.p;
                s1Var.f4479d = o1Var.h();
                s1Var.a();
                return;
            } else if (v != 4) {
                throw new IllegalStateException();
            }
        }
        r1 r1Var2 = o1Var.o;
        r1Var2.f4478d = false;
        r1Var2.a();
        s1 s1Var2 = o1Var.p;
        s1Var2.f4479d = false;
        s1Var2.a();
    }

    @Override // f.h.b.b.f1
    public int A() {
        Z();
        return this.f4419d.x.f3798l;
    }

    @Override // f.h.b.b.f1
    public TrackGroupArray B() {
        Z();
        return this.f4419d.x.f3793g;
    }

    @Override // f.h.b.b.f1
    public int C() {
        Z();
        return this.f4419d.q;
    }

    @Override // f.h.b.b.f1
    public q1 D() {
        Z();
        return this.f4419d.x.a;
    }

    @Override // f.h.b.b.f1
    public Looper E() {
        return this.f4419d.n;
    }

    @Override // f.h.b.b.f1
    public boolean F() {
        Z();
        return this.f4419d.r;
    }

    @Override // f.h.b.b.f1
    public long G() {
        Z();
        return this.f4419d.G();
    }

    @Override // f.h.b.b.f1
    public f.h.b.b.d2.k H() {
        Z();
        return this.f4419d.H();
    }

    @Override // f.h.b.b.f1
    public int I(int i2) {
        Z();
        return this.f4419d.c[i2].x();
    }

    @Override // f.h.b.b.f1
    public long J() {
        Z();
        return this.f4419d.J();
    }

    @Override // f.h.b.b.f1
    public f1.c K() {
        return this;
    }

    public void L(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof f.h.b.b.h2.p) {
            if (surfaceView.getHolder() == this.v) {
                R(null);
                this.v = null;
                return;
            }
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        Z();
        if (holder == null || holder != this.v) {
            return;
        }
        T(null);
    }

    public final void O(final int i2, final int i3) {
        if (i2 == this.x && i3 == this.y) {
            return;
        }
        this.x = i2;
        this.y = i3;
        f.h.b.b.t1.w0 w0Var = this.f4426k;
        final x0.a U = w0Var.U();
        l.a<f.h.b.b.t1.x0> aVar = new l.a() { // from class: f.h.b.b.t1.n
            @Override // f.h.b.b.g2.l.a
            public final void b(Object obj) {
                ((x0) obj).n();
            }
        };
        w0Var.f4493j.put(1029, U);
        f.h.b.b.g2.l<f.h.b.b.t1.x0, x0.b> lVar = w0Var.f4494k;
        lVar.b(1029, aVar);
        lVar.a();
        Iterator<f.h.b.b.h2.v> it = this.f4421f.iterator();
        while (it.hasNext()) {
            it.next().f(i2, i3);
        }
    }

    public final void P() {
        TextureView textureView = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f4420e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.w.setSurfaceTextureListener(null);
            }
            this.w = null;
        }
        SurfaceHolder surfaceHolder = this.v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f4420e);
            this.v = null;
        }
    }

    public final void Q(int i2, int i3, Object obj) {
        j1[] j1VarArr;
        for (j1 j1Var : this.b) {
            if (j1Var.x() == i2) {
                g1 a2 = this.f4419d.a(j1Var);
                f.h.b.b.e2.j.g(!a2.f4261i);
                a2.f4257e = i3;
                f.h.b.b.e2.j.g(!a2.f4261i);
                a2.f4258f = obj;
                a2.d();
            }
        }
    }

    public final void R(f.h.b.b.h2.r rVar) {
        Q(2, 8, rVar);
    }

    public void S(Surface surface) {
        Z();
        P();
        if (surface != null) {
            R(null);
        }
        U(surface, false);
        int i2 = surface != null ? -1 : 0;
        O(i2, i2);
    }

    public void T(SurfaceHolder surfaceHolder) {
        Z();
        P();
        if (surfaceHolder != null) {
            R(null);
        }
        this.v = surfaceHolder;
        if (surfaceHolder == null) {
            U(null, false);
            O(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f4420e);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            U(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            O(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        U(null, false);
        O(0, 0);
    }

    public final void U(Surface surface, boolean z) {
        j1[] j1VarArr;
        ArrayList arrayList = new ArrayList();
        for (j1 j1Var : this.b) {
            if (j1Var.x() == 2) {
                g1 a2 = this.f4419d.a(j1Var);
                f.h.b.b.e2.j.g(!a2.f4261i);
                a2.f4257e = 1;
                f.h.b.b.e2.j.g(!a2.f4261i);
                a2.f4258f = surface;
                a2.d();
                arrayList.add(a2);
            }
        }
        Surface surface2 = this.s;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((g1) it.next()).a(this.q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f4419d.R(false, ExoPlaybackException.b(new ExoTimeoutException(3)));
            }
            if (this.t) {
                this.s.release();
            }
        }
        this.s = surface;
        this.t = z;
    }

    public void V(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof f.h.b.b.h2.p) {
            f.h.b.b.h2.r videoDecoderOutputBufferRenderer = ((f.h.b.b.h2.p) surfaceView).getVideoDecoderOutputBufferRenderer();
            Z();
            P();
            U(null, false);
            O(0, 0);
            this.v = surfaceView.getHolder();
            R(videoDecoderOutputBufferRenderer);
            return;
        }
        T(surfaceView != null ? surfaceView.getHolder() : null);
    }

    public void W(TextureView textureView) {
        Z();
        P();
        if (textureView != null) {
            R(null);
        }
        this.w = textureView;
        if (textureView == null) {
            U(null, true);
            O(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f4420e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            U(null, true);
            O(0, 0);
            return;
        }
        U(new Surface(surfaceTexture), true);
        O(textureView.getWidth(), textureView.getHeight());
    }

    public void X(boolean z) {
        Z();
        this.f4428m.d(h(), 1);
        this.f4419d.R(z, null);
        this.D = Collections.emptyList();
    }

    public final void Y(boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = z && i2 != -1;
        if (z2 && i2 != 1) {
            i4 = 1;
        }
        this.f4419d.Q(z2, i4, i3);
    }

    public final void Z() {
        if (Looper.myLooper() != this.f4419d.n) {
            if (!this.G) {
                f.h.b.b.g2.m.c("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.H ? null : new IllegalStateException());
                this.H = true;
                return;
            }
            throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
        }
    }

    public void b(Surface surface) {
        Z();
        if (surface == null || surface != this.s) {
            return;
        }
        Z();
        P();
        U(null, false);
        O(0, 0);
    }

    @Override // f.h.b.b.f1
    public c1 c() {
        Z();
        return this.f4419d.x.f3799m;
    }

    @Override // f.h.b.b.f1
    public void d() {
        Z();
        boolean h2 = h();
        int d2 = this.f4428m.d(h2, 2);
        Y(h2, d2, N(h2, d2));
        this.f4419d.d();
    }

    @Override // f.h.b.b.f1
    public boolean e() {
        Z();
        return this.f4419d.e();
    }

    @Override // f.h.b.b.f1
    public long f() {
        Z();
        return h0.b(this.f4419d.x.q);
    }

    @Override // f.h.b.b.f1
    public void g(int i2, long j2) {
        Z();
        f.h.b.b.t1.w0 w0Var = this.f4426k;
        if (!w0Var.f4496m) {
            final x0.a P = w0Var.P();
            w0Var.f4496m = true;
            l.a<f.h.b.b.t1.x0> aVar = new l.a() { // from class: f.h.b.b.t1.q0
                @Override // f.h.b.b.g2.l.a
                public final void b(Object obj) {
                    ((x0) obj).T();
                }
            };
            w0Var.f4493j.put(-1, P);
            f.h.b.b.g2.l<f.h.b.b.t1.x0, x0.b> lVar = w0Var.f4494k;
            lVar.b(-1, aVar);
            lVar.a();
        }
        this.f4419d.g(i2, j2);
    }

    @Override // f.h.b.b.f1
    public long getDuration() {
        Z();
        return this.f4419d.getDuration();
    }

    @Override // f.h.b.b.f1
    public boolean h() {
        Z();
        return this.f4419d.x.f3797k;
    }

    @Override // f.h.b.b.f1
    public void i(boolean z) {
        Z();
        this.f4419d.i(z);
    }

    @Override // f.h.b.b.f1
    public List<Metadata> j() {
        Z();
        return this.f4419d.x.f3795i;
    }

    @Override // f.h.b.b.f1
    public int k() {
        Z();
        return this.f4419d.k();
    }

    @Override // f.h.b.b.f1
    public void m(f1.a aVar) {
        Objects.requireNonNull(aVar);
        this.f4419d.m(aVar);
    }

    @Override // f.h.b.b.f1
    public int n() {
        Z();
        return this.f4419d.n();
    }

    @Override // f.h.b.b.f1
    public void o(f1.a aVar) {
        this.f4419d.o(aVar);
    }

    @Override // f.h.b.b.f1
    public int p() {
        Z();
        return this.f4419d.p();
    }

    @Override // f.h.b.b.f1
    public ExoPlaybackException q() {
        Z();
        return this.f4419d.x.f3791e;
    }

    @Override // f.h.b.b.f1
    public void r(boolean z) {
        Z();
        int d2 = this.f4428m.d(z, v());
        Y(z, d2, N(z, d2));
    }

    @Override // f.h.b.b.f1
    public f1.d s() {
        return this;
    }

    @Override // f.h.b.b.f1
    public long t() {
        Z();
        return this.f4419d.t();
    }

    @Override // f.h.b.b.f1
    public int v() {
        Z();
        return this.f4419d.x.f3790d;
    }

    @Override // f.h.b.b.f1
    public int x() {
        Z();
        return this.f4419d.x();
    }

    @Override // f.h.b.b.f1
    public void y(int i2) {
        Z();
        this.f4419d.y(i2);
    }
}
