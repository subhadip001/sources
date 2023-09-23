package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfue extends zzfuc {
    private zzfue() {
        super(null);
    }

    public /* synthetic */ zzfue(zzfub zzfubVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final int zza(zzfuf zzfufVar) {
        int zzA;
        synchronized (zzfufVar) {
            zzA = zzfuf.zzA(zzfufVar);
        }
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzb(zzfuf zzfufVar, Set set, Set set2) {
        Set set3;
        synchronized (zzfufVar) {
            set3 = zzfufVar.seenExceptions;
            if (set3 == null) {
                zzfufVar.seenExceptions = set2;
            }
        }
    }
}
