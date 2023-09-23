package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes.dex */
public final class e0 extends u {

    /* renamed from: i  reason: collision with root package name */
    public int f4556i;

    /* renamed from: j  reason: collision with root package name */
    public int f4557j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4558k;

    /* renamed from: l  reason: collision with root package name */
    public int f4559l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f4560m = f.h.b.b.g2.b0.f4270f;
    public int n;
    public long o;

    @Override // f.h.b.b.u1.u, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.f4559l);
        this.o += min / this.b.f726d;
        this.f4559l -= min;
        byteBuffer.position(position + min);
        if (this.f4559l > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.n + i3) - this.f4560m.length;
        ByteBuffer k2 = k(length);
        int h2 = f.h.b.b.g2.b0.h(length, 0, this.n);
        k2.put(this.f4560m, 0, h2);
        int h3 = f.h.b.b.g2.b0.h(length - h2, 0, i3);
        byteBuffer.limit(byteBuffer.position() + h3);
        k2.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - h3;
        int i5 = this.n - h2;
        this.n = i5;
        byte[] bArr = this.f4560m;
        System.arraycopy(bArr, h2, bArr, 0, i5);
        byteBuffer.get(this.f4560m, this.n, i4);
        this.n += i4;
        k2.flip();
    }

    @Override // f.h.b.b.u1.u
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            this.f4558k = true;
            return (this.f4556i == 0 && this.f4557j == 0) ? AudioProcessor.a.f725e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // f.h.b.b.u1.u, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i2;
        if (super.b() && (i2 = this.n) > 0) {
            k(i2).put(this.f4560m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // f.h.b.b.u1.u
    public void h() {
        if (this.f4558k) {
            this.f4558k = false;
            int i2 = this.f4557j;
            int i3 = this.b.f726d;
            this.f4560m = new byte[i2 * i3];
            this.f4559l = this.f4556i * i3;
        }
        this.n = 0;
    }

    @Override // f.h.b.b.u1.u
    public void i() {
        int i2;
        if (this.f4558k) {
            if (this.n > 0) {
                this.o += i2 / this.b.f726d;
            }
            this.n = 0;
        }
    }

    @Override // f.h.b.b.u1.u
    public void j() {
        this.f4560m = f.h.b.b.g2.b0.f4270f;
    }
}
