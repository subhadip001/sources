package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcmi {
    private final zzcmj zza;
    private final zzcmh zzb;

    public zzcmi(zzcmj zzcmjVar, zzcmh zzcmhVar, byte[] bArr) {
        this.zzb = zzcmhVar;
        this.zza = zzcmjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzcmq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzaoc zzK = r0.zzK();
        if (zzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzc = zzK.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcmj zzcmjVar = this.zza;
            return zzc.zzf(context, str, (View) zzcmjVar, zzcmjVar.zzk());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzcmq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzaoc zzK = r0.zzK();
        if (zzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzany zzc = zzK.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcmj zzcmjVar = this.zza;
            return zzc.zzh(context, (View) zzcmjVar, zzcmjVar.zzk());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzcfi.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmi.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        zzcmh zzcmhVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzclp zzaL = ((zzcmb) zzcmhVar.zza).zzaL();
        if (zzaL == null) {
            zzcfi.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaL.zzi(parse);
        }
    }
}
