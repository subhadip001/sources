package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
