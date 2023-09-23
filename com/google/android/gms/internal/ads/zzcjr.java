package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjr implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzcju zzd;

    public zzcjr(zzcju zzcjuVar, String str, String str2, int i2) {
        this.zzd = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", hashMap);
    }
}
