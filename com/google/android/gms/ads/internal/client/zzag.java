package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzag extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbtz zzb;
    public final /* synthetic */ OnH5AdsEventListener zzc;

    public zzag(zzau zzauVar, Context context, zzbtz zzbtzVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbtzVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* synthetic */ Object zza() {
        return new zzbpq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzj(ObjectWrapper.wrap(this.zza), this.zzb, 221310000, new zzbpd(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((zzbpm) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    return zzbpl.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221310000, new zzbpd(this.zzc));
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
