package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbon implements zzbol {
    private final zzboo zza;

    public zzbon(zzboo zzbooVar, byte[] bArr) {
        this.zza = zzbooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            zzcfi.zzh("Fail to parse float", e2);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f2);
        zzcliVar.zzav(equals);
    }
}
