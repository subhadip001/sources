package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zac extends zaf {
    public zac(zae zaeVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(zah zahVar) {
        ((zal) zahVar.getService()).zae(new zad(this));
    }
}
