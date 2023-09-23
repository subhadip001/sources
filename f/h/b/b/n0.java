package f.h.b.b;

import android.content.Context;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* compiled from: DefaultRenderersFactory.java */
/* loaded from: classes.dex */
public class n0 implements m1 {
    public final Context a;
    public f.h.b.b.z1.t b;

    public n0(Context context) {
        this.a = context;
        int i2 = f.h.b.b.z1.t.a;
        this.b = new f.h.b.b.z1.t() { // from class: f.h.b.b.z1.k
            @Override // f.h.b.b.z1.t
            public final List a(String str, boolean z, boolean z2) {
                return MediaCodecUtil.e(str, z, z2);
            }
        };
    }
}
