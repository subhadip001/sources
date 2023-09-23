package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenu implements zzetb {
    private final zzetb zza;
    private final zzfby zzb;
    private final Context zzc;
    private final zzcer zzd;

    public zzenu(zzepl zzeplVar, zzfby zzfbyVar, Context context, zzcer zzcerVar) {
        this.zza = zzeplVar;
        this.zzb = zzfbyVar;
        this.zzc = context;
        this.zzd = zzcerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzm(this.zza.zzb(), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return zzenu.this.zzc((zzetg) obj);
            }
        }, zzcfv.zzf);
    }

    public final /* synthetic */ zzenv zzc(zzetg zzetgVar) {
        String str;
        boolean z;
        String str2;
        float f2;
        int i2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        } else {
            float f3 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i3 = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i2 = i5;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i6 = zzqVar3.zze;
                    if (i6 == -1) {
                        i6 = f2 != 0.0f ? (int) (zzqVar3.zzf / f2) : -1;
                    }
                    sb.append(i6);
                    sb.append("x");
                    int i7 = zzqVar3.zzb;
                    if (i7 == -2) {
                        i7 = f2 != 0.0f ? (int) (zzqVar3.zzc / f2) : -2;
                    }
                    sb.append(i7);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i4 = 0;
                    sb.insert(0, "|");
                } else {
                    i4 = 0;
                }
                sb.insert(i4, "320x50");
            }
        }
        return new zzenv(zzqVar, str, z, sb.toString(), f2, i2, i3, str2, this.zzb.zzp);
    }
}
