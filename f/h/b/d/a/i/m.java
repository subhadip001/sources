package f.h.b.d.a.i;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class m {
    public final p a = new p();

    public final boolean a(Exception exc) {
        p pVar = this.a;
        synchronized (pVar.a) {
            if (pVar.c) {
                return false;
            }
            pVar.c = true;
            pVar.f5831e = exc;
            pVar.b.b(pVar);
            return true;
        }
    }

    public final boolean b(Object obj) {
        p pVar = this.a;
        synchronized (pVar.a) {
            if (pVar.c) {
                return false;
            }
            pVar.c = true;
            pVar.f5830d = obj;
            pVar.b.b(pVar);
            return true;
        }
    }
}
