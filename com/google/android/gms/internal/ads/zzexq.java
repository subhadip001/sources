package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexq implements zzems {
    private final Context zza;
    private final Executor zzb;
    private final zzcnf zzc;
    private final zzemc zzd;
    private final zzemg zze;
    private final ViewGroup zzf;
    private zzbit zzg;
    private final zzdeh zzh;
    private final zzfhs zzi;
    private final zzdgn zzj;
    private final zzfbw zzk;
    private zzfvj zzl;

    public zzexq(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcnf zzcnfVar, zzemc zzemcVar, zzemg zzemgVar, zzfbw zzfbwVar, zzdgn zzdgnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnfVar;
        this.zzd = zzemcVar;
        this.zze = zzemgVar;
        this.zzk = zzfbwVar;
        this.zzh = zzcnfVar.zzf();
        this.zzi = zzcnfVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdgnVar;
        zzfbwVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        zzfvj zzfvjVar = this.zzl;
        return (zzfvjVar == null || zzfvjVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemq zzemqVar, zzemr zzemrVar) {
        zzcwr zzj;
        zzfhq zzfhqVar;
        zzfhg zzb = zzfhf.zzb(this.zza, 7, 3, zzlVar);
        if (str == null) {
            zzcfi.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexm
                @Override // java.lang.Runnable
                public final void run() {
                    zzexq.this.zzm();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzfbw zzfbwVar = this.zzk;
            zzfbwVar.zzs(str);
            zzfbwVar.zzE(zzlVar);
            zzfby zzG = zzfbwVar.zzG();
            if (((Boolean) zzbjt.zzc.zze()).booleanValue() && this.zzk.zzg().zzk) {
                zzemc zzemcVar = this.zzd;
                if (zzemcVar != null) {
                    zzemcVar.zza(zzfcx.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                zzcwq zze = this.zzc.zze();
                zzdbc zzdbcVar = new zzdbc();
                zzdbcVar.zzc(this.zza);
                zzdbcVar.zzf(zzG);
                zze.zzi(zzdbcVar.zzg());
                zzdhc zzdhcVar = new zzdhc();
                zzdhcVar.zzj(this.zzd, this.zzb);
                zzdhcVar.zzk(this.zzd, this.zzb);
                zze.zzf(zzdhcVar.zzn());
                zze.zze(new zzekm(this.zzg));
                zze.zzd(new zzdlo(zzdnr.zza, null));
                zze.zzg(new zzcxo(this.zzh, this.zzj));
                zze.zzc(new zzcvr(this.zzf));
                zzj = zze.zzj();
            } else {
                zzcwq zze2 = this.zzc.zze();
                zzdbc zzdbcVar2 = new zzdbc();
                zzdbcVar2.zzc(this.zza);
                zzdbcVar2.zzf(zzG);
                zze2.zzi(zzdbcVar2.zzg());
                zzdhc zzdhcVar2 = new zzdhc();
                zzdhcVar2.zzj(this.zzd, this.zzb);
                zzdhcVar2.zza(this.zzd, this.zzb);
                zzdhcVar2.zza(this.zze, this.zzb);
                zzdhcVar2.zzl(this.zzd, this.zzb);
                zzdhcVar2.zzd(this.zzd, this.zzb);
                zzdhcVar2.zze(this.zzd, this.zzb);
                zzdhcVar2.zzf(this.zzd, this.zzb);
                zzdhcVar2.zzb(this.zzd, this.zzb);
                zzdhcVar2.zzk(this.zzd, this.zzb);
                zzdhcVar2.zzi(this.zzd, this.zzb);
                zze2.zzf(zzdhcVar2.zzn());
                zze2.zze(new zzekm(this.zzg));
                zze2.zzd(new zzdlo(zzdnr.zza, null));
                zze2.zzg(new zzcxo(this.zzh, this.zzj));
                zze2.zzc(new zzcvr(this.zzf));
                zzj = zze2.zzj();
            }
            zzcwr zzcwrVar = zzj;
            if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                zzfhq zzj2 = zzcwrVar.zzj();
                zzj2.zzh(3);
                zzj2.zzb(zzlVar.zzp);
                zzfhqVar = zzj2;
            } else {
                zzfhqVar = null;
            }
            zzcyz zzd = zzcwrVar.zzd();
            zzfvj zzh = zzd.zzh(zzd.zzi());
            this.zzl = zzh;
            zzfva.zzr(zzh, new zzexp(this, zzemrVar, zzfhqVar, zzb, zzcwrVar), this.zzb);
            return true;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfbw zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzfcx.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zze.zza(zzbcVar);
    }

    public final void zzp(zzdei zzdeiVar) {
        this.zzh.zzj(zzdeiVar, this.zzb);
    }

    public final void zzq(zzbit zzbitVar) {
        this.zzg = zzbitVar;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzR(view, view.getContext());
        }
        return false;
    }
}
