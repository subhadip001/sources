package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.arthenica.ffmpegkit.Chapter;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdoj implements View.OnClickListener {
    public String zza;
    public Long zzb;
    public WeakReference zzc;
    private final zzdsd zzd;
    private final Clock zze;
    private zzbmu zzf;
    private zzbol zzg;

    public zzdoj(zzdsd zzdsdVar, Clock clock) {
        this.zzd = zzdsdVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Chapter.KEY_ID, this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final zzbmu zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzc(final zzbmu zzbmuVar) {
        this.zzf = zzbmuVar;
        zzbol zzbolVar = this.zzg;
        if (zzbolVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbolVar);
        }
        zzbol zzbolVar2 = new zzbol() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdoj zzdojVar = zzdoj.this;
                zzbmu zzbmuVar2 = zzbmuVar;
                try {
                    zzdojVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdojVar.zza = (String) map.get(Chapter.KEY_ID);
                String str = (String) map.get("asset_id");
                if (zzbmuVar2 == null) {
                    zzcfi.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbmuVar2.zzf(str);
                } catch (RemoteException e2) {
                    zzcfi.zzl("#007 Could not call remote method.", e2);
                }
            }
        };
        this.zzg = zzbolVar2;
        this.zzd.zzi("/unconfirmedClick", zzbolVar2);
    }
}
