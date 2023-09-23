package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfro extends zzfpk {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ zzfot zzb;

    public zzfro(Iterator it, zzfot zzfotVar) {
        this.zza = it;
        this.zzb = zzfotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
