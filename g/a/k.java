package g.a;

import g.a.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: CompressorRegistry.java */
/* loaded from: classes2.dex */
public final class k {
    public static final k b = new k(new i.a(), i.b.a);
    public final ConcurrentMap<String, j> a = new ConcurrentHashMap();

    public k(j... jVarArr) {
        for (j jVar : jVarArr) {
            this.a.put(jVar.a(), jVar);
        }
    }
}
