package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzei {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzei(String str, String str2, Bundle bundle, long j2) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j2;
    }

    public static zzei zzb(zzaw zzawVar) {
        return new zzei(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.zzc(), zzawVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder F = a.F("origin=", str, ",name=", str2, ",params=");
        F.append(obj);
        return F.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
