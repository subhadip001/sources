package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfcx {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzefc) {
            zzefc zzefcVar = (zzefc) th;
            return zzc(zzefcVar.zza(), zzefcVar.zzb());
        } else if (th instanceof zzdzk) {
            if (th.getMessage() == null) {
                return zzd(((zzdzk) th).zza(), null, null);
            }
            return zzd(((zzdzk) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzay) {
            com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
            return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfpg.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzefd zzefdVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i2 = zza.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzefdVar != null) {
            zza.zze = zzefdVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i2 != 0) {
            if (i2 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgR)).intValue() > 0) {
                    return zzeVar;
                }
                i2 = 8;
            }
            return zzd(i2, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcx.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
