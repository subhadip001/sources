package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzwp {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzwo) obj).zza - ((zzwo) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzwo) obj).zzc, ((zzwo) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzwo[] zzd = new zzwo[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzwp(int i2) {
    }

    public final float zza(float f2) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f3 = this.zzg * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.size(); i3++) {
            zzwo zzwoVar = (zzwo) this.zzc.get(i3);
            i2 += zzwoVar.zzb;
            if (i2 >= f3) {
                return zzwoVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzwo) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i2, float f2) {
        zzwo zzwoVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i3 = this.zzh;
        if (i3 > 0) {
            zzwo[] zzwoVarArr = this.zzd;
            int i4 = i3 - 1;
            this.zzh = i4;
            zzwoVar = zzwoVarArr[i4];
        } else {
            zzwoVar = new zzwo(null);
        }
        int i5 = this.zzf;
        this.zzf = i5 + 1;
        zzwoVar.zza = i5;
        zzwoVar.zzb = i2;
        zzwoVar.zzc = f2;
        this.zzc.add(zzwoVar);
        this.zzg += i2;
        while (true) {
            int i6 = this.zzg;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            zzwo zzwoVar2 = (zzwo) this.zzc.get(0);
            int i8 = zzwoVar2.zzb;
            if (i8 <= i7) {
                this.zzg -= i8;
                this.zzc.remove(0);
                int i9 = this.zzh;
                if (i9 < 5) {
                    zzwo[] zzwoVarArr2 = this.zzd;
                    this.zzh = i9 + 1;
                    zzwoVarArr2[i9] = zzwoVar2;
                }
            } else {
                zzwoVar2.zzb = i8 - i7;
                this.zzg -= i7;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
