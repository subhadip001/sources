package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfrn {
    public static boolean zza(Iterable iterable, zzfot zzfotVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzfotVar);
            return zzc((List) iterable, zzfotVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzfotVar);
        boolean z = false;
        while (it.hasNext()) {
            if (zzfotVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzfot zzfotVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzfotVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            list.remove(i3);
        }
    }

    private static boolean zzc(List list, zzfot zzfotVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!zzfotVar.zza(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfotVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfotVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }
}
