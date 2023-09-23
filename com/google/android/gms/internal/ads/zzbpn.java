package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbpn {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbpj zzc;

    public zzbpn(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbhy.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhO)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhQ)).intValue()) {
                zzcfi.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzaw.zza().zzk(this.zza, new zzbtw(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhO)).booleanValue()) {
            zzd();
            zzbpj zzbpjVar = this.zzc;
            if (zzbpjVar != null) {
                try {
                    zzbpjVar.zze();
                } catch (RemoteException e2) {
                    zzcfi.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (zzc(str)) {
            zzd();
            zzbpj zzbpjVar = this.zzc;
            if (zzbpjVar != null) {
                try {
                    zzbpjVar.zzf(str);
                    return true;
                } catch (RemoteException e2) {
                    zzcfi.zzl("#007 Could not call remote method.", e2);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
