package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public interface zzyz {
    public static final zzyz zzb = new zzyz() { // from class: com.google.android.gms.internal.ads.zzyx
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            int i2 = zzyy.zza;
            return new zzys[0];
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };

    zzys[] zza();

    zzys[] zzb(Uri uri, Map map);
}
