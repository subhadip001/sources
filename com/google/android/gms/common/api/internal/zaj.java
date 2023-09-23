package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaj implements GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final GoogleApiClient zab;
    public final GoogleApiClient.OnConnectionFailedListener zac;
    public final /* synthetic */ zak zad;

    public zaj(zak zakVar, int i2, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zad = zakVar;
        this.zaa = i2;
        this.zab = googleApiClient;
        this.zac = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        valueOf.length();
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(valueOf));
        this.zad.zah(connectionResult, this.zaa);
    }
}
