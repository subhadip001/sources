package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbos implements zzbol {
    public static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbwo zzc;
    private final zzbwv zzd;

    public zzbos(com.google.android.gms.ads.internal.zzb zzbVar, zzbwo zzbwoVar, zzbwv zzbwvVar) {
        this.zzb = zzbVar;
        this.zzc = zzbwoVar;
        this.zzd = zzbwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i2 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb(null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbwr(zzcliVar, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbwm(zzcliVar, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zzcfi.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcliVar == null) {
            zzcfi.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i2 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i2 = parseBoolean ? -1 : 14;
        }
        zzcliVar.zzas(i2);
    }
}
