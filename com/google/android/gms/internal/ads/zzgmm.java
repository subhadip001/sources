package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmm {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgmm() {
    }

    public static /* bridge */ /* synthetic */ zzgjg zza(zzgmm zzgmmVar, zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        zzgmmVar.zzb(zzgjgVar);
        zzgmmVar.zzb(zzgjgVar2);
        zzgjg zzgjgVar3 = (zzgjg) zzgmmVar.zza.pop();
        while (!zzgmmVar.zza.isEmpty()) {
            zzgjgVar3 = new zzgmq((zzgjg) zzgmmVar.zza.pop(), zzgjgVar3);
        }
        return zzgjgVar3;
    }

    private final void zzb(zzgjg zzgjgVar) {
        zzgjg zzgjgVar2;
        zzgjg zzgjgVar3;
        if (zzgjgVar.zzh()) {
            int zzc = zzc(zzgjgVar.zzd());
            int zzc2 = zzgmq.zzc(zzc + 1);
            if (!this.zza.isEmpty() && ((zzgjg) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgmq.zzc(zzc);
                zzgjg zzgjgVar4 = (zzgjg) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzgjg) this.zza.peek()).zzd() < zzc3) {
                    zzgjgVar4 = new zzgmq((zzgjg) this.zza.pop(), zzgjgVar4);
                }
                zzgmq zzgmqVar = new zzgmq(zzgjgVar4, zzgjgVar);
                while (!this.zza.isEmpty()) {
                    if (((zzgjg) this.zza.peek()).zzd() >= zzgmq.zzc(zzc(zzgmqVar.zzd()) + 1)) {
                        break;
                    }
                    zzgmqVar = new zzgmq((zzgjg) this.zza.pop(), zzgmqVar);
                }
                this.zza.push(zzgmqVar);
                return;
            }
            this.zza.push(zzgjgVar);
        } else if (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar2 = (zzgmq) zzgjgVar;
            zzgjgVar2 = zzgmqVar2.zzd;
            zzb(zzgjgVar2);
            zzgjgVar3 = zzgmqVar2.zze;
            zzb(zzgjgVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgjgVar.getClass())));
        }
    }

    private static final int zzc(int i2) {
        int binarySearch = Arrays.binarySearch(zzgmq.zza, i2);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzgmm(zzgml zzgmlVar) {
    }
}
