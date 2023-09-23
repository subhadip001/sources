package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyc extends zzgar {
    public zzfyc() {
        super(zzgcu.class, new zzfya(zzfwd.class));
    }

    public static void zzg(boolean z) {
        if (zzm()) {
            zzfxi.zzm(new zzfyc(), true);
        }
    }

    public static /* bridge */ /* synthetic */ zzgao zzh(int i2, int i3) {
        zzgcw zzc = zzgcx.zzc();
        zzc.zza(i2);
        return new zzgao((zzgcx) zzc.zzaj(), i3);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfyb(this, zzgcx.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgcu.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgcu zzgcuVar = (zzgcu) zzglyVar;
        zzgik.zzb(zzgcuVar.zza(), 0);
        zzgik.zza(zzgcuVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
