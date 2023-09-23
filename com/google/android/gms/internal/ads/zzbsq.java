package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsq {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbsz zzc;
    private zzbsz zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbsz zza(Context context, zzcfo zzcfoVar, zzfhs zzfhsVar) {
        zzbsz zzbszVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbsz(zzc(context), zzcfoVar, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zza), zzfhsVar);
            }
            zzbszVar = this.zzc;
        }
        return zzbszVar;
    }

    public final zzbsz zzb(Context context, zzcfo zzcfoVar, zzfhs zzfhsVar) {
        zzbsz zzbszVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbsz(zzc(context), zzcfoVar, (String) zzbjx.zzb.zze(), zzfhsVar);
            }
            zzbszVar = this.zzd;
        }
        return zzbszVar;
    }
}
