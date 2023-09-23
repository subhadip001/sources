package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbxk zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new zzbtw());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), getInputData().b(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI), getInputData().b("gws_query_id"));
            return new ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.a.C0002a();
        }
    }
}
