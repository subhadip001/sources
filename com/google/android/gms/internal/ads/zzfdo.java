package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdo implements zzfdn {
    private final ConcurrentHashMap zza;
    private final zzfdu zzb;
    private final zzfdq zzc = new zzfdq();

    public zzfdo(zzfdu zzfduVar) {
        this.zza = new ConcurrentHashMap(zzfduVar.zzd);
        this.zzb = zzfduVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdu> creator = zzfdu.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfo)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i2 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfdx) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i3 = 0; i3 < ((zzfdm) entry.getValue()).zzb(); i3++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfdm) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdm) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i2 < this.zzb.zzc) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            zzcfi.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final zzfdu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized zzfdw zzb(zzfdx zzfdxVar) {
        zzfdw zzfdwVar;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar != null) {
            zzfdwVar = zzfdmVar.zze();
            if (zzfdwVar == null) {
                this.zzc.zze();
            }
            zzfek zzf = zzfdmVar.zzf();
            if (zzfdwVar != null) {
                zzbea zza = zzbeg.zza();
                zzbdy zza2 = zzbdz.zza();
                zza2.zzd(2);
                zzbec zza3 = zzbed.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfdwVar.zza.zzb().zzc().zze((zzbeg) zza.zzaj());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdwVar = null;
        }
        return zzfdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    @Deprecated
    public final zzfdx zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfdy(zzlVar, str, new zzbzy(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zzd(zzfdx zzfdxVar, zzfdw zzfdwVar) {
        boolean zzh;
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        zzfdwVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        if (zzfdmVar == null) {
            zzfdu zzfduVar = this.zzb;
            zzfdmVar = new zzfdm(zzfduVar.zzd, zzfduVar.zze * 1000);
            int size = this.zza.size();
            zzfdu zzfduVar2 = this.zzb;
            if (size == zzfduVar2.zzc) {
                int i2 = zzfduVar2.zzg;
                int i3 = i2 - 1;
                zzfdx zzfdxVar2 = null;
                if (i2 != 0) {
                    long j2 = Long.MAX_VALUE;
                    if (i3 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdm) entry.getValue()).zzc() < j2) {
                                j2 = ((zzfdm) entry.getValue()).zzc();
                                zzfdxVar2 = (zzfdx) entry.getKey();
                            }
                        }
                        if (zzfdxVar2 != null) {
                            this.zza.remove(zzfdxVar2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdm) entry2.getValue()).zzd() < j2) {
                                j2 = ((zzfdm) entry2.getValue()).zzd();
                                zzfdxVar2 = (zzfdx) entry2.getKey();
                            }
                        }
                        if (zzfdxVar2 != null) {
                            this.zza.remove(zzfdxVar2);
                        }
                    } else if (i3 == 2) {
                        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdm) entry3.getValue()).zza() < i4) {
                                i4 = ((zzfdm) entry3.getValue()).zza();
                                zzfdxVar2 = (zzfdx) entry3.getKey();
                            }
                        }
                        if (zzfdxVar2 != null) {
                            this.zza.remove(zzfdxVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfdxVar, zzfdmVar);
            this.zzc.zzd();
        }
        zzh = zzfdmVar.zzh(zzfdwVar);
        this.zzc.zzc();
        zzfdp zza = this.zzc.zza();
        zzfek zzf = zzfdmVar.zzf();
        zzbea zza2 = zzbeg.zza();
        zzbdy zza3 = zzbdz.zza();
        zza3.zzd(2);
        zzbee zza4 = zzbef.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzfdwVar.zza.zzb().zzc().zzf((zzbeg) zza2.zzaj());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdn
    public final synchronized boolean zze(zzfdx zzfdxVar) {
        zzfdm zzfdmVar = (zzfdm) this.zza.get(zzfdxVar);
        if (zzfdmVar != null) {
            return zzfdmVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
