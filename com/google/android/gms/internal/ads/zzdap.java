package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdap implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdap(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcfo zza = ((zzcnu) this.zzb).zza();
        final zzfby zza2 = ((zzdbj) this.zzc).zza();
        return new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                Context context2 = context;
                zzcfo zzcfoVar = zza;
                zzfby zzfbyVar = zza2;
                zzfbg zzfbgVar = (zzfbg) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzfbgVar.zzC);
                zzasVar.zzq(zzfbgVar.zzD.toString());
                zzasVar.zzo(zzcfoVar.zza);
                zzasVar.zzn(zzfbyVar.zzf);
                return zzasVar;
            }
        };
    }
}
