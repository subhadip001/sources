package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfig {
    private final Context zza;
    private final Executor zzb;
    private final zzcfn zzc;
    private final zzfhs zzd;

    public zzfig(Context context, Executor executor, zzcfn zzcfnVar, zzfhs zzfhsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfnVar;
        this.zzd = zzfhsVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfhq zzfhqVar) {
        zzfhg zza = zzfhf.zza(this.zza, 14);
        zza.zzf();
        zza.zze(this.zzc.zza(str));
        if (zzfhqVar == null) {
            this.zzd.zzb(zza.zzj());
            return;
        }
        zzfhqVar.zza(zza);
        zzfhqVar.zzg();
    }

    public final void zzc(final String str, final zzfhq zzfhqVar) {
        if (zzfhs.zza() && ((Boolean) zzbjh.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfif
                @Override // java.lang.Runnable
                public final void run() {
                    zzfig.this.zzb(str, zzfhqVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfie
                @Override // java.lang.Runnable
                public final void run() {
                    zzfig.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
