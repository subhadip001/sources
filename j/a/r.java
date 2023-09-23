package j.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public class r {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public r(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public r(Throwable th, boolean z, int i2) {
        ?? r2 = (i2 & 2) != 0 ? 0 : z;
        this.a = th;
        this._handled = r2;
    }
}
