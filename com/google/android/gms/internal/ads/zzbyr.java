package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbyr {
    private final View zza;
    private final Map zzb;
    private final zzcdz zzc;

    public zzbyr(zzbyq zzbyqVar) {
        View view;
        Map map;
        View view2;
        view = zzbyqVar.zza;
        this.zza = view;
        map = zzbyqVar.zzb;
        this.zzb = map;
        view2 = zzbyqVar.zza;
        zzcdz zza = zzbyl.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzf(new zzbys(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzcfi.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                zzcfi.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbyp(this, list));
                return;
            } catch (RemoteException e2) {
                zzcfi.zzg("RemoteException recording click: ".concat(e2.toString()));
                return;
            }
        }
        zzcfi.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzcdz zzcdzVar = this.zzc;
            if (zzcdzVar != null) {
                try {
                    zzcdzVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbyo(this, list));
                    return;
                } catch (RemoteException e2) {
                    zzcfi.zzg("RemoteException recording impression urls: ".concat(e2.toString()));
                    return;
                }
            }
            zzcfi.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzcfi.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcdz zzcdzVar = this.zzc;
        if (zzcdzVar != null) {
            try {
                zzcdzVar.zzj(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                zzcfi.zzg("Failed to call remote method.");
                return;
            }
        }
        zzcfi.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbyn(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbym(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }
}
