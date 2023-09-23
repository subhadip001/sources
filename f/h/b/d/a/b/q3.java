package f.h.b.d.a.b;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class q3 implements f.h.b.d.a.e.x {
    public final l3 a;

    public q3(l3 l3Var) {
        this.a = l3Var;
    }

    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    @Override // f.h.b.d.a.e.x
    public final Object zza() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
