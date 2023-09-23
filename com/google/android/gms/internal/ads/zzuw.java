package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzuw extends zzco {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;

    @Deprecated
    public zzuw() {
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    public static /* bridge */ /* synthetic */ SparseArray zzm(zzuw zzuwVar) {
        return zzuwVar.zzf;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzn(zzuw zzuwVar) {
        return zzuwVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzp(zzuw zzuwVar) {
        return zzuwVar.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zzq(zzuw zzuwVar) {
        return zzuwVar.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzuw zzuwVar) {
        return zzuwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzuw zzuwVar) {
        return zzuwVar.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzuw zzuwVar) {
        return zzuwVar.zza;
    }

    private final void zzu() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final /* synthetic */ zzco zze(int i2, int i3, boolean z) {
        super.zze(i2, i3, true);
        return this;
    }

    public final zzuw zzo(int i2, boolean z) {
        if (this.zzg.get(i2) == z) {
            return this;
        }
        if (z) {
            this.zzg.put(i2, true);
        } else {
            this.zzg.delete(i2);
        }
        return this;
    }

    public zzuw(Context context) {
        super.zzd(context);
        Point zzA = zzeg.zzA(context);
        zze(zzA.x, zzA.y, true);
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    public /* synthetic */ zzuw(zzuu zzuuVar, zzuv zzuvVar) {
        super(zzuuVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzuuVar.zzG;
        this.zzb = zzuuVar.zzI;
        this.zzc = zzuuVar.zzK;
        this.zzd = zzuuVar.zzP;
        this.zze = zzuuVar.zzR;
        sparseArray = zzuuVar.zzS;
        SparseArray sparseArray2 = new SparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), new HashMap((Map) sparseArray.valueAt(i2)));
        }
        this.zzf = sparseArray2;
        sparseBooleanArray = zzuuVar.zzT;
        this.zzg = sparseBooleanArray.clone();
    }
}
