package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaww implements zzaxa, zzawz {
    private final Uri zza;
    private final zzayh zzb;
    private final zzatx zzc;
    private final int zzd;
    private final Handler zze;
    private final zzawv zzf;
    private final zzasb zzg = new zzasb();
    private final int zzh;
    private zzawz zzi;
    private zzasd zzj;
    private boolean zzk;

    public zzaww(Uri uri, zzayh zzayhVar, zzatx zzatxVar, int i2, Handler handler, zzawv zzawvVar, String str, int i3) {
        this.zza = uri;
        this.zzb = zzayhVar;
        this.zzc = zzatxVar;
        this.zzd = i2;
        this.zze = handler;
        this.zzf = zzawvVar;
        this.zzh = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzb(zzari zzariVar, boolean z, zzawz zzawzVar) {
        this.zzi = zzawzVar;
        zzaxn zzaxnVar = new zzaxn(-9223372036854775807L, false);
        this.zzj = zzaxnVar;
        zzawzVar.zzg(zzaxnVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzc(zzawy zzawyVar) {
        ((zzawu) zzawyVar).zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzd() {
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final zzawy zze(int i2, zzayl zzaylVar) {
        zzayy.zzc(i2 == 0);
        return new zzawu(this.zza, this.zzb.zza(), this.zzc.zza(), this.zzd, this.zze, this.zzf, this, zzaylVar, null, this.zzh, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzg(zzasd zzasdVar, Object obj) {
        zzasb zzasbVar = this.zzg;
        zzasdVar.zzd(0, zzasbVar, false);
        boolean z = zzasbVar.zzc != -9223372036854775807L;
        if (!this.zzk || z) {
            this.zzj = zzasdVar;
            this.zzk = z;
            this.zzi.zzg(zzasdVar, null);
        }
    }
}
