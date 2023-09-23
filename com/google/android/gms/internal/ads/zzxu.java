package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzxt zza(byte[] bArr) {
        return zzb(new zzdx(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
        if (r11 != 3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzxt zzb(com.google.android.gms.internal.ads.zzdx r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxu.zzb(com.google.android.gms.internal.ads.zzdx, boolean):com.google.android.gms.internal.ads.zzxt");
    }

    private static int zzc(zzdx zzdxVar) {
        int zzc2 = zzdxVar.zzc(5);
        return zzc2 == 31 ? zzdxVar.zzc(6) + 32 : zzc2;
    }

    private static int zzd(zzdx zzdxVar) {
        int zzc2 = zzdxVar.zzc(4);
        if (zzc2 == 15) {
            return zzdxVar.zzc(24);
        }
        if (zzc2 < 13) {
            return zzb[zzc2];
        }
        throw zzbp.zza(null, null);
    }
}
