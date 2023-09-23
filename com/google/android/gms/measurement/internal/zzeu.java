package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzeu {
    @VisibleForTesting
    public final String zza;
    public final /* synthetic */ zzew zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public /* synthetic */ zzeu(zzew zzewVar, String str, long j2, zzet zzetVar) {
        this.zzb = zzewVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j2 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j2;
    }

    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzt.zzav().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzt.zzav().currentTimeMillis());
        }
        long j2 = this.zze;
        if (abs < j2) {
            return null;
        }
        if (abs > j2 + j2) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j3 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        if (string != null && j3 > 0) {
            return new Pair(string, Long.valueOf(j3));
        }
        return zzew.zza;
    }

    public final void zzb(String str, long j2) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzt.zzv().zzG().nextLong();
        long j4 = j3 + 1;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j4) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j4);
        edit2.apply();
    }
}
