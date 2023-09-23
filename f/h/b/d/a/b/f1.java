package f.h.b.d.a.b;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements q1 {
    public final /* synthetic */ r1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ f1(r1 r1Var, int i2) {
        this.a = r1Var;
        this.b = i2;
    }

    @Override // f.h.b.d.a.b.q1
    public final Object zza() {
        r1 r1Var = this.a;
        int i2 = this.b;
        o1 a = r1Var.a(i2);
        n1 n1Var = a.c;
        if (f.h.b.c.a.u1(n1Var.f5668d)) {
            r1Var.a.c(n1Var.a, a.b, n1Var.b);
            n1 n1Var2 = a.c;
            int i3 = n1Var2.f5668d;
            if (i3 == 5 || i3 == 6) {
                c0 c0Var = r1Var.a;
                String str = n1Var2.a;
                int i4 = a.b;
                long j2 = n1Var2.b;
                if (c0Var.n(str, i4, j2).exists()) {
                    c0.j(c0Var.n(str, i4, j2));
                    return null;
                }
                return null;
            }
            return null;
        }
        throw new y0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
    }
}
