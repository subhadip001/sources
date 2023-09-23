package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: classes.dex */
public final class x extends u {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4601i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == f4601i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer k2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            k2 = k((i2 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k2);
                position += 3;
            }
        } else if (i3 == 805306368) {
            k2 = k(i2);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        k2.flip();
    }

    @Override // f.h.b.b.u1.u
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        int i2 = aVar.c;
        if (f.h.b.b.g2.b0.x(i2)) {
            if (i2 != 4) {
                return new AudioProcessor.a(aVar.a, aVar.b, 4);
            }
            return AudioProcessor.a.f725e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
