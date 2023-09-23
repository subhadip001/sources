package f.h.b.b.z1;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements MediaCodecUtil.f {
    public final /* synthetic */ Format a;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public final int a(Object obj) {
        try {
            return ((s) obj).e(this.a) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }
}
