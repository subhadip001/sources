package com.google.android.gms.internal.play_billing;

import f.a.b.a.a;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzv(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        a.R(sb, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(a.w(sb, " and ", valueOf3, "=", valueOf4));
    }
}
