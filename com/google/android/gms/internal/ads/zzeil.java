package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeil {
    private final Clock zza;
    private final zzeim zzb;
    private final zzfig zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfO)).booleanValue();
    private final zzefd zzf;

    public zzeil(Clock clock, zzeim zzeimVar, zzefd zzefdVar, zzfig zzfigVar) {
        this.zza = clock;
        this.zzb = zzeimVar;
        this.zzf = zzefdVar;
        this.zzc = zzfigVar;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzeil zzeilVar, String str, int i2, long j2, String str2) {
        String str3 = str + "." + i2 + "." + j2;
        if (!TextUtils.isEmpty(str2)) {
            str3 = a.q(str3, ".", str2);
        }
        zzeilVar.zzd.add(str3);
    }

    public final zzfvj zze(zzfbs zzfbsVar, zzfbg zzfbgVar, zzfvj zzfvjVar, zzfic zzficVar) {
        zzfbj zzfbjVar = zzfbsVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfbgVar.zzx;
        if (str != null) {
            zzfva.zzr(zzfvjVar, new zzeik(this, elapsedRealtime, str, zzfbgVar, zzfbjVar, zzficVar, zzfbsVar), zzcfv.zzf);
        }
        return zzfvjVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
