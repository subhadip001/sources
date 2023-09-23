package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetm implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzetm(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetk zzc() {
        int i2;
        boolean z;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i4 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i4 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i3 = i4;
        } else {
            i2 = -2;
            z = false;
            i3 = -1;
        }
        return new zzetk(networkOperator, i2, com.google.android.gms.ads.internal.zzt.zzq().zzk(this.zzb), phoneType, z, i3);
    }
}
