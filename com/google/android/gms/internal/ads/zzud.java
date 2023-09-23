package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzud {
    public final long zza;
    public final long zzb;

    public zzud(long j2, long j3) {
        this.zza = j2;
        this.zzb = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzud) {
            zzud zzudVar = (zzud) obj;
            return this.zza == zzudVar.zza && this.zzb == zzudVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
