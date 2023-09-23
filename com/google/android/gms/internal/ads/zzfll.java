package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfll {
    private final Context zza;
    private final Executor zzb;
    private final zzfks zzc;
    private final zzfku zzd;
    private final zzflk zze;
    private final zzflk zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    public zzfll(Context context, Executor executor, zzfks zzfksVar, zzfku zzfkuVar, zzfli zzfliVar, zzflj zzfljVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfksVar;
        this.zzd = zzfkuVar;
        this.zze = zzfliVar;
        this.zzf = zzfljVar;
    }

    public static zzfll zze(Context context, Executor executor, zzfks zzfksVar, zzfku zzfkuVar) {
        zzfll zzfllVar = new zzfll(context, executor, zzfksVar, zzfkuVar, new zzfli(), new zzflj());
        if (zzfllVar.zzd.zzd()) {
            zzfllVar.zzg = zzfllVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzflf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfll.this.zzc();
                }
            });
        } else {
            zzfllVar.zzg = Tasks.forResult(zzfllVar.zze.zza());
        }
        zzfllVar.zzh = zzfllVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzflg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfll.this.zzd();
            }
        });
        return zzfllVar;
    }

    private static zzaly zzg(Task task, zzaly zzalyVar) {
        return !task.isSuccessful() ? zzalyVar : (zzaly) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfll.this.zzf(exc);
            }
        });
    }

    public final zzaly zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaly zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzaly zzc() {
        Context context = this.zza;
        zzali zza = zzaly.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzr(id);
            zza.zzq(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzY(6);
        }
        return (zzaly) zza.zzaj();
    }

    public final /* synthetic */ zzaly zzd() {
        Context context = this.zza;
        return zzfla.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
