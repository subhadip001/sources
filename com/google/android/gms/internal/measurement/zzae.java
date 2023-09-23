package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzae implements Iterable, zzap, zzal {
    public final SortedMap zza;
    public final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzae) {
            zzae zzaeVar = (zzae) obj;
            if (zzc() != zzaeVar.zzc()) {
                return false;
            }
            if (this.zza.isEmpty()) {
                return zzaeVar.zza.isEmpty();
            }
            for (int intValue = ((Integer) this.zza.firstKey()).intValue(); intValue <= ((Integer) this.zza.lastKey()).intValue(); intValue++) {
                if (!zze(intValue).equals(zzaeVar.zze(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbR(String str, zzg zzgVar, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return zzaj.zza(this, new zzat(str), zzgVar, list);
        }
        return zzbb.zza(str, this, zzgVar, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Integer) this.zza.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i2) {
        zzap zzapVar;
        if (i2 < zzc()) {
            return (!zzs(i2) || (zzapVar = (zzap) this.zza.get(Integer.valueOf(i2))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        return (!zzt(str) || (zzapVar = (zzap) this.zzb.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.size() == 1) {
            return zze(0).zzh();
        }
        if (this.zza.size() <= 0) {
            return Double.valueOf((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                zzap zze = zze(i2);
                sb.append(str);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i2 = 0; i2 < zzc(); i2++) {
            arrayList.add(zze(i2));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i2, zzap zzapVar) {
        if (i2 >= 0) {
            if (i2 >= zzc()) {
                zzq(i2, zzapVar);
                return;
            }
            for (int intValue = ((Integer) this.zza.lastKey()).intValue(); intValue >= i2; intValue--) {
                SortedMap sortedMap = this.zza;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzapVar2 = (zzap) sortedMap.get(valueOf);
                if (zzapVar2 != null) {
                    zzq(intValue + 1, zzapVar2);
                    this.zza.remove(valueOf);
                }
            }
            zzq(i2, zzapVar);
            return;
        }
        throw new IllegalArgumentException(a.i("Invalid value index: ", i2));
    }

    public final void zzp(int i2) {
        int intValue = ((Integer) this.zza.lastKey()).intValue();
        if (i2 > intValue || i2 < 0) {
            return;
        }
        this.zza.remove(Integer.valueOf(i2));
        if (i2 == intValue) {
            SortedMap sortedMap = this.zza;
            int i3 = i2 - 1;
            Integer valueOf = Integer.valueOf(i3);
            if (sortedMap.containsKey(valueOf) || i3 < 0) {
                return;
            }
            this.zza.put(valueOf, zzap.zzf);
            return;
        }
        while (true) {
            i2++;
            if (i2 > ((Integer) this.zza.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.zza;
            Integer valueOf2 = Integer.valueOf(i2);
            zzap zzapVar = (zzap) sortedMap2.get(valueOf2);
            if (zzapVar != null) {
                this.zza.put(Integer.valueOf(i2 - 1), zzapVar);
                this.zza.remove(valueOf2);
            }
        }
    }

    public final void zzq(int i2, zzap zzapVar) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.i("Out of bounds index: ", i2));
        }
        if (zzapVar == null) {
            this.zza.remove(Integer.valueOf(i2));
        } else {
            this.zza.put(Integer.valueOf(i2), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i2) {
        if (i2 >= 0 && i2 <= ((Integer) this.zza.lastKey()).intValue()) {
            return this.zza.containsKey(Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a.i("Out of bounds index: ", i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzq(i2, (zzap) list.get(i2));
            }
        }
    }
}
