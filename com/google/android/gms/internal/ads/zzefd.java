package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzefd {
    private zzfbj zzc = null;
    private zzfbg zzd = null;
    private com.google.android.gms.ads.internal.client.zzu zze = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    private final void zzh(zzfbg zzfbgVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = zzfbgVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zzd == null) {
                this.zzd = zzfbgVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j2;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfL)).booleanValue() && z) {
                this.zze = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zze;
    }

    public final zzdbl zzb() {
        return new zzdbl(this.zzd, "", this, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbg zzfbgVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfbgVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfbgVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfbgVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfK)).booleanValue()) {
            String str6 = zzfbgVar.zzG;
            String str7 = zzfbgVar.zzH;
            str = str6;
            str2 = str7;
            str3 = zzfbgVar.zzI;
            str4 = zzfbgVar.zzJ;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfbgVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        this.zza.add(zzuVar);
        this.zzb.put(str5, zzuVar);
    }

    public final void zze(zzfbg zzfbgVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfbgVar, j2, zzeVar, false);
    }

    public final void zzf(zzfbg zzfbgVar, long j2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfbgVar, j2, null, true);
    }

    public final void zzg(zzfbj zzfbjVar) {
        this.zzc = zzfbjVar;
    }
}
