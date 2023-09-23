package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    public final zzdu zza;

    public BaseAdView(Context context, int i2) {
        super(context);
        this.zza = new zzdu(this, i2);
    }

    public void destroy() {
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isLoading() {
        return this.zza.zzA();
    }

    public void loadAd(final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhy.zzc(getContext());
        if (((Boolean) zzbjm.zze.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzm(adRequest.zza());
                        } catch (IllegalStateException e2) {
                            zzbyx.zza(baseAdView.getContext()).zzd(e2, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i6 = ((i4 - i2) - measuredWidth) / 2;
        int i7 = ((i5 - i3) - measuredHeight) / 2;
        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        AdSize adSize;
        int i4;
        int i5 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i2, i3);
            i5 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                zzcfi.zzh("Unable to retrieve ad size.", e2);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i4 = adSize.getHeightInPixels(context);
                i5 = widthInPixels;
            } else {
                i4 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i5, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i3));
    }

    public void pause() {
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == null) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.zza = new zzdu(this, attributeSet, false, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.zza = new zzdu(this, attributeSet, false, i3);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i2, int i3, boolean z) {
        super(context, attributeSet, i2);
        this.zza = new zzdu(this, attributeSet, z, i3);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzdu(this, attributeSet, z);
    }
}
