package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeou implements zzeta {
    @VisibleForTesting
    public final String zza;
    @VisibleForTesting
    public final int zzb;

    public zzeou(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle zza = zzfcj.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", this.zza);
        zza.putInt("pvid_s", this.zzb);
    }
}
