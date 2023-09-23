package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfrl extends zzfra {
    public Object[] zzd;
    private int zze;

    public zzfrl() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfra, com.google.android.gms.internal.ads.zzfrb
    public final /* bridge */ /* synthetic */ zzfrb zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfrl zze(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfrm.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int i2 = length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfqz.zza(hashCode);
                while (true) {
                    int i3 = zza & i2;
                    Object[] objArr = this.zzd;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        objArr[i3] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i3 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfrl zzf(Iterable iterable) {
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zze(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfrm zzg() {
        zzfrm zzp;
        boolean zzq;
        int i2 = this.zzb;
        if (i2 != 0) {
            if (i2 != 1) {
                if (this.zzd == null || zzfrm.zzh(i2) != this.zzd.length) {
                    zzp = zzfrm.zzp(this.zzb, this.zza);
                    this.zzb = zzp.size();
                } else {
                    int i3 = this.zzb;
                    Object[] objArr = this.zza;
                    zzq = zzfrm.zzq(i3, objArr.length);
                    if (zzq) {
                        objArr = Arrays.copyOf(objArr, i3);
                    }
                    int i4 = this.zze;
                    Object[] objArr2 = this.zzd;
                    zzp = new zzfsw(objArr, i4, objArr2, objArr2.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzp;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzftd(obj);
        }
        return zzfsw.zza;
    }

    public zzfrl(int i2) {
        super(i2);
        this.zzd = new Object[zzfrm.zzh(i2)];
    }
}
