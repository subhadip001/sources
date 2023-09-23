package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdtn {
    private final zzdbq zza;
    private final zzdjd zzb;
    private final zzdcz zzc;
    private final zzddm zzd;
    private final zzddy zze;
    private final zzdgl zzf;
    private final Executor zzg;
    private final zzdja zzh;
    private final zzcuc zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzccj zzk;
    private final zzaoc zzl;
    private final zzdgc zzm;
    private final zzeen zzn;
    private final zzfig zzo;
    private final zzdwg zzp;
    private final zzfgo zzq;

    public zzdtn(zzdbq zzdbqVar, zzdcz zzdczVar, zzddm zzddmVar, zzddy zzddyVar, zzdgl zzdglVar, Executor executor, zzdja zzdjaVar, zzcuc zzcucVar, com.google.android.gms.ads.internal.zzb zzbVar, zzccj zzccjVar, zzaoc zzaocVar, zzdgc zzdgcVar, zzeen zzeenVar, zzfig zzfigVar, zzdwg zzdwgVar, zzfgo zzfgoVar, zzdjd zzdjdVar) {
        this.zza = zzdbqVar;
        this.zzc = zzdczVar;
        this.zzd = zzddmVar;
        this.zze = zzddyVar;
        this.zzf = zzdglVar;
        this.zzg = executor;
        this.zzh = zzdjaVar;
        this.zzi = zzcucVar;
        this.zzj = zzbVar;
        this.zzk = zzccjVar;
        this.zzl = zzaocVar;
        this.zzm = zzdgcVar;
        this.zzn = zzeenVar;
        this.zzo = zzfigVar;
        this.zzp = zzdwgVar;
        this.zzq = zzfgoVar;
        this.zzb = zzdjdVar;
    }

    public static final zzfvj zzj(zzcli zzcliVar, String str, String str2) {
        final zzcga zzcgaVar = new zzcga();
        zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdtl
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzcga zzcgaVar2 = zzcga.this;
                if (z) {
                    zzcgaVar2.zzd(null);
                } else {
                    zzcgaVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcliVar.zzad(str, str2, null);
        return zzcgaVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzcli zzcliVar, zzcli zzcliVar2, Map map) {
        this.zzi.zzh(zzcliVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        return false;
    }

    public final void zzi(final zzcli zzcliVar, boolean z, zzboo zzbooVar) {
        zzany zzc;
        zzcliVar.zzP().zzL(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdtn.this.zzc();
            }
        }, this.zzd, this.zze, new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final void zzbD(String str, String str2) {
                zzdtn.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzw() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.ads.internal.overlay.zzw
            public final void zzg() {
                zzdtn.this.zze();
            }
        }, z, zzbooVar, this.zzj, new zzdtm(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb);
        zzcliVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdtn.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcliVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdtn.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcf)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzn((View) zzcliVar);
        }
        this.zzh.zzj(zzcliVar, this.zzg);
        this.zzh.zzj(new zzbam() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // com.google.android.gms.internal.ads.zzbam
            public final void zzc(zzbal zzbalVar) {
                zzcmv zzP = zzcli.this.zzP();
                Rect rect = zzbalVar.zzd;
                zzP.zzo(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcliVar);
        zzcliVar.zzaf("/trackActiveViewUnit", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdtk
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdtn.this.zzg(zzcliVar, (zzcli) obj, map);
            }
        });
        this.zzi.zzi(zzcliVar);
    }
}
