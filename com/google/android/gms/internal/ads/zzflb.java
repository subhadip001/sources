package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzflb implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    public final zzflz zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfks zzf;
    private final long zzg;
    private final int zzh;

    public zzflb(Context context, int i2, int i3, String str, String str2, String str3, zzfks zzfksVar) {
        this.zzb = str;
        this.zzh = i3;
        this.zzc = str2;
        this.zzf = zzfksVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzflz zzflzVar = new zzflz(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzflzVar;
        this.zzd = new LinkedBlockingQueue();
        zzflzVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzfml zza() {
        return new zzfml(null, 1);
    }

    private final void zze(int i2, long j2, Exception exc) {
        this.zzf.zzc(i2, System.currentTimeMillis() - j2, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfme zzd = zzd();
        if (zzd != null) {
            try {
                zzfml zzf = zzd.zzf(new zzfmj(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfml zzb(int i2) {
        zzfml zzfmlVar;
        try {
            zzfmlVar = (zzfml) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zze(2009, this.zzg, e2);
            zzfmlVar = null;
        }
        zze(3004, this.zzg, null);
        if (zzfmlVar != null) {
            if (zzfmlVar.zzc == 7) {
                zzfks.zzg(3);
            } else {
                zzfks.zzg(2);
            }
        }
        return zzfmlVar == null ? zza() : zzfmlVar;
    }

    public final void zzc() {
        zzflz zzflzVar = this.zza;
        if (zzflzVar != null) {
            if (zzflzVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfme zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
