package f.h.b.b.u1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes.dex */
public final class r {
    public final a a;
    public int b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f4579d;

    /* renamed from: e  reason: collision with root package name */
    public long f4580e;

    /* renamed from: f  reason: collision with root package name */
    public long f4581f;

    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public long f4582d;

        /* renamed from: e  reason: collision with root package name */
        public long f4583e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }
    }

    public r(AudioTrack audioTrack) {
        if (f.h.b.b.g2.b0.a >= 19) {
            this.a = new a(audioTrack);
            a();
            return;
        }
        this.a = null;
        b(3);
    }

    public void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i2) {
        this.b = i2;
        if (i2 == 0) {
            this.f4580e = 0L;
            this.f4581f = -1L;
            this.c = System.nanoTime() / 1000;
            this.f4579d = 10000L;
        } else if (i2 == 1) {
            this.f4579d = 10000L;
        } else if (i2 == 2 || i2 == 3) {
            this.f4579d = 10000000L;
        } else if (i2 == 4) {
            this.f4579d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }
}
