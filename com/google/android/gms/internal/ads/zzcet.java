package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcet {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = CrashlyticsReportDataCapture.SIGNAL_DEFAULT;

    public final synchronized String zza() {
        String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
