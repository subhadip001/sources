package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzuu extends zzcp {
    public static final zzuu zzC;
    @Deprecated
    public static final zzuu zzD;
    public static final zzl zzE;
    public final int zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        zzuu zzuuVar = new zzuu(new zzuw());
        zzC = zzuuVar;
        zzD = zzuuVar;
        zzE = new zzl() { // from class: com.google.android.gms.internal.ads.zzus
        };
    }

    private zzuu(zzuw zzuwVar) {
        super(zzuwVar);
        this.zzG = zzuw.zzt(zzuwVar);
        this.zzH = false;
        this.zzI = zzuw.zzq(zzuwVar);
        this.zzJ = false;
        this.zzK = zzuw.zzr(zzuwVar);
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzF = 0;
        this.zzP = zzuw.zzs(zzuwVar);
        this.zzQ = false;
        this.zzR = zzuw.zzp(zzuwVar);
        this.zzS = zzuw.zzm(zzuwVar);
        this.zzT = zzuw.zzn(zzuwVar);
    }

    public static zzuu zzc(Context context) {
        return new zzuu(new zzuw(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzuu.class == obj.getClass()) {
            zzuu zzuuVar = (zzuu) obj;
            if (super.equals(zzuuVar) && this.zzG == zzuuVar.zzG && this.zzI == zzuuVar.zzI && this.zzK == zzuuVar.zzK && this.zzP == zzuuVar.zzP && this.zzR == zzuuVar.zzR) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzuuVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                                break;
                            }
                            i2++;
                        } else {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzuuVar.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i3 = 0; i3 < size2; i3++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i3);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zztz zztzVar = (zztz) entry.getKey();
                                                if (map2.containsKey(zztzVar)) {
                                                    if (!zzeg.zzS(entry.getValue(), map2.get(zztzVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 887503681) + (this.zzP ? 1 : 0)) * 961) + (this.zzR ? 1 : 0);
    }

    public final zzuw zzd() {
        return new zzuw(this, null);
    }

    @Deprecated
    public final zzuy zze(int i2, zztz zztzVar) {
        Map map = (Map) this.zzS.get(i2);
        if (map != null) {
            return (zzuy) map.get(zztzVar);
        }
        return null;
    }

    public final boolean zzf(int i2) {
        return this.zzT.get(i2);
    }

    @Deprecated
    public final boolean zzg(int i2, zztz zztzVar) {
        Map map = (Map) this.zzS.get(i2);
        return map != null && map.containsKey(zztzVar);
    }
}
