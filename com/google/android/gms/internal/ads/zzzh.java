package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzh {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i2 = zzeg.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbl zzblVar) {
        for (int i2 = 0; i2 < zzblVar.zza(); i2++) {
            zzbk zzb = zzblVar.zzb(i2);
            if (zzb instanceof zzabv) {
                zzabv zzabvVar = (zzabv) zzb;
                if ("iTunSMPB".equals(zzabvVar.zzb) && zzc(zzabvVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzace) {
                zzace zzaceVar = (zzace) zzb;
                if ("com.apple.iTunes".equals(zzaceVar.zza) && "iTunSMPB".equals(zzaceVar.zzb) && zzc(zzaceVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
