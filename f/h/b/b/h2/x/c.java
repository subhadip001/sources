package f.h.b.b.h2.x;

import android.opengl.Matrix;
import f.h.b.b.g2.z;

/* compiled from: FrameRotationQueue.java */
/* loaded from: classes.dex */
public final class c {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final z<float[]> c = new z<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4383d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }
}
