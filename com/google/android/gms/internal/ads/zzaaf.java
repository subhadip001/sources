package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaaf {
    public static int zza(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static zzbl zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String[] zzag = zzeg.zzag(str, "=");
            if (zzag.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzag[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzabh.zzb(new zzdy(Base64.decode(zzag[1], 0))));
                } catch (RuntimeException e2) {
                    zzdn.zzb("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzacx(zzag[0], zzag[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    public static zzaac zzc(zzdy zzdyVar, boolean z, boolean z2) {
        if (z) {
            zzd(3, zzdyVar, false);
        }
        String zzx = zzdyVar.zzx((int) zzdyVar.zzq(), zzfog.zzc);
        long zzq = zzdyVar.zzq();
        String[] strArr = new String[(int) zzq];
        int length = zzx.length() + 15;
        for (int i2 = 0; i2 < zzq; i2++) {
            String zzx2 = zzdyVar.zzx((int) zzdyVar.zzq(), zzfog.zzc);
            strArr[i2] = zzx2;
            length = length + 4 + zzx2.length();
        }
        if (z2 && (zzdyVar.zzk() & 1) == 0) {
            throw zzbp.zza("framing bit expected to be set", null);
        }
        return new zzaac(zzx, strArr, length + 1);
    }

    public static boolean zzd(int i2, zzdy zzdyVar, boolean z) {
        if (zzdyVar.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzdyVar.zza();
            throw zzbp.zza("too short header: " + zza, null);
        } else if (zzdyVar.zzk() != i2) {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i2))), null);
        } else if (zzdyVar.zzk() == 118 && zzdyVar.zzk() == 111 && zzdyVar.zzk() == 114 && zzdyVar.zzk() == 98 && zzdyVar.zzk() == 105 && zzdyVar.zzk() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected characters 'vorbis'", null);
        }
    }
}
