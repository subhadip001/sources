package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcoz implements zzewe {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcoz(zzcrb zzcrbVar, zzcoy zzcoyVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final /* synthetic */ zzewe zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final /* synthetic */ zzewe zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewe
    public final zzewf zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        return new zzcpb(this.zza, this.zzb, this.zzc, null);
    }
}
