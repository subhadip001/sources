package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfs implements zzer {
    private final zzer zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzfs(zzer zzerVar) {
        Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        int zza = this.zza.zza(bArr, i2, i3);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        this.zzc = zzewVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzewVar);
        Uri zzc = zzc();
        Objects.requireNonNull(zzc);
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
        Objects.requireNonNull(zzftVar);
        this.zza.zzf(zzftVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
