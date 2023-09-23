package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfo;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaw {
    private static final zzaw zza = new zzaw();
    private final zzcfb zzb;
    private final zzau zzc;
    private final String zzd;
    private final zzcfo zze;
    private final Random zzf;

    public zzaw() {
        zzcfb zzcfbVar = new zzcfb();
        zzau zzauVar = new zzau(new zzk(), new zzi(), new zzel(), new zzbmz(), new zzcbp(), new zzbxr(), new zzbna());
        String zzd = zzcfb.zzd();
        zzcfo zzcfoVar = new zzcfo(0, 221310000, true, false, false);
        Random random = new Random();
        this.zzb = zzcfbVar;
        this.zzc = zzauVar;
        this.zzd = zzd;
        this.zze = zzcfoVar;
        this.zzf = random;
    }

    public static zzau zza() {
        return zza.zzc;
    }

    public static zzcfb zzb() {
        return zza.zzb;
    }

    public static zzcfo zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
