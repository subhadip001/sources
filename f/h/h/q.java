package f.h.h;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes2.dex */
public class q {
    public static volatile q b;
    public static final q c = new q(true);
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i2) {
            this.a = obj;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public q() {
        this.a = new HashMap();
    }

    public static q a() {
        q qVar = b;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = b;
                if (qVar == null) {
                    Class<?> cls = p.a;
                    q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = c;
                    }
                    b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public q(boolean z) {
        this.a = Collections.emptyMap();
    }
}
