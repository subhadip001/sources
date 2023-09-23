package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.logging.type.LogSeverity;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzya {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, LogSeverity.EMERGENCY_VALUE, LogSeverity.EMERGENCY_VALUE, 480, LogSeverity.WARNING_VALUE, LogSeverity.WARNING_VALUE, RecyclerView.a0.FLAG_MOVED};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r11 != 8) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzxz zza(com.google.android.gms.internal.ads.zzdx r11) {
        /*
            r0 = 16
            int r1 = r11.zzc(r0)
            int r0 = r11.zzc(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.zzc(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.zzc(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3f
            r1 = 0
        L2c:
            int r5 = r11.zzc(r0)
            int r5 = r5 + r1
            boolean r1 = r11.zzl()
            if (r1 != 0) goto L3a
            int r5 = r5 + r4
            r1 = r5
            goto L3f
        L3a:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L3f:
            r5 = 10
            int r5 = r11.zzc(r5)
            boolean r6 = r11.zzl()
            if (r6 == 0) goto L54
            int r6 = r11.zzc(r4)
            if (r6 <= 0) goto L54
            r11.zzj(r0)
        L54:
            boolean r6 = r11.zzl()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L65
            r6 = 44100(0xac44, float:6.1797E-41)
            goto L68
        L65:
            r6 = 48000(0xbb80, float:6.7262E-41)
        L68:
            int r11 = r11.zzc(r2)
            if (r6 != r8) goto L78
            r8 = 13
            if (r11 != r8) goto L78
            int[] r11 = com.google.android.gms.internal.ads.zzya.zzb
            r11 = r11[r8]
            r8 = r11
            goto La8
        L78:
            if (r6 != r9) goto La7
            r8 = 14
            if (r11 >= r8) goto La7
            int[] r3 = com.google.android.gms.internal.ads.zzya.zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L9d
            r9 = 11
            if (r5 == r0) goto L98
            if (r5 == r4) goto L9d
            if (r5 == r2) goto L91
            goto La2
        L91:
            if (r11 == r4) goto La4
            if (r11 == r8) goto La4
            if (r11 != r9) goto La2
            goto La4
        L98:
            if (r11 == r8) goto La4
            if (r11 != r9) goto La2
            goto La4
        L9d:
            if (r11 == r4) goto La4
            if (r11 != r8) goto La2
            goto La4
        La2:
            r8 = r3
            goto La8
        La4:
            int r3 = r3 + 1
            goto La2
        La7:
            r8 = 0
        La8:
            com.google.android.gms.internal.ads.zzxz r11 = new com.google.android.gms.internal.ads.zzxz
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzya.zza(com.google.android.gms.internal.ads.zzdx):com.google.android.gms.internal.ads.zzxz");
    }

    public static void zzb(int i2, zzdy zzdyVar) {
        zzdyVar.zzC(7);
        byte[] zzH = zzdyVar.zzH();
        zzH[0] = -84;
        zzH[1] = 64;
        zzH[2] = -1;
        zzH[3] = -1;
        zzH[4] = (byte) ((i2 >> 16) & 255);
        zzH[5] = (byte) ((i2 >> 8) & 255);
        zzH[6] = (byte) (i2 & 255);
    }
}
