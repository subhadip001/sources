package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbxk zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtw());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzf();
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0002a();
        }
    }
}
