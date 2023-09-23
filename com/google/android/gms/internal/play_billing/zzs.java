package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzs extends zzo {
    private final zzu zza;

    public zzs(zzu zzuVar, int i2) {
        super(zzuVar.size(), i2);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
