package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfbg;
import com.google.android.gms.internal.ads.zzfof;
import com.google.android.gms.internal.ads.zzfpe;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbx {
    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzj = zzj(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgF)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e2) {
                    zzcfi.zzh("Error occurred while putting signals into JSON object.", e2);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e3) {
                e = e3;
                jSONObject = jSONObject2;
                zzcfi.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzj = zzj(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry2.getValue()).get();
            if (view2 != null) {
                int[] zzj2 = zzj(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put(StreamInformation.KEY_WIDTH, com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, view2.getMeasuredWidth()));
                        jSONObject5.put(StreamInformation.KEY_HEIGHT, com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, zzj2[0] - zzj[0]));
                        jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, zzj2[1] - zzj[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put(StreamInformation.KEY_WIDTH, 0);
                            jSONObject2.put(StreamInformation.KEY_HEIGHT, 0);
                            jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, zzj2[0] - zzj[0]));
                            jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, zzj2[1] - zzj[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = entry2;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put(NotificationCompat.MessagingStyle.Message.KEY_TEXT, textView.getText());
                        } else {
                            entry = entry2;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                            zzcfi.zzj("Unable to get asset views information");
                            jSONObject3 = jSONObject;
                            it = it2;
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("can_show_on_lock_screen", zzs.zzl(view));
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("is_keyguard_locked", zzs.zzz(context));
        } catch (JSONException unused) {
            zzcfi.zzj("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    r2 = true;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:45|46|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f A[Catch: JSONException -> 0x0174, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0174, blocks: (B:30:0x013b, B:47:0x0166, B:48:0x016a, B:49:0x016f), top: B:56:0x013b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0175 -> B:55:0x017a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbx.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, zzfbg zzfbgVar) {
        if (zzfbgVar.zzO) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgD)).booleanValue()) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgG)).booleanValue();
            }
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgE);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : zzfpe.zzc(zzfof.zzc(';')).zzd(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean zzi(int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcC)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcD)).booleanValue() || i2 <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject zzk(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StreamInformation.KEY_WIDTH, com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put(StreamInformation.KEY_HEIGHT, com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
