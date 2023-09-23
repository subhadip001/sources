package com.google.firebase.auth.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.internal.InternalTokenResult;

/* compiled from: com.google.firebase:firebase-auth-interop@@19.0.2 */
@KeepForSdk
/* loaded from: classes.dex */
public interface IdTokenListener {
    @KeepForSdk
    void onIdTokenChanged(InternalTokenResult internalTokenResult);
}
