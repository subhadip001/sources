package f.h.b.b.e2.r;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import f.h.b.b.e2.j;
import f.h.b.b.e2.r.d;
import f.h.b.b.e2.r.e;
import f.h.b.b.e2.r.i;
import f.h.b.b.f1;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.z;
import f.h.b.b.o1;
import java.nio.Buffer;
import java.util.Objects;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes.dex */
public final class h extends GLSurfaceView {

    /* renamed from: f  reason: collision with root package name */
    public final SensorManager f4176f;

    /* renamed from: g  reason: collision with root package name */
    public final Sensor f4177g;

    /* renamed from: h  reason: collision with root package name */
    public final d f4178h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f4179i;

    /* renamed from: j  reason: collision with root package name */
    public final i f4180j;

    /* renamed from: k  reason: collision with root package name */
    public final f f4181k;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceTexture f4182l;

    /* renamed from: m  reason: collision with root package name */
    public Surface f4183m;
    public f1.d n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes.dex */
    public class a implements GLSurfaceView.Renderer, i.a, d.a {

        /* renamed from: f  reason: collision with root package name */
        public final f f4184f;

        /* renamed from: i  reason: collision with root package name */
        public final float[] f4187i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f4188j;

        /* renamed from: k  reason: collision with root package name */
        public final float[] f4189k;

        /* renamed from: l  reason: collision with root package name */
        public float f4190l;

        /* renamed from: m  reason: collision with root package name */
        public float f4191m;

        /* renamed from: g  reason: collision with root package name */
        public final float[] f4185g = new float[16];

        /* renamed from: h  reason: collision with root package name */
        public final float[] f4186h = new float[16];
        public final float[] n = new float[16];
        public final float[] o = new float[16];

        public a(f fVar) {
            float[] fArr = new float[16];
            this.f4187i = fArr;
            float[] fArr2 = new float[16];
            this.f4188j = fArr2;
            float[] fArr3 = new float[16];
            this.f4189k = fArr3;
            this.f4184f = fVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f4191m = 3.1415927f;
        }

        @Override // f.h.b.b.e2.r.d.a
        public synchronized void a(float[] fArr, float f2) {
            float[] fArr2 = this.f4187i;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f4191m = -f2;
            b();
        }

        public final void b() {
            Matrix.setRotateM(this.f4188j, 0, -this.f4190l, (float) Math.cos(this.f4191m), (float) Math.sin(this.f4191m), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long d2;
            float[] fArr2;
            synchronized (this) {
                Matrix.multiplyMM(this.o, 0, this.f4187i, 0, this.f4189k, 0);
                Matrix.multiplyMM(this.n, 0, this.f4188j, 0, this.o, 0);
            }
            Matrix.multiplyMM(this.f4186h, 0, this.f4185g, 0, this.n, 0);
            f fVar = this.f4184f;
            float[] fArr3 = this.f4186h;
            Objects.requireNonNull(fVar);
            GLES20.glClear(16384);
            j.e();
            if (fVar.a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = fVar.f4172j;
                Objects.requireNonNull(surfaceTexture);
                surfaceTexture.updateTexImage();
                j.e();
                if (fVar.b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(fVar.f4169g, 0);
                }
                long timestamp = fVar.f4172j.getTimestamp();
                z<Long> zVar = fVar.f4167e;
                synchronized (zVar) {
                    d2 = zVar.d(timestamp, false);
                }
                Long l2 = d2;
                if (l2 != null) {
                    f.h.b.b.h2.x.c cVar = fVar.f4166d;
                    float[] fArr4 = fVar.f4169g;
                    float[] e2 = cVar.c.e(l2.longValue());
                    if (e2 != null) {
                        float[] fArr5 = cVar.b;
                        float f2 = e2[0];
                        float f3 = -e2[1];
                        float f4 = -e2[2];
                        float length = Matrix.length(f2, f3, f4);
                        if (length != 0.0f) {
                            fArr2 = fArr4;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
                        } else {
                            fArr2 = fArr4;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!cVar.f4383d) {
                            f.h.b.b.h2.x.c.a(cVar.a, cVar.b);
                            cVar.f4383d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, cVar.a, 0, cVar.b, 0);
                    }
                }
                f.h.b.b.h2.x.d e3 = fVar.f4168f.e(timestamp);
                if (e3 != null) {
                    e eVar = fVar.c;
                    Objects.requireNonNull(eVar);
                    if (e.a(e3)) {
                        eVar.a = e3.c;
                        e.a aVar = new e.a(e3.a.a[0]);
                        eVar.b = aVar;
                        if (!e3.f4384d) {
                            aVar = new e.a(e3.b.a[0]);
                        }
                        eVar.c = aVar;
                    }
                }
            }
            Matrix.multiplyMM(fVar.f4170h, 0, fArr3, 0, fVar.f4169g, 0);
            e eVar2 = fVar.c;
            int i2 = fVar.f4171i;
            float[] fArr6 = fVar.f4170h;
            e.a aVar2 = eVar2.b;
            if (aVar2 == null) {
                return;
            }
            GLES20.glUseProgram(eVar2.f4159d);
            j.e();
            GLES20.glEnableVertexAttribArray(eVar2.f4162g);
            GLES20.glEnableVertexAttribArray(eVar2.f4163h);
            j.e();
            int i3 = eVar2.a;
            if (i3 == 1) {
                fArr = e.f4158m;
            } else if (i3 == 2) {
                fArr = e.o;
            } else {
                fArr = e.f4157l;
            }
            GLES20.glUniformMatrix3fv(eVar2.f4161f, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(eVar2.f4160e, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(eVar2.f4164i, 0);
            j.e();
            GLES20.glVertexAttribPointer(eVar2.f4162g, 3, 5126, false, 12, (Buffer) aVar2.b);
            j.e();
            GLES20.glVertexAttribPointer(eVar2.f4163h, 2, 5126, false, 8, (Buffer) aVar2.c);
            j.e();
            GLES20.glDrawArrays(aVar2.f4165d, 0, aVar2.a);
            j.e();
            GLES20.glDisableVertexAttribArray(eVar2.f4162g);
            GLES20.glDisableVertexAttribArray(eVar2.f4163h);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f4185g, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            final h hVar = h.this;
            final SurfaceTexture d2 = this.f4184f.d();
            hVar.f4179i.post(new Runnable() { // from class: f.h.b.b.e2.r.c
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar2 = h.this;
                    SurfaceTexture surfaceTexture = d2;
                    SurfaceTexture surfaceTexture2 = hVar2.f4182l;
                    Surface surface = hVar2.f4183m;
                    hVar2.f4182l = surfaceTexture;
                    Surface surface2 = new Surface(surfaceTexture);
                    hVar2.f4183m = surface2;
                    f1.d dVar = hVar2.n;
                    if (dVar != null) {
                        ((o1) dVar).S(surface2);
                    }
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                    }
                    if (surface != null) {
                        surface.release();
                    }
                }
            });
        }
    }

    public h(Context context) {
        super(context, null);
        this.f4179i = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f4176f = sensorManager;
        Sensor defaultSensor = b0.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f4177g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        f fVar = new f();
        this.f4181k = fVar;
        a aVar = new a(fVar);
        i iVar = new i(context, aVar, 25.0f);
        this.f4180j = iVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        this.f4178h = new d(windowManager.getDefaultDisplay(), iVar, aVar);
        this.o = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(iVar);
    }

    public final void a() {
        boolean z = this.o && this.p;
        Sensor sensor = this.f4177g;
        if (sensor == null || z == this.q) {
            return;
        }
        if (z) {
            this.f4176f.registerListener(this.f4178h, sensor, 0);
        } else {
            this.f4176f.unregisterListener(this.f4178h);
        }
        this.q = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4179i.post(new Runnable() { // from class: f.h.b.b.e2.r.b
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                Surface surface = hVar.f4183m;
                if (surface != null) {
                    f1.d dVar = hVar.n;
                    if (dVar != null) {
                        ((o1) dVar).b(surface);
                    }
                    SurfaceTexture surfaceTexture = hVar.f4182l;
                    Surface surface2 = hVar.f4183m;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    if (surface2 != null) {
                        surface2.release();
                    }
                    hVar.f4182l = null;
                    hVar.f4183m = null;
                }
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.p = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.p = true;
        a();
    }

    public void setDefaultStereoMode(int i2) {
        this.f4181k.f4173k = i2;
    }

    public void setSingleTapListener(g gVar) {
        this.f4180j.f4198l = gVar;
    }

    public void setUseSensorRotation(boolean z) {
        this.o = z;
        a();
    }

    public void setVideoComponent(f1.d dVar) {
        f1.d dVar2 = this.n;
        if (dVar == dVar2) {
            return;
        }
        if (dVar2 != null) {
            Surface surface = this.f4183m;
            if (surface != null) {
                ((o1) dVar2).b(surface);
            }
            f1.d dVar3 = this.n;
            f fVar = this.f4181k;
            o1 o1Var = (o1) dVar3;
            o1Var.Z();
            if (o1Var.E == fVar) {
                o1Var.Q(2, 6, null);
            }
            f1.d dVar4 = this.n;
            f fVar2 = this.f4181k;
            o1 o1Var2 = (o1) dVar4;
            o1Var2.Z();
            if (o1Var2.F == fVar2) {
                o1Var2.Q(6, 7, null);
            }
        }
        this.n = dVar;
        if (dVar != null) {
            f fVar3 = this.f4181k;
            o1 o1Var3 = (o1) dVar;
            o1Var3.Z();
            o1Var3.E = fVar3;
            o1Var3.Q(2, 6, fVar3);
            f1.d dVar5 = this.n;
            f fVar4 = this.f4181k;
            o1 o1Var4 = (o1) dVar5;
            o1Var4.Z();
            o1Var4.F = fVar4;
            o1Var4.Q(6, 7, fVar4);
            ((o1) this.n).S(this.f4183m);
        }
    }
}
