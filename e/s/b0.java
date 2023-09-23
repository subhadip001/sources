package e.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class b0 {
    public final Map<String, Object> a = new HashMap();
    public volatile boolean b = false;

    public <T> T a(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    public void b() {
    }

    public <T> T c(String str, T t) {
        Object obj;
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == null) {
                this.a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.b && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return t;
    }
}
