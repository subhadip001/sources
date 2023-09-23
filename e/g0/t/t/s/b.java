package e.g0.t.t.s;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor.java */
/* loaded from: classes.dex */
public enum b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
