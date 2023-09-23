package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaaq implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaap
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaaq.zza;
            return new zzys[]{new zzaaq()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private zzyv zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzaao zzp;
    private zzaau zzq;
    private final zzdy zzb = new zzdy(4);
    private final zzdy zzc = new zzdy(9);
    private final zzdy zzd = new zzdy(11);
    private final zzdy zze = new zzdy();
    private final zzaar zzf = new zzaar();
    private int zzh = 1;

    private final zzdy zze(zzyt zzytVar) {
        if (this.zzm > this.zze.zzb()) {
            zzdy zzdyVar = this.zze;
            int zzb = zzdyVar.zzb();
            zzdyVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzym) zzytVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzL(new zzzu(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r17, com.google.android.gms.internal.ads.zzzs r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaq.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzg = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        if (j2 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzymVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & 250) != 0) {
            return false;
        }
        zzymVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzytVar.zzj();
        zzym zzymVar2 = (zzym) zzytVar;
        zzymVar2.zzl(zze, false);
        zzymVar2.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
