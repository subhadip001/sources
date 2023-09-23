package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpj implements zzexs {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    public /* synthetic */ zzcpj(zzcrb zzcrbVar, zzcpi zzcpiVar) {
        this.zza = zzcrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final /* synthetic */ zzexs zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexs
    public final zzext zzd() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        zzgqc.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcpl(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
