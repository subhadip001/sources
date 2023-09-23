package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapv extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapv(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "UloSfoTFTeHwqhun6eFIktptgYL2IDO82d0FsFWUGkksiDJXPejv+whIfZ+2Wfan", "7xM/jp1ssnTHy48Ysast7LrhX+6n3G9zqz4TlIUZi1E=", zzaliVar, i2, 22);
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
            this.zze.zzv(zzi.longValue());
        }
    }
}
