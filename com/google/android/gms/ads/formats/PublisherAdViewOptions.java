package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    private final zzbz zzb;
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    private final IBinder zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        private ShouldDelayBannerRenderingListener zza;

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zza = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? zzby.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        zzbz zzbzVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzbzVar == null ? null : zzbzVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzbz zza() {
        return this.zzb;
    }

    public final zzbmr zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return zzbmq.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
