package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaiz implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzajb zzc;

    public zzaiz(zzajb zzajbVar, String str, long j2) {
        this.zzc = zzajbVar;
        this.zza = str;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzajm zzajmVar;
        zzajm zzajmVar2;
        zzajmVar = this.zzc.zza;
        zzajmVar.zza(this.zza, this.zzb);
        zzajb zzajbVar = this.zzc;
        zzajmVar2 = zzajbVar.zza;
        zzajmVar2.zzb(zzajbVar.toString());
    }
}
