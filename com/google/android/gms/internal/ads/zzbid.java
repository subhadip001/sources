package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f.e.a.k.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbid {
    @VisibleForTesting
    public String zzd;
    @VisibleForTesting
    public Context zze;
    @VisibleForTesting
    public String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    @VisibleForTesting
    public final BlockingQueue zza = new ArrayBlockingQueue(100);
    @VisibleForTesting
    public final LinkedHashMap zzb = new LinkedHashMap();
    @VisibleForTesting
    public final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbid zzbidVar) {
        while (true) {
            try {
                zzbin zzbinVar = (zzbin) zzbidVar.zza.take();
                zzbim zza = zzbinVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbidVar.zzg(zzbidVar.zzb(zzbidVar.zzb, zzbinVar.zzb()), zza);
                }
            } catch (InterruptedException e2) {
                zzcfi.zzk("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbim zzbimVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbimVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbimVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbimVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbimVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbimVar.zza());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzG(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        fileOutputStream2.write(uri.getBytes());
                        fileOutputStream2.write(10);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e2) {
                            zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        zzcfi.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } else {
            zzcfi.zzj("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        }
    }

    public final zzbij zza(String str) {
        zzbij zzbijVar = (zzbij) this.zzc.get(str);
        return zzbijVar != null ? zzbijVar : zzbij.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbjj.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbic
            @Override // java.lang.Runnable
            public final void run() {
                zzbid.zzc(zzbid.this);
            }
        });
        Map map2 = this.zzc;
        zzbij zzbijVar = zzbij.zzb;
        map2.put("action", zzbijVar);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbijVar);
        this.zzc.put(e.u, zzbij.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbin zzbinVar) {
        return this.zza.offer(zzbinVar);
    }
}
