package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.arthenica.ffmpegkit.StreamInformation;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzclz implements zzbol {
    public final /* synthetic */ zzcmb zza;

    public zzclz(zzcmb zzcmbVar) {
        this.zza = zzcmbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i2;
        zzcli zzcliVar = (zzcli) obj;
        if (map != null) {
            String str = (String) map.get(StreamInformation.KEY_HEIGHT);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcmb zzcmbVar = this.zza;
                    i2 = zzcmbVar.zzG;
                    if (i2 != parseInt) {
                        zzcmbVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e2) {
                zzcfi.zzk("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
