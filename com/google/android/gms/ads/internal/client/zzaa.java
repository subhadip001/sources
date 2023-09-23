package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzav {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzau zzb;

    public zzaa(zzau zzauVar, Activity activity) {
        this.zzb = zzauVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzl(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbyz zzbyzVar;
        zzbxr zzbxrVar;
        zzbhy.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                return zzbxt.zzF(((zzbxx) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzbxw.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                this.zzb.zzh = zzbyx.zza(this.zza.getApplicationContext());
                zzbyzVar = this.zzb.zzh;
                zzbyzVar.zzd(e2, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzbxrVar = this.zzb.zzf;
        return zzbxrVar.zza(this.zza);
    }
}
