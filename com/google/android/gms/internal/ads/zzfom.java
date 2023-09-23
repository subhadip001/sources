package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfom {
    private final String zza;
    private final zzfol zzb;
    private zzfol zzc;

    public /* synthetic */ zzfom(String str, zzfok zzfokVar) {
        zzfol zzfolVar = new zzfol(null);
        this.zzb = zzfolVar;
        this.zzc = zzfolVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfol zzfolVar = this.zzb.zzb;
        String str = "";
        while (zzfolVar != null) {
            Object obj = zzfolVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfolVar = zzfolVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfom zza(Object obj) {
        zzfol zzfolVar = new zzfol(null);
        this.zzc.zzb = zzfolVar;
        this.zzc = zzfolVar;
        zzfolVar.zza = obj;
        return this;
    }
}
