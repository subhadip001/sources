package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaps extends zzaqm {
    private final long zzi;

    public zzaps(zzapc zzapcVar, String str, String str2, zzali zzaliVar, long j2, int i2, int i3) {
        super(zzapcVar, "9aN5Cm+1eB8M6WEeTCyHrcP34KU7gU8jlMBy6C9bmSWwJjNodfWmCfc45rNGVCVv", "hM2f+ZpOxGYOaoXhhqTEB4E2d1ZW9gQWshCuliQN60Y=", zzaliVar, i2, 25);
        this.zzi = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzs(longValue);
            long j2 = this.zzi;
            if (j2 != 0) {
                this.zze.zzQ(longValue - j2);
                this.zze.zzR(this.zzi);
            }
        }
    }
}
