package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzewm implements zzems {
    public final zzcnf zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexc zzd;
    private final zzeyv zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    private final zzfhs zzh;
    private final zzfbw zzi;
    private zzfvj zzj;

    public zzewm(Context context, Executor executor, zzcnf zzcnfVar, zzeyv zzeyvVar, zzexc zzexcVar, zzfbw zzfbwVar, zzcfo zzcfoVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnfVar;
        this.zze = zzeyvVar;
        this.zzd = zzexcVar;
        this.zzi = zzfbwVar;
        this.zzf = zzcfoVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnfVar.zzy();
    }

    public static /* synthetic */ zzdba zzd(zzewm zzewmVar, zzeyt zzeytVar) {
        return zzewmVar.zzm(zzeytVar);
    }

    public final synchronized zzdba zzm(zzeyt zzeytVar) {
        zzewl zzewlVar = (zzewl) zzeytVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
            zzcvr zzcvrVar = new zzcvr(this.zzg);
            zzdbc zzdbcVar = new zzdbc();
            zzdbcVar.zzc(this.zzb);
            zzdbcVar.zzf(zzewlVar.zza);
            zzdbe zzg = zzdbcVar.zzg();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zzc(this.zzd, this.zzc);
            zzdhcVar.zzl(this.zzd, this.zzc);
            return zzc(zzcvrVar, zzg, zzdhcVar.zzn());
        }
        zzexc zzi = zzexc.zzi(this.zzd);
        zzdhc zzdhcVar2 = new zzdhc();
        zzdhcVar2.zzb(zzi, this.zzc);
        zzdhcVar2.zzg(zzi, this.zzc);
        zzdhcVar2.zzh(zzi, this.zzc);
        zzdhcVar2.zzi(zzi, this.zzc);
        zzdhcVar2.zzc(zzi, this.zzc);
        zzdhcVar2.zzl(zzi, this.zzc);
        zzdhcVar2.zzm(zzi);
        zzcvr zzcvrVar2 = new zzcvr(this.zzg);
        zzdbc zzdbcVar2 = new zzdbc();
        zzdbcVar2.zzc(this.zzb);
        zzdbcVar2.zzf(zzewlVar.zza);
        return zzc(zzcvrVar2, zzdbcVar2.zzg(), zzdhcVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        zzfvj zzfvjVar = this.zzj;
        return (zzfvjVar == null || zzfvjVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x004c A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0018, B:48:0x002d, B:53:0x004c, B:56:0x005d, B:60:0x0063, B:62:0x0072, B:64:0x007a, B:66:0x008f, B:68:0x00a8, B:70:0x00ac, B:71:0x00b5, B:51:0x0045), top: B:77:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0018, B:48:0x002d, B:53:0x004c, B:56:0x005d, B:60:0x0063, B:62:0x0072, B:64:0x007a, B:66:0x008f, B:68:0x00a8, B:70:0x00ac, B:71:0x00b5, B:51:0x0045), top: B:77:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzems
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r9, java.lang.String r10, com.google.android.gms.internal.ads.zzemq r11, com.google.android.gms.internal.ads.zzemr r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewm.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzemq, com.google.android.gms.internal.ads.zzemr):boolean");
    }

    public abstract zzdba zzc(zzcvr zzcvrVar, zzdbe zzdbeVar, zzdhe zzdheVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfcx.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
