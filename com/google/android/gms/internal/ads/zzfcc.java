package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfcc {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbh zzfbhVar = (zzfbh) it.next();
            if (zzfbhVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbhVar.zza, zzfbhVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbh zzb(List list, zzfbh zzfbhVar) {
        return (zzfbh) list.get(0);
    }

    public static zzfbh zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzi ? new zzfbh(-3, 0, true) : new zzfbh(zzqVar.zze, zzqVar.zzb, false);
    }
}
