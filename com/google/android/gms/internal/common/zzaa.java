package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class zzaa extends zzab {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzaa(int i2) {
    }

    private final void zzb(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i2) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i3 = length + (length >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i3);
        this.zzc = false;
    }

    public final zzaa zza(Object obj) {
        Objects.requireNonNull(obj);
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }
}
