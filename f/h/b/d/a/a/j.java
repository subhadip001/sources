package f.h.b.d.a.a;

import f.h.b.d.a.e.x;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class j implements x {
    public final x a;

    public j(x xVar) {
        this.a = xVar;
    }

    @Override // f.h.b.d.a.e.x
    public final Object zza() {
        g gVar = (g) this.a.zza();
        Objects.requireNonNull(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
