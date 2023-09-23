package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdoa extends zzblj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpb {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdnb zze;
    private zzban zzf;

    public zzdoa(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzban(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzx(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzv(zzf(), zzl(), zzm(), zzdnb.zzP(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzv(zzf(), zzl(), zzm(), zzdnb.zzP(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzD(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzcfi.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzF((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdnb)) {
            zzcfi.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzL(this);
        }
        zzdnb zzdnbVar2 = (zzdnb) unwrap;
        if (zzdnbVar2.zzM()) {
            this.zze = zzdnbVar2;
            zzdnbVar2.zzK(this);
            this.zze.zzC(zzf());
            return;
        }
        zzcfi.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final synchronized void zzd() {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            zzdnbVar.zzL(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final zzban zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized JSONObject zzp() {
        zzdnb zzdnbVar = this.zze;
        if (zzdnbVar != null) {
            return zzdnbVar.zzg(zzf(), zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    public final synchronized void zzq(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
