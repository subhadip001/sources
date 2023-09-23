package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaq extends zzav {
    public final /* synthetic */ FrameLayout zza;
    public final /* synthetic */ FrameLayout zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ zzau zzd;

    public zzaq(zzau zzauVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzauVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzh(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbyz zzbyzVar;
        zzbmz zzbmzVar;
        zzbhy.zzc(this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                return zzbld.zzbB(((zzblh) zzcfm.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzblg.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 221310000));
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                this.zzd.zzh = zzbyx.zza(this.zzc);
                zzbyzVar = this.zzd.zzh;
                zzbyzVar.zzd(e2, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzbmzVar = this.zzd.zzd;
        return zzbmzVar.zza(this.zzc, this.zza, this.zzb);
    }
}
