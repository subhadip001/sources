package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctx {
    private final String zza;
    private final zzbti zzb;
    private final Executor zzc;
    private zzcuc zzd;
    private final zzbol zze = new zzctu(this);
    private final zzbol zzf = new zzctw(this);

    public zzctx(String str, zzbti zzbtiVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbtiVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzctx zzctxVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzctxVar.zza);
    }

    public final void zzc(zzcuc zzcucVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcucVar;
    }

    public final void zzd(zzcli zzcliVar) {
        zzcliVar.zzaf("/updateActiveView", this.zze);
        zzcliVar.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcli zzcliVar) {
        zzcliVar.zzaw("/updateActiveView", this.zze);
        zzcliVar.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
