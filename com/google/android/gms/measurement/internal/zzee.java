package com.google.android.gms.measurement.internal;

import android.util.Log;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzee implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzeh zzf;

    public zzee(zzeh zzehVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzehVar;
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j2;
        char c2;
        long j3;
        zzew zzm = this.zzf.zzt.zzm();
        if (zzm.zzx()) {
            zzeh zzehVar = this.zzf;
            c = zzehVar.zza;
            if (c == 0) {
                if (zzehVar.zzt.zzf().zzy()) {
                    zzeh zzehVar2 = this.zzf;
                    zzehVar2.zzt.zzaw();
                    zzehVar2.zza = 'C';
                } else {
                    zzeh zzehVar3 = this.zzf;
                    zzehVar3.zzt.zzaw();
                    zzehVar3.zza = 'c';
                }
            }
            zzeh zzehVar4 = this.zzf;
            j2 = zzehVar4.zzb;
            if (j2 < 0) {
                zzehVar4.zzt.zzf().zzh();
                zzehVar4.zzb = 74029L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzeh zzehVar5 = this.zzf;
            c2 = zzehVar5.zza;
            j3 = zzehVar5.zzb;
            String zzo = zzeh.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder();
            sb.append("2");
            sb.append(charAt);
            sb.append(c2);
            sb.append(j3);
            String u = a.u(sb, ":", zzo);
            if (u.length() > 1024) {
                u = this.zzb.substring(0, 1024);
            }
            zzeu zzeuVar = zzm.zzb;
            if (zzeuVar != null) {
                zzeuVar.zzb(u, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
