package f.h.b.b.e2.r;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import f.h.b.b.e2.j;
import f.h.b.b.g2.t;
import f.h.b.b.g2.z;
import f.h.b.b.h2.s;
import f.h.b.b.h2.x.d;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SceneRenderer.java */
/* loaded from: classes.dex */
public final class f implements s, f.h.b.b.h2.x.a {

    /* renamed from: i  reason: collision with root package name */
    public int f4171i;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f4172j;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f4175m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final e c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.b.h2.x.c f4166d = new f.h.b.b.h2.x.c();

    /* renamed from: e  reason: collision with root package name */
    public final z<Long> f4167e = new z<>();

    /* renamed from: f  reason: collision with root package name */
    public final z<f.h.b.b.h2.x.d> f4168f = new z<>();

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4169g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4170h = new float[16];

    /* renamed from: k  reason: collision with root package name */
    public volatile int f4173k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4174l = -1;

    @Override // f.h.b.b.h2.x.a
    public void a(long j2, float[] fArr) {
        this.f4166d.c.a(j2, fArr);
    }

    @Override // f.h.b.b.h2.x.a
    public void b() {
        this.f4167e.b();
        f.h.b.b.h2.x.c cVar = this.f4166d;
        cVar.c.b();
        cVar.f4383d = false;
        this.b.set(true);
    }

    @Override // f.h.b.b.h2.s
    public void c(long j2, long j3, Format format, MediaFormat mediaFormat) {
        float f2;
        float f3;
        int i2;
        int i3;
        ArrayList<d.a> arrayList;
        int f4;
        this.f4167e.a(j3, Long.valueOf(j2));
        byte[] bArr = format.A;
        int i4 = format.B;
        byte[] bArr2 = this.f4175m;
        int i5 = this.f4174l;
        this.f4175m = bArr;
        if (i4 == -1) {
            i4 = this.f4173k;
        }
        this.f4174l = i4;
        if (i5 == i4 && Arrays.equals(bArr2, this.f4175m)) {
            return;
        }
        byte[] bArr3 = this.f4175m;
        f.h.b.b.h2.x.d dVar = null;
        if (bArr3 != null) {
            int i6 = this.f4174l;
            t tVar = new t(bArr3);
            try {
                tVar.D(4);
                f4 = tVar.f();
                tVar.C(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (f4 == 1886547818) {
                tVar.D(8);
                int i7 = tVar.b;
                int i8 = tVar.c;
                while (i7 < i8) {
                    int f5 = tVar.f() + i7;
                    if (f5 <= i7 || f5 > i8) {
                        break;
                    }
                    int f6 = tVar.f();
                    if (f6 != 2037673328 && f6 != 1836279920) {
                        tVar.C(f5);
                        i7 = f5;
                    }
                    tVar.B(f5);
                    arrayList = j.s(tVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = j.s(tVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    dVar = new f.h.b.b.h2.x.d(arrayList.get(0), i6);
                } else if (size == 2) {
                    dVar = new f.h.b.b.h2.x.d(arrayList.get(0), arrayList.get(1), i6);
                }
            }
        }
        if (dVar == null || !e.a(dVar)) {
            int i9 = this.f4174l;
            j.c(true);
            j.c(true);
            j.c(true);
            j.c(true);
            j.c(true);
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f7 = radians / 36;
            float f8 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 36; i10 < i13; i13 = 36) {
                float f9 = radians / 2.0f;
                float f10 = (i10 * f7) - f9;
                int i14 = i10 + 1;
                float f11 = (i14 * f7) - f9;
                int i15 = 0;
                while (i15 < 73) {
                    int i16 = i14;
                    int i17 = 0;
                    for (int i18 = 2; i17 < i18; i18 = 2) {
                        if (i17 == 0) {
                            f3 = f11;
                            f2 = f10;
                        } else {
                            f2 = f11;
                            f3 = f2;
                        }
                        float f12 = i15 * f8;
                        float f13 = f10;
                        int i19 = i11 + 1;
                        float f14 = f8;
                        double d2 = 50.0f;
                        int i20 = i15;
                        double d3 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                        int i21 = i9;
                        float f15 = radians;
                        double d4 = f2;
                        float f16 = f7;
                        fArr[i11] = -((float) (Math.cos(d4) * Math.sin(d3) * d2));
                        int i22 = i19 + 1;
                        int i23 = i17;
                        fArr[i19] = (float) (Math.sin(d4) * d2);
                        int i24 = i22 + 1;
                        fArr[i22] = (float) (Math.cos(d4) * Math.cos(d3) * d2);
                        int i25 = i12 + 1;
                        fArr2[i12] = f12 / radians2;
                        int i26 = i25 + 1;
                        fArr2[i25] = ((i10 + i23) * f16) / f15;
                        if (i20 == 0 && i23 == 0) {
                            i3 = i23;
                            i2 = i20;
                        } else {
                            i2 = i20;
                            i3 = i23;
                            if (i2 != 72 || i3 != 1) {
                                i12 = i26;
                                i11 = i24;
                                i17 = i3 + 1;
                                i15 = i2;
                                f11 = f3;
                                f8 = f14;
                                f10 = f13;
                                radians = f15;
                                f7 = f16;
                                i9 = i21;
                            }
                        }
                        System.arraycopy(fArr, i24 - 3, fArr, i24, 3);
                        i24 += 3;
                        System.arraycopy(fArr2, i26 - 2, fArr2, i26, 2);
                        i26 += 2;
                        i12 = i26;
                        i11 = i24;
                        i17 = i3 + 1;
                        i15 = i2;
                        f11 = f3;
                        f8 = f14;
                        f10 = f13;
                        radians = f15;
                        f7 = f16;
                        i9 = i21;
                    }
                    i15++;
                    i14 = i16;
                    f11 = f11;
                    i9 = i9;
                }
                i10 = i14;
            }
            dVar = new f.h.b.b.h2.x.d(new d.a(new d.b(0, fArr, fArr2, 1)), i9);
        }
        this.f4168f.a(j3, dVar);
    }

    public SurfaceTexture d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        j.e();
        e eVar = this.c;
        Objects.requireNonNull(eVar);
        int k2 = j.k(TextUtils.join("\n", e.f4155j), TextUtils.join("\n", e.f4156k));
        eVar.f4159d = k2;
        eVar.f4160e = GLES20.glGetUniformLocation(k2, "uMvpMatrix");
        eVar.f4161f = GLES20.glGetUniformLocation(eVar.f4159d, "uTexMatrix");
        eVar.f4162g = GLES20.glGetAttribLocation(eVar.f4159d, "aPosition");
        eVar.f4163h = GLES20.glGetAttribLocation(eVar.f4159d, "aTexCoords");
        eVar.f4164i = GLES20.glGetUniformLocation(eVar.f4159d, "uTexture");
        j.e();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        j.e();
        this.f4171i = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4171i);
        this.f4172j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: f.h.b.b.e2.r.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                f.this.a.set(true);
            }
        });
        return this.f4172j;
    }
}
