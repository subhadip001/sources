package f.h.b.d.a.i;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class j implements k {
    public final Executor a;
    public final Object b = new Object();
    public final c c;

    public j(Executor executor, c cVar) {
        this.a = executor;
        this.c = cVar;
    }

    @Override // f.h.b.d.a.i.k
    public final void a(p pVar) {
        if (pVar.d()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new i(this, pVar));
            }
        }
    }
}
