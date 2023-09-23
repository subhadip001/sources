package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbko;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbko zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i2, int i3, String str2, String str3, zzbko zzbkoVar) {
        super(context, str, bundle, bundle2, z, location, i2, i3, str2, str3);
        this.zza = zzbkoVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbko.zza(this.zza);
    }
}
