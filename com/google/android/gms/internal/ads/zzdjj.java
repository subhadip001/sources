package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdjj {
    private final List zza;
    private final zzfig zzb;
    private boolean zzc;

    public zzdjj(zzfbg zzfbgVar, zzfig zzfigVar) {
        this.zza = zzfbgVar.zzq;
        this.zzb = zzfigVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
