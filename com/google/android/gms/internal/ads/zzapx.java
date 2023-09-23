package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapx extends zzaqm {
    private final zzaog zzi;
    private final long zzj;
    private final long zzk;

    public zzapx(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, zzaog zzaogVar, long j2, long j3) {
        super(zzapcVar, "gwRPz8bLLKP2CNEw52CWr8qH7aLQJQgZH2Do8dWUF6DoOxZ/M4tgY0r5mQPR4CHj", "wXdYywy2LsdIoEkljSZxSgKQk9kgrY0qof3Oat1MHRk=", zzaliVar, i2, 11);
        this.zzi = zzaogVar;
        this.zzj = j2;
        this.zzk = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        zzaog zzaogVar = this.zzi;
        if (zzaogVar != null) {
            zzaoe zzaoeVar = new zzaoe((String) this.zzf.invoke(null, zzaogVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzw(zzaoeVar.zza.longValue());
                if (zzaoeVar.zzb.longValue() >= 0) {
                    this.zze.zzN(zzaoeVar.zzb.longValue());
                }
                if (zzaoeVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaoeVar.zzc.longValue());
                }
            }
        }
    }
}
