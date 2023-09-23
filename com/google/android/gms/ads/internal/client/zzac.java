package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzac extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbtz zzb;

    public zzac(zzau zzauVar, Context context, zzbtz zzbtzVar) {
        this.zza = context;
        this.zzb = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((zzcec) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    return zzceb.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221310000);
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
