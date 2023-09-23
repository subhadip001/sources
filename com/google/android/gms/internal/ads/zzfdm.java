package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdm {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfel zzd = new zzfel();

    public zzfdm(int i2, int i3) {
        this.zzb = i2;
        this.zzc = i3;
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - ((zzfdw) this.zza.getFirst()).zzd >= this.zzc) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfdw zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfdw zzfdwVar = (zzfdw) this.zza.remove();
        if (zzfdwVar != null) {
            this.zzd.zzh();
        }
        return zzfdwVar;
    }

    public final zzfek zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfdw zzfdwVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfdwVar);
        return true;
    }
}
