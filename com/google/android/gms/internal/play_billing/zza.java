package com.google.android.gms.internal.play_billing;

import com.google.firebase.database.DatabaseError;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public enum zza {
    RESPONSE_CODE_UNSPECIFIED(DatabaseError.UNKNOWN_ERROR),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    
    private static final zzx zzo;
    private final int zzq;

    static {
        zzw zzwVar = new zzw();
        zza[] values = values();
        for (int i2 = 0; i2 < 14; i2++) {
            zza zzaVar = values[i2];
            zzwVar.zza(Integer.valueOf(zzaVar.zzq), zzaVar);
        }
        zzo = zzwVar.zzb();
    }

    zza(int i2) {
        this.zzq = i2;
    }

    public static zza zza(int i2) {
        zzx zzxVar = zzo;
        Integer valueOf = Integer.valueOf(i2);
        return !zzxVar.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (zza) zzxVar.get(valueOf);
    }
}
