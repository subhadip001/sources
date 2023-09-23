package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfch {
    private final zzfbg zza;
    private final zzfbj zzb;
    private final zzeen zzc;
    private final zzfig zzd;
    private final zzfhq zze;

    @VisibleForTesting
    public zzfch(zzeen zzeenVar, zzfig zzfigVar, zzfbg zzfbgVar, zzfbj zzfbjVar, zzfhq zzfhqVar) {
        this.zza = zzfbgVar;
        this.zzb = zzfbjVar;
        this.zzc = zzeenVar;
        this.zzd = zzfigVar;
        this.zze = zzfhqVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i2) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeep(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzb.zzb, str, i2));
    }

    public final void zzc(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i2);
        }
    }
}
