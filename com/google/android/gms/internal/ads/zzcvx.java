package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcvx extends zzcvu {
    private final Context zzc;
    private final View zzd;
    private final zzcli zze;
    private final zzfbh zzf;
    private final zzcxu zzg;
    private final zzdnr zzh;
    private final zzdjh zzi;
    private final zzgpo zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcvx(zzcxv zzcxvVar, Context context, zzfbh zzfbhVar, View view, zzcli zzcliVar, zzcxu zzcxuVar, zzdnr zzdnrVar, zzdjh zzdjhVar, zzgpo zzgpoVar, Executor executor) {
        super(zzcxvVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcliVar;
        this.zzf = zzfbhVar;
        this.zzg = zzcxuVar;
        this.zzh = zzdnrVar;
        this.zzi = zzdjhVar;
        this.zzj = zzgpoVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcvx zzcvxVar) {
        zzdnr zzdnrVar = zzcvxVar.zzh;
        if (zzdnrVar.zze() == null) {
            return;
        }
        try {
            zzdnrVar.zze().zze((com.google.android.gms.ads.internal.client.zzbs) zzcvxVar.zzj.zzb(), ObjectWrapper.wrap(zzcvxVar.zzc));
        } catch (RemoteException e2) {
            zzcfi.zzh("RemoteException when notifyAdLoad is called", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzW() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvw
            @Override // java.lang.Runnable
            public final void run() {
                zzcvx.zzi(zzcvx.this);
            }
        });
        super.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgz)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfcd unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final zzfbh zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfcc.zzc(zzqVar);
        }
        zzfbg zzfbgVar = this.zzb;
        if (zzfbgVar.zzad) {
            for (String str : zzfbgVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfbh(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfcc.zzb(this.zzb.zzs, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final zzfbh zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcli zzcliVar;
        if (viewGroup == null || (zzcliVar = this.zze) == null) {
            return;
        }
        zzcliVar.zzai(zzcmx.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }
}
