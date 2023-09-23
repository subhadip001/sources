package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzclu {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzcli, java.lang.Object] */
    public static final zzcli zza(final Context context, final zzcmx zzcmxVar, final String str, final boolean z, final boolean z2, final zzaoc zzaocVar, final zzbix zzbixVar, final zzcfo zzcfoVar, zzbin zzbinVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbdl zzbdlVar, final zzfbg zzfbgVar, final zzfbj zzfbjVar) {
        zzbhy.zzc(context);
        try {
            zzfph zzfphVar = new zzfph(context, zzcmxVar, str, z, z2, zzaocVar, zzbixVar, zzcfoVar, null, zzlVar, zzaVar, zzbdlVar, zzfbgVar, zzfbjVar) { // from class: com.google.android.gms.internal.ads.zzclq
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcmx zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaoc zzf;
                public final /* synthetic */ zzbix zzg;
                public final /* synthetic */ zzcfo zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbdl zzk;
                public final /* synthetic */ zzfbg zzl;
                public final /* synthetic */ zzfbj zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbdlVar;
                    this.zzl = zzfbgVar;
                    this.zzm = zzfbjVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfph
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcmx zzcmxVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzaoc zzaocVar2 = this.zzf;
                    zzbix zzbixVar2 = this.zzg;
                    zzcfo zzcfoVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbdl zzbdlVar2 = this.zzk;
                    zzfbg zzfbgVar2 = this.zzl;
                    zzfbj zzfbjVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcmb.zza;
                        zzclx zzclxVar = new zzclx(new zzcmb(new zzcmw(context2), zzcmxVar2, str2, z3, z4, zzaocVar2, zzbixVar2, zzcfoVar2, null, zzlVar2, zzaVar2, zzbdlVar2, zzfbgVar2, zzfbjVar2));
                        zzclxVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzclxVar, zzbdlVar2, z4));
                        zzclxVar.setWebChromeClient(new zzclh(zzclxVar));
                        return zzclxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfphVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzclt("Webview initialization failed.", th);
        }
    }
}
