package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeuk implements zzetb {
    private final Context zza;
    private final zzcer zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcei zzf;

    public zzeuk(zzcei zzceiVar, int i2, Context context, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzceiVar;
        this.zza = context;
        this.zzb = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzf((zzfur) zzfva.zzo(zzfva.zzm(zzfur.zzv(zzfva.zzl(new zzfug() { // from class: com.google.android.gms.internal.ads.zzeuh
            @Override // com.google.android.gms.internal.ads.zzfug
            public final zzfvj zza() {
                return zzfva.zzi(null);
            }
        }, this.zzd)), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzeul(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzeuk.this.zzc((Exception) obj);
                return null;
            }
        }, zzfvq.zzb());
    }

    public final /* synthetic */ zzeul zzc(Exception exc) {
        this.zzb.zzt(exc, "AttestationTokenSignal");
        return null;
    }
}
