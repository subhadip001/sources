package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccu extends zzcdo {
    private final Clock zzb;
    private final zzccu zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    public /* synthetic */ zzccu(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar, zzcct zzcctVar) {
        this.zzb = clock;
        zzgpu zza = zzgpv.zza(context);
        this.zzd = zza;
        zzgpu zza2 = zzgpv.zza(zzgVar);
        this.zze = zza2;
        zzgpu zza3 = zzgpv.zza(zzcdnVar);
        this.zzf = zza3;
        this.zzg = zzgpt.zzc(new zzccm(zza, zza2, zza3));
        zzgpu zza4 = zzgpv.zza(clock);
        this.zzh = zza4;
        zzgqh zzc = zzgpt.zzc(new zzcco(zza4, zza2, zza3));
        this.zzi = zzc;
        zzccq zzccqVar = new zzccq(zza4, zzc);
        this.zzj = zzccqVar;
        this.zzk = zzgpt.zzc(new zzcdt(zza, zzccqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final zzccl zza() {
        return (zzccl) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final zzccp zzb() {
        return new zzccp(this.zzb, (zzccn) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final zzcds zzc() {
        return (zzcds) this.zzk.zzb();
    }
}
