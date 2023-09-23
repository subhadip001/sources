package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgiz extends zzgjc {
    private final int zzc;
    private final int zzd;

    public zzgiz(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzgjg.zzq(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgjc, com.google.android.gms.internal.ads.zzgjg
    public final byte zza(int i2) {
        zzgjg.zzB(i2, this.zzd);
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgjc, com.google.android.gms.internal.ads.zzgjg
    public final byte zzb(int i2) {
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgjc
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjc, com.google.android.gms.internal.ads.zzgjg
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgjc, com.google.android.gms.internal.ads.zzgjg
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, this.zzc + i2, bArr, i3, i4);
    }
}
