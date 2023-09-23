package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbc {
    @VisibleForTesting
    public int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzbbb zza(boolean z) {
        synchronized (this.zzb) {
            zzbbb zzbbbVar = null;
            if (this.zzc.isEmpty()) {
                zzcfi.zze("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.zzc.size() >= 2) {
                int i3 = Integer.MIN_VALUE;
                int i4 = 0;
                for (zzbbb zzbbbVar2 : this.zzc) {
                    int zzb = zzbbbVar2.zzb();
                    if (zzb > i3) {
                        i2 = i4;
                    }
                    int i5 = zzb > i3 ? zzb : i3;
                    if (zzb > i3) {
                        zzbbbVar = zzbbbVar2;
                    }
                    i4++;
                    i3 = i5;
                }
                this.zzc.remove(i2);
                return zzbbbVar;
            }
            zzbbb zzbbbVar3 = (zzbbb) this.zzc.get(0);
            if (z) {
                this.zzc.remove(0);
            } else {
                zzbbbVar3.zzi();
            }
            return zzbbbVar3;
        }
    }

    public final void zzb(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzcfi.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzbbbVar.zzj(i2);
            zzbbbVar.zzn();
            this.zzc.add(zzbbbVar);
        }
    }

    public final boolean zzc(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbbb zzbbbVar2 = (zzbbb) it.next();
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (zzbbbVar != zzbbbVar2 && zzbbbVar2.zzd().equals(zzbbbVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && zzbbbVar != zzbbbVar2 && zzbbbVar2.zzf().equals(zzbbbVar.zzf())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbbbVar);
        }
    }
}
