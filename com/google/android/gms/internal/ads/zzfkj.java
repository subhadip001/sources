package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfkj extends zzfke {
    public zzfkj(zzfjx zzfjxVar, HashSet hashSet, JSONObject jSONObject, long j2, byte[] bArr) {
        super(zzfjxVar, hashSet, jSONObject, j2, null);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjr.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkf, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfja zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfja.zza()) != null) {
            for (zzfip zzfipVar : zza.zzc()) {
                if (((zzfke) this).zza.contains(zzfipVar.zzh())) {
                    zzfipVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
