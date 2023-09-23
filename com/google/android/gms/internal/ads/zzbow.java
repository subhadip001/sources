package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import f.e.a.k.e;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbow implements zzbol {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdwg zzb;
    private final zzfgo zzc;
    private final zzbwo zze;
    private final zzeen zzf;
    private com.google.android.gms.ads.internal.overlay.zzu zzg = null;
    private final zzcfn zzd = new zzcfn(null);

    public zzbow(com.google.android.gms.ads.internal.zzb zzbVar, zzbwo zzbwoVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zza = zzbVar;
        this.zze = zzbwoVar;
        this.zzf = zzeenVar;
        this.zzb = zzdwgVar;
        this.zzc = zzfgoVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzaoc zzaocVar, Uri uri, View view, Activity activity) {
        if (zzaocVar == null) {
            return uri;
        }
        try {
            return zzaocVar.zze(uri) ? zzaocVar.zza(uri, context, view, activity) : uri;
        } catch (zzaod unused) {
            return uri;
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            zzcfi.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e2);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (com.google.android.gms.internal.ads.zzbov.zzc(r11, r5, r6, r7) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbow.zzh(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzi(boolean z) {
        zzbwo zzbwoVar = this.zze;
        if (zzbwoVar != null) {
            zzbwoVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdwg zzdwgVar = this.zzb;
        if (zzdwgVar != null) {
            zzeev.zzc(context, zzdwgVar, this.zzc, this.zzf, str2, "offline_open");
        }
        zzcli zzcliVar = (zzcli) zzaVar;
        boolean z = zzcliVar.zzQ().zzi() && zzcliVar.zzk() == null;
        if (zzv) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzw != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgX)).booleanValue()) {
                if (zzcliVar.zzQ().zzi()) {
                    zzeev.zzh(zzcliVar.zzk(), null, zzw, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcmn) zzaVar).zzaG(zzw, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdwg zzdwgVar2 = this.zzb;
                if (zzdwgVar2 != null) {
                    zzeev.zzc(context, zzdwgVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzw == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgX)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzeev.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i2) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgo zzfgoVar = this.zzc;
            zzfgn zzb = zzfgn.zzb("cct_action");
            zzb.zza("cct_open_status", zzbiv.zza(i2));
            zzfgoVar.zzb(zzb);
            return;
        }
        zzdwf zza = this.zzb.zza();
        zza.zzb("action", "cct_action");
        zza.zzb("cct_open_status", zzbiv.zza(i2));
        zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    /* renamed from: zze */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        HashMap hashMap;
        Object obj;
        zzcli zzcliVar = (zzcli) zzaVar;
        String zzc = zzcdp.zzc((String) map.get("u"), zzcliVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzcfi.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzfbg zzF = zzcliVar.zzF();
        zzfbj zzR = zzcliVar.zzR();
        boolean z2 = false;
        if (zzF == null || zzR == null) {
            str = "";
            z = false;
        } else {
            z = zzF.zzak;
            str = zzR.zzb;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzid)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(CrashlyticsReportDataCapture.SIGNAL_DEFAULT)) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcliVar.zzaC()) {
                zzcfi.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzi(false);
            ((zzcmn) zzaVar).zzaH(zzf(map), zzb(map), z3);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzi(false);
            if (zzc != null) {
                ((zzcmn) zzaVar).zzaI(zzf(map), zzb(map), zzc, z3);
            } else {
                ((zzcmn) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcliVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdB)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdH)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdF)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdG);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        for (String str4 : zzfpe.zzc(zzfof.zzc(';')).zzd(str3)) {
                            if (str4.equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zzg = zzbiw.zzg(zzcliVar.getContext());
            if (z2) {
                if (!zzg) {
                    zzk(4);
                } else {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        zzcfi.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk()));
                    if (z && this.zzf != null && zzj(zzaVar, zzcliVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbot(this);
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z3);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzh(zzaVar, map, z, str, z3);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z, str, z3);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgP)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcfi.zzj("Package name missing from open app action.");
                } else if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), str5, str)) {
                    PackageManager packageManager = zzcliVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzcfi.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z3);
                    }
                }
            }
        } else {
            zzi(true);
            String str6 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    intent = Intent.parseUri(str6, 0);
                } catch (URISyntaxException e2) {
                    zzcfi.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e2);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), data, zzcliVar.zzH(), zzcliVar.zzk()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgQ)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhb)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z4) {
                hashMap = hashMap2;
                obj = "p";
                this.zzg = new zzbou(this, z3, zzaVar, hashMap2, map);
                z3 = false;
            } else {
                hashMap = hashMap2;
                obj = "p";
            }
            if (intent2 != null) {
                if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), intent2.getData().toString(), str)) {
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z3);
                    return;
                } else if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbrc) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                } else {
                    return;
                }
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk())).toString();
            }
            if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), zzc, str)) {
                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzc, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get(e.u), this.zzg), z3);
            } else if (z4) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((zzbrc) zzaVar).zzd("openIntentAsync", hashMap4);
            }
        }
    }
}
