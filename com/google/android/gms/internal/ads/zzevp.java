package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzevp implements zzetb {
    private final zzcer zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final String zze;
    private final zzceg zzf;

    public zzevp(zzcer zzcerVar, boolean z, zzceg zzcegVar, zzfvk zzfvkVar, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcerVar;
        this.zzb = z;
        this.zzf = zzcegVar;
        this.zzd = zzfvkVar;
        this.zze = str;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return !this.zzb ? zzfva.zzi(null) : zzfva.zzf(zzfva.zzo(zzfva.zzm(zzfva.zzi(null), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzevq(str);
            }
        }, this.zzd), ((Long) zzbkb.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzevo
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzevp.this.zzc((Exception) obj);
                return null;
            }
        }, this.zzd);
    }

    public final /* synthetic */ zzevq zzc(Exception exc) {
        this.zza.zzt(exc, "TrustlessTokenSignal");
        return null;
    }
}
