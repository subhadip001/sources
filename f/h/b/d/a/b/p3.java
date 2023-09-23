package f.h.b.d.a.b;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class p3 implements f.h.b.d.a.e.x {
    public final f.h.b.d.a.e.x a;
    public final f.h.b.d.a.e.x b;
    public final f.h.b.d.a.e.x c;

    public p3(f.h.b.d.a.e.x xVar, f.h.b.d.a.e.x xVar2, f.h.b.d.a.e.x xVar3) {
        this.a = xVar;
        this.b = xVar2;
        this.c = xVar3;
    }

    @Override // f.h.b.d.a.e.x
    public final Object zza() {
        u3 u3Var;
        Context a = ((q3) this.a).a();
        f.h.b.d.a.e.u a2 = f.h.b.d.a.e.w.a(this.b);
        f.h.b.d.a.e.u a3 = f.h.b.d.a.e.w.a(this.c);
        if (l3.a(a) == null) {
            u3Var = (u3) a2.zza();
        } else {
            u3Var = (u3) a3.zza();
        }
        Objects.requireNonNull(u3Var, "Cannot return null from a non-@Nullable @Provides method");
        return u3Var;
    }
}
