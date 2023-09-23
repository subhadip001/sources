package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class zzbko extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbko> CREATOR = new zzbkp();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(id = 3)
    public final int zzc;
    @SafeParcelable.Field(id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(id = 5)
    public final int zze;
    @SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzfg zzf;
    @SafeParcelable.Field(id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(id = 8)
    public final int zzh;

    @SafeParcelable.Constructor
    public zzbko(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzfg zzfgVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i5) {
        this.zza = i2;
        this.zzb = z;
        this.zzc = i3;
        this.zzd = z2;
        this.zze = i4;
        this.zzf = zzfgVar;
        this.zzg = z3;
        this.zzh = i5;
    }

    public static NativeAdOptions zza(zzbko zzbkoVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbkoVar == null) {
            return builder.build();
        }
        int i2 = zzbkoVar.zza;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbkoVar.zzg);
                    builder.setMediaAspectRatio(zzbkoVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbkoVar.zzb);
                builder.setRequestMultipleImages(zzbkoVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfg zzfgVar = zzbkoVar.zzf;
            if (zzfgVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfgVar));
            }
        }
        builder.setAdChoicesPlacement(zzbkoVar.zze);
        builder.setReturnUrlsForImageAssets(zzbkoVar.zzb);
        builder.setRequestMultipleImages(zzbkoVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbko(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfg(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
