package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzas extends zzav {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzau zzd;

    public zzas(zzau zzauVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzauVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzev();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbyz zzbyzVar;
        zzbna zzbnaVar;
        zzbhy.zzc(this.zza.getContext());
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                return zzblj.zze(((zzbln) zzcfm.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzblm.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                this.zzd.zzh = zzbyx.zza(this.zza.getContext());
                zzbyzVar = this.zzd.zzh;
                zzbyzVar.zzd(e2, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzbnaVar = this.zzd.zzg;
        return zzbnaVar.zza(this.zza, this.zzb, this.zzc);
    }
}
