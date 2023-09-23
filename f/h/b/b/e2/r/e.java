package f.h.b.b.e2.r;

import f.h.b.b.e2.j;
import f.h.b.b.h2.x.d;
import java.nio.FloatBuffer;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4155j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f4156k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4157l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f4158m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    public int a;
    public a b;
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public int f4159d;

    /* renamed from: e  reason: collision with root package name */
    public int f4160e;

    /* renamed from: f  reason: collision with root package name */
    public int f4161f;

    /* renamed from: g  reason: collision with root package name */
    public int f4162g;

    /* renamed from: h  reason: collision with root package name */
    public int f4163h;

    /* renamed from: i  reason: collision with root package name */
    public int f4164i;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final FloatBuffer b;
        public final FloatBuffer c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4165d;

        public a(d.b bVar) {
            float[] fArr = bVar.c;
            this.a = fArr.length / 3;
            this.b = j.l(fArr);
            this.c = j.l(bVar.f4385d);
            int i2 = bVar.b;
            if (i2 == 1) {
                this.f4165d = 5;
            } else if (i2 != 2) {
                this.f4165d = 4;
            } else {
                this.f4165d = 6;
            }
        }
    }

    public static boolean a(f.h.b.b.h2.x.d dVar) {
        d.a aVar = dVar.a;
        d.a aVar2 = dVar.b;
        d.b[] bVarArr = aVar.a;
        if (bVarArr.length == 1 && bVarArr[0].a == 0) {
            d.b[] bVarArr2 = aVar2.a;
            if (bVarArr2.length == 1 && bVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }
}
