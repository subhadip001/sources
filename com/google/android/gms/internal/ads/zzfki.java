package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfki extends zzfke {
    public zzfki(zzfjx zzfjxVar, HashSet hashSet, JSONObject jSONObject, long j2, byte[] bArr) {
        super(zzfjxVar, hashSet, jSONObject, j2, null);
    }

    private final void zzc(String str) {
        zzfja zza = zzfja.zza();
        if (zza != null) {
            for (zzfip zzfipVar : zza.zzc()) {
                if (((zzfke) this).zza.contains(zzfipVar.zzh())) {
                    zzfipVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkf, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfkf
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
