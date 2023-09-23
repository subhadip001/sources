package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzrc implements zzsd {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsk zzc = new zzsk();
    private final zzpd zzd = new zzpd();
    private Looper zze;
    private zzci zzf;
    private zzmv zzg;

    @Override // com.google.android.gms.internal.ads.zzsd
    public final /* synthetic */ zzci zzG() {
        return null;
    }

    public final zzmv zzb() {
        zzmv zzmvVar = this.zzg;
        zzcw.zzb(zzmvVar);
        return zzmvVar;
    }

    public final zzpd zzc(zzsb zzsbVar) {
        return this.zzd.zza(0, zzsbVar);
    }

    public final zzpd zzd(int i2, zzsb zzsbVar) {
        return this.zzd.zza(i2, zzsbVar);
    }

    public final zzsk zze(zzsb zzsbVar) {
        return this.zzc.zza(0, zzsbVar, 0L);
    }

    public final zzsk zzf(int i2, zzsb zzsbVar, long j2) {
        return this.zzc.zza(i2, zzsbVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzg(Handler handler, zzpe zzpeVar) {
        Objects.requireNonNull(zzpeVar);
        this.zzd.zzb(handler, zzpeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzh(Handler handler, zzsl zzslVar) {
        Objects.requireNonNull(zzslVar);
        this.zzc.zzb(handler, zzslVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi(zzsc zzscVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzscVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzk(zzsc zzscVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzscVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzm(zzsc zzscVar, zzft zzftVar, zzmv zzmvVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg = zzmvVar;
        zzci zzciVar = this.zzf;
        this.zza.add(zzscVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzscVar);
            zzn(zzftVar);
        } else if (zzciVar != null) {
            zzk(zzscVar);
            zzscVar.zza(this, zzciVar);
        }
    }

    public abstract void zzn(zzft zzftVar);

    public final void zzo(zzci zzciVar) {
        this.zzf = zzciVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzsc) arrayList.get(i2)).zza(this, zzciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzp(zzsc zzscVar) {
        this.zza.remove(zzscVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzscVar);
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzr(zzpe zzpeVar) {
        this.zzd.zzc(zzpeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzs(zzsl zzslVar) {
        this.zzc.zzm(zzslVar);
    }

    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final /* synthetic */ boolean zzu() {
        return true;
    }
}
