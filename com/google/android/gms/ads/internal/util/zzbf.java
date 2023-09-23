package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.zzb;
        int size = list.size();
        list2 = zzbdVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbdVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = ((Double) list.get(i2)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.zzc[i2];
            double d3 = this.zzb[i2];
            int i3 = this.zzd[i2];
            arrayList.add(new zzbc(str, d2, d3, i3 / this.zze, i3));
            i2++;
        }
    }

    public final void zzb(double d2) {
        this.zze++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i2 >= dArr.length) {
                return;
            }
            double d3 = dArr[i2];
            if (d3 <= d2 && d2 < this.zzb[i2]) {
                int[] iArr = this.zzd;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < d3) {
                return;
            }
            i2++;
        }
    }
}
