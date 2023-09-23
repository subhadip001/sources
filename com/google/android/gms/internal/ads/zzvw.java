package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvw {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzvp[] zzd = new zzvp[100];

    public zzvw(boolean z, int i2) {
    }

    public final synchronized int zza() {
        return this.zzb * LogFileManager.MAX_LOG_SIZE;
    }

    public final synchronized zzvp zzb() {
        zzvp zzvpVar;
        this.zzb++;
        int i2 = this.zzc;
        if (i2 > 0) {
            zzvp[] zzvpVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzc = i3;
            zzvpVar = zzvpVarArr[i3];
            Objects.requireNonNull(zzvpVar);
            zzvpVarArr[i3] = null;
        } else {
            zzvpVar = new zzvp(new byte[LogFileManager.MAX_LOG_SIZE], 0);
            int i4 = this.zzb;
            zzvp[] zzvpVarArr2 = this.zzd;
            int length = zzvpVarArr2.length;
            if (i4 > length) {
                this.zzd = (zzvp[]) Arrays.copyOf(zzvpVarArr2, length + length);
                return zzvpVar;
            }
        }
        return zzvpVar;
    }

    public final synchronized void zzc(zzvp zzvpVar) {
        zzvp[] zzvpVarArr = this.zzd;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zzvpVarArr[i2] = zzvpVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzvq zzvqVar) {
        while (zzvqVar != null) {
            zzvp[] zzvpVarArr = this.zzd;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            zzvpVarArr[i2] = zzvqVar.zzc();
            this.zzb--;
            zzvqVar = zzvqVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i2) {
        int i3 = this.zza;
        this.zza = i2;
        if (i2 < i3) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzeg.zze(this.zza, LogFileManager.MAX_LOG_SIZE) - this.zzb);
        int i2 = this.zzc;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.zzd, max, i2, (Object) null);
        this.zzc = max;
    }
}
