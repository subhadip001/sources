package com.google.android.gms.internal.ads;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzamn {
    public static String zza(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z) {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
