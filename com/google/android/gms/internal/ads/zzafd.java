package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafd implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafc
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafd.zza;
            return new zzys[]{new zzafd()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private zzyv zzb;
    private zzafl zzc;
    private boolean zzd;

    private final boolean zze(zzyt zzytVar) {
        zzaff zzaffVar = new zzaff();
        if (zzaffVar.zzb(zzytVar, true) && (zzaffVar.zza & 2) == 2) {
            int min = Math.min(zzaffVar.zze, 8);
            zzdy zzdyVar = new zzdy(min);
            ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, min, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zza() >= 5 && zzdyVar.zzk() == 127 && zzdyVar.zzs() == 1179402563) {
                this.zzc = new zzafb();
            } else {
                zzdyVar.zzF(0);
                try {
                    if (zzaaf.zzd(1, zzdyVar, true)) {
                        this.zzc = new zzafn();
                    }
                } catch (zzbp unused) {
                }
                zzdyVar.zzF(0);
                if (zzafh.zzd(zzdyVar)) {
                    this.zzc = new zzafh();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        zzcw.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzytVar)) {
                zzytVar.zzj();
            } else {
                throw zzbp.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzd) {
            zzzz zzv = this.zzb.zzv(0, 1);
            this.zzb.zzB();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzytVar, zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        zzafl zzaflVar = this.zzc;
        if (zzaflVar != null) {
            zzaflVar.zzj(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        try {
            return zze(zzytVar);
        } catch (zzbp unused) {
            return false;
        }
    }
}
