package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i2) {
        return this.zaa.get(i2, -1);
    }

    public final int zab(Context context, Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i2 = 0;
        if (client.requiresGooglePlayServices()) {
            int minApkVersion = client.getMinApkVersion();
            int zaa = zaa(context, minApkVersion);
            if (zaa == -1) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.zaa.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = this.zaa.keyAt(i3);
                    if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                }
                zaa = i2 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i2;
                this.zaa.put(minApkVersion, zaa);
            }
            return zaa;
        }
        return 0;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
