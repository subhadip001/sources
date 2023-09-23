package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxe implements zzaxa {
    private final zzaxa[] zza;
    private final ArrayList zzb;
    private zzawz zzd;
    private zzasd zze;
    private zzaxd zzg;
    private final zzasc zzc = new zzasc();
    private int zzf = -1;

    public zzaxe(zzaxa... zzaxaVarArr) {
        this.zza = zzaxaVarArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxaVarArr));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzaxe zzaxeVar, int i2, zzasd zzasdVar, Object obj) {
        zzaxd zzaxdVar;
        if (zzaxeVar.zzg == null) {
            for (int i3 = 0; i3 <= 0; i3++) {
                zzasdVar.zzg(i3, zzaxeVar.zzc, false);
            }
            int i4 = zzaxeVar.zzf;
            if (i4 == -1) {
                zzaxeVar.zzf = 1;
            } else if (i4 != 1) {
                zzaxdVar = new zzaxd(1);
                zzaxeVar.zzg = zzaxdVar;
            }
            zzaxdVar = null;
            zzaxeVar.zzg = zzaxdVar;
        }
        if (zzaxeVar.zzg != null) {
            return;
        }
        zzaxeVar.zzb.remove(zzaxeVar.zza[i2]);
        if (i2 == 0) {
            zzaxeVar.zze = zzasdVar;
        }
        if (zzaxeVar.zzb.isEmpty()) {
            zzaxeVar.zzd.zzg(zzaxeVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zza() {
        zzaxd zzaxdVar = this.zzg;
        if (zzaxdVar != null) {
            throw zzaxdVar;
        }
        for (zzaxa zzaxaVar : this.zza) {
            zzaxaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzb(zzari zzariVar, boolean z, zzawz zzawzVar) {
        this.zzd = zzawzVar;
        int i2 = 0;
        while (true) {
            zzaxa[] zzaxaVarArr = this.zza;
            if (i2 >= zzaxaVarArr.length) {
                return;
            }
            zzaxaVarArr[i2].zzb(zzariVar, false, new zzaxc(this, i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzc(zzawy zzawyVar) {
        zzaxb zzaxbVar = (zzaxb) zzawyVar;
        int i2 = 0;
        while (true) {
            zzaxa[] zzaxaVarArr = this.zza;
            if (i2 >= zzaxaVarArr.length) {
                return;
            }
            zzaxaVarArr[i2].zzc(zzaxbVar.zza[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzd() {
        for (zzaxa zzaxaVar : this.zza) {
            zzaxaVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final zzawy zze(int i2, zzayl zzaylVar) {
        int length = this.zza.length;
        zzawy[] zzawyVarArr = new zzawy[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzawyVarArr[i3] = this.zza[i3].zze(i2, zzaylVar);
        }
        return new zzaxb(zzawyVarArr);
    }
}
