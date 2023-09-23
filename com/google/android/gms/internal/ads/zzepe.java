package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepe implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzepe(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepf zzc() {
        double d2;
        Intent registerReceiver = this.zzb.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d2 = -1.0d;
        }
        return new zzepf(d2, z);
    }
}
