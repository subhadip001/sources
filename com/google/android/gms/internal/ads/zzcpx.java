package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpx implements zzdxo {
    private final zzcrb zza;
    private Context zzb;
    private zzbpg zzc;

    public /* synthetic */ zzcpx(zzcrb zzcrbVar, zzcpw zzcpwVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxo
    public final /* synthetic */ zzdxo zza(zzbpg zzbpgVar) {
        Objects.requireNonNull(zzbpgVar);
        this.zzc = zzbpgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxo
    public final /* synthetic */ zzdxo zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdxo
    public final zzdxp zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, zzbpg.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, null);
    }
}
