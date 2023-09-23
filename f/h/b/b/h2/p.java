package f.h.b.b.h2;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: VideoDecoderGLSurfaceView.java */
/* loaded from: classes.dex */
public class p extends GLSurfaceView {

    /* renamed from: f  reason: collision with root package name */
    public final o f4366f;

    public p(Context context) {
        super(context, null);
        o oVar = new o(this);
        this.f4366f = oVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(oVar);
        setRenderMode(0);
    }

    public r getVideoDecoderOutputBufferRenderer() {
        return this.f4366f;
    }
}
