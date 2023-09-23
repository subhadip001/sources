package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmp implements zzmt {
    public static final zzfph zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzmn
        @Override // com.google.android.gms.internal.ads.zzfph
        public final Object zza() {
            return zzmp.zzc();
        }
    };
    private static final Random zzb = new Random();
    private final zzch zzc;
    private final zzcf zzd;
    private final HashMap zze;
    private final zzfph zzf;
    private zzms zzg;
    private zzci zzh;
    private String zzi;

    public zzmp() {
        throw null;
    }

    public static /* synthetic */ String zzc() {
        return zzl();
    }

    private final zzmo zzk(int i2, zzsb zzsbVar) {
        long j2;
        int i3;
        zzsb zzsbVar2;
        zzsb zzsbVar3;
        zzmo zzmoVar = null;
        long j3 = Long.MAX_VALUE;
        for (zzmo zzmoVar2 : this.zze.values()) {
            zzmoVar2.zzg(i2, zzsbVar);
            if (zzmoVar2.zzj(i2, zzsbVar)) {
                j2 = zzmoVar2.zzd;
                if (j2 == -1 || j2 < j3) {
                    zzmoVar = zzmoVar2;
                    j3 = j2;
                } else if (i3 == 0) {
                    int i4 = zzeg.zza;
                    zzsbVar2 = zzmoVar.zze;
                    if (zzsbVar2 != null) {
                        zzsbVar3 = zzmoVar2.zze;
                        if (zzsbVar3 != null) {
                            zzmoVar = zzmoVar2;
                        }
                    }
                }
            }
        }
        if (zzmoVar == null) {
            String zzl = zzl();
            zzmo zzmoVar3 = new zzmo(this, zzl, i2, zzsbVar);
            this.zze.put(zzl, zzmoVar3);
            return zzmoVar3;
        }
        return zzmoVar;
    }

    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzm(zzkj zzkjVar) {
        String str;
        long j2;
        zzsb zzsbVar;
        zzsb zzsbVar2;
        zzsb zzsbVar3;
        String unused;
        String unused2;
        if (zzkjVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmo zzmoVar = (zzmo) this.zze.get(this.zzi);
        zzmo zzk = zzk(zzkjVar.zzc, zzkjVar.zzd);
        str = zzk.zzb;
        this.zzi = str;
        zzh(zzkjVar);
        zzsb zzsbVar4 = zzkjVar.zzd;
        if (zzsbVar4 == null || !zzsbVar4.zzb()) {
            return;
        }
        if (zzmoVar != null) {
            j2 = zzmoVar.zzd;
            if (j2 == zzkjVar.zzd.zzd) {
                zzsbVar = zzmoVar.zze;
                if (zzsbVar != null) {
                    zzsbVar2 = zzmoVar.zze;
                    if (zzsbVar2.zzb == zzkjVar.zzd.zzb) {
                        zzsbVar3 = zzmoVar.zze;
                        if (zzsbVar3.zzc == zzkjVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzsb zzsbVar5 = zzkjVar.zzd;
        unused = zzk(zzkjVar.zzc, new zzsb(zzsbVar5.zza, zzsbVar5.zzd)).zzb;
        unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized String zze(zzci zzciVar, zzsb zzsbVar) {
        String str;
        str = zzk(zzciVar.zzn(zzsbVar.zza, this.zzd).zzd, zzsbVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzf(zzkj zzkjVar) {
        boolean z;
        zzms zzmsVar;
        String str;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            it.remove();
            z = zzmoVar.zzf;
            if (z && (zzmsVar = this.zzg) != null) {
                str = zzmoVar.zzb;
                zzmsVar.zzd(zzkjVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final void zzg(zzms zzmsVar) {
        this.zzg = zzmsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzkj r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzms r0 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzci r0 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmo r0 = (com.google.android.gms.internal.ads.zzmo) r0     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.google.android.gms.internal.ads.zzmo.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L33
            int r0 = com.google.android.gms.internal.ads.zzmo.zza(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.google.android.gms.internal.ads.zzmo.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmo r0 = r9.zzk(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.google.android.gms.internal.ads.zzmo.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.zzi = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.google.android.gms.internal.ads.zzsb r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.zza     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmo r1 = r9.zzk(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.internal.ads.zzmo.zzi(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.google.android.gms.internal.ads.zzmo.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzci r3 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsb r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcf r5 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcf r3 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsb r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.zzh(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmo.zzd(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.google.android.gms.internal.ads.zzmo.zzi(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.google.android.gms.internal.ads.zzmo.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmo.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzmo.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.google.android.gms.internal.ads.zzmo.zzh(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.google.android.gms.internal.ads.zzmo.zze(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzms r1 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzmo.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmp.zzh(com.google.android.gms.internal.ads.zzkj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzi(zzkj zzkjVar, int i2) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            if (zzmoVar.zzk(zzkjVar)) {
                it.remove();
                z = zzmoVar.zzf;
                if (z) {
                    str = zzmoVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z3 = false;
                    if (i2 == 0 && equals) {
                        z2 = zzmoVar.zzg;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    zzms zzmsVar = this.zzg;
                    str2 = zzmoVar.zzb;
                    zzmsVar.zzd(zzkjVar, str2, z3);
                }
            }
        }
        zzm(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final synchronized void zzj(zzkj zzkjVar) {
        boolean z;
        String str;
        String str2;
        Objects.requireNonNull(this.zzg);
        zzci zzciVar = this.zzh;
        this.zzh = zzkjVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmo zzmoVar = (zzmo) it.next();
            if (!zzmoVar.zzl(zzciVar, this.zzh) || zzmoVar.zzk(zzkjVar)) {
                it.remove();
                z = zzmoVar.zzf;
                if (z) {
                    str = zzmoVar.zzb;
                    if (str.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    zzms zzmsVar = this.zzg;
                    str2 = zzmoVar.zzb;
                    zzmsVar.zzd(zzkjVar, str2, false);
                }
            }
        }
        zzm(zzkjVar);
    }

    public zzmp(zzfph zzfphVar) {
        this.zzf = zzfphVar;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}
