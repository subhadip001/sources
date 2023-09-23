package com.google.android.gms.internal.ads;

import e.f.h;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnr {
    public static final zzdnr zza = new zzdnr(new zzdnp());
    private final zzbmb zzb;
    private final zzbly zzc;
    private final zzbmo zzd;
    private final zzbml zze;
    private final zzbra zzf;
    private final h zzg;
    private final h zzh;

    private zzdnr(zzdnp zzdnpVar) {
        this.zzb = zzdnpVar.zza;
        this.zzc = zzdnpVar.zzb;
        this.zzd = zzdnpVar.zzc;
        this.zzg = new h(zzdnpVar.zzf);
        this.zzh = new h(zzdnpVar.zzg);
        this.zze = zzdnpVar.zzd;
        this.zzf = zzdnpVar.zze;
    }

    public final zzbly zza() {
        return this.zzc;
    }

    public final zzbmb zzb() {
        return this.zzb;
    }

    public final zzbme zzc(String str) {
        return (zzbme) this.zzh.getOrDefault(str, null);
    }

    public final zzbmh zzd(String str) {
        return (zzbmh) this.zzg.getOrDefault(str, null);
    }

    public final zzbml zze() {
        return this.zze;
    }

    public final zzbmo zzf() {
        return this.zzd;
    }

    public final zzbra zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f2001h);
        int i2 = 0;
        while (true) {
            h hVar = this.zzg;
            if (i2 >= hVar.f2001h) {
                return arrayList;
            }
            arrayList.add((String) hVar.h(i2));
            i2++;
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
