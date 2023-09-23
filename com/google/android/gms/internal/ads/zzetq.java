package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetq implements zzetb {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcei zze;

    public zzetq(zzcei zzceiVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, byte[] bArr) {
        this.zze = zzceiVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaO)).booleanValue()) {
            return zzfva.zzf((zzfur) zzfva.zzo(zzfva.zzm(zzfur.zzv(this.zze.zza(this.zza, this.zzd)), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeto
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                    info.getClass();
                    return new zzetr(info, null);
                }
            }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzetp
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    return zzetq.this.zzc((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzfva.zzh(new Exception("Did not ad Ad ID into query param."));
    }

    public final /* synthetic */ zzetr zzc(Throwable th) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzetr(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
