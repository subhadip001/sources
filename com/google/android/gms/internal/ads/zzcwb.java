package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzcwb {
    private final zzcxu zza;
    private final View zzb;
    private final zzfbh zzc;
    private final zzcli zzd;

    public zzcwb(View view, zzcli zzcliVar, zzcxu zzcxuVar, zzfbh zzfbhVar) {
        this.zzb = view;
        this.zzd = zzcliVar;
        this.zza = zzcxuVar;
        this.zzc = zzfbhVar;
    }

    public static final zzdiy zzf(final Context context, final zzcfo zzcfoVar, final zzfbg zzfbgVar, final zzfby zzfbyVar) {
        return new zzdiy(new zzddg() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzddg
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcfoVar.zza, zzfbgVar.zzD.toString(), zzfbyVar.zzf);
            }
        }, zzcfv.zzf);
    }

    public static final Set zzg(zzcxl zzcxlVar) {
        return Collections.singleton(new zzdiy(zzcxlVar, zzcfv.zzf));
    }

    public static final zzdiy zzh(zzcxj zzcxjVar) {
        return new zzdiy(zzcxjVar, zzcfv.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcli zzb() {
        return this.zzd;
    }

    public final zzcxu zzc() {
        return this.zza;
    }

    public zzdde zzd(Set set) {
        return new zzdde(set);
    }

    public final zzfbh zze() {
        return this.zzc;
    }
}
