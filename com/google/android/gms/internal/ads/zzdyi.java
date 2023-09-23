package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyi {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdub zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdwp zzl;
    private final zzcfo zzm;
    private final zzdij zzo;
    private final zzfhs zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcga zze = new zzcga();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();

    public zzdyi(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdub zzdubVar, ScheduledExecutorService scheduledExecutorService, zzdwp zzdwpVar, zzcfo zzcfoVar, zzdij zzdijVar, zzfhs zzfhsVar) {
        this.zzh = zzdubVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdwpVar;
        this.zzm = zzcfoVar;
        this.zzo = zzdijVar;
        this.zzp = zzfhsVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdyi zzdyiVar, String str) {
        int i2 = 5;
        final zzfhg zza = zzfhf.zza(zzdyiVar.zzf, 5);
        zza.zzf();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfhg zza2 = zzfhf.zza(zzdyiVar.zzf, i2);
                zza2.zzf();
                zza2.zzc(next);
                final Object obj = new Object();
                final zzcga zzcgaVar = new zzcga();
                zzfvj zzo = zzfva.zzo(zzcgaVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbz)).longValue(), TimeUnit.SECONDS, zzdyiVar.zzk);
                zzdyiVar.zzl.zzc(next);
                zzdyiVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
                zzo.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyi.this.zzq(obj, zzcgaVar, next, elapsedRealtime, zza2);
                    }
                }, zzdyiVar.zzi);
                arrayList.add(zzo);
                final zzdyh zzdyhVar = new zzdyh(zzdyiVar, obj, next, elapsedRealtime, zza2, zzcgaVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        int i3 = 0;
                        while (i3 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            String optString = jSONObject2.optString(MediaInformation.KEY_FORMAT_PROPERTIES, "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqp(optString, bundle));
                            i3++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdyiVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfct zzc = zzdyiVar.zzh.zzc(next, new JSONObject());
                        zzdyiVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdyi.this.zzn(zzc, zzdyhVar, arrayList2, next);
                            }
                        });
                    } catch (zzfcd unused2) {
                        zzdyhVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e2) {
                    zzcfi.zzh("", e2);
                }
                i2 = 5;
            }
            zzfva.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdya
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdyi.this.zzf(zza);
                    return null;
                }
            }, zzdyiVar.zzi);
        } catch (JSONException e3) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e3);
            zzdyiVar.zzo.zza("MalformedJson");
            zzdyiVar.zzl.zza("MalformedJson");
            zzdyiVar.zze.zze(e3);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e3, "AdapterInitializer.updateAdapterStatus");
            zzfhs zzfhsVar = zzdyiVar.zzp;
            zza.zze(false);
            zzfhsVar.zzb(zza.zzj());
        }
    }

    private final synchronized zzfvj zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfva.zzi(zzc);
        }
        final zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdye
            @Override // java.lang.Runnable
            public final void run() {
                zzdyi.this.zzo(zzcgaVar);
            }
        });
        return zzcgaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i2) {
        this.zzn.put(str, new zzbqf(str, z, i2, str2));
    }

    public final /* synthetic */ Object zzf(zzfhg zzfhgVar) {
        this.zze.zzd(Boolean.TRUE);
        zzfhs zzfhsVar = this.zzp;
        zzfhgVar.zze(true);
        zzfhsVar.zzb(zzfhgVar.zzj());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbqf zzbqfVar = (zzbqf) this.zzn.get(str);
            arrayList.add(new zzbqf(str, zzbqfVar.zzb, zzbqfVar.zzc, zzbqfVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    public final /* synthetic */ void zzn(zzfct zzfctVar, zzbqj zzbqjVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfctVar.zzi(context, zzbqjVar, list);
            } catch (RemoteException e2) {
                zzcfi.zzh("", e2);
            }
        } catch (zzfcd unused) {
            zzbqjVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    public final /* synthetic */ void zzo(final zzcga zzcgaVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // java.lang.Runnable
            public final void run() {
                zzcga zzcgaVar2 = zzcgaVar;
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (!TextUtils.isEmpty(zzc)) {
                    zzcgaVar2.zzd(zzc);
                } else {
                    zzcgaVar2.zze(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcga zzcgaVar, String str, long j2, zzfhg zzfhgVar) {
        synchronized (obj) {
            if (!zzcgaVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - j2));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhs zzfhsVar = this.zzp;
                zzfhgVar.zze(false);
                zzfhsVar.zzb(zzfhgVar.zzj());
                zzcgaVar.zzd(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbjt.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzby)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxy
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyi.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfvj zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyb
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyi.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbA)).longValue(), TimeUnit.SECONDS);
                    zzfva.zzr(zzu, new zzdyg(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbqm zzbqmVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyc
            @Override // java.lang.Runnable
            public final void run() {
                zzdyi zzdyiVar = zzdyi.this;
                try {
                    zzbqmVar.zzb(zzdyiVar.zzg());
                } catch (RemoteException e2) {
                    zzcfi.zzh("", e2);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
