package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzfkz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    public final zzflz zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfkz(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzflz zzflzVar = new zzflz(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzflzVar;
        this.zzd = new LinkedBlockingQueue();
        zzflzVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzaly zza() {
        zzali zza = zzaly.zza();
        zza.zzA(32768L);
        return (zzaly) zza.zzaj();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfme zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfma(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaly zzb(int i2) {
        zzaly zzalyVar;
        try {
            zzalyVar = (zzaly) this.zzd.poll(FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzalyVar = null;
        }
        return zzalyVar == null ? zza() : zzalyVar;
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
