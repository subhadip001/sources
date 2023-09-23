package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdh {
    private zzbcw zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbdh(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbdh zzbdhVar) {
        synchronized (zzbdhVar.zzd) {
            zzbcw zzbcwVar = zzbdhVar.zza;
            if (zzbcwVar == null) {
                return;
            }
            zzbcwVar.disconnect();
            zzbdhVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzbcx zzbcxVar) {
        zzbdb zzbdbVar = new zzbdb(this);
        zzbdf zzbdfVar = new zzbdf(this, zzbcxVar, zzbdbVar);
        zzbdg zzbdgVar = new zzbdg(this, zzbdbVar);
        synchronized (this.zzd) {
            zzbcw zzbcwVar = new zzbcw(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzbdfVar, zzbdgVar);
            this.zza = zzbcwVar;
            zzbcwVar.checkAvailabilityAndConnect();
        }
        return zzbdbVar;
    }
}
