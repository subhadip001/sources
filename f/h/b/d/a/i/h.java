package f.h.b.d.a.i;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class h implements k {
    public final Executor a;
    public final Object b = new Object();
    public final b c;

    public h(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    @Override // f.h.b.d.a.i.k
    public final void a(p pVar) {
        if (pVar.d()) {
            return;
        }
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            this.a.execute(new g(this, pVar));
        }
    }
}
