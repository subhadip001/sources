package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpg;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzee {
    private static zzee zza;
    private zzcm zzd;
    private InitializationStatus zzi;
    private final Object zzc = new Object();
    private boolean zze = false;
    private boolean zzf = false;
    private OnAdInspectorClosedListener zzg = null;
    private RequestConfiguration zzh = new RequestConfiguration.Builder().build();
    private final ArrayList zzb = new ArrayList();

    private zzee() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializationStatus zzA(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqf zzbqfVar = (zzbqf) it.next();
            hashMap.put(zzbqfVar.zza, new zzbqn(zzbqfVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqfVar.zzd, zzbqfVar.zzc));
        }
        return new zzbqo(hashMap);
    }

    public static zzee zzf() {
        zzee zzeeVar;
        synchronized (zzee.class) {
            if (zza == null) {
                zza = new zzee();
            }
            zzeeVar = zza;
        }
        return zzeeVar;
    }

    private final void zzx(Context context, String str, final OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            zzbts.zza().zzb(context, null);
            this.zzd.zzj();
            this.zzd.zzk(null, ObjectWrapper.wrap(null));
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzeq)).booleanValue() || zzg().endsWith(CrashlyticsReportDataCapture.SIGNAL_DEFAULT)) {
                return;
            }
            zzcfi.zzg("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
            this.zzi = new zzdw(this);
            if (onInitializationCompleteListener != null) {
                zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzdv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzee.this.zzm(onInitializationCompleteListener);
                    }
                });
            }
        } catch (RemoteException e2) {
            zzcfi.zzk("MobileAdsSettingManager initialization failed", e2);
        }
    }

    private final void zzy(Context context) {
        if (this.zzd == null) {
            this.zzd = (zzcm) new zzao(zzaw.zza(), context).zzd(context, false);
        }
    }

    private final void zzz(RequestConfiguration requestConfiguration) {
        try {
            this.zzd.zzs(new zzfa(requestConfiguration));
        } catch (RemoteException e2) {
            zzcfi.zzh("Unable to set request configuration parcel.", e2);
        }
    }

    public final float zza() {
        synchronized (this.zzc) {
            zzcm zzcmVar = this.zzd;
            float f2 = 1.0f;
            if (zzcmVar == null) {
                return 1.0f;
            }
            try {
                f2 = zzcmVar.zze();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to get app volume.", e2);
            }
            return f2;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzh;
    }

    public final InitializationStatus zze() {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                InitializationStatus initializationStatus = this.zzi;
                if (initializationStatus != null) {
                    return initializationStatus;
                }
                return zzA(this.zzd.zzg());
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to get Initialization status.");
                return new zzdw(this);
            }
        }
    }

    @Deprecated
    public final String zzg() {
        String zzc;
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfpg.zzc(this.zzd.zzf());
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to get version string.", e2);
                return "";
            }
        }
        return zzc;
    }

    public final void zzk(Context context) {
        synchronized (this.zzc) {
            zzy(context);
            try {
                this.zzd.zzi();
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzl(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    zzf().zzb.add(onInitializationCompleteListener);
                }
            } else if (this.zzf) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.zze = true;
                if (onInitializationCompleteListener != null) {
                    zzf().zzb.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    try {
                        zzy(context);
                        if (onInitializationCompleteListener != null) {
                            this.zzd.zzr(new zzed(this, null));
                        }
                        this.zzd.zzn(new zzbtw());
                        if (this.zzh.getTagForChildDirectedTreatment() != -1 || this.zzh.getTagForUnderAgeOfConsent() != -1) {
                            zzz(this.zzh);
                        }
                    } catch (RemoteException e2) {
                        zzcfi.zzk("MobileAdsSettingManager initialization failed", e2);
                    }
                    zzbhy.zzc(context);
                    if (((Boolean) zzbjm.zza.zze()).booleanValue()) {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzip)).booleanValue()) {
                            zzcfi.zze("Initializing on bg thread");
                            zzcex.zza.execute(new Runnable(context, null, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                public final /* synthetic */ Context zzb;
                                public final /* synthetic */ OnInitializationCompleteListener zzc;

                                {
                                    this.zzc = onInitializationCompleteListener;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzee.this.zzn(this.zzb, null, this.zzc);
                                }
                            });
                            return;
                        }
                    }
                    if (((Boolean) zzbjm.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzip)).booleanValue()) {
                            zzcex.zzb.execute(new Runnable(context, null, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdy
                                public final /* synthetic */ Context zzb;
                                public final /* synthetic */ OnInitializationCompleteListener zzc;

                                {
                                    this.zzc = onInitializationCompleteListener;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzee.this.zzo(this.zzb, null, this.zzc);
                                }
                            });
                            return;
                        }
                    }
                    zzcfi.zze("Initializing on calling thread");
                    zzx(context, null, onInitializationCompleteListener);
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public final /* synthetic */ void zzm(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzi);
    }

    public final /* synthetic */ void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final /* synthetic */ void zzo(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzc) {
            zzy(context);
            zzf().zzg = onAdInspectorClosedListener;
            try {
                this.zzd.zzl(new zzeb(null));
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzd.zzm(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to open debug menu.", e2);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzc) {
            try {
                this.zzd.zzh(cls.getCanonicalName());
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to register RtbAdapter", e2);
            }
        }
    }

    public final void zzs(WebView webView) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        synchronized (this.zzc) {
            if (webView == null) {
                zzcfi.zzg("The webview to be registered cannot be null.");
                return;
            }
            zzcdz zza2 = zzbyl.zza(webView.getContext());
            if (zza2 == null) {
                zzcfi.zzj("Internal error, query info generator is null.");
                return;
            }
            try {
                zza2.zzi(ObjectWrapper.wrap(webView));
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzd.zzo(z);
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to set app mute state.", e2);
            }
        }
    }

    public final void zzu(float f2) {
        boolean z = true;
        Preconditions.checkArgument(f2 >= 0.0f && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzc) {
            if (this.zzd == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzd.zzp(f2);
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to set app volume.", e2);
            }
        }
    }

    public final void zzv(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzc) {
            RequestConfiguration requestConfiguration2 = this.zzh;
            this.zzh = requestConfiguration;
            if (this.zzd == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzz(requestConfiguration);
            }
        }
    }

    public final boolean zzw() {
        synchronized (this.zzc) {
            zzcm zzcmVar = this.zzd;
            boolean z = false;
            if (zzcmVar == null) {
                return false;
            }
            try {
                z = zzcmVar.zzt();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to get app mute state.", e2);
            }
            return z;
        }
    }
}
