package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import e.f.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnb extends zzcxw {
    public static final zzfrh zzc = zzfrh.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbao zzA;
    private final Executor zzd;
    private final zzdng zze;
    private final zzdno zzf;
    private final zzdog zzg;
    private final zzdnl zzh;
    private final zzdnr zzi;
    private final zzgpo zzj;
    private final zzgpo zzk;
    private final zzgpo zzl;
    private final zzgpo zzm;
    private final zzgpo zzn;
    private zzdpb zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzccv zzs;
    private final zzaoc zzt;
    private final zzcfo zzu;
    private final Context zzv;
    private final zzdnd zzw;
    private final zzemf zzx;
    private final Map zzy;
    private final List zzz;

    public zzdnb(zzcxv zzcxvVar, Executor executor, zzdng zzdngVar, zzdno zzdnoVar, zzdog zzdogVar, zzdnl zzdnlVar, zzdnr zzdnrVar, zzgpo zzgpoVar, zzgpo zzgpoVar2, zzgpo zzgpoVar3, zzgpo zzgpoVar4, zzgpo zzgpoVar5, zzccv zzccvVar, zzaoc zzaocVar, zzcfo zzcfoVar, Context context, zzdnd zzdndVar, zzemf zzemfVar, zzbao zzbaoVar) {
        super(zzcxvVar);
        this.zzd = executor;
        this.zze = zzdngVar;
        this.zzf = zzdnoVar;
        this.zzg = zzdogVar;
        this.zzh = zzdnlVar;
        this.zzi = zzdnrVar;
        this.zzj = zzgpoVar;
        this.zzk = zzgpoVar2;
        this.zzl = zzgpoVar3;
        this.zzm = zzgpoVar4;
        this.zzn = zzgpoVar5;
        this.zzs = zzccvVar;
        this.zzt = zzaocVar;
        this.zzu = zzcfoVar;
        this.zzv = context;
        this.zzw = zzdndVar;
        this.zzx = zzemfVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbaoVar;
    }

    public static boolean zzP(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhX)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhY)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzR(Map map) {
        if (map == null) {
            return null;
        }
        zzfrh zzfrhVar = zzc;
        int size = zzfrhVar.size();
        int i2 = 0;
        while (i2 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfrhVar.get(i2));
            i2++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized void zzS(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzp(view, map, map2);
        this.zzq = true;
    }

    /* renamed from: zzT */
    public final synchronized void zzt(zzdpb zzdpbVar) {
        Iterator<String> keys;
        View view;
        zzany zzc2;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdpbVar;
        this.zzg.zze(zzdpbVar);
        this.zzf.zzx(zzdpbVar.zzf(), zzdpbVar.zzm(), zzdpbVar.zzn(), zzdpbVar, zzdpbVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcf)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
            zzc2.zzn(zzdpbVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbw)).booleanValue()) {
            zzfbg zzfbgVar = this.zzb;
            if (zzfbgVar.zzam && (keys = zzfbgVar.zzal.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzban zzbanVar = new zzban(this.zzv, view);
                        this.zzz.add(zzbanVar);
                        zzbanVar.zzc(new zzdna(this, next));
                    }
                }
            }
        }
        if (zzdpbVar.zzi() != null) {
            zzdpbVar.zzi().zzc(this.zzs);
        }
    }

    /* renamed from: zzU */
    public final void zzu(zzdpb zzdpbVar) {
        this.zzf.zzy(zzdpbVar.zzf(), zzdpbVar.zzl());
        if (zzdpbVar.zzh() != null) {
            zzdpbVar.zzh().setClickable(false);
            zzdpbVar.zzh().removeAllViews();
        }
        if (zzdpbVar.zzi() != null) {
            zzdpbVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzh(zzdnb zzdnbVar) {
        try {
            zzdng zzdngVar = zzdnbVar.zze;
            int zzc2 = zzdngVar.zzc();
            if (zzc2 == 1) {
                if (zzdnbVar.zzi.zzb() != null) {
                    zzdnbVar.zzq("Google", true);
                    zzdnbVar.zzi.zzb().zze((zzblr) zzdnbVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                if (zzdnbVar.zzi.zza() != null) {
                    zzdnbVar.zzq("Google", true);
                    zzdnbVar.zzi.zza().zze((zzblp) zzdnbVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                if (zzdnbVar.zzi.zzd(zzdngVar.zzy()) != null) {
                    if (zzdnbVar.zze.zzr() != null) {
                        zzdnbVar.zzq("Google", true);
                    }
                    zzdnbVar.zzi.zzd(zzdnbVar.zze.zzy()).zze((zzblu) zzdnbVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                if (zzdnbVar.zzi.zzf() != null) {
                    zzdnbVar.zzq("Google", true);
                    zzdnbVar.zzi.zzf().zze((zzbmx) zzdnbVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                zzcfi.zzg("Wrong native template id!");
            } else {
                zzdnr zzdnrVar = zzdnbVar.zzi;
                if (zzdnrVar.zzg() != null) {
                    zzdnrVar.zzg().zzg((zzbqu) zzdnbVar.zzm.zzb());
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("RemoteException when notifyAdLoad is called", e2);
        }
    }

    public final synchronized void zzA() {
        zzdpb zzdpbVar = this.zzo;
        if (zzdpbVar == null) {
            zzcfi.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdpbVar instanceof zzdoa;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmx
            @Override // java.lang.Runnable
            public final void run() {
                zzdnb.this.zzs(z);
            }
        });
    }

    public final synchronized void zzB() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzq();
    }

    public final void zzC(View view) {
        zzdng zzdngVar = this.zze;
        IObjectWrapper zzu = zzdngVar.zzu();
        zzcli zzq = zzdngVar.zzq();
        if (!this.zzh.zzd() || zzu == null || zzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(zzu, view);
    }

    public final synchronized void zzD(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzr(view, motionEvent, view2);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzs(bundle);
    }

    public final synchronized void zzF(View view) {
        this.zzf.zzt(view);
    }

    public final synchronized void zzG() {
        this.zzf.zzu();
    }

    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzf.zzv(zzcqVar);
    }

    public final synchronized void zzI(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzx.zza(zzdeVar);
    }

    public final synchronized void zzJ(zzbmu zzbmuVar) {
        this.zzf.zzw(zzbmuVar);
    }

    public final synchronized void zzK(final zzdpb zzdpbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmy
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnb.this.zzt(zzdpbVar);
                }
            });
        } else {
            zzt(zzdpbVar);
        }
    }

    public final synchronized void zzL(final zzdpb zzdpbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmu
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnb.this.zzu(zzdpbVar);
                }
            });
        } else {
            zzu(zzdpbVar);
        }
    }

    public final boolean zzM() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzN() {
        return this.zzf.zzz();
    }

    public final boolean zzO() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzQ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzA = this.zzf.zzA(bundle);
        this.zzq = zzA;
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzV() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // java.lang.Runnable
            public final void run() {
                zzdnb.this.zzr();
            }
        });
        super.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzW() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // java.lang.Runnable
            public final void run() {
                zzdnb.zzh(zzdnb.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdno zzdnoVar = this.zzf;
            zzdnoVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmw
                @Override // java.lang.Runnable
                public final void run() {
                    zzdno.this.zzo();
                }
            });
        }
        super.zzW();
    }

    public final zzdnd zza() {
        return this.zzw;
    }

    public final String zzd() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzf(View view, Map map, Map map2) {
        return this.zzf.zzd(view, map, map2);
    }

    public final synchronized JSONObject zzg(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2);
    }

    public final void zzi(View view) {
        IObjectWrapper zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(zzu);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zzb(view, zzfir.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void zzk() {
        this.zzf.zzg();
    }

    public final void zzq(String str, boolean z) {
        String str2;
        zzbxp zzbxpVar;
        zzbxq zzbxqVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdng zzdngVar = this.zze;
        zzcli zzq = zzdngVar.zzq();
        zzcli zzr = zzdngVar.zzr();
        if (zzq == null && zzr == null) {
            zzcfi.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = zzq != null;
        boolean z4 = zzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzee)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i2 = zzb - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    zzcfi.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                } else if (zzq == null) {
                    zzcfi.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z2 = true;
                    z4 = false;
                }
            } else if (zzr == null) {
                zzcfi.zzj("Omid media type was video but there was no video webview.");
                return;
            } else {
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzq = zzr;
        }
        String str3 = str2;
        zzq.zzI();
        if (!com.google.android.gms.ads.internal.zzt.zzh().zze(this.zzv)) {
            zzcfi.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcfo zzcfoVar = this.zzu;
        String str4 = zzcfoVar.zzb + "." + zzcfoVar.zzc;
        if (z4) {
            zzbxpVar = zzbxp.VIDEO;
            zzbxqVar = zzbxq.DEFINED_BY_JAVASCRIPT;
        } else {
            zzbxpVar = zzbxp.NATIVE_DISPLAY;
            if (this.zze.zzc() == 3) {
                zzbxqVar = zzbxq.UNSPECIFIED;
            } else {
                zzbxqVar = zzbxq.ONE_PIXEL;
            }
        }
        IObjectWrapper zzb2 = com.google.android.gms.ads.internal.zzt.zzh().zzb(str4, zzq.zzI(), "", "javascript", str3, str, zzbxqVar, zzbxpVar, this.zzb.zzan);
        if (zzb2 == null) {
            zzcfi.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zze.zzaa(zzb2);
        zzq.zzar(zzb2);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzc(zzb2, zzr.zzH());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzh().zzd(zzb2);
            zzq.zzd("onSdkLoaded", new a());
        }
    }

    public final /* synthetic */ void zzr() {
        this.zzf.zzh();
        this.zze.zzG();
    }

    public final /* synthetic */ void zzs(boolean z) {
        this.zzf.zzn(this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z);
    }

    public final synchronized void zzv(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbw)).booleanValue() && this.zzb.zzam) {
            for (String str : this.zzy.keySet()) {
                if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcU)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && zzP(view2)) {
                        zzS(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzR = zzR(map);
        if (zzR == null) {
            zzS(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcV)).booleanValue()) {
            if (zzP(zzR)) {
                zzS(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcW)).booleanValue()) {
            Rect rect = new Rect();
            if (zzR.getGlobalVisibleRect(rect, null) && zzR.getHeight() == rect.height() && zzR.getWidth() == rect.width()) {
                zzS(view, map, map2);
                return;
            }
            return;
        }
        zzS(view, map, map2);
    }

    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.zzf.zzi(zzcuVar);
    }

    public final synchronized void zzx(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzj(view, view2, map, map2, z);
        if (this.zzr) {
            zzdng zzdngVar = this.zze;
            if (zzdngVar.zzr() != null) {
                zzdngVar.zzr().zzd("onSdkAdUserInteractionClick", new a());
            }
        }
    }

    public final synchronized void zzy(String str) {
        this.zzf.zzk(str);
    }

    public final synchronized void zzz(Bundle bundle) {
        this.zzf.zzl(bundle);
    }
}
