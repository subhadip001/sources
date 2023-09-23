package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgia {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i2 = b & 255;
            sb.append("0123456789abcdef".charAt(i2 >> 4));
            sb.append("0123456789abcdef".charAt(i2 & 15));
        }
        return sb.toString();
    }
}
