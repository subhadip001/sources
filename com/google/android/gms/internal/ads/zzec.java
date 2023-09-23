package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzec implements zzdg {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzec(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzeb zzebVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzebVar);
            }
        }
    }

    private static zzeb zzl() {
        zzeb zzebVar;
        List list = zza;
        synchronized (list) {
            zzebVar = list.isEmpty() ? new zzeb(null) : (zzeb) list.remove(list.size() - 1);
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zza(int i2) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i2), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzb(int i2, Object obj) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i2, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzc(int i2, int i3, int i4) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i3, i4), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zzd(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zze(int i2) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzf(int i2) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzg(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzh(int i2) {
        return this.zzb.sendEmptyMessage(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzi(int i2, long j2) {
        return this.zzb.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzj(zzdf zzdfVar) {
        return ((zzeb) zzdfVar).zzc(this.zzb);
    }
}
