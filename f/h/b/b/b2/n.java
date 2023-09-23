package f.h.b.b.b2;

import android.content.Context;
import android.util.SparseArray;
import f.h.b.b.b2.d0;
import f.h.b.b.f2.i;

/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes.dex */
public final class n implements b0 {
    public final SparseArray<b0> a;
    public final int[] b;

    public n(Context context, f.h.b.b.y1.l lVar) {
        f.h.b.b.f2.n nVar = new f.h.b.b.f2.n(context);
        SparseArray<b0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (b0) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(b0.class).getConstructor(i.a.class).newInstance(nVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (b0) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(b0.class).getConstructor(i.a.class).newInstance(nVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (b0) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(b0.class).getConstructor(i.a.class).newInstance(nVar));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new d0.b(nVar, lVar));
        this.a = sparseArray;
        this.b = new int[sparseArray.size()];
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.b[i2] = this.a.keyAt(i2);
        }
    }
}
