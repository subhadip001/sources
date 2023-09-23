package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfeb {
    private final HashMap zza = new HashMap();

    public final zzfea zza(zzfdr zzfdrVar, Context context, zzfdj zzfdjVar, zzfeh zzfehVar) {
        zzfea zzfeaVar = (zzfea) this.zza.get(zzfdrVar);
        if (zzfeaVar == null) {
            zzfdo zzfdoVar = new zzfdo(zzfdu.zza(zzfdrVar, context));
            zzfea zzfeaVar2 = new zzfea(zzfdoVar, new zzfej(zzfdoVar, zzfdjVar, zzfehVar));
            this.zza.put(zzfdrVar, zzfeaVar2);
            return zzfeaVar2;
        }
        return zzfeaVar;
    }
}
