package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfgt {
    private final Clock zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfgt(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i2 = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    i2++;
                    arrayList.add(new zzfgs(((String) entry.getKey()) + "." + i2, str));
                }
            } else {
                arrayList.add(new zzfgs((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (this.zzc.containsKey(str)) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            long longValue = ((Long) this.zzc.remove(str)).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(elapsedRealtime - longValue);
            zzd(str, sb.toString());
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
    }

    public final void zzc(String str, String str2) {
        if (this.zzc.containsKey(str)) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            long longValue = ((Long) this.zzc.remove(str)).longValue();
            StringBuilder A = a.A(str2);
            A.append(elapsedRealtime - longValue);
            zzd(str, A.toString());
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
    }
}
