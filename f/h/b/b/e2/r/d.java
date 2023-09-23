package f.h.b.b.e2.r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* compiled from: OrientationListener.java */
/* loaded from: classes.dex */
public final class d implements SensorEventListener {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f4151d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    public final Display f4152e;

    /* renamed from: f  reason: collision with root package name */
    public final a[] f4153f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4154g;

    /* compiled from: OrientationListener.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(float[] fArr, float f2);
    }

    public d(Display display, a... aVarArr) {
        this.f4152e = display;
        this.f4153f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent.values);
        float[] fArr = this.a;
        int rotation = this.f4152e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            int i3 = 130;
            if (rotation == 1) {
                i2 = 2;
                i3 = 129;
            } else if (rotation != 2) {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
                i3 = 1;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.b, i2, i3, fArr);
        }
        SensorManager.remapCoordinateSystem(this.a, 1, 131, this.b);
        SensorManager.getOrientation(this.b, this.f4151d);
        float f2 = this.f4151d[2];
        Matrix.rotateM(this.a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.a;
        if (!this.f4154g) {
            f.h.b.b.h2.x.c.a(this.c, fArr3);
            this.f4154g = true;
        }
        float[] fArr4 = this.b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.b, 0, this.c, 0);
        float[] fArr5 = this.a;
        for (a aVar : this.f4153f) {
            aVar.a(fArr5, f2);
        }
    }
}
