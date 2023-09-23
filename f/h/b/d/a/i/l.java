package f.h.b.d.a.i;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class l {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(k kVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(kVar);
        }
    }

    public final void b(p pVar) {
        k kVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        kVar = (k) this.b.poll();
                        if (kVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    kVar.a(pVar);
                }
            }
        }
    }
}
