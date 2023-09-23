package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemc implements zzden, zzddg, zzdbv, zzdcm, com.google.android.gms.ads.internal.client.zza, zzdbs, zzded, zzarb, zzdci, zzdjf {
    private final zzfgo zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    @VisibleForTesting
    public final BlockingQueue zza = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzho)).intValue());

    public zzemc(zzfgo zzfgoVar) {
        this.zzj = zzfgoVar;
    }

    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            for (final Pair pair : this.zza) {
                zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelt
                    @Override // com.google.android.gms.internal.ads.zzeyi
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
            return;
        }
        zzeyj.zza(this.zzb, zzelu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelw
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final synchronized void zzbu(final String str, final String str2) {
        if (this.zzg.get()) {
            if (!this.zza.offer(new Pair(str, str2))) {
                zzcfi.zze("The queue for app events is full, dropping the new event.");
                zzfgo zzfgoVar = this.zzj;
                if (zzfgoVar != null) {
                    zzfgn zzb = zzfgn.zzb("dae_action");
                    zzb.zza("dae_name", str);
                    zzb.zza("dae_data", str2);
                    zzfgoVar.zzb(zzb);
                    return;
                }
            }
            return;
        }
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelp
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbf zzc() {
        return (com.google.android.gms.ads.internal.client.zzbf) this.zzb.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbz zzd() {
        return (com.google.android.gms.ads.internal.client.zzbz) this.zzc.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.set(zzbfVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zze.set(zzbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzd.set(zzdeVar);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        this.zzc.set(zzbzVar);
        this.zzh.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzd();
            }
        });
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelq
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zzn() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzi();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzc();
            }
        });
        this.zzi.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelm
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzj();
            }
        });
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzf();
            }
        });
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
            zzeyj.zza(this.zzb, zzelu.zza);
        }
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzelv
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.zzf.set(zzcgVar);
    }
}
