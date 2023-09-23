package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeya implements zzfei {
    public final zzeyu zza;
    public final zzeyw zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfdx zzg;

    public zzeya(zzeyu zzeyuVar, zzeyw zzeywVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfdx zzfdxVar) {
        this.zza = zzeyuVar;
        this.zzb = zzeywVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final zzfdx zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final Executor zzb() {
        return this.zze;
    }
}
