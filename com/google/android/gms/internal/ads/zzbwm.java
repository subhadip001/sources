package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwm extends zzbwu {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbwm(zzcli zzcliVar, Map map) {
        super(zzcliVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcliVar.zzk();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j2 = this.zzd;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.zze;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbhi(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builder.setTitle(zzd != null ? zzd.getString(R.string.s5) : "Create calendar event");
        builder.setMessage(zzd != null ? zzd.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(zzd != null ? zzd.getString(R.string.s3) : DefaultSettingsSpiCall.HEADER_ACCEPT, new zzbwk(this));
        builder.setNegativeButton(zzd != null ? zzd.getString(R.string.s4) : "Decline", new zzbwl(this));
        builder.create().show();
    }
}
