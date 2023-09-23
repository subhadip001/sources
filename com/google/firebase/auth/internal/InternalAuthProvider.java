package com.google.firebase.auth.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.internal.InternalTokenProvider;

/* compiled from: com.google.firebase:firebase-auth-interop@@19.0.2 */
@KeepForSdk
/* loaded from: classes.dex */
public interface InternalAuthProvider extends InternalTokenProvider {
    @KeepForSdk
    @DeferredApi
    void addIdTokenListener(IdTokenListener idTokenListener);

    @Override // com.google.firebase.internal.InternalTokenProvider
    @KeepForSdk
    Task<GetTokenResult> getAccessToken(boolean z);

    @Override // com.google.firebase.internal.InternalTokenProvider
    String getUid();

    @KeepForSdk
    void removeIdTokenListener(IdTokenListener idTokenListener);
}
