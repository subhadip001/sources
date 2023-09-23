package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexj implements zzemr {
    public final /* synthetic */ zzexk zza;

    public zzexj(zzexk zzexkVar) {
        this.zza = zzexkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzexc zzexcVar;
        zzexc zzexcVar2;
        zzcvn zzcvnVar = (zzcvn) obj;
        synchronized (this.zza) {
            zzcvn zzcvnVar2 = this.zza.zza;
            if (zzcvnVar2 != null) {
                zzcvnVar2.zzV();
            }
            zzexk zzexkVar = this.zza;
            zzexkVar.zza = zzcvnVar;
            zzcvnVar.zzc(zzexkVar);
            zzexk zzexkVar2 = this.zza;
            zzexcVar = zzexkVar2.zzg;
            zzexcVar2 = zzexkVar2.zzg;
            zzexcVar.zzl(new zzcvo(zzcvnVar, zzexkVar2, zzexcVar2));
            zzcvnVar.zzW();
        }
    }
}
