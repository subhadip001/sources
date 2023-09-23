package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdd implements zzdbv {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcev zzc;

    public zzfdd(Context context, zzcev zzcevVar) {
        this.zzb = context;
        this.zzc = zzcevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final synchronized void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzi(this.zza);
        }
    }

    public final Bundle zzb() {
        return this.zzc.zzk(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
