package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzhe {
    public final Context zza;
    public final zzcx zzb;
    public final zzfph zzc;
    public final zzfph zzd;
    public zzfph zze;
    public zzfph zzf;
    public final zzfph zzg;
    public final zzfoi zzh;
    public final Looper zzi;
    public final zzi zzj;
    public final zzjx zzk;
    public boolean zzl;
    public final zzgp zzm;

    public zzhe(final Context context, zzckr zzckrVar, byte[] bArr) {
        zzgy zzgyVar = new zzgy(zzckrVar, null);
        zzgz zzgzVar = new zzgz(context);
        zzfph zzfphVar = new zzfph() { // from class: com.google.android.gms.internal.ads.zzha
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return new zzvf(context);
            }
        };
        zzhb zzhbVar = new zzfph() { // from class: com.google.android.gms.internal.ads.zzhb
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return new zzgq();
            }
        };
        zzhc zzhcVar = new zzhc(context);
        zzhd zzhdVar = new zzfoi() { // from class: com.google.android.gms.internal.ads.zzhd
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return new zzmm((zzcx) obj);
            }
        };
        this.zza = context;
        this.zzc = zzgyVar;
        this.zzd = zzgzVar;
        this.zze = zzfphVar;
        this.zzf = zzhbVar;
        this.zzg = zzhcVar;
        this.zzh = zzhdVar;
        this.zzi = zzeg.zzD();
        this.zzj = zzi.zza;
        this.zzk = zzjx.zze;
        this.zzm = new zzgp(0.97f, 1.03f, 1000L, 1.0E-7f, zzeg.zzv(20L), zzeg.zzv(500L), 0.999f, null);
        this.zzb = zzcx.zza;
    }

    public static /* synthetic */ zzsa zza(Context context) {
        return new zzro(context, new zzyo());
    }
}
