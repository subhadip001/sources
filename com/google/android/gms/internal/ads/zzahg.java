package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzahg implements zzagz {
    public final /* synthetic */ zzahi zza;
    private final zzdx zzb = new zzdx(new byte[4], 4);

    public zzahg(zzahi zzahiVar) {
        this.zza = zzahiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzdy zzdyVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i2;
        if (zzdyVar.zzk() == 0 && (zzdyVar.zzk() & 128) != 0) {
            zzdyVar.zzG(6);
            int zza = zzdyVar.zza() / 4;
            for (int i3 = 0; i3 < zza; i3++) {
                zzdyVar.zzA(this.zzb, 4);
                int zzc = this.zzb.zzc(16);
                this.zzb.zzj(3);
                if (zzc == 0) {
                    this.zzb.zzj(13);
                } else {
                    int zzc2 = this.zzb.zzc(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzc2) == null) {
                        zzahi zzahiVar = this.zza;
                        sparseArray3 = zzahiVar.zzf;
                        sparseArray3.put(zzc2, new zzaha(new zzahh(zzahiVar, zzc2)));
                        zzahi zzahiVar2 = this.zza;
                        i2 = zzahiVar2.zzl;
                        zzahiVar2.zzl = i2 + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzee zzeeVar, zzyv zzyvVar, zzahm zzahmVar) {
    }
}
