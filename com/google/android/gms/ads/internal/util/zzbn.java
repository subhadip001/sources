package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajb;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcga;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbn extends zzajb {
    private final zzcga zza;
    private final zzcfh zzb;

    public zzbn(String str, Map map, zzcga zzcgaVar) {
        super(0, str, new zzbm(zzcgaVar));
        this.zza = zzcgaVar;
        zzcfh zzcfhVar = new zzcfh(null);
        this.zzb = zzcfhVar;
        zzcfhVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final zzajh zzh(zzaix zzaixVar) {
        return zzajh.zzb(zzaixVar, zzajy.zzb(zzaixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzaix zzaixVar = (zzaix) obj;
        this.zzb.zzf(zzaixVar.zzc, zzaixVar.zza);
        zzcfh zzcfhVar = this.zzb;
        byte[] bArr = zzaixVar.zzb;
        if (zzcfh.zzl() && bArr != null) {
            zzcfhVar.zzh(bArr);
        }
        this.zza.zzd(zzaixVar);
    }
}
