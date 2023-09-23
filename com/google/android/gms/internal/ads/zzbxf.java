package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxf implements NativeCustomFormatAd {
    private final zzblu zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomFormatAd.DisplayOpenMeasurement zzd;

    @VisibleForTesting
    public zzbxf(zzblu zzbluVar) {
        Context context;
        this.zza = zzbluVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbluVar.zzg());
        } catch (RemoteException | NullPointerException e2) {
            zzcfi.zzh("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzq(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzcfi.zzh("", e3);
            }
        }
        this.zzb = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzk();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzp()) {
                this.zzd = new zzbwx(this.zza);
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzbla zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzbwy(zzf);
            }
            return null;
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.zza.zzi(str);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        try {
            com.google.android.gms.ads.internal.client.zzdk zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("Exception occurred while getting video controller", e2);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.zza.zzm(str);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzn();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }
}
