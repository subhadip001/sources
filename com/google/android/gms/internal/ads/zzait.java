package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzait {
    private final String zza;
    private final String zzb;

    public zzait(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzait.class == obj.getClass()) {
            zzait zzaitVar = (zzait) obj;
            if (TextUtils.equals(this.zza, zzaitVar.zza) && TextUtils.equals(this.zzb, zzaitVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return a.s("Header[name=", this.zza, ",value=", this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
