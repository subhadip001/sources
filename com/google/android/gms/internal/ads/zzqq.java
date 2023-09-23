package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqq {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzqq(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzqq.class) {
            zzqq zzqqVar = (zzqq) obj;
            if (TextUtils.equals(this.zza, zzqqVar.zza) && this.zzb == zzqqVar.zzb && this.zzc == zzqqVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a.I(this.zza, 31, 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
