package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.f.h;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdng {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzbks zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzeg zzg;
    private Bundle zzh;
    private zzcli zzi;
    private zzcli zzj;
    private zzcli zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbla zzq;
    private zzbla zzr;
    private String zzs;
    private float zzv;
    private String zzw;
    private final h zzt = new h();
    private final h zzu = new h();
    private List zzf = Collections.emptyList();

    public static zzdng zzab(zzbuk zzbukVar) {
        try {
            zzdnf zzaf = zzaf(zzbukVar.zzg(), null);
            zzbks zzh = zzbukVar.zzh();
            String zzo = zzbukVar.zzo();
            List zzr = zzbukVar.zzr();
            String zzm = zzbukVar.zzm();
            Bundle zzf = zzbukVar.zzf();
            String zzn = zzbukVar.zzn();
            IObjectWrapper zzl = zzbukVar.zzl();
            String zzq = zzbukVar.zzq();
            String zzp = zzbukVar.zzp();
            double zze = zzbukVar.zze();
            zzbla zzi = zzbukVar.zzi();
            zzdng zzdngVar = new zzdng();
            zzdngVar.zza = 2;
            zzdngVar.zzb = zzaf;
            zzdngVar.zzc = zzh;
            zzdngVar.zzd = (View) zzah(zzbukVar.zzj());
            zzdngVar.zzU("headline", zzo);
            zzdngVar.zze = zzr;
            zzdngVar.zzU("body", zzm);
            zzdngVar.zzh = zzf;
            zzdngVar.zzU("call_to_action", zzn);
            zzdngVar.zzm = (View) zzah(zzbukVar.zzk());
            zzdngVar.zzo = zzl;
            zzdngVar.zzU("store", zzq);
            zzdngVar.zzU(FirebaseAnalytics.Param.PRICE, zzp);
            zzdngVar.zzp = zze;
            zzdngVar.zzq = zzi;
            return zzdngVar;
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    public static zzdng zzac(zzbul zzbulVar) {
        try {
            zzdnf zzaf = zzaf(zzbulVar.zzf(), null);
            zzbks zzg = zzbulVar.zzg();
            String zzo = zzbulVar.zzo();
            List zzp = zzbulVar.zzp();
            String zzm = zzbulVar.zzm();
            Bundle zze = zzbulVar.zze();
            String zzn = zzbulVar.zzn();
            IObjectWrapper zzk = zzbulVar.zzk();
            String zzl = zzbulVar.zzl();
            zzbla zzh = zzbulVar.zzh();
            zzdng zzdngVar = new zzdng();
            zzdngVar.zza = 1;
            zzdngVar.zzb = zzaf;
            zzdngVar.zzc = zzg;
            zzdngVar.zzd = (View) zzah(zzbulVar.zzi());
            zzdngVar.zzU("headline", zzo);
            zzdngVar.zze = zzp;
            zzdngVar.zzU("body", zzm);
            zzdngVar.zzh = zze;
            zzdngVar.zzU("call_to_action", zzn);
            zzdngVar.zzm = (View) zzah(zzbulVar.zzj());
            zzdngVar.zzo = zzk;
            zzdngVar.zzU("advertiser", zzl);
            zzdngVar.zzr = zzh;
            return zzdngVar;
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    public static zzdng zzad(zzbuk zzbukVar) {
        try {
            return zzag(zzaf(zzbukVar.zzg(), null), zzbukVar.zzh(), (View) zzah(zzbukVar.zzj()), zzbukVar.zzo(), zzbukVar.zzr(), zzbukVar.zzm(), zzbukVar.zzf(), zzbukVar.zzn(), (View) zzah(zzbukVar.zzk()), zzbukVar.zzl(), zzbukVar.zzq(), zzbukVar.zzp(), zzbukVar.zze(), zzbukVar.zzi(), null, 0.0f);
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzdng zzae(zzbul zzbulVar) {
        try {
            return zzag(zzaf(zzbulVar.zzf(), null), zzbulVar.zzg(), (View) zzah(zzbulVar.zzi()), zzbulVar.zzo(), zzbulVar.zzp(), zzbulVar.zzm(), zzbulVar.zze(), zzbulVar.zzn(), (View) zzah(zzbulVar.zzj()), zzbulVar.zzk(), null, null, -1.0d, zzbulVar.zzh(), zzbulVar.zzl(), 0.0f);
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static zzdnf zzaf(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbuo zzbuoVar) {
        if (zzdkVar == null) {
            return null;
        }
        return new zzdnf(zzdkVar, zzbuoVar);
    }

    private static zzdng zzag(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbks zzbksVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzbla zzblaVar, String str6, float f2) {
        zzdng zzdngVar = new zzdng();
        zzdngVar.zza = 6;
        zzdngVar.zzb = zzdkVar;
        zzdngVar.zzc = zzbksVar;
        zzdngVar.zzd = view;
        zzdngVar.zzU("headline", str);
        zzdngVar.zze = list;
        zzdngVar.zzU("body", str2);
        zzdngVar.zzh = bundle;
        zzdngVar.zzU("call_to_action", str3);
        zzdngVar.zzm = view2;
        zzdngVar.zzo = iObjectWrapper;
        zzdngVar.zzU("store", str4);
        zzdngVar.zzU(FirebaseAnalytics.Param.PRICE, str5);
        zzdngVar.zzp = d2;
        zzdngVar.zzq = zzblaVar;
        zzdngVar.zzU("advertiser", str6);
        zzdngVar.zzP(f2);
        return zzdngVar;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdng zzs(zzbuo zzbuoVar) {
        try {
            return zzag(zzaf(zzbuoVar.zzj(), zzbuoVar), zzbuoVar.zzk(), (View) zzah(zzbuoVar.zzm()), zzbuoVar.zzs(), zzbuoVar.zzv(), zzbuoVar.zzq(), zzbuoVar.zzi(), zzbuoVar.zzr(), (View) zzah(zzbuoVar.zzn()), zzbuoVar.zzo(), zzbuoVar.zzu(), zzbuoVar.zzt(), zzbuoVar.zze(), zzbuoVar.zzl(), zzbuoVar.zzp(), zzbuoVar.zzf());
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.getOrDefault(str, null);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcli zzcliVar = this.zzi;
        if (zzcliVar != null) {
            zzcliVar.destroy();
            this.zzi = null;
        }
        zzcli zzcliVar2 = this.zzj;
        if (zzcliVar2 != null) {
            zzcliVar2.destroy();
            this.zzj = null;
        }
        zzcli zzcliVar3 = this.zzk;
        if (zzcliVar3 != null) {
            zzcliVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzbks zzbksVar) {
        this.zzc = zzbksVar;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        this.zzg = zzegVar;
    }

    public final synchronized void zzK(zzbla zzblaVar) {
        this.zzq = zzblaVar;
    }

    public final synchronized void zzL(String str, zzbkm zzbkmVar) {
        if (zzbkmVar == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzbkmVar);
        }
    }

    public final synchronized void zzM(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzbla zzblaVar) {
        this.zzr = zzblaVar;
    }

    public final synchronized void zzP(float f2) {
        this.zzv = f2;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcli zzcliVar) {
        this.zzk = zzcliVar;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d2) {
        this.zzp = d2;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i2) {
        this.zza = i2;
    }

    public final synchronized void zzW(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.zzb = zzdkVar;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcli zzcliVar) {
        this.zzi = zzcliVar;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized h zzh() {
        return this.zzt;
    }

    public final synchronized h zzi() {
        return this.zzu;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeg zzk() {
        return this.zzg;
    }

    public final synchronized zzbks zzl() {
        return this.zzc;
    }

    public final zzbla zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbkz.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbla zzn() {
        return this.zzq;
    }

    public final synchronized zzbla zzo() {
        return this.zzr;
    }

    public final synchronized zzcli zzp() {
        return this.zzj;
    }

    public final synchronized zzcli zzq() {
        return this.zzk;
    }

    public final synchronized zzcli zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD("advertiser");
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
