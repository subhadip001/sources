package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztz {
    public static final zztz zza = new zztz(new zzck[0]);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzty
    };
    public final int zzc;
    private final zzfrh zzd;
    private int zze;

    public zztz(zzck... zzckVarArr) {
        this.zzd = zzfrh.zzn(zzckVarArr);
        this.zzc = zzckVarArr.length;
        int i2 = 0;
        while (i2 < this.zzd.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.zzd.size(); i4++) {
                if (((zzck) this.zzd.get(i2)).equals(this.zzd.get(i4))) {
                    zzdn.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztz.class == obj.getClass()) {
            zztz zztzVar = (zztz) obj;
            if (this.zzc == zztzVar.zzc && this.zzd.equals(zztzVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = this.zzd.hashCode();
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final int zza(zzck zzckVar) {
        int indexOf = this.zzd.indexOf(zzckVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzck zzb(int i2) {
        return (zzck) this.zzd.get(i2);
    }
}
