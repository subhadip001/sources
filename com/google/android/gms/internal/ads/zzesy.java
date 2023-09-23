package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesy implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzesy(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, -1);
            int i3 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i3 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesy.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzeta zzd() {
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfb);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle zzc = zzc(this.zzb, new JSONArray(str));
            return new zzeta() { // from class: com.google.android.gms.internal.ads.zzesx
                @Override // com.google.android.gms.internal.ads.zzeta
                public final void zzf(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", zzc);
                }
            };
        } catch (JSONException e2) {
            zzcfi.zzf("JSON parsing error", e2);
            return null;
        }
    }
}
