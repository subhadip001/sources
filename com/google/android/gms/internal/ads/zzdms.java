package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdms extends zzbkw {
    private final zzdng zza;
    private IObjectWrapper zzb;

    public zzdms(zzdng zzdngVar) {
        this.zza = zzdngVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfi)).booleanValue()) {
            if (this.zza.zzb() != 0.0f) {
                return this.zza.zzb();
            }
            if (this.zza.zzj() != null) {
                try {
                    return this.zza.zzj().zze();
                } catch (RemoteException e2) {
                    zzcfi.zzh("Remote exception getting video controller aspect ratio.", e2);
                    return 0.0f;
                }
            }
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzbla zzm = this.zza.zzm();
            if (zzm == null) {
                return 0.0f;
            }
            float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : zzm.zzd() / zzm.zzc();
            return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final float zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfj)).booleanValue()) {
            return this.zza.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final IObjectWrapper zzi() {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbla zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final boolean zzk() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zzl(zzbmi zzbmiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfj)).booleanValue() && (this.zza.zzj() instanceof zzcme)) {
            ((zzcme) this.zza.zzj()).zzv(zzbmiVar);
        }
    }
}
