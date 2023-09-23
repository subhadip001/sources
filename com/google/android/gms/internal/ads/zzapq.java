package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapq extends zzaqm {
    public zzapq(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "WlHsOh3wlV0WLQIL1K9rw/fkp4GO6NjuEiNcfL+sOy0Pjb3rqvyOdqvxRQtxMK9a", "4hMU+mzsUU6XYstubXUmZj16dvyex8xOMz7Jpzy9YvA=", zzaliVar, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        this.zze.zzl(-1L);
        this.zze.zzk(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzl(iArr[0]);
            this.zze.zzk(iArr[1]);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                this.zze.zzj(i2);
            }
        }
    }
}
