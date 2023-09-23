package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzjy {
    private final zzhe zza;

    @Deprecated
    public zzjy(Context context, zzckr zzckrVar, byte[] bArr) {
        this.zza = new zzhe(context, zzckrVar, null);
    }

    @Deprecated
    public final zzjy zza(final zzjb zzjbVar) {
        zzhe zzheVar = this.zza;
        zzcw.zzf(!zzheVar.zzl);
        zzheVar.zzf = new zzfph() { // from class: com.google.android.gms.internal.ads.zzgw
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzjb.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzjy zzb(final zzvn zzvnVar) {
        zzhe zzheVar = this.zza;
        zzcw.zzf(!zzheVar.zzl);
        zzheVar.zze = new zzfph() { // from class: com.google.android.gms.internal.ads.zzgx
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzvn.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzjz zzc() {
        zzhe zzheVar = this.zza;
        zzcw.zzf(!zzheVar.zzl);
        zzheVar.zzl = true;
        return new zzjz(zzheVar);
    }
}
