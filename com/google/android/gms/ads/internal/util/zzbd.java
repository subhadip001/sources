package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbd zza(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i2)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i2)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i2++;
        }
        this.zza.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d2));
        this.zzb.add(i2, Double.valueOf(d3));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
