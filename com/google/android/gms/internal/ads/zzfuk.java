package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfuk extends zzfua {
    private List zza;

    public zzfuk(zzfrc zzfrcVar, boolean z) {
        super(zzfrcVar, true, true);
        List zza;
        if (zzfrcVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfrv.zza(zzfrcVar.size());
        }
        for (int i2 = 0; i2 < zzfrcVar.size(); i2++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzg(int i2, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i2, new zzfuj(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zzz(int i2) {
        super.zzz(i2);
        this.zza = null;
    }
}
