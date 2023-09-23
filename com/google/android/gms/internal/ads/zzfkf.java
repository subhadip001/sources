package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfkf extends AsyncTask {
    private zzfkg zza;
    public final zzfjx zzd;

    public zzfkf(zzfjx zzfjxVar, byte[] bArr) {
        this.zzd = zzfjxVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfkg zzfkgVar = this.zza;
        if (zzfkgVar != null) {
            zzfkgVar.zza(this);
        }
    }

    public final void zzb(zzfkg zzfkgVar) {
        this.zza = zzfkgVar;
    }
}
