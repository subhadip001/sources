package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcql implements zzfaz {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcql(zzcrb zzcrbVar, zzcqk zzcqkVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ zzfaz zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* synthetic */ zzfaz zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final zzfba zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, null);
    }
}
