package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqh extends zzaqm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaqh(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "95m8nxzquSP6UteH+ctwS+fnWW3e+ARzjY5ilI8E7MqGTZUjuLdEgCnwSuHZqZih", "hyYn+RjvP2onIyOXybEZ6mkvLCHC0SlFWfJn2VBlQ1U=", zzaliVar, i2, 33);
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
            this.zze.zzS(zzi.longValue());
        }
    }
}
