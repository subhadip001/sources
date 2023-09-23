package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdpe implements zzdno {
    private final zzbuo zza;
    private final zzdck zzb;
    private final zzdbq zzc;
    private final zzdjd zzd;
    private final Context zze;
    private final zzfbg zzf;
    private final zzcfo zzg;
    private final zzfby zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbuk zzl;
    private final zzbul zzm;

    public zzdpe(zzbuk zzbukVar, zzbul zzbulVar, zzbuo zzbuoVar, zzdck zzdckVar, zzdbq zzdbqVar, zzdjd zzdjdVar, Context context, zzfbg zzfbgVar, zzcfo zzcfoVar, zzfby zzfbyVar, byte[] bArr) {
        this.zzl = zzbukVar;
        this.zzm = zzbulVar;
        this.zza = zzbuoVar;
        this.zzb = zzdckVar;
        this.zzc = zzdbqVar;
        this.zzd = zzdjdVar;
        this.zze = context;
        this.zzf = zzfbgVar;
        this.zzg = zzcfoVar;
        this.zzh = zzfbyVar;
    }

    private final void zza(View view) {
        try {
            zzbuo zzbuoVar = this.zza;
            if (zzbuoVar != null && !zzbuoVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbuk zzbukVar = this.zzl;
            if (zzbukVar != null && !zzbukVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbul zzbulVar = this.zzm;
            if (zzbulVar == null || zzbulVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                this.zzd.zzq();
            }
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to call handleClick", e2);
        }
    }

    private static final HashMap zzb(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final boolean zzA(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final JSONObject zzd(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final JSONObject zze(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzi(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzk(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzl(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzn(View view, Map map, Map map2, boolean z) {
        if (!this.zzj) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zza(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzp(View view, Map map, Map map2) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbuo zzbuoVar = this.zza;
                if (zzbuoVar != null && !zzbuoVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbuk zzbukVar = this.zzl;
                if (zzbukVar != null && !zzbukVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbul zzbulVar = this.zzm;
                if (zzbulVar == null || zzbulVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzr(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzs(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzt(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzu() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzv(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzw(zzbmu zzbmuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzal;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbq)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbr)).booleanValue() && next.equals("3010")) {
                                zzbuo zzbuoVar = this.zza;
                                Object obj2 = null;
                                if (zzbuoVar != null) {
                                    try {
                                        zzn = zzbuoVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbuk zzbukVar = this.zzl;
                                    if (zzbukVar != null) {
                                        zzn = zzbukVar.zzk();
                                    } else {
                                        zzbul zzbulVar = this.zzm;
                                        zzn = zzbulVar != null ? zzbulVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzb = zzb(map);
            HashMap zzb2 = zzb(map2);
            zzbuo zzbuoVar2 = this.zza;
            if (zzbuoVar2 != null) {
                zzbuoVar2.zzy(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                return;
            }
            zzbuk zzbukVar2 = this.zzl;
            if (zzbukVar2 != null) {
                zzbukVar2.zzv(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbul zzbulVar2 = this.zzm;
            if (zzbulVar2 != null) {
                zzbulVar2.zzt(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zzy(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbuo zzbuoVar = this.zza;
            if (zzbuoVar != null) {
                zzbuoVar.zzz(wrap);
                return;
            }
            zzbuk zzbukVar = this.zzl;
            if (zzbukVar != null) {
                zzbukVar.zzw(wrap);
                return;
            }
            zzbul zzbulVar = this.zzm;
            if (zzbulVar != null) {
                zzbulVar.zzu(wrap);
            }
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final boolean zzz() {
        return this.zzf.zzM;
    }
}
