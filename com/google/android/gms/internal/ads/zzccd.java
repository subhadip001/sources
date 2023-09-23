package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccd implements zzccj {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    public boolean zza;
    private final zzgoc zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccg zzi;
    private final zzccf zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzccd(Context context, zzcfo zzcfoVar, zzccg zzccgVar, String str, zzccf zzccfVar, byte[] bArr) {
        Preconditions.checkNotNull(zzccgVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzccfVar;
        this.zzi = zzccgVar;
        for (String str2 : zzccgVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgoc zza = zzgpa.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzgod zza2 = zzgoe.zza();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zza2.zza(str3);
        }
        zza.zzg((zzgoe) zza2.zzaj());
        zzgoy zza3 = zzgoz.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = zzcfoVar.zza;
        if (str4 != null) {
            zza3.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzgoz) zza3.zzaj());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zza() {
        return this.zzi;
    }

    public final /* synthetic */ zzfvj zzb(Map map) {
        zzgow zzgowVar;
        zzfvj zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzgowVar = (zzgow) this.zze.get(str);
                            }
                            if (zzgowVar == null) {
                                zzcci.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i2 = 0; i2 < length; i2++) {
                                    zzgowVar.zza(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzbjv.zzb.zze()).booleanValue()) {
                    zzcfi.zzf("Failed to get SafeBrowsing metadata", e2);
                }
                return zzfva.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if ((z && this.zzi.zzg) || ((this.zzm && this.zzi.zzf) || (!z && this.zzi.zzd))) {
            synchronized (this.zzj) {
                for (zzgow zzgowVar2 : this.zze.values()) {
                    this.zzd.zzc((zzgox) zzgowVar2.zzaj());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzcci.zzb()) {
                    String zzl = this.zzd.zzl();
                    String zzk = this.zzd.zzk();
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzl + "\n  clickUrl: " + zzk + "\n  resources: \n");
                    for (zzgox zzgoxVar : this.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzgoxVar.zza());
                        sb.append("] ");
                        sb.append(zzgoxVar.zze());
                    }
                    zzcci.zza(sb.toString());
                }
                zzfvj zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgpa) this.zzd.zzaj()).zzau());
                if (zzcci.zzb()) {
                    zzb2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcci.zza("Pinged SB successfully.");
                        }
                    }, zzcfv.zza);
                }
                zzm = zzfva.zzm(zzb2, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzcbz
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        int i3 = zzccd.zzb;
                        return null;
                    }
                }, zzcfv.zzf);
            }
            return zzm;
        }
        return zzfva.zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzd(String str, Map map, int i2) {
        synchronized (this.zzj) {
            if (i2 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i2 == 3) {
                    ((zzgow) this.zze.get(str)).zze(zzgov.zza(3));
                }
                return;
            }
            zzgow zzc2 = zzgox.zzc();
            int zza = zzgov.zza(i2);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzgoh zza2 = zzgok.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgof zza3 = zzgog.zza();
                        zza3.zza(zzgjg.zzx(str2));
                        zza3.zzb(zzgjg.zzx(str3));
                        zza2.zza((zzgog) zza3.zzaj());
                    }
                }
            }
            zzc2.zzc((zzgok) zza2.zzaj());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfvj zzi = zzfva.zzi(Collections.emptyMap());
            zzfuh zzfuhVar = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzcca
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzccd.this.zzb((Map) obj);
                }
            };
            zzfvk zzfvkVar = zzcfv.zzf;
            zzfvj zzn = zzfva.zzn(zzi, zzfuhVar, zzfvkVar);
            zzfvj zzo = zzfva.zzo(zzn, 10L, TimeUnit.SECONDS, zzcfv.zzd);
            zzfva.zzr(zzn, new zzccc(this, zzo), zzfvkVar);
            zzc.add(zzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgjd zzt = zzgjg.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzgoc zzgocVar = this.zzd;
            zzgop zza = zzgor.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzgocVar.zzi((zzgor) zza.zzaj());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzccj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzccg r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.zzl
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcfi.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcfi.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcfi.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcci.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzccb r8 = new com.google.android.gms.internal.ads.zzccb
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzf(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccd.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
