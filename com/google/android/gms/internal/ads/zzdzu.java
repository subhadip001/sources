package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdzu implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzdzu(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffy zzffyVar = zzffy.WEBVIEW_COOKIE;
        zzffv zzi = zzffo.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaH));
            }
        }, zzffyVar, (zzfge) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzdzs zzdzsVar = new zzffh() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzffr
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfva.zzi("");
            }
        }).zza();
    }
}
