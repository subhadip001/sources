package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqe implements zzaiu {
    private volatile zzbpr zza;
    private final Context zzb;

    public zzbqe(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbqe zzbqeVar) {
        if (zzbqeVar.zza == null) {
            return;
        }
        zzbqeVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final zzaix zza(zzajb zzajbVar) {
        Parcelable.Creator<zzbps> creator = zzbps.CREATOR;
        Map zzl = zzajbVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i3] = (String) entry.getKey();
            strArr2[i3] = (String) entry.getValue();
            i3++;
        }
        zzbps zzbpsVar = new zzbps(zzajbVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcgaVar = new zzcga();
            this.zza = new zzbpr(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbqc(this, zzcgaVar), new zzbqd(this, zzcgaVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqa zzbqaVar = new zzbqa(this, zzbpsVar);
            zzfvk zzfvkVar = zzcfv.zza;
            zzfvj zzo = zzfva.zzo(zzfva.zzn(zzcgaVar, zzbqaVar, zzfvkVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdy)).intValue(), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzo.zzc(new zzbqb(this), zzfvkVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            StringBuilder A = a.A("Http assets remote cache took ");
            A.append(elapsedRealtime2 - elapsedRealtime);
            A.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(A.toString());
            zzbpu zzbpuVar = (zzbpu) new zzbzs(parcelFileDescriptor).zza(zzbpu.CREATOR);
            if (zzbpuVar == null) {
                return null;
            }
            if (!zzbpuVar.zza) {
                if (zzbpuVar.zze.length != zzbpuVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbpuVar.zze;
                    if (i2 < strArr3.length) {
                        hashMap.put(strArr3[i2], zzbpuVar.zzf[i2]);
                        i2++;
                    } else {
                        return new zzaix(zzbpuVar.zzc, zzbpuVar.zzd, hashMap, zzbpuVar.zzg, zzbpuVar.zzh);
                    }
                }
            } else {
                throw new zzajk(zzbpuVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            StringBuilder A2 = a.A("Http assets remote cache took ");
            A2.append(elapsedRealtime3 - elapsedRealtime);
            A2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(A2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            StringBuilder A3 = a.A("Http assets remote cache took ");
            A3.append(elapsedRealtime4 - elapsedRealtime);
            A3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(A3.toString());
            throw th;
        }
    }
}
