package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public interface SignalCallbacks {
    void onFailure(AdError adError);

    @Deprecated
    void onFailure(String str);

    void onSuccess(String str);
}
