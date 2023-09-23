package com.google.android.gms.internal.ads;

import android.net.Uri;
import f.a.b.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzew {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbc.zzb("media3.datasource");
    }

    private zzew(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2 + j3;
        boolean z = false;
        zzcw.zzd(j5 >= 0);
        zzcw.zzd(j3 >= 0);
        long j6 = -1;
        if (j4 > 0) {
            j6 = j4;
        } else if (j4 != -1) {
            j6 = j4;
            zzcw.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j3;
            this.zze = j5;
            this.zzg = j6;
            this.zzh = null;
            this.zzi = i3;
        }
        z = true;
        zzcw.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j3;
        this.zze = j5;
        this.zzg = j6;
        this.zzh = null;
        this.zzi = i3;
    }

    public static String zza(int i2) {
        return "GET";
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i2 = this.zzi;
        StringBuilder A = a.A("DataSpec[");
        A.append(zza(1));
        A.append(" ");
        A.append(valueOf);
        A.append(", ");
        A.append(j2);
        a.Q(A, ", ", j3, ", null, ");
        return a.t(A, i2, "]");
    }

    public final boolean zzb(int i2) {
        return (this.zzi & i2) == i2;
    }

    @Deprecated
    public zzew(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        this(uri, j2 - j3, 1, null, Collections.emptyMap(), j3, j4, null, i2, null);
    }
}
