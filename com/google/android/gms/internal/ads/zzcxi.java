package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcxi extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxi(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxi zza(Context context, View view, zzfbg zzfbgVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxi zzcxiVar = new zzcxi(context);
        if (!zzfbgVar.zzv.isEmpty() && (resources = zzcxiVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbh zzfbhVar = (zzfbh) zzfbgVar.zzv.get(0);
            float f2 = displayMetrics.density;
            zzcxiVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfbhVar.zza * f2), (int) (zzfbhVar.zzb * f2)));
        }
        zzcxiVar.zzb = view;
        zzcxiVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zzb(zzcxiVar, zzcxiVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zza(zzcxiVar, zzcxiVar);
        JSONObject jSONObject = zzfbgVar.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxiVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxiVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxiVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcxiVar.addView(relativeLayout);
        return zzcxiVar;
    }

    private final int zzb(double d2) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzv(this.zza, (int) d2);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(StreamInformation.KEY_HEIGHT, 15.0d)));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
