package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfuw;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzw implements zzfuw {
    public final /* synthetic */ zzbyj zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzz zzc;

    public zzw(zzz zzzVar, zzbyj zzbyjVar, boolean z) {
        this.zzc = zzzVar;
        this.zza = zzbyjVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        try {
            zzbyj zzbyjVar = this.zza;
            String message = th.getMessage();
            zzbyjVar.zze("Internal error: " + message);
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z;
        String str;
        Uri zzV;
        zzfig zzfigVar;
        zzfig zzfigVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzt;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzN(uri)) {
                        str = this.zzc.zzC;
                        zzV = zzz.zzV(uri, str, "1");
                        zzfigVar = this.zzc.zzs;
                        zzfigVar.zzc(zzV.toString(), null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgt)).booleanValue()) {
                            zzfigVar2 = this.zzc.zzs;
                            zzfigVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }
}
