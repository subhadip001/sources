package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkj extends zzbkr {
    public static final int zza;
    public static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        zza = Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzbkj(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        int i4;
        int i5;
        this.zzd = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzbkm zzbkmVar = (zzbkm) list.get(i6);
            this.zze.add(zzbkmVar);
            this.zzf.add(zzbkmVar);
        }
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = zza;
        }
        this.zzg = i4;
        if (num2 != null) {
            i5 = num2.intValue();
        } else {
            i5 = zzb;
        }
        this.zzh = i5;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i2;
        this.zzk = i3;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
