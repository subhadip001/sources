package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import f.a.b.a.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzar {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzau zzf;

    public zzar(zzfr zzfrVar, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j2;
        this.zze = j3;
        if (j3 != 0 && j3 > j2) {
            zzfrVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeh.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfrVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzfrVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzfrVar.zzay().zzk().zzb("Param value can't be null", zzfrVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfrVar.zzv().zzO(bundle2, next, zzA);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return a.u(a.F("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzar zza(zzfr zzfrVar, long j2) {
        return new zzar(zzfrVar, this.zzc, this.zza, this.zzb, this.zzd, j2, this.zzf);
    }

    private zzar(zzfr zzfrVar, String str, String str2, String str3, long j2, long j3, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j2;
        this.zze = j3;
        if (j3 != 0 && j3 > j2) {
            zzfrVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeh.zzn(str2), zzeh.zzn(str3));
        }
        this.zzf = zzauVar;
    }
}
