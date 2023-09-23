package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzkf {
    private final Context zza;
    private final Handler zzb;
    private final zzkb zzc;
    private final AudioManager zzd;
    private zzke zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzkf(Context context, Handler handler, zzkb zzkbVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkbVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzcw.zzb(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzke zzkeVar = new zzke(this, null);
        try {
            applicationContext.registerReceiver(zzkeVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkeVar;
        } catch (RuntimeException e2) {
            zzdn.zzb("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzkf zzkfVar) {
        zzkfVar.zzh();
    }

    private static int zzg(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            zzdn.zzb("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public final void zzh() {
        zzdm zzdmVar;
        final int zzg = zzg(this.zzd, this.zzf);
        final boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg == zzg && this.zzh == zzi) {
            return;
        }
        this.zzg = zzg;
        this.zzh = zzi;
        zzdmVar = ((zzij) this.zzc).zza.zzl;
        zzdmVar.zzd(30, new zzdj() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzc(zzg, zzi);
            }
        });
        zzdmVar.zzc();
    }

    private static boolean zzi(AudioManager audioManager, int i2) {
        if (zzeg.zza >= 23) {
            return audioManager.isStreamMute(i2);
        }
        return zzg(audioManager, i2) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzeg.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzke zzkeVar = this.zze;
        if (zzkeVar != null) {
            try {
                this.zza.unregisterReceiver(zzkeVar);
            } catch (RuntimeException e2) {
                zzdn.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i2) {
        zzkf zzkfVar;
        final zzr zzam;
        zzr zzrVar;
        zzdm zzdmVar;
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzh();
        zzij zzijVar = (zzij) this.zzc;
        zzkfVar = zzijVar.zza.zzz;
        zzam = zzin.zzam(zzkfVar);
        zzrVar = zzijVar.zza.zzac;
        if (zzam.equals(zzrVar)) {
            return;
        }
        zzijVar.zza.zzac = zzam;
        zzdmVar = zzijVar.zza.zzl;
        zzdmVar.zzd(29, new zzdj() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzb(zzr.this);
            }
        });
        zzdmVar.zzc();
    }
}
