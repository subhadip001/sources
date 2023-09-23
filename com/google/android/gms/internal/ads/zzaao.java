package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaao extends zzaat {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaao(zzzz zzzzVar) {
        super(zzzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zza(zzdy zzdyVar) {
        if (!this.zzc) {
            int zzk = zzdyVar.zzk();
            int i2 = zzk >> 4;
            this.zze = i2;
            if (i2 == 2) {
                int i3 = zzb[(zzk >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzS("audio/mpeg");
                zzabVar.zzw(1);
                zzabVar.zzT(i3);
                this.zza.zzk(zzabVar.zzY());
                this.zzd = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzab zzabVar2 = new zzab();
                zzabVar2.zzS(str);
                zzabVar2.zzw(1);
                zzabVar2.zzT(8000);
                this.zza.zzk(zzabVar2.zzY());
                this.zzd = true;
            } else if (i2 != 10) {
                throw new zzaas(a.i("Audio format not supported: ", i2));
            }
            this.zzc = true;
        } else {
            zzdyVar.zzG(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzb(zzdy zzdyVar, long j2) {
        if (this.zze == 2) {
            int zza = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza);
            this.zza.zzs(j2, 1, zza, 0, null);
            return true;
        }
        int zzk = zzdyVar.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzdyVar.zza();
            byte[] bArr = new byte[zza2];
            zzdyVar.zzB(bArr, 0, zza2);
            zzxt zza3 = zzxu.zza(bArr);
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/mp4a-latm");
            zzabVar.zzx(zza3.zzc);
            zzabVar.zzw(zza3.zzb);
            zzabVar.zzT(zza3.zza);
            zzabVar.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzabVar.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze != 10 || zzk == 1) {
            int zza4 = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza4);
            this.zza.zzs(j2, 1, zza4, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
