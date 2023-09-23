package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzep extends zzek {
    private zzew zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzep() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(zzeg.zzG(this.zzb), this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        zzi(zzewVar);
        this.zza = zzewVar;
        Uri uri = zzewVar.zza;
        String scheme = uri.getScheme();
        zzcw.zze(Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzaf = zzeg.zzaf(uri.getSchemeSpecificPart(), ",");
        if (zzaf.length == 2) {
            String str = zzaf[1];
            if (zzaf[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw zzbp.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e2);
                }
            } else {
                this.zzb = zzeg.zzZ(URLDecoder.decode(str, zzfog.zza.name()));
            }
            long j2 = zzewVar.zzf;
            int length = this.zzb.length;
            if (j2 <= length) {
                int i2 = (int) j2;
                this.zzc = i2;
                int i3 = length - i2;
                this.zzd = i3;
                long j3 = zzewVar.zzg;
                if (j3 != -1) {
                    this.zzd = (int) Math.min(i3, j3);
                }
                zzj(zzewVar);
                long j4 = zzewVar.zzg;
                return j4 != -1 ? j4 : this.zzd;
            }
            this.zzb = null;
            throw new zzes(2008);
        }
        throw zzbp.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        zzew zzewVar = this.zza;
        if (zzewVar != null) {
            return zzewVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
