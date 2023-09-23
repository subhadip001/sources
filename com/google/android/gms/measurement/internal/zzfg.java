package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzfg implements com.google.android.gms.internal.measurement.zzr {
    public final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i2, String str, List list, boolean z, boolean z2) {
        zzef zzc;
        int i3 = i2 - 1;
        if (i3 == 0) {
            zzc = this.zza.zzt.zzay().zzc();
        } else if (i3 != 1) {
            if (i3 == 3) {
                zzc = this.zza.zzt.zzay().zzj();
            } else if (i3 != 4) {
                zzc = this.zza.zzt.zzay().zzi();
            } else if (z) {
                zzc = this.zza.zzt.zzay().zzm();
            } else if (!z2) {
                zzc = this.zza.zzt.zzay().zzl();
            } else {
                zzc = this.zza.zzt.zzay().zzk();
            }
        } else if (z) {
            zzc = this.zza.zzt.zzay().zzh();
        } else if (!z2) {
            zzc = this.zza.zzt.zzay().zze();
        } else {
            zzc = this.zza.zzt.zzay().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzc.zza(str);
        } else {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
