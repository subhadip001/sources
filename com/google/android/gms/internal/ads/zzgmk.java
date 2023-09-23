package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmk extends zzgiy {
    public final zzgmo zza;
    public zzgja zzb = zzb();
    public final /* synthetic */ zzgmq zzc;

    public zzgmk(zzgmq zzgmqVar) {
        this.zzc = zzgmqVar;
        this.zza = new zzgmo(zzgmqVar, null);
    }

    private final zzgja zzb() {
        zzgmo zzgmoVar = this.zza;
        if (zzgmoVar.hasNext()) {
            return zzgmoVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgja
    public final byte zza() {
        zzgja zzgjaVar = this.zzb;
        if (zzgjaVar != null) {
            byte zza = zzgjaVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
