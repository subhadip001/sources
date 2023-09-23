package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzcp {
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    public static final zzl zzc;
    public final zzfrk zzA;
    public final zzfrm zzB;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrh zzo;
    public final zzfrh zzq;
    public final zzfrh zzu;
    public final zzfrh zzv;
    public final int zzw;
    public final int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzp = 0;
    public final int zzr = 0;
    public final int zzs = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final int zzt = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public final boolean zzx = false;
    public final boolean zzy = false;
    public final boolean zzz = false;

    static {
        zzcp zzcpVar = new zzcp(new zzco());
        zza = zzcpVar;
        zzb = zzcpVar;
        zzc = new zzl() { // from class: com.google.android.gms.internal.ads.zzcn
        };
    }

    public zzcp(zzco zzcoVar) {
        this.zzl = zzco.zzc(zzcoVar);
        this.zzm = zzco.zzb(zzcoVar);
        this.zzn = zzco.zzl(zzcoVar);
        this.zzo = zzco.zzi(zzcoVar);
        this.zzq = zzco.zzf(zzcoVar);
        this.zzu = zzco.zzg(zzcoVar);
        this.zzv = zzco.zzh(zzcoVar);
        this.zzw = zzco.zza(zzcoVar);
        this.zzA = zzfrk.zzc(zzco.zzj(zzcoVar));
        this.zzB = zzfrm.zzl(zzco.zzk(zzcoVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzn == zzcpVar.zzn && this.zzl == zzcpVar.zzl && this.zzm == zzcpVar.zzm && this.zzo.equals(zzcpVar.zzo) && this.zzq.equals(zzcpVar.zzq) && this.zzu.equals(zzcpVar.zzu) && this.zzv.equals(zzcpVar.zzv) && this.zzw == zzcpVar.zzw && this.zzA.equals(zzcpVar.zzA) && this.zzB.equals(zzcpVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.zzo.hashCode();
        int hashCode2 = this.zzq.hashCode();
        int hashCode3 = this.zzu.hashCode();
        int hashCode4 = this.zzv.hashCode();
        int hashCode5 = this.zzA.hashCode();
        return this.zzB.hashCode() + ((hashCode5 + ((((hashCode4 + ((hashCode3 + ((((((hashCode2 + ((hashCode + (((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31) + Api.BaseClientBuilder.API_PRIORITY_OTHER) * 31)) * 31)) * 31) + this.zzw) * 923521)) * 31);
    }
}
