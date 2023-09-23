package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeue implements zzetb {
    private final zzcer zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final zzbco zze;

    public zzeue(String str, zzbco zzbcoVar, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvkVar, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbcoVar;
        this.zza = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcj)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzco)).booleanValue()) {
                zzfvj zzn = zzfva.zzn(zzfnx.zza(Tasks.forResult(null)), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeuc
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzfva.zzi(new zzeuf(null, -1));
                        }
                        return zzfva.zzi(new zzeuf(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbjd.zza.zze()).booleanValue()) {
                    zzn = zzfva.zzo(zzn, ((Long) zzbjd.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfva.zzf(zzn, Exception.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeud
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        return zzeue.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfva.zzi(new zzeuf(null, -1));
    }

    public final /* synthetic */ zzeuf zzc(Exception exc) {
        this.zza.zzt(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeuf(null, -1);
    }
}
