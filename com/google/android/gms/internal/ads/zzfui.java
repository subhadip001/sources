package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfui extends zzfuk {
    public zzfui(zzfrc zzfrcVar, boolean z) {
        super(zzfrcVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfrv.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfuj zzfujVar = (zzfuj) it.next();
            zza.add(zzfujVar != null ? zzfujVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
