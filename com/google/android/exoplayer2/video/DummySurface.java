package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DummySurface extends Surface {

    /* renamed from: h  reason: collision with root package name */
    public static int f1034h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f1035i;

    /* renamed from: f  reason: collision with root package name */
    public final b f1036f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1037g;

    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        public EGLSurfaceTexture f1038f;

        /* renamed from: g  reason: collision with root package name */
        public Handler f1039g;

        /* renamed from: h  reason: collision with root package name */
        public Error f1040h;

        /* renamed from: i  reason: collision with root package name */
        public RuntimeException f1041i;

        /* renamed from: j  reason: collision with root package name */
        public DummySurface f1042j;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public final void a(int i2) {
            EGLSurface eglCreatePbufferSurface;
            Objects.requireNonNull(this.f1038f);
            EGLSurfaceTexture eGLSurfaceTexture = this.f1038f;
            Objects.requireNonNull(eGLSurfaceTexture);
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    eGLSurfaceTexture.f1025h = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.f1022l, 0, eGLConfigArr, 0, 1, iArr2, 0);
                    if (eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f1025h, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                        if (eglCreateContext != null) {
                            eGLSurfaceTexture.f1026i = eglCreateContext;
                            EGLDisplay eGLDisplay = eGLSurfaceTexture.f1025h;
                            if (i2 == 1) {
                                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eglCreatePbufferSurface == null) {
                                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed", null);
                                }
                            }
                            if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                eGLSurfaceTexture.f1027j = eglCreatePbufferSurface;
                                GLES20.glGenTextures(1, eGLSurfaceTexture.f1024g, 0);
                                j.e();
                                SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f1024g[0]);
                                eGLSurfaceTexture.f1028k = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
                                SurfaceTexture surfaceTexture2 = this.f1038f.f1028k;
                                Objects.requireNonNull(surfaceTexture2);
                                this.f1042j = new DummySurface(this, surfaceTexture2, i2 != 0, null);
                                return;
                            }
                            throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed", null);
                        }
                        throw new EGLSurfaceTexture.GlException("eglCreateContext failed", null);
                    }
                    throw new EGLSurfaceTexture.GlException(b0.k("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
                }
                throw new EGLSurfaceTexture.GlException("eglInitialize failed", null);
            }
            throw new EGLSurfaceTexture.GlException("eglGetDisplay failed", null);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
        public final void b() {
            Objects.requireNonNull(this.f1038f);
            EGLSurfaceTexture eGLSurfaceTexture = this.f1038f;
            eGLSurfaceTexture.f1023f.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f1028k;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f1024g, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f1025h;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f1025h;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f1027j;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f1025h, eGLSurfaceTexture.f1027j);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f1026i;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f1025h, eGLContext);
                }
                if (b0.a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f1025h;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f1025h);
                }
                eGLSurfaceTexture.f1025h = null;
                eGLSurfaceTexture.f1026i = null;
                eGLSurfaceTexture.f1027j = null;
                eGLSurfaceTexture.f1028k = null;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    m.b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f1040h = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    m.b("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f1041i = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z, a aVar) {
        super(surfaceTexture);
        this.f1036f = bVar;
    }

    public static int b(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i2 = b0.a;
        boolean z = false;
        if (i2 >= 24 && (i2 >= 26 || !("samsung".equals(b0.c) || "XT1650".equals(b0.f4268d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content"))) {
            if (i2 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
                z = true;
            }
            return z ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            if (!f1035i) {
                f1034h = b(context);
                f1035i = true;
            }
            z = f1034h != 0;
        }
        return z;
    }

    public static DummySurface d(Context context, boolean z) {
        boolean z2 = false;
        j.g(!z || c(context));
        b bVar = new b();
        int i2 = z ? f1034h : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f1039g = handler;
        bVar.f1038f = new EGLSurfaceTexture(handler);
        synchronized (bVar) {
            bVar.f1039g.obtainMessage(1, i2, 0).sendToTarget();
            while (bVar.f1042j == null && bVar.f1041i == null && bVar.f1040h == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f1041i;
        if (runtimeException == null) {
            Error error = bVar.f1040h;
            if (error == null) {
                DummySurface dummySurface = bVar.f1042j;
                Objects.requireNonNull(dummySurface);
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f1036f) {
            if (!this.f1037g) {
                b bVar = this.f1036f;
                Objects.requireNonNull(bVar.f1039g);
                bVar.f1039g.sendEmptyMessage(2);
                this.f1037g = true;
            }
        }
    }
}
