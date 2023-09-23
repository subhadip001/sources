package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjs extends zzgd {
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzci[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjs(Collection collection, zztu zztuVar, byte[] bArr) {
        super(false, zztuVar, null);
        int i2 = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzci[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap();
        Iterator it = collection.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            zzjh zzjhVar = (zzjh) it.next();
            this.zzg[i4] = zzjhVar.zza();
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += this.zzg[i4].zzc();
            i3 += this.zzg[i4].zzb();
            this.zzh[i4] = zzjhVar.zzb();
            this.zzi.put(this.zzh[i4], Integer.valueOf(i4));
            i4++;
        }
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zzq(int i2) {
        return zzeg.zzc(this.zze, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zzr(int i2) {
        return zzeg.zzc(this.zzf, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zzs(int i2) {
        return this.zze[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zzt(int i2) {
        return this.zzf[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final zzci zzu(int i2) {
        return this.zzg[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Object zzv(int i2) {
        return this.zzh[i2];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }
}
