package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzml {
    private final zzcf zza;
    private zzfrh zzb = zzfrh.zzo();
    private zzfrk zzc = zzfrk.zzd();
    private zzsb zzd;
    private zzsb zze;
    private zzsb zzf;

    public zzml(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    private static zzsb zzj(zzcb zzcbVar, zzfrh zzfrhVar, zzsb zzsbVar, zzcf zzcfVar) {
        zzci zzn = zzcbVar.zzn();
        int zzg = zzcbVar.zzg();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zzg);
        int zzc = (zzcbVar.zzs() || zzn.zzo()) ? -1 : zzn.zzd(zzg, zzcfVar, false).zzc(zzeg.zzv(zzcbVar.zzl()));
        for (int i2 = 0; i2 < zzfrhVar.size(); i2++) {
            zzsb zzsbVar2 = (zzsb) zzfrhVar.get(i2);
            if (zzm(zzsbVar2, zzf, zzcbVar.zzs(), zzcbVar.zzd(), zzcbVar.zze(), zzc)) {
                return zzsbVar2;
            }
        }
        if (zzfrhVar.isEmpty() && zzsbVar != null) {
            if (zzm(zzsbVar, zzf, zzcbVar.zzs(), zzcbVar.zzd(), zzcbVar.zze(), zzc)) {
                return zzsbVar;
            }
        }
        return null;
    }

    private final void zzk(zzfrj zzfrjVar, zzsb zzsbVar, zzci zzciVar) {
        if (zzsbVar == null) {
            return;
        }
        if (zzciVar.zza(zzsbVar.zza) != -1) {
            zzfrjVar.zza(zzsbVar, zzciVar);
            return;
        }
        zzci zzciVar2 = (zzci) this.zzc.get(zzsbVar);
        if (zzciVar2 != null) {
            zzfrjVar.zza(zzsbVar, zzciVar2);
        }
    }

    private final void zzl(zzci zzciVar) {
        zzfrj zzfrjVar = new zzfrj();
        if (this.zzb.isEmpty()) {
            zzk(zzfrjVar, this.zze, zzciVar);
            if (!zzfoo.zza(this.zzf, this.zze)) {
                zzk(zzfrjVar, this.zzf, zzciVar);
            }
            if (!zzfoo.zza(this.zzd, this.zze) && !zzfoo.zza(this.zzd, this.zzf)) {
                zzk(zzfrjVar, this.zzd, zzciVar);
            }
        } else {
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzk(zzfrjVar, (zzsb) this.zzb.get(i2), zzciVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfrjVar, this.zzd, zzciVar);
            }
        }
        this.zzc = zzfrjVar.zzc();
    }

    private static boolean zzm(zzsb zzsbVar, Object obj, boolean z, int i2, int i3, int i4) {
        if (zzsbVar.zza.equals(obj)) {
            if (z) {
                if (zzsbVar.zzb != i2 || zzsbVar.zzc != i3) {
                    return false;
                }
            } else if (zzsbVar.zzb != -1 || zzsbVar.zze != i4) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzci zza(zzsb zzsbVar) {
        return (zzci) this.zzc.get(zzsbVar);
    }

    public final zzsb zzb() {
        return this.zzd;
    }

    public final zzsb zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfrh zzfrhVar = this.zzb;
        if (zzfrhVar instanceof List) {
            if (!zzfrhVar.isEmpty()) {
                obj = zzfrhVar.get(zzfrhVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfrhVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzsb) obj;
    }

    public final zzsb zzd() {
        return this.zze;
    }

    public final zzsb zze() {
        return this.zzf;
    }

    public final void zzg(zzcb zzcbVar) {
        this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzsb zzsbVar, zzcb zzcbVar) {
        this.zzb = zzfrh.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsb) list.get(0);
            Objects.requireNonNull(zzsbVar);
            this.zzf = zzsbVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcbVar.zzn());
    }

    public final void zzi(zzcb zzcbVar) {
        this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
        zzl(zzcbVar.zzn());
    }
}
