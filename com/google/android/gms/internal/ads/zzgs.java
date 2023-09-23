package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgs implements zzjc {
    private final zzka zza;
    private final zzgr zzb;
    private zzju zzc;
    private zzjc zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgs(zzgr zzgrVar, zzcx zzcxVar) {
        this.zzb = zzgrVar;
        this.zza = new zzka(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzju zzjuVar = this.zzc;
        if (zzjuVar != null && !zzjuVar.zzM() && (this.zzc.zzN() || (!z && !this.zzc.zzG()))) {
            zzjc zzjcVar = this.zzd;
            Objects.requireNonNull(zzjcVar);
            long zza = zzjcVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbt zzc = zzjcVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        } else {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjc zzjcVar2 = this.zzd;
        Objects.requireNonNull(zzjcVar2);
        return zzjcVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final zzbt zzc() {
        zzjc zzjcVar = this.zzd;
        return zzjcVar != null ? zzjcVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzju zzjuVar) {
        if (zzjuVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzju zzjuVar) {
        zzjc zzjcVar;
        zzjc zzi = zzjuVar.zzi();
        if (zzi == null || zzi == (zzjcVar = this.zzd)) {
            return;
        }
        if (zzjcVar == null) {
            this.zzd = zzi;
            this.zzc = zzjuVar;
            zzi.zzg(this.zza.zzc());
            return;
        }
        throw zzgu.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void zzf(long j2) {
        this.zza.zzb(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final void zzg(zzbt zzbtVar) {
        zzjc zzjcVar = this.zzd;
        if (zzjcVar != null) {
            zzjcVar.zzg(zzbtVar);
            zzbtVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbtVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
