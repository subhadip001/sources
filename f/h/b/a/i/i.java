package f.h.b.a.i;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class i implements Object<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final i a = new i();
    }

    public Object get() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
