package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayg implements zzayi {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;

    public zzayg(byte[] bArr) {
        Objects.requireNonNull(bArr);
        zzayy.zzc(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(this.zza, this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final long zzb(zzayk zzaykVar) {
        this.zzb = zzaykVar.zza;
        long j2 = zzaykVar.zzc;
        int i2 = (int) j2;
        this.zzc = i2;
        long j3 = zzaykVar.zzd;
        long j4 = -1;
        if (j3 == -1) {
            j3 = this.zza.length - j2;
        } else {
            j4 = j3;
        }
        int i3 = (int) j3;
        this.zzd = i3;
        if (i3 <= 0 || i2 + i3 > this.zza.length) {
            int length = this.zza.length;
            throw new IOException("Unsatisfiable range: [" + i2 + ", " + j4 + "], length: " + length);
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() {
        this.zzb = null;
    }
}
