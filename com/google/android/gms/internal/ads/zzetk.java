package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetk implements zzeta {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzetk(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        zzfcj.zzg(bundle, "carrier", str, !TextUtils.isEmpty(str));
        zzfcj.zzf(bundle, "cnt", Integer.valueOf(this.zzb), this.zzb != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfcj.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfcj.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
