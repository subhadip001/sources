package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeuz implements zzetb {
    public final zzfvk zza;
    public final List zzb;
    public final zzbhj zzc;

    public zzeuz(zzbhj zzbhjVar, zzfvk zzfvkVar, List list, byte[] bArr) {
        this.zzc = zzbhjVar;
        this.zza = zzfvkVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeva(zzeuz.this.zzb);
            }
        });
    }
}
