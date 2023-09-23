package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhr {
    private final Collection zza = new ArrayList();
    private final Collection zzb = new ArrayList();
    private final Collection zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbhq zzbhqVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbhz.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbhq zzbhqVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbhz.zzb());
        return zza;
    }

    public final void zzc(zzbhq zzbhqVar) {
        this.zzb.add(zzbhqVar);
    }

    public final void zzd(zzbhq zzbhqVar) {
        this.zza.add(zzbhqVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i2, JSONObject jSONObject) {
        for (zzbhq zzbhqVar : this.zza) {
            if (zzbhqVar.zze() == 1) {
                zzbhqVar.zzd(editor, zzbhqVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcfi.zzg("Flag Json is null.");
        }
    }
}
