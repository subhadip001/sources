package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfaj extends zzfkm implements zzddg, zzdbv, zzdbs, zzdci, zzded, zzeys, zzdjf {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfaj(zzfdj zzfdjVar) {
        this.zza = zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i2 = zzeVar.zza;
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezp
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbk) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbk) obj).zze(i2);
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzg(i2);
            }
        });
    }

    public final void zzb(zzfkm zzfkmVar) {
        this.zzb.set(zzfkmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeys
    public final void zzbL(zzeys zzeysVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezu
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzk();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzh.set(zzdeVar);
    }

    public final void zzd(zzcbg zzcbgVar) {
        this.zzd.set(zzcbgVar);
    }

    public final void zze(zzcbk zzcbkVar) {
        this.zzc.set(zzcbkVar);
    }

    @Deprecated
    public final void zzf(zzcaq zzcaqVar) {
        this.zze.set(zzcaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyj.zza(this.zzh, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezo
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    @Deprecated
    public final void zzh(zzcal zzcalVar) {
        this.zzg.set(zzcalVar);
    }

    public final void zzi(zzcbl zzcblVar) {
        this.zzf.set(zzcblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        this.zza.zza();
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zzg();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezs
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezt
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzeyj.zza(this.zzc, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbk) obj).zzg();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezx
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zzj();
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzj();
            }
        });
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfaa
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(final zzcak zzcakVar, final String str, final String str2) {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                zzcak zzcakVar2 = zzcak.this;
                ((zzcbg) obj).zzk(new zzcbu(zzcakVar2.zzc(), zzcakVar2.zzb()));
            }
        });
        zzeyj.zza(this.zzf, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                zzcak zzcakVar2 = zzcak.this;
                ((zzcbl) obj).zze(new zzcbu(zzcakVar2.zzc(), zzcakVar2.zzb()), str, str2);
            }
        });
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zze(zzcak.this);
            }
        });
        zzeyj.zza(this.zzg, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfai
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcal) obj).zze(zzcak.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzeyj.zza(this.zzd, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcbg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
        zzeyj.zza(this.zze, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzcaq) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfkm
    public final void zzv() {
        zzeyj.zza(this.zzb, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((zzfkm) obj).zzv();
            }
        });
    }
}
