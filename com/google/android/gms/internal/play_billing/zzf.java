package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public abstract class zzf extends zzi implements zzg {
    public zzf() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzi
    public final boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzj.zzb(parcel);
            zza((Bundle) zzj.zza(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
