package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public enum zzbfy implements zzgkq {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzgkr zzg = new zzgkr() { // from class: com.google.android.gms.internal.ads.zzbfw
    };
    private final int zzi;

    zzbfy(int i2) {
        this.zzi = i2;
    }

    public static zzbfy zzb(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return SUSPENDED;
                        }
                        return DISCONNECTED;
                    }
                    return DISCONNECTING;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return UNSPECIFIED;
    }

    public static zzgks zzc() {
        return zzbfx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
