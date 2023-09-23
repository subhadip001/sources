package f.h.b.d.a.a;

import android.content.Context;
import f.h.b.d.a.e.x;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class k implements x {
    public final i a;

    public k(i iVar) {
        this.a = iVar;
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
