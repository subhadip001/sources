package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final IBinder zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zza = false;
        private ShouldDelayBannerRenderingListener zzb;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzb = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb != null ? new zzfe(builder.zzb) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzbmr zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbmq.zzc(iBinder);
    }

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }
}
