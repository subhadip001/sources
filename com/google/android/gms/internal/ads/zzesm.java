package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesm implements zzetb {
    private final zzcdn zza;
    private final zzfvk zzb;
    private final Context zzc;

    public zzesm(zzcdn zzcdnVar, zzfvk zzfvkVar, Context context) {
        this.zza = zzcdnVar;
        this.zzb = zzfvkVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesm.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesn zzc() {
        if (this.zza.zzu(this.zzc)) {
            String zze = this.zza.zze(this.zzc);
            String str = zze == null ? "" : zze;
            String zzc = this.zza.zzc(this.zzc);
            String str2 = zzc == null ? "" : zzc;
            String zza = this.zza.zza(this.zzc);
            String str3 = zza == null ? "" : zza;
            String zzb = this.zza.zzb(this.zzc);
            return new zzesn(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzad) : null);
        }
        return new zzesn(null, null, null, null, null);
    }
}
