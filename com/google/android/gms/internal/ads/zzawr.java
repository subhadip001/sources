package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawr implements zzayu {
    public final /* synthetic */ zzawu zza;
    private final Uri zzb;
    private final zzayi zzc;
    private final zzaws zzd;
    private final zzaza zze;
    private final zzaua zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzawr(zzawu zzawuVar, Uri uri, zzayi zzayiVar, zzaws zzawsVar, zzaza zzazaVar) {
        this.zza = zzawuVar;
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzayiVar);
        this.zzc = zzayiVar;
        Objects.requireNonNull(zzawsVar);
        this.zzd = zzawsVar;
        this.zze = zzazaVar;
        this.zzf = new zzaua();
        this.zzh = true;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzb() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void zzc() {
        zzatu zzatuVar;
        long j2;
        while (!this.zzg) {
            int i2 = 0;
            try {
                long j3 = this.zzf.zza;
                long zzb = this.zzc.zzb(new zzayk(this.zzb, null, j3, j3, -1L, null, 0));
                this.zzj = zzb;
                if (zzb != -1) {
                    j2 = j3;
                    zzb += j2;
                    this.zzj = zzb;
                } else {
                    j2 = j3;
                }
                zzatuVar = new zzatu(this.zzc, j2, zzb);
                try {
                    zzatv zzb2 = this.zzd.zzb(zzatuVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb2.zze(j2, this.zzi);
                        this.zzh = false;
                    }
                    long j4 = j2;
                    int i3 = 0;
                    while (true) {
                        if (i3 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i3 = 0;
                                break;
                            }
                            this.zze.zza();
                            i3 = zzb2.zzf(zzatuVar, this.zzf);
                            if (zzatuVar.zzd() > zzawu.zzf(this.zza) + j4) {
                                j4 = zzatuVar.zzd();
                                this.zze.zzb();
                                zzawu zzawuVar = this.zza;
                                zzawu.zzj(zzawuVar).post(zzawu.zzo(zzawuVar));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i3;
                            if (i2 != 1 && zzatuVar != null) {
                                this.zzf.zza = zzatuVar.zzd();
                            }
                            zzazn.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i3 != 1) {
                        this.zzf.zza = zzatuVar.zzd();
                        i2 = i3;
                    }
                    zzazn.zzm(this.zzc);
                    if (i2 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatuVar = null;
            }
        }
    }

    public final void zzd(long j2, long j3) {
        this.zzf.zza = j2;
        this.zzi = j3;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final boolean zze() {
        return this.zzg;
    }
}
