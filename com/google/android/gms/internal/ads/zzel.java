package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzel extends zzek {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzel(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        zzcw.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        this.zzb = zzewVar.zza;
        zzi(zzewVar);
        long j2 = zzewVar.zzf;
        int length = this.zza.length;
        if (j2 <= length) {
            int i2 = (int) j2;
            this.zzc = i2;
            int i3 = length - i2;
            this.zzd = i3;
            long j3 = zzewVar.zzg;
            if (j3 != -1) {
                this.zzd = (int) Math.min(i3, j3);
            }
            this.zze = true;
            zzj(zzewVar);
            long j4 = zzewVar.zzg;
            return j4 != -1 ? j4 : this.zzd;
        }
        throw new zzes(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
