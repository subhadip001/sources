package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzb extends LinkedHashMap {
    public final /* synthetic */ zzc zza;

    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int i2;
        ArrayDeque arrayDeque;
        int i3;
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            i2 = zzcVar.zza;
            if (size <= i2) {
                return false;
            }
            arrayDeque = zzcVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i3 = this.zza.zza;
            return size2 > i3;
        }
    }
}
