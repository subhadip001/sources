package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsl {
    private final Context zzb;
    private final String zzc;
    private final zzcfo zzd;
    private final zzfhs zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    private zzbsk zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbsl(Context context, zzcfo zzcfoVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfhs zzfhsVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcfoVar;
        this.zze = zzfhsVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbsf zzb(zzaoc zzaocVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbsk zzbskVar = this.zzh;
                if (zzbskVar != null && this.zzi == 0) {
                    zzbskVar.zzi(new zzcge() { // from class: com.google.android.gms.internal.ads.zzbrq
                        @Override // com.google.android.gms.internal.ads.zzcge
                        public final void zza(Object obj) {
                            zzbsl.this.zzk((zzbrg) obj);
                        }
                    }, new zzcgc() { // from class: com.google.android.gms.internal.ads.zzbrr
                        @Override // com.google.android.gms.internal.ads.zzcgc
                        public final void zza() {
                        }
                    });
                }
            }
            zzbsk zzbskVar2 = this.zzh;
            if (zzbskVar2 != null && zzbskVar2.zze() != -1) {
                int i2 = this.zzi;
                if (i2 == 0) {
                    return this.zzh.zza();
                } else if (i2 == 1) {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                } else {
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            zzbsk zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    public final zzbsk zzd(zzaoc zzaocVar) {
        zzfhg zza = zzfhf.zza(this.zzb, 6);
        zza.zzf();
        zzbsk zzbskVar = new zzbsk(this.zzg);
        zzcfv.zze.execute(new Runnable(null, zzbskVar) { // from class: com.google.android.gms.internal.ads.zzbrs
            public final /* synthetic */ zzbsk zzb;

            {
                this.zzb = zzbskVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbsl.this.zzj(null, this.zzb);
            }
        });
        zzbskVar.zzi(new zzbsa(this, zzbskVar, zza), new zzbsb(this, zzbskVar, zza));
        return zzbskVar;
    }

    public final /* synthetic */ void zzi(zzbsk zzbskVar, final zzbrg zzbrgVar) {
        synchronized (this.zza) {
            if (zzbskVar.zze() != -1 && zzbskVar.zze() != 1) {
                zzbskVar.zzg();
                zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbrg.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzaoc zzaocVar, zzbsk zzbskVar) {
        try {
            zzbro zzbroVar = new zzbro(this.zzb, this.zzd, null, null);
            zzbroVar.zzk(new zzbru(this, zzbskVar, zzbroVar));
            zzbroVar.zzq("/jsLoaded", new zzbrw(this, zzbskVar, zzbroVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzbrx zzbrxVar = new zzbrx(this, null, zzbroVar, zzcaVar);
            zzcaVar.zzb(zzbrxVar);
            zzbroVar.zzq("/requestReload", zzbrxVar);
            if (this.zzc.endsWith(".js")) {
                zzbroVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbroVar.zzf(this.zzc);
            } else {
                zzbroVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbrz(this, zzbskVar, zzbroVar), 60000L);
        } catch (Throwable th) {
            zzcfi.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbskVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzbrg zzbrgVar) {
        if (zzbrgVar.zzi()) {
            this.zzi = 1;
        }
    }
}
