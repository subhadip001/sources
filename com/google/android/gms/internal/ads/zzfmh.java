package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import f.a.b.a.a;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmh {
    @VisibleForTesting
    public final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmh(Context context, int i2) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfmi.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfmi.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i2;
    }

    @VisibleForTesting
    public static String zza(zzaqu zzaquVar) {
        return Hex.bytesToStringLowercase(zzaquVar.zzaq().zzE());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i2 = this.zzd;
        StringBuilder A = a.A("FBAMTD");
        A.append(i2 - 1);
        return A.toString();
    }

    private final String zzg() {
        int i2 = this.zzd;
        StringBuilder A = a.A("LATMTD");
        A.append(i2 - 1);
        return A.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzaqr r8, com.google.android.gms.internal.ads.zzfmn r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmh.zzb(com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzfmn):boolean");
    }

    @VisibleForTesting
    public final zzaqu zzc(int i2) {
        String string;
        if (i2 == 1) {
            string = this.zzc.getString(zzg(), null);
        } else {
            string = this.zzc.getString(zzf(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzaqu zzh = zzaqu.zzh(zzgjg.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfmi.zzb(zzk, "pcam.jar", zze());
            if (!zzb.exists()) {
                zzb = zzfmi.zzb(zzk, "pcam", zze());
            }
            File zzb2 = zzfmi.zzb(zzk, "pcbc", zze());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgla unused) {
        }
        return null;
    }

    public final zzfmg zzd(int i2) {
        zzaqu zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zzk = zzc.zzk();
        File zzb = zzfmi.zzb(zzk, "pcam.jar", zze());
        if (!zzb.exists()) {
            zzb = zzfmi.zzb(zzk, "pcam", zze());
        }
        return new zzfmg(zzc, zzb, zzfmi.zzb(zzk, "pcbc", zze()), zzfmi.zzb(zzk, "pcopt", zze()));
    }
}
