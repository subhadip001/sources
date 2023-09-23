package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfep {
    private final zzfei zza;
    private final zzfvj zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfep(final zzfdn zzfdnVar, final zzfeh zzfehVar, final zzfei zzfeiVar) {
        this.zza = zzfeiVar;
        this.zzb = zzfva.zzg(zzfva.zzn(zzfehVar.zza(zzfeiVar), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzfen
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfep.this.zzb(zzfehVar, zzfdnVar, zzfeiVar, (zzfdw) obj);
            }
        }, zzfeiVar.zzb()), Exception.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzfep.this.zzc(zzfehVar, (Exception) obj);
            }
        }, zzfeiVar.zzb());
    }

    public final synchronized zzfvj zza(zzfei zzfeiVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfeiVar.zza() != null && this.zza.zza().equals(zzfeiVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzfvj zzb(zzfeh zzfehVar, zzfdn zzfdnVar, zzfei zzfeiVar, zzfdw zzfdwVar) {
        synchronized (this) {
            this.zzd = true;
            zzfehVar.zzb(zzfdwVar);
            if (!this.zzc) {
                zzfdnVar.zzd(zzfeiVar.zza(), zzfdwVar);
                return zzfva.zzi(null);
            }
            return zzfva.zzi(new zzfeg(zzfdwVar, zzfeiVar));
        }
    }

    public final /* synthetic */ zzfvj zzc(zzfeh zzfehVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuw zzfuwVar) {
        zzfva.zzr(zzfva.zzn(this.zzb, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzfem
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzfeg zzfegVar = (zzfeg) obj;
                return zzfva.zzj();
            }
        }, this.zza.zzb()), zzfuwVar, this.zza.zzb());
    }
}
