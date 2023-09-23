package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdi extends zzaqv implements zzdk {
    public zzdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        Parcel zzbk = zzbk(5, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() {
        zzdn zzdlVar;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdlVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(readStrongBinder);
        }
        zzbk.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdnVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzdnVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        zzbl(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        Parcel zzbk = zzbk(10, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        Parcel zzbk = zzbk(4, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
