package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztx {
    private int zza;
    private final SparseArray zzb;
    private final zzda zzc;

    public zztx() {
        zztw zztwVar = new zzda() { // from class: com.google.android.gms.internal.ads.zztw
        };
        throw null;
    }

    public final Object zza(int i2) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i3 = this.zza;
            if (i3 > 0 && i2 < this.zzb.keyAt(i3)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i2 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        SparseArray sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzc(int i2, Object obj) {
        if (this.zza == -1) {
            zzcw.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            SparseArray sparseArray = this.zzb;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzcw.zzd(i2 >= keyAt);
            if (keyAt == i2) {
                SparseArray sparseArray2 = this.zzb;
                zztq.zzl((zzto) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.zzb.append(i2, obj);
    }

    public final void zzd() {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zztq.zzl((zzto) this.zzb.valueAt(i2));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i2) {
        int i3 = 0;
        while (i3 < this.zzb.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.zzb.keyAt(i4)) {
                return;
            }
            zztq.zzl((zzto) this.zzb.valueAt(i3));
            this.zzb.removeAt(i3);
            int i5 = this.zza;
            if (i5 > 0) {
                this.zza = i5 - 1;
            }
            i3 = i4;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zztx(zzda zzdaVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdaVar;
        this.zza = -1;
    }
}
