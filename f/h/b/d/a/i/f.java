package f.h.b.d.a.i;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class f implements k {
    public final Executor a;
    public final Object b = new Object();
    public final a c;

    public f(Executor executor, a aVar) {
        this.a = executor;
        this.c = aVar;
    }

    @Override // f.h.b.d.a.i.k
    public final void a(p pVar) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new e(this, pVar));
        }
    }
}
