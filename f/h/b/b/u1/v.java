package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: i  reason: collision with root package name */
    public int[] f4599i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f4600j;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = this.f4600j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k2 = k(((limit - position) / this.b.f726d) * this.c.f726d);
        while (position < limit) {
            for (int i2 : iArr) {
                k2.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.f726d;
        }
        byteBuffer.position(limit);
        k2.flip();
    }

    @Override // f.h.b.b.u1.u
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        int[] iArr = this.f4599i;
        if (iArr == null) {
            return AudioProcessor.a.f725e;
        }
        if (aVar.c == 2) {
            boolean z = aVar.b != iArr.length;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 >= aVar.b) {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
                z |= i3 != i2;
                i2++;
            }
            if (z) {
                return new AudioProcessor.a(aVar.a, iArr.length, 2);
            }
            return AudioProcessor.a.f725e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // f.h.b.b.u1.u
    public void h() {
        this.f4600j = this.f4599i;
    }

    @Override // f.h.b.b.u1.u
    public void j() {
        this.f4600j = null;
        this.f4599i = null;
    }
}
