package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfoc extends zzfob {
    private final char zza;

    public zzfoc(char c) {
        this.zza = c;
    }

    public final String toString() {
        int i2 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return a.v(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}
