package f.h.b.d.a.b;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class o3 implements f.h.b.d.a.e.x {
    public final f.h.b.d.a.e.x a;
    public final f.h.b.d.a.e.x b;

    public o3(f.h.b.d.a.e.x xVar, f.h.b.d.a.e.x xVar2) {
        this.a = xVar;
        this.b = xVar2;
    }

    @Override // f.h.b.d.a.e.x
    public final Object zza() {
        Object zza = this.a.zza();
        Context a = ((q3) this.b).a();
        h3 h3Var = (h3) zza;
        f.h.b.c.a.l1(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        f.h.b.c.a.l1(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        Objects.requireNonNull(h3Var, "Cannot return null from a non-@Nullable @Provides method");
        return h3Var;
    }
}
