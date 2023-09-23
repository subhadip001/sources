package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzdkc {
    private final zzdlf zza;
    private final zzcli zzb;

    public zzdkc(zzdlf zzdlfVar, zzcli zzcliVar) {
        this.zza = zzdlfVar;
        this.zzb = zzcliVar;
    }

    public static final zzdiy zzh(zzfhd zzfhdVar) {
        return new zzdiy(zzfhdVar, zzcfv.zzf);
    }

    public static final zzdiy zzi(zzdlk zzdlkVar) {
        return new zzdiy(zzdlkVar, zzcfv.zzf);
    }

    public final View zza() {
        zzcli zzcliVar = this.zzb;
        if (zzcliVar == null) {
            return null;
        }
        return zzcliVar.zzI();
    }

    public final View zzb() {
        zzcli zzcliVar = this.zzb;
        if (zzcliVar != null) {
            return zzcliVar.zzI();
        }
        return null;
    }

    public final zzcli zzc() {
        return this.zzb;
    }

    public final zzdiy zzd(Executor executor) {
        final zzcli zzcliVar = this.zzb;
        return new zzdiy(new zzdge() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzdge
            public final void zza() {
                zzcli zzcliVar2 = zzcli.this;
                if (zzcliVar2.zzN() != null) {
                    zzcliVar2.zzN().zzb();
                }
            }
        }, executor);
    }

    public final zzdlf zze() {
        return this.zza;
    }

    public Set zzf(zzdas zzdasVar) {
        return Collections.singleton(new zzdiy(zzdasVar, zzcfv.zzf));
    }

    public Set zzg(zzdas zzdasVar) {
        return Collections.singleton(new zzdiy(zzdasVar, zzcfv.zzf));
    }
}
