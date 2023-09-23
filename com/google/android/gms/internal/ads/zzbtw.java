package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtw extends zzbty {
    private static final zzbvw zza = new zzbvw();

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final zzbuc zzb(String str) {
        zzbuy zzbuyVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbtw.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbuy((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbuy((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcfi.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                zzcfi.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzcfi.zze("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbuyVar = new zzbuy(new AdMobAdapter());
            } else {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbuyVar = new zzbuy(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            return zzbuyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final zzbvs zzc(String str) {
        return new zzbwd((RtbAdapter) Class.forName(str, false, zzbvw.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final boolean zzd(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbtw.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcfi.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final boolean zze(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbtw.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcfi.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
