package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfkw extends zzfkt {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final zzfkt zza(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final zzfkt zzb(boolean z) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final zzfkt zzc(boolean z) {
        this.zzb = z;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final zzfku zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zzfky(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" clientVersion");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
