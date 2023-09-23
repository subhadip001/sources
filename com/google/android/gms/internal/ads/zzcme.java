package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcme extends com.google.android.gms.ads.internal.client.zzdj {
    private final zzchr zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdn zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbmi zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcme(zzchr zzchrVar, float f2, boolean z, boolean z2) {
        this.zza = zzchrVar;
        this.zzi = f2;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(final int i2, final int i3, final boolean z, final boolean z2) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzd(i2, i3, z, z2);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        boolean z3;
        int i3;
        synchronized (this.zzb) {
            z2 = true;
            if (f3 == this.zzi && f4 == this.zzk) {
                z2 = false;
            }
            this.zzi = f3;
            this.zzj = f2;
            z3 = this.zzh;
            this.zzh = z;
            i3 = this.zze;
            this.zze = i2;
            float f5 = this.zzk;
            this.zzk = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbmi zzbmiVar = this.zzn;
                if (zzbmiVar != null) {
                    zzbmiVar.zze();
                }
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzw(i3, i2, z3, z);
    }

    public final /* synthetic */ void zzd(int i2, int i3, boolean z, boolean z2) {
        int i4;
        boolean z3;
        boolean z4;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar2;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            boolean z6 = false;
            if (z5 || i3 != 1) {
                i4 = i3;
                z3 = false;
            } else {
                i4 = 1;
                z3 = true;
            }
            if (i2 == i3 || i4 != 1) {
                z4 = false;
            } else {
                i4 = 1;
                z4 = true;
            }
            boolean z7 = i2 != i3 && i4 == 2;
            boolean z8 = i2 != i3 && i4 == 3;
            this.zzg = (z5 || z3) ? true : true;
            if (z3) {
                try {
                    com.google.android.gms.ads.internal.client.zzdn zzdnVar4 = this.zzf;
                    if (zzdnVar4 != null) {
                        zzdnVar4.zzi();
                    }
                } catch (RemoteException e2) {
                    zzcfi.zzl("#007 Could not call remote method.", e2);
                }
            }
            if (z4 && (zzdnVar3 = this.zzf) != null) {
                zzdnVar3.zzh();
            }
            if (z7 && (zzdnVar2 = this.zzf) != null) {
                zzdnVar2.zzg();
            }
            if (z8) {
                com.google.android.gms.ads.internal.client.zzdn zzdnVar5 = this.zzf;
                if (zzdnVar5 != null) {
                    zzdnVar5.zze();
                }
                this.zza.zzy();
            }
            if (z != z2 && (zzdnVar = this.zzf) != null) {
                zzdnVar.zzf(z2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzk;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzj;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzi;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        int i2;
        synchronized (this.zzb) {
            i2 = this.zze;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        synchronized (this.zzb) {
            zzdnVar = this.zzf;
        }
        return zzdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        zzx(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.zzb) {
            this.zzf = zzdnVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
        boolean z = zzfgVar.zza;
        boolean z2 = zzfgVar.zzb;
        boolean z3 = zzfgVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1", "customControlsRequested", true != z2 ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1", "clickToExpandRequested", true != z3 ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1"));
    }

    public final void zzt(float f2) {
        synchronized (this.zzb) {
            this.zzj = f2;
        }
    }

    public final void zzu() {
        boolean z;
        int i2;
        synchronized (this.zzb) {
            z = this.zzh;
            i2 = this.zze;
            this.zze = 3;
        }
        zzw(i2, 3, z, z);
    }

    public final void zzv(zzbmi zzbmiVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmiVar;
        }
    }
}
