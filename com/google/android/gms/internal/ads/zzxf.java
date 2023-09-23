package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzxf {
    private final zzwu zza = new zzwu();
    private final zzxb zzb;
    private final zzxe zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzxf(Context context) {
        zzxb zzxbVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i2 = zzeg.zza;
            zzxbVar = zzxd.zzc(applicationContext);
            if (zzxbVar == null) {
                zzxbVar = zzxc.zzc(applicationContext);
            }
        } else {
            zzxbVar = null;
        }
        this.zzb = zzxbVar;
        this.zzc = zzxbVar != null ? zzxe.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzxf zzxfVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzxfVar.zzk = refreshRate;
            zzxfVar.zzl = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzxfVar.zzk = -9223372036854775807L;
        zzxfVar.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzeg.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzxa.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10.zza.zzb() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzeg.zza
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            com.google.android.gms.internal.ads.zzwu r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzwu r0 = r10.zza
            float r0 = r0.zza()
            goto L1c
        L1a:
            float r0 = r10.zzf
        L1c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L58
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzwu r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzwu r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r6 != 0) goto L68
            com.google.android.gms.internal.ads.zzwu r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r10.zzg = r0
            r10.zzn(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxf.zzm():void");
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzeg.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f2 = 0.0f;
        if (this.zzd) {
            float f3 = this.zzg;
            if (f3 != -1.0f) {
                f2 = this.zzi * f3;
            }
        }
        if (z || this.zzh != f2) {
            this.zzh = f2;
            zzxa.zza(surface, f2);
        }
    }

    public final long zza(long j2) {
        long j3;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zzq + (((float) ((this.zzm - this.zzp) * this.zza.zzc())) / this.zzi);
            if (Math.abs(j2 - zzc) <= 20000000) {
                j2 = zzc;
            } else {
                zzl();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j2;
        zzxe zzxeVar = this.zzc;
        if (zzxeVar == null || this.zzk == -9223372036854775807L) {
            return j2;
        }
        long j4 = zzxeVar.zza;
        if (j4 == -9223372036854775807L) {
            return j2;
        }
        long j5 = this.zzk;
        long j6 = (((j2 - j4) / j5) * j5) + j4;
        if (j2 <= j6) {
            j3 = j6 - j5;
        } else {
            j3 = j6;
            j6 = j5 + j6;
        }
        if (j6 - j2 >= j2 - j3) {
            j6 = j3;
        }
        return j6 - this.zzl;
    }

    public final void zzc(float f2) {
        this.zzf = f2;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j2) {
        long j3 = this.zzn;
        if (j3 != -1) {
            this.zzp = j3;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j2 * 1000);
        zzm();
    }

    public final void zze(float f2) {
        this.zzi = f2;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzxe zzxeVar = this.zzc;
            Objects.requireNonNull(zzxeVar);
            zzxeVar.zzb();
            this.zzb.zzb(new zzwz(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxb zzxbVar = this.zzb;
        if (zzxbVar != null) {
            zzxbVar.zza();
            zzxe zzxeVar = this.zzc;
            Objects.requireNonNull(zzxeVar);
            zzxeVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzws)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i2) {
        if (this.zzj == i2) {
            return;
        }
        this.zzj = i2;
        zzn(true);
    }
}
