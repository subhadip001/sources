package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzey implements ServiceConnection {
    public final /* synthetic */ zzez zza;
    private final String zzb;

    public zzey(zzez zzezVar, String str) {
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
                if (zzb == null) {
                    this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaz().zzp(new zzex(this, zzb, this));
                return;
            } catch (RuntimeException e2) {
                this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e2);
                return;
            }
        }
        a.L(this.zza.zza, "Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a.K(this.zza.zza, "Install Referrer Service disconnected");
    }
}
