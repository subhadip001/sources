package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjo implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzcju zze;

    public zzcjo(zzcju zzcjuVar, String str, String str2, int i2, int i3, boolean z) {
        this.zze = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        zzcju.zza(this.zze, "onPrecacheEvent", hashMap);
    }
}
