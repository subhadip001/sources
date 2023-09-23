package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdxv implements zzdxf {
    private final long zza;
    private final String zzb;
    private final zzdxk zzc;
    private final zzfax zzd;

    public zzdxv(long j2, Context context, zzdxk zzdxkVar, zzcnf zzcnfVar, String str) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = zzdxkVar;
        zzfaz zzu = zzcnfVar.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzd = zzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzd.zzf(zzlVar, new zzdxt(this));
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzc() {
        try {
            this.zzd.zzk(new zzdxu(this));
            this.zzd.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }
}
