package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzase {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static int zza(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static zzars zzb(zzazg zzazgVar, String str, String str2, zzatr zzatrVar) {
        int i2 = zzc[(zzazgVar.zzg() & 192) >> 6];
        int zzg = zzazgVar.zzg();
        int i3 = zzd[(zzg & 56) >> 3];
        if ((zzg & 4) != 0) {
            i3++;
        }
        return zzars.zzg(str, "audio/ac3", null, -1, -1, i3, i2, null, zzatrVar, 0, str2);
    }

    public static zzars zzc(zzazg zzazgVar, String str, String str2, zzatr zzatrVar) {
        zzazgVar.zzw(2);
        int i2 = zzc[(zzazgVar.zzg() & 192) >> 6];
        int zzg = zzazgVar.zzg();
        int i3 = zzd[(zzg & 14) >> 1];
        if ((zzg & 1) != 0) {
            i3++;
        }
        return zzars.zzg(str, "audio/eac3", null, -1, -1, i3, i2, null, zzatrVar, 0, str2);
    }
}
