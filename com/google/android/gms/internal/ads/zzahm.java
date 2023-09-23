package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahm {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzahm(int i2, int i3, int i4) {
        String str;
        if (i2 != Integer.MIN_VALUE) {
            str = i2 + "/";
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i2 = this.zzd;
        int i3 = i2 == Integer.MIN_VALUE ? this.zzb : i2 + this.zzc;
        this.zzd = i3;
        this.zze = a.i(this.zza, i3);
    }
}
