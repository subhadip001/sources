package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import f.h.b.e.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzj extends Exception {
    private final int zza;

    public zzj(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public final f zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new f(this.zza, getMessage());
    }

    public zzj(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = i2;
    }
}
