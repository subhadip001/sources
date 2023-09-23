package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfef implements zzfuw {
    public final /* synthetic */ zzfei zza;
    public final /* synthetic */ zzfej zzb;

    public zzfef(zzfej zzfejVar, zzfei zzfeiVar) {
        this.zzb = zzfejVar;
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i2;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfej zzfejVar = this.zzb;
            i2 = zzfejVar.zzf;
            if (i2 == 1) {
                zzfejVar.zzh();
            }
        }
    }
}
