package f.m.b;

import android.util.LruCache;
import f.m.b.n;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public class m extends LruCache<String, n.a> {
    public m(n nVar, int i2) {
        super(i2);
    }

    @Override // android.util.LruCache
    public int sizeOf(String str, n.a aVar) {
        return aVar.b;
    }
}
