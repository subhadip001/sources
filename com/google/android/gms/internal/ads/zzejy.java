package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejy implements zzeey {
    private final zzefa zza;
    private final zzefg zzb;
    private final zzfge zzc;
    private final zzfvk zzd;

    public zzejy(zzfge zzfgeVar, zzfvk zzfvkVar, zzefa zzefaVar, zzefg zzefgVar) {
        this.zzc = zzfgeVar;
        this.zzd = zzfvkVar;
        this.zzb = zzefgVar;
        this.zza = zzefaVar;
    }

    @VisibleForTesting
    public static final String zze(String str, int i2) {
        return "Error from: " + str + ", code: " + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        final zzefb zzefbVar;
        Iterator it = zzfbgVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefbVar = null;
                break;
            }
            try {
                zzefbVar = this.zza.zza((String) it.next(), zzfbgVar.zzw);
                break;
            } catch (zzfcd unused) {
            }
        }
        if (zzefbVar == null) {
            return zzfva.zzh(new zzeia("Unable to instantiate mediation adapter class."));
        }
        zzcga zzcgaVar = new zzcga();
        zzefbVar.zzc.zza(new zzejx(this, zzefbVar, zzcgaVar));
        if (zzfbgVar.zzN) {
            Bundle bundle = zzfbsVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzejv
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() {
                zzejy.this.zzd(zzfbsVar, zzfbgVar, zzefbVar);
            }
        }, this.zzd, zzffy.ADAPTER_LOAD_AD_SYN, zzfgeVar).zzb(zzffy.ADAPTER_LOAD_AD_ACK).zzd(zzcgaVar).zzb(zzffy.ADAPTER_WRAP_ADAPTER).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzejw
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                return zzejy.this.zzc(zzfbsVar, zzfbgVar, zzefbVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        return !zzfbgVar.zzu.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar, Void r4) {
        return this.zzb.zza(zzfbsVar, zzfbgVar, zzefbVar);
    }

    public final /* synthetic */ void zzd(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        this.zzb.zzb(zzfbsVar, zzfbgVar, zzefbVar);
    }
}
