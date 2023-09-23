package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgix implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgjg zzgjgVar = (zzgjg) obj;
        zzgjg zzgjgVar2 = (zzgjg) obj2;
        zzgja it = zzgjgVar.iterator();
        zzgja it2 = zzgjgVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgjgVar.zzd()).compareTo(Integer.valueOf(zzgjgVar2.zzd()));
    }
}
