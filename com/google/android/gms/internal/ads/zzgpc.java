package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgpc extends zzgpf implements zzako {
    public zzakp zza;
    public final String zzb = "moov";

    public zzgpc(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgpg zzgpgVar, ByteBuffer byteBuffer, long j2, zzakl zzaklVar) {
        zzgpgVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgpgVar;
        this.zzf = zzgpgVar.zzb();
        zzgpgVar.zze(zzgpgVar.zzb() + j2);
        this.zzg = zzgpgVar.zzb();
        this.zzc = zzaklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakpVar) {
        this.zza = zzakpVar;
    }
}
