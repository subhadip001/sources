package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcln implements zzfuw {
    public final /* synthetic */ List zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Uri zzc;
    public final /* synthetic */ zzclp zzd;

    public zzcln(zzclp zzclpVar, List list, String str, Uri uri) {
        this.zzd = zzclpVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcfi.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzO((Map) obj, this.zza, this.zzb);
    }
}
