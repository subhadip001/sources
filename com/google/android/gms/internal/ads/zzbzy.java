package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbzy {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:20:0x0089, B:22:0x0097), top: B:34:0x0089 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbzy(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.zzc(r7)
            r6.zze(r7)
            r6.zzd(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r6.zzq = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r3 = 0
        L2d:
            r6.zzr = r3
            java.lang.String r2 = r1.getCountry()
            r6.zzs = r2
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            boolean r2 = com.google.android.gms.internal.ads.zzcfb.zzp()
            r6.zzt = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r7)
            r6.zzu = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r7)
            r6.zzv = r2
            java.lang.String r1 = r1.getLanguage()
            r6.zzw = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = zzb(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L60
        L5e:
            r0 = r2
            goto L87
        L60:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L65
            goto L5e
        L65:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            if (r3 == 0) goto L5e
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
        L87:
            r6.zzx = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r7)     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto Laf
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r4.<init>()     // Catch: java.lang.Exception -> Lae
            r4.append(r3)     // Catch: java.lang.Exception -> Lae
            r4.append(r1)     // Catch: java.lang.Exception -> Lae
            r4.append(r0)     // Catch: java.lang.Exception -> Lae
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lae
            goto Laf
        Lae:
        Laf:
            r6.zzB = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb8
            return
        Lb8:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto Lbf
            return
        Lbf:
            float r0 = r7.density
            r6.zzy = r0
            int r0 = r7.widthPixels
            r6.zzz = r0
            int r7 = r7.heightPixels
            r6.zzA = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzy.<init>(android.content.Context):void");
    }

    private static ResolveInfo zzb(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), LogFileManager.MAX_LOG_SIZE);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void zzc(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    private final void zzd(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        this.zzm = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        this.zzn = (intExtra == 2 || intExtra == 5) ? true : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zze(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.zzg = r2
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zzbhq r2 = com.google.android.gms.internal.ads.zzbhy.zzha
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r2 = r4.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.zzi = r2
            int r0 = r0.getPhoneType()
            r5.zzj = r0
            r0 = -2
            r5.zzh = r0
            r5.zzk = r3
            r0 = -1
            r5.zzl = r0
            com.google.android.gms.ads.internal.zzt.zzp()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzs.zzx(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.zzh = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.zzl = r6
            goto L69
        L67:
            r5.zzh = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.zzk = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzy.zze(android.content.Context):void");
    }

    public final zzbzz zza() {
        return new zzbzz(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbzy(Context context, zzbzz zzbzzVar) {
        zzc(context);
        zze(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbiw.zzg(context);
        this.zzq = zzbzzVar.zza;
        this.zzr = zzbzzVar.zzb;
        this.zzs = zzbzzVar.zzd;
        this.zzt = zzbzzVar.zze;
        this.zzu = zzbzzVar.zzf;
        this.zzv = zzbzzVar.zzg;
        this.zzw = zzbzzVar.zzh;
        this.zzx = zzbzzVar.zzi;
        this.zzB = zzbzzVar.zzj;
        this.zzy = zzbzzVar.zzm;
        this.zzz = zzbzzVar.zzn;
        this.zzA = zzbzzVar.zzo;
    }
}
