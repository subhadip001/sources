package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyp {
    public final String zza;

    private zzyp(int i2, int i3, String str) {
        this.zza = str;
    }

    public static zzyp zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        int i2 = zzk >> 1;
        int zzk2 = (zzdyVar.zzk() >> 3) | ((zzk & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzk2 < 10 ? ".0" : ".";
        return new zzyp(i2, zzk2, str + ".0" + i2 + str2 + zzk2);
    }
}
