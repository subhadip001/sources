package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtn extends zzcfn {
    private final zzbtm zza;

    public zzbtn(zzbtm zzbtmVar, String str) {
        super(str);
        this.zza = zzbtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfn, com.google.android.gms.internal.ads.zzcfa
    public final boolean zza(String str) {
        zzcfi.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzcfi.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
