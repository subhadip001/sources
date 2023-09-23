package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;
    private final zzble zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzble zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzaw.zza().zzg(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, View view) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar != null) {
            try {
                zzbleVar.zzbw(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call setAssetView on delegate", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzble zzbleVar = this.zzb;
        if (zzbleVar != null) {
            try {
                zzbleVar.zzc();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to destroy native ad view", e2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzble zzbleVar;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcC)).booleanValue() && (zzbleVar = this.zzb) != null) {
            try {
                zzbleVar.zzd(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call handleTouchEvent on delegate", e2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            zzcfi.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        zzble zzbleVar = this.zzb;
        if (zzbleVar != null) {
            try {
                zzbleVar.zze(ObjectWrapper.wrap(view), i2);
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar != null) {
            try {
                zzbleVar.zzbx(ObjectWrapper.wrap(view));
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call setClickConfirmingView on delegate", e2);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar != 0) {
            try {
                zzbleVar.zzbA(nativeAd.zza());
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    public final View zza(String str) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar != null) {
            try {
                IObjectWrapper zzb = zzbleVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call getAssetView on delegate", e2);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzek) {
                zzbleVar.zzby(((zzek) mediaContent).zza());
            } else if (mediaContent == null) {
                zzbleVar.zzby(null);
            } else {
                zzcfi.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("Unable to call setMediaContent on delegate", e2);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzble zzbleVar = this.zzb;
        if (zzbleVar == null || scaleType == null) {
            return;
        }
        try {
            zzbleVar.zzbz(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e2) {
            zzcfi.zzh("Unable to call setMediaViewImageScaleType on delegate", e2);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
