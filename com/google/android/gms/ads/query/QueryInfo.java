package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzeh zza;

    public QueryInfo(zzeh zzehVar) {
        this.zza = zzehVar;
    }

    @KeepForSdk
    public static void generate(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbhy.zzc(context);
        if (((Boolean) zzbjm.zzh.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        new zzbyl(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza()).zzb(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbyl(context, adFormat, adRequest == null ? null : adRequest.zza()).zzb(queryInfoGenerationCallback);
    }

    @KeepForSdk
    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzd();
    }

    public final zzeh zza() {
        return this.zza;
    }
}
