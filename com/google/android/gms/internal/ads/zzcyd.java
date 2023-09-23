package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcyd {
    public final List zza;

    public zzcyd(zzcxw zzcxwVar) {
        this.zza = Collections.singletonList(zzfva.zzi(zzcxwVar));
    }

    public zzcyd(List list) {
        this.zza = list;
    }

    public static zzeey zza(zzeey zzeeyVar) {
        return new zzeez(zzeeyVar, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzcyc
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return new zzcyd((zzcxw) obj);
            }
        });
    }
}
