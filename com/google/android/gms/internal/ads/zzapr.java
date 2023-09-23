package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapr extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapr(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "4qo7ydIZUH0p5YejDx/8wjt7DkOxdD2eNzq7zPXjrFqYSIF2FJuHDk9SiXwd9Q5H", "6AMFYAA1mweGFVX4poqZeQeR2M0TfYtYyjbhtBhim8Y=", zzaliVar, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzn(zzi.longValue());
        }
    }
}
