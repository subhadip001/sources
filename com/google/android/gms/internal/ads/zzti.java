package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzti extends zzrc implements zzsz {
    private final zzbb zza;
    private final zzaw zzb;
    private final zzeq zzc;
    private final zzpj zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzft zzj;
    private final zztf zzk;
    private final zzwa zzl;

    public /* synthetic */ zzti(zzbb zzbbVar, zzeq zzeqVar, zztf zztfVar, zzpj zzpjVar, zzwa zzwaVar, int i2, zzth zzthVar, byte[] bArr) {
        zzaw zzawVar = zzbbVar.zzd;
        Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
        this.zza = zzbbVar;
        this.zzc = zzeqVar;
        this.zzk = zztfVar;
        this.zzd = zzpjVar;
        this.zzl = zzwaVar;
        this.zze = i2;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j2 = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbb zzbbVar = this.zza;
        zztv zztvVar = new zztv(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z, false, false, null, zzbbVar, z2 ? zzbbVar.zzf : null);
        zzo(this.zzf ? new zzte(this, zztvVar) : zztvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzB(zzrz zzrzVar) {
        ((zztd) zzrzVar).zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzrz zzD(zzsb zzsbVar, zzvw zzvwVar, long j2) {
        zzer zza = this.zzc.zza();
        zzft zzftVar = this.zzj;
        if (zzftVar != null) {
            zza.zzf(zzftVar);
        }
        Uri uri = this.zzb.zza;
        zztf zztfVar = this.zzk;
        zzb();
        zzre zzreVar = new zzre(zztfVar.zza);
        zzpj zzpjVar = this.zzd;
        zzpd zzc = zzc(zzsbVar);
        zzwa zzwaVar = this.zzl;
        zzsk zze = zze(zzsbVar);
        String str = this.zzb.zzf;
        return new zztd(uri, zza, zzreVar, zzpjVar, zzc, zzwaVar, zze, this, zzvwVar, null, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zza(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.zzg;
        }
        if (!this.zzf && this.zzg == j2 && this.zzh == z && this.zzi == z2) {
            return;
        }
        this.zzg = j2;
        this.zzh = z;
        this.zzi = z2;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzn(zzft zzftVar) {
        this.zzj = zzftVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzbb zzz() {
        return this.zza;
    }
}
