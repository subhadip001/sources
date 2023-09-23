package com.google.firebase.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: com.google.firebase:firebase-auth-interop@@19.0.2 */
@KeepForSdk
/* loaded from: classes2.dex */
public class InternalTokenResult {
    private String zza;

    @KeepForSdk
    public InternalTokenResult(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InternalTokenResult) {
            return Objects.equal(this.zza, ((InternalTokenResult) obj).zza);
        }
        return false;
    }

    @KeepForSdk
    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(FirebaseMessagingService.EXTRA_TOKEN, this.zza).toString();
    }
}
