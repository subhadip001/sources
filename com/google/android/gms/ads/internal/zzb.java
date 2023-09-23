package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzccj;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzccj zzc;
    private final zzbzi zzd = new zzbzi(false, Collections.emptyList());

    public zzb(Context context, zzccj zzccjVar, zzbzi zzbziVar) {
        this.zza = context;
        this.zzc = zzccjVar;
    }

    private final boolean zzd() {
        zzccj zzccjVar = this.zzc;
        return (zzccjVar != null && zzccjVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzccj zzccjVar = this.zzc;
            if (zzccjVar != null) {
                zzccjVar.zzd(str, null, 3);
                return;
            }
            zzbzi zzbziVar = this.zzd;
            if (!zzbziVar.zza || (list = zzbziVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzG(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
