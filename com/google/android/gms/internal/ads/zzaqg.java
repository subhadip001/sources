package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqg extends zzaqm {
    private final zzapj zzi;
    private long zzj;

    public zzaqg(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, zzapj zzapjVar) {
        super(zzapcVar, "JlKpVe7xzQtZywdnv0ux4JrKILbEoPGtNuq/lCSZezm3ZqhaJyVFDnkCoxXLf/KG", "V8HYPAghzWHqrIy38Vh6p4w3eeyqyQ2rIl2LLOtw9JM=", zzaliVar, i2, 53);
        this.zzi = zzapjVar;
        if (zzapjVar != null) {
            this.zzj = zzapjVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        if (this.zzi != null) {
            this.zze.zzM(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
