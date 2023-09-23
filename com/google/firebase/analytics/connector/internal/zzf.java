package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class zzf implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ zzg zza;

    public zzf(zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgs
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (str == null || !zzc.zzk(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle(CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY, bundle);
        analyticsConnectorListener = this.zza.zza;
        analyticsConnectorListener.onMessageTriggered(3, bundle2);
    }
}
