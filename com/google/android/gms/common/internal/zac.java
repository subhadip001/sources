package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import e.f.h;
import e.i.f.d;
import e.i.f.g;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zac {
    private static final h<String, String> zaa = new h<>();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i2) {
        Resources resources = context.getResources();
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String zad(Context context, int i2) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i2 != 1) {
            if (i2 == 2) {
                return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, zaa2);
            } else if (i2 != 3) {
                if (i2 != 5) {
                    if (i2 != 7) {
                        if (i2 != 9) {
                            if (i2 != 20) {
                                switch (i2) {
                                    case 16:
                                        return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                                    case 17:
                                        return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                                    case 18:
                                        return resources.getString(R.string.common_google_play_services_updating_text, zaa2);
                                    default:
                                        return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
                                }
                            }
                            return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                        }
                        return resources.getString(R.string.common_google_play_services_unsupported_text, zaa2);
                    }
                    return zah(context, "common_google_play_services_network_error_text", zaa2);
                }
                return zah(context, "common_google_play_services_invalid_account_text", zaa2);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, zaa2);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, zaa2);
    }

    public static String zae(Context context, int i2) {
        if (i2 != 6 && i2 != 19) {
            return zad(context, i2);
        }
        return zah(context, "common_google_play_services_resolution_required_text", zaa(context));
    }

    public static String zaf(Context context, int i2) {
        String zag;
        if (i2 == 6) {
            zag = zai(context, "common_google_play_services_resolution_required_title");
        } else {
            zag = zag(context, i2);
        }
        return zag == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : zag;
    }

    public static String zag(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zai(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, str2);
    }

    private static String zai(Context context, String str) {
        String str2;
        String str3;
        h<String, String> hVar = zaa;
        synchronized (hVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new d(new g(configuration.getLocales())) : d.a(configuration.locale)).a.get(0);
                if (!locale.equals(zab)) {
                    hVar.clear();
                    zab = locale;
                }
                String orDefault = hVar.getOrDefault(str, null);
                if (orDefault != null) {
                    return orDefault;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    hVar.put(str, string);
                    return string;
                }
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
