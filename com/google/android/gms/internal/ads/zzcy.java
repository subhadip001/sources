package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};

    public static String zza(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String zzb(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i2];
        objArr[1] = Integer.valueOf(i3);
        objArr[2] = Integer.valueOf(i4);
        objArr[3] = Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i5);
        StringBuilder sb = new StringBuilder(zzeg.zzH("hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (i6 > 0) {
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i8])));
        }
        return sb.toString();
    }

    public static byte[] zzc(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }
}
