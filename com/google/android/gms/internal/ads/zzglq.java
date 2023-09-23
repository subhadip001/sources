package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglq implements zzgms {
    private static final zzglw zza = new zzglo();
    private final zzglw zzb;

    public zzglq() {
        zzglw zzglwVar;
        zzglw[] zzglwVarArr = new zzglw[2];
        zzglwVarArr[0] = zzgkj.zza();
        try {
            zzglwVar = (zzglw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzglwVar = zza;
        }
        zzglwVarArr[1] = zzglwVar;
        zzglp zzglpVar = new zzglp(zzglwVarArr);
        zzgky.zzf(zzglpVar, "messageInfoFactory");
        this.zzb = zzglpVar;
    }

    private static boolean zzb(zzglv zzglvVar) {
        return zzglvVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgms
    public final zzgmr zza(Class cls) {
        zzgmt.zzG(cls);
        zzglv zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzgko.class.isAssignableFrom(cls)) {
                return zzgmc.zzc(zzgmt.zzB(), zzgkd.zzb(), zzb.zza());
            }
            return zzgmc.zzc(zzgmt.zzz(), zzgkd.zza(), zzb.zza());
        } else if (zzgko.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzgmb.zzl(cls, zzb, zzgme.zzb(), zzglm.zze(), zzgmt.zzB(), zzgkd.zzb(), zzglu.zzb());
            }
            return zzgmb.zzl(cls, zzb, zzgme.zzb(), zzglm.zze(), zzgmt.zzB(), null, zzglu.zzb());
        } else if (zzb(zzb)) {
            return zzgmb.zzl(cls, zzb, zzgme.zza(), zzglm.zzd(), zzgmt.zzz(), zzgkd.zza(), zzglu.zza());
        } else {
            return zzgmb.zzl(cls, zzb, zzgme.zza(), zzglm.zzd(), zzgmt.zzA(), null, zzglu.zza());
        }
    }
}
