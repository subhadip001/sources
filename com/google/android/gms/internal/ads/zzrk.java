package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzrk extends zzrc {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzft zzc;

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzj() {
        for (zzrj zzrjVar : this.zza.values()) {
            zzrjVar.zza.zzi(zzrjVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zzl() {
        for (zzrj zzrjVar : this.zza.values()) {
            zzrjVar.zza.zzk(zzrjVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public void zzn(zzft zzftVar) {
        this.zzc = zzftVar;
        this.zzb = zzeg.zzC(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public void zzq() {
        for (zzrj zzrjVar : this.zza.values()) {
            zzrjVar.zza.zzp(zzrjVar.zzb);
            zzrjVar.zza.zzs(zzrjVar.zzc);
            zzrjVar.zza.zzr(zzrjVar.zzc);
        }
        this.zza.clear();
    }

    public zzsb zzv(Object obj, zzsb zzsbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public void zzw() {
        for (zzrj zzrjVar : this.zza.values()) {
            zzrjVar.zza.zzw();
        }
    }

    public abstract void zzx(Object obj, zzsd zzsdVar, zzci zzciVar);

    public final void zzy(final Object obj, zzsd zzsdVar) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzsc zzscVar = new zzsc() { // from class: com.google.android.gms.internal.ads.zzrh
            @Override // com.google.android.gms.internal.ads.zzsc
            public final void zza(zzsd zzsdVar2, zzci zzciVar) {
                zzrk.this.zzx(obj, zzsdVar2, zzciVar);
            }
        };
        zzri zzriVar = new zzri(this, obj);
        this.zza.put(obj, new zzrj(zzsdVar, zzscVar, zzriVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzsdVar.zzh(handler, zzriVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzsdVar.zzg(handler2, zzriVar);
        zzsdVar.zzm(zzscVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zzsdVar.zzi(zzscVar);
    }
}
