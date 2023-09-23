package f.h.b.b.h2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.firebase.messaging.Constants;
import f.h.b.b.g2.b0;
import java.util.Objects;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes.dex */
public final class t {
    public final l a = new l();
    public final WindowManager b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4367d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4368e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f4369f;

    /* renamed from: g  reason: collision with root package name */
    public float f4370g;

    /* renamed from: h  reason: collision with root package name */
    public float f4371h;

    /* renamed from: i  reason: collision with root package name */
    public float f4372i;

    /* renamed from: j  reason: collision with root package name */
    public float f4373j;

    /* renamed from: k  reason: collision with root package name */
    public long f4374k;

    /* renamed from: l  reason: collision with root package name */
    public long f4375l;

    /* renamed from: m  reason: collision with root package name */
    public long f4376m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public final class a implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                t.this.d();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes.dex */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: k  reason: collision with root package name */
        public static final b f4377k = new b();

        /* renamed from: f  reason: collision with root package name */
        public volatile long f4378f = -9223372036854775807L;

        /* renamed from: g  reason: collision with root package name */
        public final Handler f4379g;

        /* renamed from: h  reason: collision with root package name */
        public final HandlerThread f4380h;

        /* renamed from: i  reason: collision with root package name */
        public Choreographer f4381i;

        /* renamed from: j  reason: collision with root package name */
        public int f4382j;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f4380h = handlerThread;
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i2 = b0.a;
            Handler handler = new Handler(looper, this);
            this.f4379g = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f4378f = j2;
            Choreographer choreographer = this.f4381i;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f4381i = Choreographer.getInstance();
                return true;
            } else if (i2 == 1) {
                int i3 = this.f4382j + 1;
                this.f4382j = i3;
                if (i3 == 1) {
                    Choreographer choreographer = this.f4381i;
                    Objects.requireNonNull(choreographer);
                    choreographer.postFrameCallback(this);
                }
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                int i4 = this.f4382j - 1;
                this.f4382j = i4;
                if (i4 == 0) {
                    Choreographer choreographer2 = this.f4381i;
                    Objects.requireNonNull(choreographer2);
                    choreographer2.removeFrameCallback(this);
                    this.f4378f = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    public t(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.b = (WindowManager) context.getSystemService("window");
        } else {
            this.b = null;
        }
        if (this.b != null) {
            if (b0.a >= 17) {
                Objects.requireNonNull(context);
                DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                if (displayManager != null) {
                    aVar = new a(displayManager);
                }
            }
            this.f4367d = aVar;
            this.c = b.f4377k;
        } else {
            this.f4367d = null;
            this.c = null;
        }
        this.f4374k = -9223372036854775807L;
        this.f4375l = -9223372036854775807L;
        this.f4370g = -1.0f;
        this.f4373j = 1.0f;
    }

    public static void c(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            f.h.b.b.g2.m.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }

    public final void a() {
        Surface surface;
        if (b0.a < 30 || (surface = this.f4369f) == null || this.f4372i == 0.0f) {
            return;
        }
        this.f4372i = 0.0f;
        c(surface, 0.0f);
    }

    public final void b() {
        this.f4376m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void d() {
        WindowManager windowManager = this.b;
        Objects.requireNonNull(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.f4374k = refreshRate;
            this.f4375l = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f4374k = -9223372036854775807L;
        this.f4375l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (java.lang.Math.abs(r0 - r10.f4371h) < (!r1 ? 0.02f : 1.0f)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r10.a.f4350e >= 30) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r10 = this;
            int r0 = f.h.b.b.g2.b0.a
            r1 = 30
            if (r0 < r1) goto L98
            android.view.Surface r0 = r10.f4369f
            if (r0 != 0) goto Lc
            goto L98
        Lc:
            f.h.b.b.h2.l r0 = r10.a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L38
            f.h.b.b.h2.l r0 = r10.a
            boolean r3 = r0.a()
            if (r3 == 0) goto L35
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            f.h.b.b.h2.l$a r0 = r0.a
            long r5 = r0.f4352e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2e
            goto L31
        L2e:
            long r7 = r0.f4353f
            long r7 = r7 / r5
        L31:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L3a
        L35:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3a
        L38:
            float r0 = r10.f4370g
        L3a:
            float r3 = r10.f4371h
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L41
            return
        L41:
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L88
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L88
            f.h.b.b.h2.l r1 = r10.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L70
            f.h.b.b.h2.l r1 = r10.a
            boolean r2 = r1.a()
            if (r2 == 0) goto L60
            f.h.b.b.h2.l$a r1 = r1.a
            long r1 = r1.f4353f
            goto L65
        L60:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            if (r1 == 0) goto L77
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L79
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
        L79:
            float r2 = r10.f4371h
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L86
            goto L91
        L86:
            r5 = 0
            goto L91
        L88:
            if (r6 == 0) goto L8b
            goto L91
        L8b:
            f.h.b.b.h2.l r2 = r10.a
            int r2 = r2.f4350e
            if (r2 < r1) goto L86
        L91:
            if (r5 == 0) goto L98
            r10.f4371h = r0
            r10.f(r4)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.h2.t.e():void");
    }

    public final void f(boolean z) {
        Surface surface;
        if (b0.a < 30 || (surface = this.f4369f) == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.f4368e) {
            float f3 = this.f4371h;
            if (f3 != -1.0f) {
                f2 = this.f4373j * f3;
            }
        }
        if (z || this.f4372i != f2) {
            this.f4372i = f2;
            c(surface, f2);
        }
    }
}
