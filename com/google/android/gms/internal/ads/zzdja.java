package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdja extends zzdhb implements zzbam {
    private final Map zzb;
    private final Context zzc;
    private final zzfbg zzd;

    public zzdja(Context context, Set set, zzfbg zzfbgVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfbgVar;
    }

    public final synchronized void zza(View view) {
        zzban zzbanVar = (zzban) this.zzb.get(view);
        if (zzbanVar == null) {
            zzbanVar = new zzban(this.zzc, view);
            zzbanVar.zzc(this);
            this.zzb.put(view, zzbanVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbh)).booleanValue()) {
                zzbanVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbg)).longValue());
                return;
            }
        }
        zzbanVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzban) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final synchronized void zzc(final zzbal zzbalVar) {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzbam) obj).zzc(zzbal.this);
            }
        });
    }
}
