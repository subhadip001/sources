package f.e.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public class e {
    public final Map<Class<?>, Object> a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Map<Class<?>, Object> a = new HashMap();
    }

    public e(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
