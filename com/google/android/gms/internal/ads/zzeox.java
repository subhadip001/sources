package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeox implements zzetb {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzczj zzd;
    private final zzfdd zze;
    private final zzfby zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeox(String str, String str2, zzczj zzczjVar, zzfdd zzfddVar, zzfby zzfbyVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzczjVar;
        this.zze = zzfddVar;
        this.zzf = zzfbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeA)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfva.zzi(new zzeta() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                zzeox.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeA)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzez)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (this.zzg.zzP()) {
            return;
        }
        bundle2.putString("session_id", this.zzc);
    }
}
