package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdv extends PhoneStateListener {
    public final /* synthetic */ zzdw zza;

    public /* synthetic */ zzdv(zzdw zzdwVar, zzdu zzduVar) {
        this.zza = zzdwVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        zzdw.zzc(this.zza, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        zzdw.zzc(this.zza, true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
