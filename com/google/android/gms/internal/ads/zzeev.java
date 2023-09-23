package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeev extends zzbxj {
    private final Context zza;
    private final zzdwg zzb;
    private final zzcfn zzc;
    private final zzeen zzd;
    private final zzfgo zze;

    public zzeev(Context context, zzeen zzeenVar, zzcfn zzcfnVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zza = context;
        this.zzb = zzdwgVar;
        this.zzc = zzcfnVar;
        this.zzd = zzeenVar;
        this.zze = zzfgoVar;
    }

    public static void zzc(Context context, zzdwg zzdwgVar, zzfgo zzfgoVar, zzeen zzeenVar, String str, String str2) {
        zzd(context, zzdwgVar, zzfgoVar, zzeenVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdwg zzdwgVar, zzfgo zzfgoVar, zzeen zzeenVar, String str, String str2, Map map) {
        String zzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgn zzb = zzfgn.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? "online" : "offline");
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zzf = zzfgoVar.zza(zzb);
        } else {
            zzdwf zza = zzdwgVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? "online" : "offline");
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zzf = zza.zzf();
        }
        zzeenVar.zzd(new zzeep(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), str, zzf, 2));
    }

    public static void zzh(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final zzeen zzeenVar, final zzdwg zzdwgVar, final zzfgo zzfgoVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, com.google.android.gms.ads.internal.zzt.zzq().zza());
        final Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builder.setTitle(zzd == null ? "Open ad when you're back online." : zzd.getString(R.string.offline_opt_in_title)).setMessage(zzd == null ? "We'll send you a notification with a link to the advertiser site." : zzd.getString(R.string.offline_opt_in_message)).setPositiveButton(zzd == null ? "OK" : zzd.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeer
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
                if (r0.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.content.DialogInterface r19, int r20) {
                /*
                    r18 = this;
                    r1 = r18
                    com.google.android.gms.internal.ads.zzdwg r9 = com.google.android.gms.internal.ads.zzdwg.this
                    android.app.Activity r10 = r2
                    com.google.android.gms.internal.ads.zzfgo r11 = r3
                    com.google.android.gms.internal.ads.zzeen r12 = r4
                    java.lang.String r13 = r5
                    com.google.android.gms.ads.internal.util.zzbr r0 = r6
                    java.lang.String r14 = r7
                    android.content.res.Resources r15 = r8
                    com.google.android.gms.ads.internal.overlay.zzl r8 = r9
                    if (r9 == 0) goto L34
                    java.util.HashMap r7 = new java.util.HashMap
                    r7.<init>()
                    java.lang.String r2 = "dialog_action"
                    java.lang.String r3 = "confirm"
                    r7.put(r2, r3)
                    java.lang.String r16 = "dialog_click"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r17 = r7
                    r7 = r16
                    r1 = r8
                    r8 = r17
                    com.google.android.gms.internal.ads.zzeev.zzd(r2, r3, r4, r5, r6, r7, r8)
                    goto L35
                L34:
                    r1 = r8
                L35:
                    com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L40
                    boolean r0 = r0.zzf(r2, r14, r13)     // Catch: android.os.RemoteException -> L40
                    if (r0 != 0) goto L55
                    goto L46
                L40:
                    r0 = move-exception
                    java.lang.String r2 = "Failed to schedule offline notification poster."
                    com.google.android.gms.internal.ads.zzcfi.zzh(r2, r0)
                L46:
                    r12.zzc(r13)
                    if (r9 == 0) goto L55
                    java.lang.String r7 = "offline_notification_worker_not_scheduled"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    com.google.android.gms.internal.ads.zzeev.zzc(r2, r3, r4, r5, r6, r7)
                L55:
                    com.google.android.gms.ads.internal.zzt.zzp()
                    com.google.android.gms.ads.internal.util.zzaa r0 = com.google.android.gms.ads.internal.zzt.zzq()
                    android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
                    int r0 = r0.zza()
                    r2.<init>(r10, r0)
                    if (r15 != 0) goto L6a
                    java.lang.String r0 = "You'll get a notification with the link when you're back online"
                    goto L70
                L6a:
                    int r0 = com.google.android.gms.ads.impl.R.string.offline_opt_in_confirmation
                    java.lang.String r0 = r15.getString(r0)
                L70:
                    android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
                    com.google.android.gms.internal.ads.zzeeq r3 = new com.google.android.gms.internal.ads.zzeeq
                    r3.<init>()
                    r0.setOnCancelListener(r3)
                    android.app.AlertDialog r0 = r2.create()
                    r0.show()
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    com.google.android.gms.internal.ads.zzeeu r3 = new com.google.android.gms.internal.ads.zzeeu
                    r3.<init>(r0, r2, r1)
                    r0 = 3000(0xbb8, double:1.482E-320)
                    r2.schedule(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeer.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton(zzd == null ? "No thanks" : zzd.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzees
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzeen zzeenVar2 = zzeen.this;
                String str3 = str;
                zzdwg zzdwgVar2 = zzdwgVar;
                Activity activity2 = activity;
                zzfgo zzfgoVar2 = zzfgoVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeenVar2.zzc(str3);
                if (zzdwgVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzeev.zzd(activity2, zzdwgVar2, zzfgoVar2, zzeenVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeet
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzeen zzeenVar2 = zzeen.this;
                String str3 = str;
                zzdwg zzdwgVar2 = zzdwgVar;
                Activity activity2 = activity;
                zzfgo zzfgoVar2 = zzfgoVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeenVar2.zzc(str3);
                if (zzdwgVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzeev.zzd(activity2, zzdwgVar2, zzfgoVar2, zzeenVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builder.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzv ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzeen.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e2) {
                zzcfi.zzg("Failed to get writable offline buffering database: ".concat(e2.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzf() {
        zzeen zzeenVar = this.zzd;
        final zzcfn zzcfnVar = this.zzc;
        zzeenVar.zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzeen.zzb(zzcfn.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzg(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, str);
        int i2 = zzfny.zza;
        PendingIntent zza = zzfny.zza(context, 0, intent, i2 | CommonUtils.BYTES_IN_A_GIGABYTE, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent zza2 = zzfny.zza(context, 0, intent2, i2 | CommonUtils.BYTES_IN_A_GIGABYTE, 0);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(zzd == null ? "View the ad you saved when you were offline" : zzd.getString(R.string.offline_notification_title)).setContentText(zzd == null ? "Tap to open ad" : zzd.getString(R.string.offline_notification_text)).setAutoCancel(true).setDeleteIntent(zza2).setContentIntent(zza).setSmallIcon(context.getApplicationInfo().icon).build());
        zzi(str2, "offline_notification_impression", new HashMap());
    }
}
