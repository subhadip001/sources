package com.google.android.gms.internal.ads;

import android.net.Uri;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayk {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayk(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = false;
        zzayy.zzc(j2 >= 0);
        zzayy.zzc(j3 >= 0);
        if (j4 <= 0) {
            j4 = j4 == -1 ? -1L : j4;
            zzayy.zzc(z);
            this.zza = uri;
            this.zzb = j2;
            this.zzc = j3;
            this.zzd = j4;
        }
        z = true;
        zzayy.zzc(z);
        this.zza = uri;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        StringBuilder F = a.F("DataSpec[", valueOf, ", ", arrays, ", ");
        F.append(j2);
        a.Q(F, ", ", j3, ", ");
        F.append(j4);
        F.append(", null, 0]");
        return F.toString();
    }
}
