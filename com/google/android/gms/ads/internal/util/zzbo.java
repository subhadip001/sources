package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbo {
    private static zzaje zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzaje zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbhy.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdw)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzaki.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfvj zza(String str) {
        zzcga zzcgaVar = new zzcga();
        zzb.zza(new zzbn(str, null, zzcgaVar));
        return zzcgaVar;
    }

    public final zzfvj zzb(int i2, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzcfh zzcfhVar = new zzcfh(null);
        zzbi zzbiVar = new zzbi(this, i2, str, zzblVar, zzbhVar, bArr, map, zzcfhVar);
        if (zzcfh.zzl()) {
            try {
                zzcfhVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzaij e2) {
                zzcfi.zzj(e2.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
