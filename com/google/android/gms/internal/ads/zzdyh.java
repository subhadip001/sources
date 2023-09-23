package com.google.android.gms.internal.ads;

import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyh extends zzbqi {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzfhg zzd;
    public final /* synthetic */ zzcga zze;
    public final /* synthetic */ zzdyi zzf;

    public zzdyh(zzdyi zzdyiVar, Object obj, String str, long j2, zzfhg zzfhgVar, zzcga zzcgaVar) {
        this.zzf = zzdyiVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = zzfhgVar;
        this.zze = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str) {
        zzdwp zzdwpVar;
        zzdij zzdijVar;
        zzfhs zzfhsVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwpVar = this.zzf.zzl;
            zzdwpVar.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzdijVar = this.zzf.zzo;
            zzdijVar.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzfhsVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zze(false);
            zzfhsVar.zzb(zzfhgVar.zzj());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzf() {
        zzdwp zzdwpVar;
        zzdij zzdijVar;
        zzfhs zzfhsVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwpVar = this.zzf.zzl;
            zzdwpVar.zzd(this.zzb);
            zzdijVar = this.zzf.zzo;
            zzdijVar.zzd(this.zzb);
            zzfhsVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zze(true);
            zzfhsVar.zzb(zzfhgVar.zzj());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
