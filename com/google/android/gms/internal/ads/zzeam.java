package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeam implements zzfuw {
    public final /* synthetic */ zzean zza;

    public zzeam(zzean zzeanVar) {
        this.zza = zzeanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        Pattern pattern;
        zzedr zzedrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
            pattern = zzean.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedrVar = this.zza.zzf;
                zzedrVar.zzg(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzedr zzedrVar;
        zzedr zzedrVar2;
        zzfbs zzfbsVar = (zzfbs) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
            zzedrVar = this.zza.zzf;
            zzedrVar.zzg(zzfbsVar.zzb.zzb.zze);
            zzedrVar2 = this.zza.zzf;
            zzedrVar2.zzh(zzfbsVar.zzb.zzb.zzf);
        }
    }
}
