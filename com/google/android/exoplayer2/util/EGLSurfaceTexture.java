package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f1022l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: f  reason: collision with root package name */
    public final Handler f1023f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1024g = new int[1];

    /* renamed from: h  reason: collision with root package name */
    public EGLDisplay f1025h;

    /* renamed from: i  reason: collision with root package name */
    public EGLContext f1026i;

    /* renamed from: j  reason: collision with root package name */
    public EGLSurface f1027j;

    /* renamed from: k  reason: collision with root package name */
    public SurfaceTexture f1028k;

    /* loaded from: classes.dex */
    public static final class GlException extends RuntimeException {
        public GlException(String str, a aVar) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f1023f = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f1023f.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.f1028k;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
