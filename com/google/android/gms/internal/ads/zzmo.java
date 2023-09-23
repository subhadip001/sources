package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmo {
    public final /* synthetic */ zzmp zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzsb zze;
    private boolean zzf;
    private boolean zzg;

    public zzmo(zzmp zzmpVar, String str, int i2, zzsb zzsbVar) {
        this.zza = zzmpVar;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = zzsbVar == null ? -1L : zzsbVar.zzd;
        if (zzsbVar == null || !zzsbVar.zzb()) {
            return;
        }
        this.zze = zzsbVar;
    }

    public final void zzg(int i2, zzsb zzsbVar) {
        if (this.zzd == -1 && i2 == this.zzc && zzsbVar != null) {
            this.zzd = zzsbVar.zzd;
        }
    }

    public final boolean zzj(int i2, zzsb zzsbVar) {
        if (zzsbVar == null) {
            return i2 == this.zzc;
        }
        zzsb zzsbVar2 = this.zze;
        return zzsbVar2 == null ? !zzsbVar.zzb() && zzsbVar.zzd == this.zzd : zzsbVar.zzd == zzsbVar2.zzd && zzsbVar.zzb == zzsbVar2.zzb && zzsbVar.zzc == zzsbVar2.zzc;
    }

    public final boolean zzk(zzkj zzkjVar) {
        long j2 = this.zzd;
        if (j2 == -1) {
            return false;
        }
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null) {
            return this.zzc != zzkjVar.zzc;
        } else if (zzsbVar.zzd > j2) {
            return true;
        } else {
            if (this.zze == null) {
                return false;
            }
            int zza = zzkjVar.zzb.zza(zzsbVar.zza);
            int zza2 = zzkjVar.zzb.zza(this.zze.zza);
            zzsb zzsbVar2 = zzkjVar.zzd;
            if (zzsbVar2.zzd < this.zze.zzd || zza < zza2) {
                return false;
            }
            if (zza > zza2) {
                return true;
            }
            if (zzsbVar2.zzb()) {
                zzsb zzsbVar3 = zzkjVar.zzd;
                int i2 = zzsbVar3.zzb;
                int i3 = zzsbVar3.zzc;
                zzsb zzsbVar4 = this.zze;
                int i4 = zzsbVar4.zzb;
                return i2 > i4 || (i2 == i4 && i3 > zzsbVar4.zzc);
            }
            int i5 = zzkjVar.zzd.zze;
            return i5 == -1 || i5 > this.zze.zzb;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzci r7, com.google.android.gms.internal.ads.zzci r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzmp r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = com.google.android.gms.internal.ads.zzmp.zzb(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmp r0 = r6.zza
            com.google.android.gms.internal.ads.zzch r0 = com.google.android.gms.internal.ads.zzmp.zzb(r0)
            int r0 = r0.zzo
        L26:
            com.google.android.gms.internal.ads.zzmp r1 = r6.zza
            com.google.android.gms.internal.ads.zzch r1 = com.google.android.gms.internal.ads.zzmp.zzb(r1)
            int r1 = r1.zzp
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzmp r7 = r6.zza
            com.google.android.gms.internal.ads.zzcf r7 = com.google.android.gms.internal.ads.zzmp.zza(r7)
            com.google.android.gms.internal.ads.zzcf r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzsb r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmo.zzl(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzci):boolean");
    }
}
