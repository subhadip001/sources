package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdna implements zzbam {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzdnb zzb;

    public zzdna(zzdnb zzdnbVar, String str) {
        this.zzb = zzdnbVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        Map map;
        zzdpb zzdpbVar;
        zzdpb zzdpbVar2;
        zzdpb zzdpbVar3;
        zzdpb zzdpbVar4;
        Map map2;
        zzdpb zzdpbVar5;
        zzdpb zzdpbVar6;
        zzdpb zzdpbVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbv)).booleanValue()) {
            if (zzbalVar.zzj) {
                map = this.zzb.zzy;
                map.put(this.zza, Boolean.TRUE);
                zzdnb zzdnbVar = this.zzb;
                zzdpbVar = zzdnbVar.zzo;
                View zzf = zzdpbVar.zzf();
                zzdpbVar2 = this.zzb.zzo;
                Map zzl = zzdpbVar2.zzl();
                zzdpbVar3 = this.zzb.zzo;
                zzdnbVar.zzv(zzf, zzl, zzdpbVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzbalVar.zzj) {
                zzdnb zzdnbVar2 = this.zzb;
                zzdpbVar4 = zzdnbVar2.zzo;
                if (zzdpbVar4 == null) {
                    return;
                }
                map2 = zzdnbVar2.zzy;
                map2.put(this.zza, Boolean.TRUE);
                zzdnb zzdnbVar3 = this.zzb;
                zzdpbVar5 = zzdnbVar3.zzo;
                View zzf2 = zzdpbVar5.zzf();
                zzdpbVar6 = this.zzb.zzo;
                Map zzl2 = zzdpbVar6.zzl();
                zzdpbVar7 = this.zzb.zzo;
                zzdnbVar3.zzv(zzf2, zzl2, zzdpbVar7.zzm(), true);
            }
        }
    }
}
