package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjh {
    private static zzfjh zza;
    private float zzb = 0.0f;
    private final zzfiz zzc;
    private final zzfix zzd;
    private zzfiy zze;
    private zzfja zzf;

    public zzfjh(zzfiz zzfizVar, zzfix zzfixVar) {
        this.zzc = zzfizVar;
        this.zzd = zzfixVar;
    }

    public static zzfjh zzb() {
        if (zza == null) {
            zza = new zzfjh(new zzfiz(), new zzfix());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfiy(new Handler(), context, new zzfiw(), this, null);
    }

    public final void zzd(float f2) {
        this.zzb = f2;
        if (this.zzf == null) {
            this.zzf = zzfja.zza();
        }
        for (zzfip zzfipVar : this.zzf.zzb()) {
            zzfipVar.zzg().zzh(f2);
        }
    }

    public final void zze() {
        zzfjc.zza().zzg(this);
        zzfjc.zza().zzd();
        if (zzfjc.zza().zzf()) {
            zzfkd.zzd().zzi();
        }
        this.zze.zza();
    }

    public final void zzf() {
        zzfkd.zzd().zzj();
        zzfjc.zza().zze();
        this.zze.zzb();
    }
}
