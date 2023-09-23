package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgan {
    private final zzfwd zza;
    private final zzfwj zzb;

    public zzgan(zzfwd zzfwdVar) {
        this.zza = zzfwdVar;
        this.zzb = null;
    }

    public zzgan(zzfwj zzfwjVar) {
        this.zza = null;
        this.zzb = zzfwjVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzfwd zzfwdVar = this.zza;
        return zzfwdVar != null ? zzfwdVar.zzb(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
