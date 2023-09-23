package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfck {
    public zzfck() {
        try {
            zzfxk.zza();
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgjd zzt = zzgjg.zzt();
        try {
            zzfwh.zzb(zzfwr.zzb(zzfwq.zza("AES128_GCM")), zzfwf.zzb(zzt));
        } catch (IOException | GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdwb zzdwbVar) {
        zzfwr zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfwd) zzc.zzd(zzfwd.class)).zza(bArr, bArr2);
            zzdwbVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "CryptoUtils.decrypt");
            zzdwbVar.zza().put("df", e2.toString());
            return null;
        }
    }

    private static final zzfwr zzc(String str) {
        try {
            return zzfwh.zza(zzfwe.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "CryptoUtils.getHandle");
            return null;
        }
    }
}
