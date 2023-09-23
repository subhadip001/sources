package com.google.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public enum AdRequest$ErrorCode {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String zzb;

    AdRequest$ErrorCode(String str) {
        this.zzb = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
