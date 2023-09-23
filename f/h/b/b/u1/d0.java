package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes.dex */
public final class d0 implements AudioProcessor {
    public int b;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f4542d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f4543e;

    /* renamed from: f  reason: collision with root package name */
    public AudioProcessor.a f4544f;

    /* renamed from: g  reason: collision with root package name */
    public AudioProcessor.a f4545g;

    /* renamed from: h  reason: collision with root package name */
    public AudioProcessor.a f4546h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4547i;

    /* renamed from: j  reason: collision with root package name */
    public c0 f4548j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f4549k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f4550l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f4551m;
    public long n;
    public long o;
    public boolean p;

    public d0() {
        AudioProcessor.a aVar = AudioProcessor.a.f725e;
        this.f4543e = aVar;
        this.f4544f = aVar;
        this.f4545g = aVar;
        this.f4546h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f4549k = byteBuffer;
        this.f4550l = byteBuffer.asShortBuffer();
        this.f4551m = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f4544f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.f4542d - 1.0f) >= 1.0E-4f || this.f4544f.a != this.f4543e.a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        c0 c0Var;
        return this.p && ((c0Var = this.f4548j) == null || (c0Var.f4538m * c0Var.b) * 2 == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c0 c0Var = this.f4548j;
            Objects.requireNonNull(c0Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = c0Var.b;
            int i3 = remaining2 / i2;
            short[] c = c0Var.c(c0Var.f4535j, c0Var.f4536k, i3);
            c0Var.f4535j = c;
            asShortBuffer.get(c, c0Var.f4536k * c0Var.b, ((i2 * i3) * 2) / 2);
            c0Var.f4536k += i3;
            c0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d() {
        this.c = 1.0f;
        this.f4542d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f725e;
        this.f4543e = aVar;
        this.f4544f = aVar;
        this.f4545g = aVar;
        this.f4546h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f4549k = byteBuffer;
        this.f4550l = byteBuffer.asShortBuffer();
        this.f4551m = byteBuffer;
        this.b = -1;
        this.f4547i = false;
        this.f4548j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a e(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            int i2 = this.b;
            if (i2 == -1) {
                i2 = aVar.a;
            }
            this.f4543e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i2, aVar.b, 2);
            this.f4544f = aVar2;
            this.f4547i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void f() {
        int i2;
        c0 c0Var = this.f4548j;
        if (c0Var != null) {
            int i3 = c0Var.f4536k;
            float f2 = c0Var.c;
            float f3 = c0Var.f4529d;
            float f4 = c0Var.f4530e * f3;
            int i4 = c0Var.f4538m + ((int) ((((i3 / (f2 / f3)) + c0Var.o) / f4) + 0.5f));
            c0Var.f4535j = c0Var.c(c0Var.f4535j, i3, (c0Var.f4533h * 2) + i3);
            int i5 = 0;
            while (true) {
                i2 = c0Var.f4533h * 2;
                int i6 = c0Var.b;
                if (i5 >= i2 * i6) {
                    break;
                }
                c0Var.f4535j[(i6 * i3) + i5] = 0;
                i5++;
            }
            c0Var.f4536k = i2 + c0Var.f4536k;
            c0Var.f();
            if (c0Var.f4538m > i4) {
                c0Var.f4538m = i4;
            }
            c0Var.f4536k = 0;
            c0Var.r = 0;
            c0Var.o = 0;
        }
        this.p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f4543e;
            this.f4545g = aVar;
            AudioProcessor.a aVar2 = this.f4544f;
            this.f4546h = aVar2;
            if (this.f4547i) {
                this.f4548j = new c0(aVar.a, aVar.b, this.c, this.f4542d, aVar2.a);
            } else {
                c0 c0Var = this.f4548j;
                if (c0Var != null) {
                    c0Var.f4536k = 0;
                    c0Var.f4538m = 0;
                    c0Var.o = 0;
                    c0Var.p = 0;
                    c0Var.q = 0;
                    c0Var.r = 0;
                    c0Var.s = 0;
                    c0Var.t = 0;
                    c0Var.u = 0;
                    c0Var.v = 0;
                }
            }
        }
        this.f4551m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i2;
        c0 c0Var = this.f4548j;
        if (c0Var != null && (i2 = c0Var.f4538m * c0Var.b * 2) > 0) {
            if (this.f4549k.capacity() < i2) {
                ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.f4549k = order;
                this.f4550l = order.asShortBuffer();
            } else {
                this.f4549k.clear();
                this.f4550l.clear();
            }
            ShortBuffer shortBuffer = this.f4550l;
            int min = Math.min(shortBuffer.remaining() / c0Var.b, c0Var.f4538m);
            shortBuffer.put(c0Var.f4537l, 0, c0Var.b * min);
            int i3 = c0Var.f4538m - min;
            c0Var.f4538m = i3;
            short[] sArr = c0Var.f4537l;
            int i4 = c0Var.b;
            System.arraycopy(sArr, min * i4, sArr, 0, i3 * i4);
            this.o += i2;
            this.f4549k.limit(i2);
            this.f4551m = this.f4549k;
        }
        ByteBuffer byteBuffer = this.f4551m;
        this.f4551m = AudioProcessor.a;
        return byteBuffer;
    }
}
