package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzbyr zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzbyq zza;

        @KeepForSdk
        public Builder(View view) {
            zzbyq zzbyqVar = new zzbyq();
            this.zza = zzbyqVar;
            zzbyqVar.zzb(view);
        }

        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @KeepForSdk
        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbyr(builder.zza);
    }

    @KeepForSdk
    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
