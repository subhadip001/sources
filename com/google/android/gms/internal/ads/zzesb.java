package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesb implements zzetb {
    public final String zza;
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final zzekz zzd;
    private final Context zze;
    private final zzfby zzf;
    private final zzekv zzg;
    private final zzdub zzh;

    public zzesb(zzfvk zzfvkVar, ScheduledExecutorService scheduledExecutorService, String str, zzekz zzekzVar, Context context, zzfby zzfbyVar, zzekv zzekvVar, zzdub zzdubVar) {
        this.zzb = zzfvkVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzekzVar;
        this.zze = context;
        this.zzf = zzfbyVar;
        this.zzg = zzekvVar;
        this.zzh = zzdubVar;
    }

    public static /* synthetic */ zzfvj zzc(zzesb zzesbVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzii)).booleanValue()) {
            str = zzesbVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesbVar.zzf.zzf;
        }
        Map zza = zzesbVar.zzd.zza(zzesbVar.zza, str);
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfrk) zza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzesbVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(zzesbVar.zze(str2, list, bundle, true, true));
        }
        for (Map.Entry entry2 : ((zzfrk) zzesbVar.zzd.zzb()).entrySet()) {
            zzeld zzeldVar = (zzeld) entry2.getValue();
            String str3 = zzeldVar.zza;
            Bundle bundle3 = zzesbVar.zzf.zzd.zzm;
            arrayList.add(zzesbVar.zze(str3, Collections.singletonList(zzeldVar.zzd), bundle3 != null ? bundle3.getBundle(str3) : null, zzeldVar.zzb, zzeldVar.zzc));
        }
        return zzfva.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfvj> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (zzfvj zzfvjVar : list2) {
                    if (((JSONObject) zzfvjVar.get()) != null) {
                        jSONArray.put(zzfvjVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzesc(jSONArray.toString());
            }
        }, zzesbVar.zzb);
    }

    private final zzfur zze(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfur zzv = zzfur.zzv(zzfva.zzl(new zzfug() { // from class: com.google.android.gms.internal.ads.zzerz
            @Override // com.google.android.gms.internal.ads.zzfug
            public final zzfvj zza() {
                return zzesb.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
            zzv = (zzfur) zzfva.zzo(zzv, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfur) zzfva.zzf(zzv, Throwable.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzesa
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzcfi.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzl(new zzfug() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // com.google.android.gms.internal.ads.zzfug
            public final zzfvj zza() {
                return zzesb.zzc(zzesb.this);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfvj zzd(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzbvs zzbvsVar;
        zzbvs zzb;
        zzcga zzcgaVar = new zzcga();
        if (z2) {
            this.zzg.zzb(str);
            zzb = this.zzg.zza(str);
        } else {
            try {
                zzb = this.zzh.zzb(str);
            } catch (RemoteException e2) {
                zzcfi.zzh("Couldn't create RTB adapter : ", e2);
                zzbvsVar = null;
            }
        }
        zzbvsVar = zzb;
        if (zzbvsVar == null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbn)).booleanValue()) {
                zzelc.zzb(str, zzcgaVar);
            } else {
                throw null;
            }
        } else {
            final zzelc zzelcVar = new zzelc(str, zzbvsVar, zzcgaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbs)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzerx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzelc.this.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbvsVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelcVar);
            } else {
                zzelcVar.zzd();
            }
        }
        return zzcgaVar;
    }
}
