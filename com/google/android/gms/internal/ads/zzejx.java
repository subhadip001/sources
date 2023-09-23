package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejx implements zzddb {
    public boolean zza = false;
    public final /* synthetic */ zzefb zzb;
    public final /* synthetic */ zzcga zzc;
    public final /* synthetic */ zzejy zzd;

    public zzejx(zzejy zzejyVar, zzefb zzefbVar, zzcga zzcgaVar) {
        this.zzd = zzejyVar;
        this.zzb = zzefbVar;
        this.zzc = zzcgaVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i2 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeu)).booleanValue()) {
            i2 = 3;
        }
        this.zzc.zze(new zzefc(i2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zza(int i2) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i2, zzejy.zze(this.zzb.zza, i2), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzc(int i2, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzejy.zze(this.zzb.zza, i2);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i2, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}
