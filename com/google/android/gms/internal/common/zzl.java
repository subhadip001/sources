package com.google.android.gms.internal.common;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class zzl extends zzk {
    private final char zza;

    public zzl(char c) {
        this.zza = c;
    }

    public final String toString() {
        StringBuilder A = a.A("CharMatcher.is('");
        int i2 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        A.append(String.copyValueOf(cArr));
        A.append("')");
        return A.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
