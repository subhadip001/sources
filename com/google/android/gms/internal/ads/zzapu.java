package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapu implements Callable {
    private final zzapc zza;
    private final zzali zzb;

    public zzapu(zzapc zzapcVar, zzali zzaliVar) {
        this.zza = zzapcVar;
        this.zzb = zzaliVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaly zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzali zzaliVar = this.zzb;
                    byte[] zzau = zzc.zzau();
                    zzaliVar.zzai(zzau, 0, zzau.length, zzgka.zza());
                }
                return null;
            } catch (zzgla | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
