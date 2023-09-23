package f.h.b.b.f2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class q {
    public final Map<String, String> a = new HashMap();
    public Map<String, String> b;

    public synchronized Map<String, String> a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}
