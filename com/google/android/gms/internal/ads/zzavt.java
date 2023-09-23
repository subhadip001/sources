package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavt {
    public final String zza;
    public final boolean zzb;

    public zzavt(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzavt.class) {
            zzavt zzavtVar = (zzavt) obj;
            if (TextUtils.equals(this.zza, zzavtVar.zza) && this.zzb == zzavtVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.zzb ? 1237 : 1231);
    }
}
