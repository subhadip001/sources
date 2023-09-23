package f.h.b.b.u1;

import android.media.AudioAttributes;

/* compiled from: AudioAttributes.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f  reason: collision with root package name */
    public static final n f4575f = new n(0, 0, 1, 1, null);
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4576d;

    /* renamed from: e  reason: collision with root package name */
    public AudioAttributes f4577e;

    public n(int i2, int i3, int i4, int i5, a aVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f4576d = i5;
    }

    public AudioAttributes a() {
        if (this.f4577e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            if (f.h.b.b.g2.b0.a >= 29) {
                usage.setAllowedCapturePolicy(this.f4576d);
            }
            this.f4577e = usage.build();
        }
        return this.f4577e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && this.f4576d == nVar.f4576d;
    }

    public int hashCode() {
        return ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.f4576d;
    }
}
