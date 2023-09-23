package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.logging.type.LogSeverity;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(LogSeverity.NOTICE_VALUE, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, LogSeverity.CRITICAL_VALUE, "160x600_as");
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i2, int i3) {
        this(i2, i3, a.r(i2 == -1 ? "FULL" : String.valueOf(i2), "x", i3 == -2 ? "AUTO" : String.valueOf(i3), "_as"));
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i2) {
        AdSize zzc = zzcfb.zzc(context, i2, 50, 0);
        zzc.zze = true;
        return zzc;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i2) {
        int zza2 = zzcfb.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i2) {
        return zzj(i2, zzcfb.zza(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i2, int i3) {
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = i3;
        adSize.zzf = true;
        if (i3 < 32) {
            zzcfi.zzj("The maximum height set for the inline adaptive ad size was " + i3 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i2) {
        AdSize zzc = zzcfb.zzc(context, i2, 50, 2);
        zzc.zze = true;
        return zzc;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i2) {
        int zza2 = zzcfb.zza(context, 2);
        AdSize adSize = new AdSize(i2, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i2) {
        return zzj(i2, zzcfb.zza(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i2) {
        AdSize zzc = zzcfb.zzc(context, i2, 50, 1);
        zzc.zze = true;
        return zzc;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i2) {
        int zza2 = zzcfb.zza(context, 1);
        AdSize adSize = new AdSize(i2, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i2) {
        return zzj(i2, zzcfb.zza(context, 1));
    }

    private static AdSize zzj(int i2, int i3) {
        if (i3 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzi = i3;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i2 = this.zzc;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 != -2) {
            zzaw.zzb();
            return zzcfb.zzv(context, this.zzc);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i2 = this.zzb;
        if (i2 != -3) {
            if (i2 != -1) {
                zzaw.zzb();
                return zzcfb.zzv(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i2) {
        this.zzg = i2;
    }

    public final void zzd(int i2) {
        this.zzi = i2;
    }

    public final void zze(boolean z) {
        this.zzf = true;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(a.i("Invalid width for AdSize: ", i2));
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException(a.i("Invalid height for AdSize: ", i3));
        }
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str;
    }
}
