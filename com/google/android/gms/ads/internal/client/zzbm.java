package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbra;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbm extends zzaqv implements zzbo {
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() {
        zzbl zzbjVar;
        Parcel zzbk = zzbk(1, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbjVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
        }
        zzbk.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbly zzblyVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmb zzbmbVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbmh zzbmhVar, zzbme zzbmeVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqx.zzg(zza, zzbmhVar);
        zzaqx.zzg(zza, zzbmeVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbra zzbraVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbml zzbmlVar, zzq zzqVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmlVar);
        zzaqx.zze(zza, zzqVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmo zzbmoVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmoVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbfVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel zza = zza();
        zzaqx.zze(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqr zzbqrVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbko zzbkoVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbkoVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) {
        throw null;
    }
}
