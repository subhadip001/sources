package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayl {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayf[] zze = new zzayf[100];
    private final zzayf[] zza = new zzayf[1];

    public zzayl(boolean z, int i2) {
    }

    public final synchronized int zza() {
        return this.zzc * LogFileManager.MAX_LOG_SIZE;
    }

    public final synchronized zzayf zzb() {
        zzayf zzayfVar;
        this.zzc++;
        int i2 = this.zzd;
        if (i2 > 0) {
            zzayf[] zzayfVarArr = this.zze;
            int i3 = i2 - 1;
            this.zzd = i3;
            zzayfVar = zzayfVarArr[i3];
            zzayfVarArr[i3] = null;
        } else {
            zzayfVar = new zzayf(new byte[LogFileManager.MAX_LOG_SIZE], 0);
        }
        return zzayfVar;
    }

    public final synchronized void zzc(zzayf zzayfVar) {
        zzayf[] zzayfVarArr = this.zza;
        zzayfVarArr[0] = zzayfVar;
        zzd(zzayfVarArr);
    }

    public final synchronized void zzd(zzayf[] zzayfVarArr) {
        int length = this.zzd + zzayfVarArr.length;
        zzayf[] zzayfVarArr2 = this.zze;
        int length2 = zzayfVarArr2.length;
        if (length >= length2) {
            this.zze = (zzayf[]) Arrays.copyOf(zzayfVarArr2, Math.max(length2 + length2, length));
        }
        for (zzayf zzayfVar : zzayfVarArr) {
            byte[] bArr = zzayfVar.zza;
            zzayf[] zzayfVarArr3 = this.zze;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            zzayfVarArr3[i2] = zzayfVar;
        }
        this.zzc -= zzayfVarArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i2) {
        int i3 = this.zzb;
        this.zzb = i2;
        if (i2 < i3) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazn.zzd(this.zzb, LogFileManager.MAX_LOG_SIZE) - this.zzc);
        int i2 = this.zzd;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.zze, max, i2, (Object) null);
        this.zzd = max;
    }
}
