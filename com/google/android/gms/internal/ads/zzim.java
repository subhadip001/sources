package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzim implements zzjh {
    private final Object zza;
    private zzci zzb;

    public zzim(Object obj, zzci zzciVar) {
        this.zza = obj;
        this.zzb = zzciVar;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzim zzimVar, zzci zzciVar) {
        zzimVar.zzb = zzciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final zzci zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final Object zzb() {
        return this.zza;
    }
}
