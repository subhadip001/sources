package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccs {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcdn zzd;

    private zzccs() {
    }

    public /* synthetic */ zzccs(zzccr zzccrVar) {
    }

    public final zzccs zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzccs zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzccs zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzccs zzd(zzcdn zzcdnVar) {
        this.zzd = zzcdnVar;
        return this;
    }

    public final zzcdo zze() {
        zzgqc.zzc(this.zza, Context.class);
        zzgqc.zzc(this.zzb, Clock.class);
        zzgqc.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgqc.zzc(this.zzd, zzcdn.class);
        return new zzccu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
