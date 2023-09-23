package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjn {
    private final zzmv zza;
    private final zzjm zze;
    private final zzsk zzf;
    private final zzpd zzg;
    private final HashMap zzh;
    private final Set zzi;
    private boolean zzj;
    private zzft zzk;
    private zztu zzl = new zztu(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();

    public zzjn(zzjm zzjmVar, zzki zzkiVar, Handler handler, zzmv zzmvVar) {
        this.zza = zzmvVar;
        this.zze = zzjmVar;
        zzsk zzskVar = new zzsk();
        this.zzf = zzskVar;
        zzpd zzpdVar = new zzpd();
        this.zzg = zzpdVar;
        this.zzh = new HashMap();
        this.zzi = new HashSet();
        zzskVar.zzb(handler, zzkiVar);
        zzpdVar.zzb(handler, zzkiVar);
    }

    private final void zzp(int i2, int i3) {
        while (i2 < this.zzb.size()) {
            ((zzjl) this.zzb.get(i2)).zzd += i3;
            i2++;
        }
    }

    private final void zzq(zzjl zzjlVar) {
        zzjk zzjkVar = (zzjk) this.zzh.get(zzjlVar);
        if (zzjkVar != null) {
            zzjkVar.zza.zzi(zzjkVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjl zzjlVar = (zzjl) it.next();
            if (zzjlVar.zzc.isEmpty()) {
                zzq(zzjlVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzjl zzjlVar) {
        if (zzjlVar.zze && zzjlVar.zzc.isEmpty()) {
            zzjk zzjkVar = (zzjk) this.zzh.remove(zzjlVar);
            Objects.requireNonNull(zzjkVar);
            zzjkVar.zza.zzp(zzjkVar.zzb);
            zzjkVar.zza.zzs(zzjkVar.zzc);
            zzjkVar.zza.zzr(zzjkVar.zzc);
            this.zzi.remove(zzjlVar);
        }
    }

    private final void zzt(zzjl zzjlVar) {
        zzrw zzrwVar = zzjlVar.zza;
        zzsc zzscVar = new zzsc() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzsc
            public final void zza(zzsd zzsdVar, zzci zzciVar) {
                zzjn.this.zze(zzsdVar, zzciVar);
            }
        };
        zzjj zzjjVar = new zzjj(this, zzjlVar);
        this.zzh.put(zzjlVar, new zzjk(zzrwVar, zzscVar, zzjjVar));
        zzrwVar.zzh(new Handler(zzeg.zzD(), null), zzjjVar);
        zzrwVar.zzg(new Handler(zzeg.zzD(), null), zzjjVar);
        zzrwVar.zzm(zzscVar, this.zzk, this.zza);
    }

    private final void zzu(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            zzjl zzjlVar = (zzjl) this.zzb.remove(i3);
            this.zzd.remove(zzjlVar.zzb);
            zzp(i3, -zzjlVar.zza.zzA().zzc());
            zzjlVar.zze = true;
            if (this.zzj) {
                zzs(zzjlVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzci zzb() {
        if (this.zzb.isEmpty()) {
            return zzci.zza;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            zzjl zzjlVar = (zzjl) this.zzb.get(i3);
            zzjlVar.zzd = i2;
            i2 += zzjlVar.zza.zzA().zzc();
        }
        return new zzjs(this.zzb, this.zzl, null);
    }

    public final /* synthetic */ void zze(zzsd zzsdVar, zzci zzciVar) {
        this.zze.zzh();
    }

    public final void zzf(zzft zzftVar) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzftVar;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjl zzjlVar = (zzjl) this.zzb.get(i2);
            zzt(zzjlVar);
            this.zzi.add(zzjlVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjk zzjkVar : this.zzh.values()) {
            try {
                zzjkVar.zza.zzp(zzjkVar.zzb);
            } catch (RuntimeException e2) {
                zzdn.zza("MediaSourceList", "Failed to release child source.", e2);
            }
            zzjkVar.zza.zzs(zzjkVar.zzc);
            zzjkVar.zza.zzr(zzjkVar.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzrz zzrzVar) {
        zzjl zzjlVar = (zzjl) this.zzc.remove(zzrzVar);
        Objects.requireNonNull(zzjlVar);
        zzjlVar.zza.zzB(zzrzVar);
        zzjlVar.zzc.remove(((zzrt) zzrzVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzjlVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzci zzj(int i2, List list, zztu zztuVar) {
        if (!list.isEmpty()) {
            this.zzl = zztuVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzjl zzjlVar = (zzjl) list.get(i3 - i2);
                if (i3 > 0) {
                    zzjl zzjlVar2 = (zzjl) this.zzb.get(i3 - 1);
                    zzci zzA = zzjlVar2.zza.zzA();
                    zzjlVar.zzc(zzA.zzc() + zzjlVar2.zzd);
                } else {
                    zzjlVar.zzc(0);
                }
                zzp(i3, zzjlVar.zza.zzA().zzc());
                this.zzb.add(i3, zzjlVar);
                this.zzd.put(zzjlVar.zzb, zzjlVar);
                if (this.zzj) {
                    zzt(zzjlVar);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjlVar);
                    } else {
                        zzq(zzjlVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzci zzk(int i2, int i3, int i4, zztu zztuVar) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzci zzl(int i2, int i3, zztu zztuVar) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zztuVar;
        zzu(i2, i3);
        return zzb();
    }

    public final zzci zzm(List list, zztu zztuVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zztuVar);
    }

    public final zzci zzn(zztu zztuVar) {
        int zza = zza();
        if (zztuVar.zzc() != zza) {
            zztuVar = zztuVar.zzf().zzg(0, zza);
        }
        this.zzl = zztuVar;
        return zzb();
    }

    public final zzrz zzo(zzsb zzsbVar, zzvw zzvwVar, long j2) {
        Object obj = zzsbVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzsb zzc = zzsbVar.zzc(((Pair) obj).second);
        zzjl zzjlVar = (zzjl) this.zzd.get(obj2);
        Objects.requireNonNull(zzjlVar);
        this.zzi.add(zzjlVar);
        zzjk zzjkVar = (zzjk) this.zzh.get(zzjlVar);
        if (zzjkVar != null) {
            zzjkVar.zza.zzk(zzjkVar.zzb);
        }
        zzjlVar.zzc.add(zzc);
        zzrt zzD = zzjlVar.zza.zzD(zzc, zzvwVar, j2);
        this.zzc.put(zzD, zzjlVar);
        zzr();
        return zzD;
    }
}
