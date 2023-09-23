package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbq {
    private final int zza;
    private final zzbbn zzb = new zzbbs();

    public zzbbq(int i2) {
        this.zza = i2;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((String) arrayList.get(i2)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbbp zzbbpVar = new zzbbp();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbbo(this));
        for (String str : split) {
            String[] zzb = zzbbr.zzb(str, false);
            if (zzb.length != 0) {
                zzbbv.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbpVar.zzb.write(this.zzb.zzb(((zzbbu) it.next()).zzb));
            } catch (IOException e2) {
                zzcfi.zzh("Error while writing hash to byteStream", e2);
            }
        }
        return zzbbpVar.toString();
    }
}
