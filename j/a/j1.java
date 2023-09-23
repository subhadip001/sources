package j.a;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class j1 extends z {
    public abstract j1 i0();

    public final String m0() {
        j1 j1Var;
        z zVar = l0.a;
        j1 j1Var2 = j.a.y1.n.c;
        if (this == j1Var2) {
            return "Dispatchers.Main";
        }
        try {
            j1Var = j1Var2.i0();
        } catch (UnsupportedOperationException unused) {
            j1Var = null;
        }
        if (this == j1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // j.a.z
    public String toString() {
        String m0 = m0();
        if (m0 == null) {
            return getClass().getSimpleName() + '@' + e0.b(this);
        }
        return m0;
    }
}
