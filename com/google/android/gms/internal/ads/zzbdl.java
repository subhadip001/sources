package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdl {
    private final zzbdr zza;
    private final zzbfa zzb;
    private final boolean zzc;

    private zzbdl() {
        this.zzb = zzbfb.zzd();
        this.zzc = false;
        this.zza = new zzbdr();
    }

    public static zzbdl zza() {
        return new zzbdl();
    }

    private final synchronized String zzd(int i2) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime()), Integer.valueOf(i2 - 1), Base64.encodeToString(((zzbfb) this.zzb.zzaj()).zzau(), 3));
    }

    private final synchronized void zze(int i2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(i2).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i2) {
        zzbfa zzbfaVar = this.zzb;
        zzbfaVar.zzd();
        List<String> zzb = zzbhy.zzb();
        ArrayList arrayList = new ArrayList();
        for (String str : zzb) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbfaVar.zzc(arrayList);
        zzbdq zzbdqVar = new zzbdq(this.zza, ((zzbfb) this.zzb.zzaj()).zzau(), null);
        int i3 = i2 - 1;
        zzbdqVar.zza(i3);
        zzbdqVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i3, 10))));
    }

    public final synchronized void zzb(zzbdk zzbdkVar) {
        if (this.zzc) {
            try {
                zzbdkVar.zza(this.zzb);
            } catch (NullPointerException e2) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i2) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdV)).booleanValue()) {
                zze(i2);
            } else {
                zzf(i2);
            }
        }
    }

    public zzbdl(zzbdr zzbdrVar) {
        this.zzb = zzbfb.zzd();
        this.zza = zzbdrVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdU)).booleanValue();
    }
}
