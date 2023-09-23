package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzean implements zzebl {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzo zzb;
    private final zzfvk zzc;
    private final zzfby zzd;
    private final ScheduledExecutorService zze;
    private final zzedr zzf;
    private final zzfhq zzg;
    private final Context zzh;

    public zzean(Context context, zzfby zzfbyVar, zzdzo zzdzoVar, zzfvk zzfvkVar, ScheduledExecutorService scheduledExecutorService, zzedr zzedrVar, zzfhq zzfhqVar) {
        this.zzh = context;
        this.zzd = zzfbyVar;
        this.zzb = zzdzoVar;
        this.zzc = zzfvkVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzedrVar;
        this.zzg = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzfvj zzb(zzbzu zzbzuVar) {
        zzfvj zzb = this.zzb.zzb(zzbzuVar);
        zzfhg zza2 = zzfhf.zza(this.zzh, 11);
        zzfhp.zzc(zzb, zza2);
        zzfvj zzn = zzfva.zzn(zzb, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzean.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzew)).booleanValue()) {
            zzn = zzfva.zzg(zzfva.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeal
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzfva.zzh(new zzdzk(5));
                }
            }, zzcfv.zzf);
        }
        zzfhp.zza(zzn, this.zzg, zza2);
        zzfva.zzr(zzn, new zzeam(this), zzcfv.zzf);
        return zzn;
    }

    public final /* synthetic */ zzfvj zzc(InputStream inputStream) {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new InputStreamReader(inputStream))));
    }
}
