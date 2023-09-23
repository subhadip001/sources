package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyb {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzyb(List list, int i2, int i3, int i4, float f2, String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = f2;
        this.zzf = str;
    }

    public static zzyb zza(zzdy zzdyVar) {
        String str;
        int i2;
        int i3;
        float f2;
        try {
            zzdyVar.zzG(4);
            int zzk = (zzdyVar.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i4 = 0; i4 < zzk2; i4++) {
                    arrayList.add(zzb(zzdyVar));
                }
                int zzk3 = zzdyVar.zzk();
                for (int i5 = 0; i5 < zzk3; i5++) {
                    arrayList.add(zzb(zzdyVar));
                }
                if (zzk2 > 0) {
                    zzzo zzd = zzzp.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i6 = zzd.zze;
                    int i7 = zzd.zzf;
                    float f3 = zzd.zzg;
                    str = zzcy.zza(zzd.zza, zzd.zzb, zzd.zzc);
                    i2 = i6;
                    i3 = i7;
                    f2 = f3;
                } else {
                    str = null;
                    i2 = -1;
                    i3 = -1;
                    f2 = 1.0f;
                }
                return new zzyb(arrayList, zzk, i2, i3, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzbp.zza("Error parsing AVC config", e2);
        }
    }

    private static byte[] zzb(zzdy zzdyVar) {
        int zzo = zzdyVar.zzo();
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(zzo);
        return zzcy.zzc(zzdyVar.zzH(), zzc, zzo);
    }
}
