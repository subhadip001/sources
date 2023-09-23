package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzq extends AsyncTask {
    public final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.zza;
        if (zzs.zze(zzsVar) == null || str == null) {
            return;
        }
        zzs.zze(zzsVar).loadUrl(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzv(zzsVar, (zzaoc) zzs.zzu(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e2) {
            e = e2;
            zzcfi.zzk("", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzcfi.zzk("", e);
        } catch (TimeoutException e4) {
            zzcfi.zzk("", e4);
        }
        return this.zza.zzp();
    }
}
