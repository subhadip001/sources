package g.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Context.java */
/* loaded from: classes2.dex */
public class m {
    public static final Logger a = Logger.getLogger(m.class.getName());
    public static final m b = new m();

    /* compiled from: Context.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final b a;

        static {
            b u0Var;
            AtomicReference atomicReference = new AtomicReference();
            try {
                u0Var = (b) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                atomicReference.set(e2);
                u0Var = new u0();
            } catch (Exception e3) {
                throw new RuntimeException("Storage override failed to initialize", e3);
            }
            a = u0Var;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                m.a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    /* compiled from: Context.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract m a();

        public abstract void b(m mVar, m mVar2);

        public m c(m mVar) {
            a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    public static <T> T b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static m c() {
        m a2 = a.a.a();
        return a2 == null ? b : a2;
    }

    public m a() {
        m c = a.a.c(this);
        return c == null ? b : c;
    }

    public void d(m mVar) {
        b(mVar, "toAttach");
        a.a.b(this, mVar);
    }
}
