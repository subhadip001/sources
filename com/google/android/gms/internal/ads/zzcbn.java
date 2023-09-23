package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbn implements RewardItem {
    private final zzcba zza;

    public zzcbn(zzcba zzcbaVar) {
        this.zza = zzcbaVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcba zzcbaVar = this.zza;
        if (zzcbaVar != null) {
            try {
                return zzcbaVar.zze();
            } catch (RemoteException e2) {
                zzcfi.zzk("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcba zzcbaVar = this.zza;
        if (zzcbaVar != null) {
            try {
                return zzcbaVar.zzf();
            } catch (RemoteException e2) {
                zzcfi.zzk("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}
