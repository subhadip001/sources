package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctp implements zzfuw {
    public final /* synthetic */ zzctr zza;

    public zzctp(zzctr zzctrVar) {
        this.zza = zzctrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfch zzfchVar;
        zzfic zzficVar;
        zzfbs zzfbsVar;
        zzfbg zzfbgVar;
        zzfbg zzfbgVar2;
        Context context;
        String str = (String) obj;
        zzctr zzctrVar = this.zza;
        zzfchVar = zzctrVar.zzh;
        zzficVar = zzctrVar.zzg;
        zzfbsVar = zzctrVar.zze;
        zzfbgVar = zzctrVar.zzf;
        zzfbgVar2 = zzctrVar.zzf;
        List zzb = zzficVar.zzb(zzfbsVar, zzfbgVar, false, "", str, zzfbgVar2.zzc);
        zzcer zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        zzfchVar.zzc(zzb, true == zzo.zzv(context) ? 2 : 1);
    }
}
