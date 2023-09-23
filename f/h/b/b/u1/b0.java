package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes.dex */
public final class b0 extends u {

    /* renamed from: i  reason: collision with root package name */
    public final long f4522i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4523j;

    /* renamed from: k  reason: collision with root package name */
    public final short f4524k;

    /* renamed from: l  reason: collision with root package name */
    public int f4525l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4526m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public b0() {
        f.h.b.b.e2.j.c(true);
        this.f4522i = 150000L;
        this.f4523j = FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS;
        this.f4524k = (short) 1024;
        byte[] bArr = f.h.b.b.g2.b0.f4270f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // f.h.b.b.u1.u, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f4526m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f4597g.hasRemaining()) {
            int i2 = this.p;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > this.f4524k) {
                            int i3 = this.f4525l;
                            position = ((limit2 / i3) * i3) + i3;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 == 1) {
                int limit3 = byteBuffer.limit();
                int l2 = l(byteBuffer);
                int position2 = l2 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i4 = this.q;
                int i5 = length - i4;
                if (l2 < limit3 && position2 < i5) {
                    m(bArr, i4);
                    this.q = 0;
                    this.p = 0;
                } else {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    int i6 = this.q + min;
                    this.q = i6;
                    byte[] bArr2 = this.n;
                    if (i6 == bArr2.length) {
                        if (this.s) {
                            m(bArr2, this.r);
                            this.t += (this.q - (this.r * 2)) / this.f4525l;
                        } else {
                            this.t += (i6 - this.r) / this.f4525l;
                        }
                        n(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i2 == 2) {
                int limit4 = byteBuffer.limit();
                int l3 = l(byteBuffer);
                byteBuffer.limit(l3);
                this.t += byteBuffer.remaining() / this.f4525l;
                n(byteBuffer, this.o, this.r);
                if (l3 < limit4) {
                    m(this.o, this.r);
                    this.p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // f.h.b.b.u1.u
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            return this.f4526m ? aVar : AudioProcessor.a.f725e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // f.h.b.b.u1.u
    public void h() {
        if (this.f4526m) {
            AudioProcessor.a aVar = this.b;
            int i2 = aVar.f726d;
            this.f4525l = i2;
            long j2 = this.f4522i;
            long j3 = aVar.a;
            int i3 = ((int) ((j2 * j3) / 1000000)) * i2;
            if (this.n.length != i3) {
                this.n = new byte[i3];
            }
            int i4 = ((int) ((this.f4523j * j3) / 1000000)) * i2;
            this.r = i4;
            if (this.o.length != i4) {
                this.o = new byte[i4];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // f.h.b.b.u1.u
    public void i() {
        int i2 = this.q;
        if (i2 > 0) {
            m(this.n, i2);
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.f4525l;
    }

    @Override // f.h.b.b.u1.u
    public void j() {
        this.f4526m = false;
        this.r = 0;
        byte[] bArr = f.h.b.b.g2.b0.f4270f;
        this.n = bArr;
        this.o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f4524k) {
                int i2 = this.f4525l;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(byte[] bArr, int i2) {
        k(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i3 = this.r - min;
        System.arraycopy(bArr, i2 - i3, this.o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i3, min);
    }
}
