package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk
    public static final String TRACKING_SOURCE_DIALOG = "d";
    @KeepForSdk
    public static final String TRACKING_SOURCE_NOTIFICATION = "n";
    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public Intent getErrorResolutionIntent(int i2) {
        return getErrorResolutionIntent(null, i2, null);
    }

    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return getErrorResolutionPendingIntent(context, i2, i3, null);
    }

    @KeepForSdk
    public String getErrorString(int i2) {
        return GooglePlayServicesUtilLight.getErrorString(i2);
    }

    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i2);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i2);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i2) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i2);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(Context context, int i2) {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i2);
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return com.google.android.gms.common.internal.zzt.zzc("com.google.android.gms");
        } else if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            return com.google.android.gms.common.internal.zzt.zza();
        } else {
            StringBuilder A = a.A("gcore_");
            A.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
            A.append("-");
            if (!TextUtils.isEmpty(str)) {
                A.append(str);
            }
            A.append("-");
            if (context != null) {
                A.append(context.getPackageName());
            }
            A.append("-");
            if (context != null) {
                try {
                    A.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return com.google.android.gms.common.internal.zzt.zzb("com.google.android.gms", A.toString());
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i2, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, errorResolutionIntent, com.google.android.gms.internal.common.zzd.zza | 134217728);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context, int i2) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i2);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
