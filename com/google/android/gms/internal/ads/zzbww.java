package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbww extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbww(zzbks zzbksVar) {
        try {
            this.zzb = zzbksVar.zzg();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbksVar.zzh()) {
                zzbla zzg = obj instanceof IBinder ? zzbkz.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbwy(zzg));
                }
            }
        } catch (RemoteException e3) {
            zzcfi.zzh("", e3);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
