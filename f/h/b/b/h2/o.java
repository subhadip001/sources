package f.h.b.b.h2;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLFrameRenderer.java */
/* loaded from: classes.dex */
public class o implements GLSurfaceView.Renderer, r {
    public static final float[] o = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    public static final float[] p = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    public static final float[] q = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    public static final String[] r = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer s = f.h.b.b.e2.j.l(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: i  reason: collision with root package name */
    public int f4361i;

    /* renamed from: k  reason: collision with root package name */
    public int f4363k;
    public q n;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4358f = new int[3];

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<q> f4359g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    public FloatBuffer[] f4360h = new FloatBuffer[3];

    /* renamed from: j  reason: collision with root package name */
    public int[] f4362j = new int[3];

    /* renamed from: l  reason: collision with root package name */
    public int[] f4364l = new int[3];

    /* renamed from: m  reason: collision with root package name */
    public int[] f4365m = new int[3];

    public o(GLSurfaceView gLSurfaceView) {
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.f4364l;
            this.f4365m[i2] = -1;
            iArr[i2] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        q andSet = this.f4359g.getAndSet(null);
        if (andSet == null && this.n == null) {
            return;
        }
        if (andSet != null) {
            q qVar = this.n;
            if (qVar != null) {
                Objects.requireNonNull(qVar);
                throw null;
            }
            this.n = andSet;
        }
        Objects.requireNonNull(this.n);
        GLES20.glUniformMatrix3fv(this.f4363k, 1, false, p, 0);
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int k2 = f.h.b.b.e2.j.k("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f4361i = k2;
        GLES20.glUseProgram(k2);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f4361i, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) s);
        this.f4362j[0] = GLES20.glGetAttribLocation(this.f4361i, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f4362j[0]);
        this.f4362j[1] = GLES20.glGetAttribLocation(this.f4361i, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f4362j[1]);
        this.f4362j[2] = GLES20.glGetAttribLocation(this.f4361i, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f4362j[2]);
        f.h.b.b.e2.j.e();
        this.f4363k = GLES20.glGetUniformLocation(this.f4361i, "mColorConversion");
        f.h.b.b.e2.j.e();
        GLES20.glGenTextures(3, this.f4358f, 0);
        for (int i2 = 0; i2 < 3; i2++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f4361i, r[i2]), i2);
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.f4358f[i2]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        f.h.b.b.e2.j.e();
        f.h.b.b.e2.j.e();
    }
}
