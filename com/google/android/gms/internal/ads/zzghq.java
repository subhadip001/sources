package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghq {
    public static final zzghq zza;
    public static final zzghq zzb;
    public static final zzghq zzc;
    public static final zzghq zzd;
    public static final zzghq zze;
    public static final zzghq zzf;
    public static final zzghq zzg;
    private static final Logger zzh = Logger.getLogger(zzghq.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzghy zzk;

    static {
        if (zzfzd.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            zzj = false;
        } else if (zzgij.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzghq(new zzghr());
        zzb = new zzghq(new zzghv());
        zzc = new zzghq(new zzghx());
        zzd = new zzghq(new zzghw());
        zze = new zzghq(new zzghs());
        zzf = new zzghq(new zzghu());
        zzg = new zzghq(new zzght());
    }

    public zzghq(zzghy zzghyVar) {
        this.zzk = zzghyVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        Exception exc = null;
        for (Provider provider : zzi) {
            try {
                return this.zzk.zza(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
