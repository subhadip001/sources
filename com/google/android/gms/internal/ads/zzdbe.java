package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbe {
    private final Context zza;
    private final zzfby zzb;
    private final Bundle zzc;
    private final zzfbt zzd;

    public /* synthetic */ zzdbe(zzdbc zzdbcVar, zzdbd zzdbdVar) {
        this.zza = zzdbc.zza(zzdbcVar);
        this.zzb = zzdbc.zzi(zzdbcVar);
        this.zzc = zzdbc.zzb(zzdbcVar);
        this.zzd = zzdbc.zzh(zzdbcVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzdbc zzc() {
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(this.zza);
        zzdbcVar.zzf(this.zzb);
        zzdbcVar.zzd(this.zzc);
        return zzdbcVar;
    }

    public final zzfbt zzd() {
        return this.zzd;
    }

    public final zzfby zze() {
        return this.zzb;
    }
}
