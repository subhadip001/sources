package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenb implements zzeta {
    private final boolean zza;

    public zzenb(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
    }
}
