package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzm {
    private Bundle zza = new Bundle();
    private List zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List zzj = new ArrayList();
    private int zzk = 60000;

    public final zzl zza() {
        return new zzl(8, -1L, this.zza, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, this.zze, this.zzf, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null);
    }

    public final zzm zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzm zzc(int i2) {
        this.zzk = i2;
        return this;
    }

    public final zzm zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzm zze(List list) {
        this.zzb = list;
        return this;
    }

    public final zzm zzf(String str) {
        this.zzi = str;
        return this;
    }

    public final zzm zzg(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzm zzh(int i2) {
        this.zzh = i2;
        return this;
    }
}
