package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzah {
    private String zza;
    private Uri zzb;
    private final zzaj zzc = new zzaj();
    private final zzap zzd = new zzap(null);
    private final List zze = Collections.emptyList();
    private final zzfrh zzf = zzfrh.zzo();
    private final zzas zzg = new zzas();

    public final zzah zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzah zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbb zzc() {
        Uri uri = this.zzb;
        zzay zzayVar = uri != null ? new zzay(uri, null, null, null, this.zze, null, this.zzf, null, null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbb(str, new zzan(this.zzc, null), zzayVar, new zzau(this.zzg), zzbh.zza, null);
    }
}
