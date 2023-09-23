package e.s;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class i0 {
    public final HashMap<String, b0> a = new HashMap<>();

    public final void a() {
        for (b0 b0Var : this.a.values()) {
            b0Var.b = true;
            Map<String, Object> map = b0Var.a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : b0Var.a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            b0Var.b();
        }
        this.a.clear();
    }
}
