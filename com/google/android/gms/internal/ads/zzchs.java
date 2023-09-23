package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzfnu;
import f.a.b.a.a;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzchs {
    private final Context zza;
    private final String zzb;
    private final zzcfo zzc;
    private final zzbik zzd;
    private final zzbin zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcgx zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzchs(Context context, zzcfo zzcfoVar, String str, zzbin zzbinVar, zzbik zzbikVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcfoVar;
        this.zzb = str;
        this.zze = zzbinVar;
        this.zzd = zzbikVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzy);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.zzg[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                zzcfi.zzk("Unable to parse frame hash target time number.", e2);
                this.zzg[i2] = -1;
            }
        }
    }

    public final void zza(zzcgx zzcgxVar) {
        zzbif.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcgxVar.zzj());
        this.zzn = zzcgxVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbif.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbif.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbkc.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle S = a.S(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, "native-player-metrics");
        S.putString("request", this.zzb);
        S.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
            S.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
            S.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i2 < jArr.length) {
                String str = this.zzh[i2];
                if (str != null) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("fh_");
                    sb.append(valueOf);
                    S.putString("fh_".concat(valueOf.toString()), str);
                }
                i2++;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                final Context context = this.zza;
                final String str2 = this.zzc.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                S.putString("device", com.google.android.gms.ads.internal.util.zzs.zzq());
                S.putString("eids", TextUtils.join(",", zzbhy.zza()));
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                zzcfb.zzu(context, str2, "gmob-apps", S, true, new zzcfa() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzcfa
                    public final boolean zza(String str3) {
                        Context context2 = context;
                        String str4 = str2;
                        zzfnu zzfnuVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzG(context2, str4, str3);
                        return true;
                    }
                });
                this.zzo = true;
                return;
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcgx zzcgxVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbif.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzA().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzz)).longValue();
        long zza = zzcgxVar.zza();
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && longValue > Math.abs(zza - this.zzg[i2])) {
                String[] strArr2 = this.zzh;
                int i3 = 8;
                Bitmap bitmap = zzcgxVar.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j2);
                        i5++;
                        j2--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i2++;
        }
    }
}
