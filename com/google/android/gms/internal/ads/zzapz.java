package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapz extends zzaqm {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzapz(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "yAAnOyC41KY/eL6CMAojoxxQ2iiLx6vx3Hn+A3WrzJkepsJehbcbUfsfqGMngMgj", "0sUnM0f6jlJ2HFtGqy6I2XKbpiW5H3xN4OJ+XAaaX74=", zzaliVar, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        this.zze.zzy("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi);
        }
    }
}
