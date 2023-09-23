package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfks {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfks(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfks zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfko
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfmu.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkp
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzfmu.zzc());
                }
            });
        }
        return new zzfks(context, executor, taskCompletionSource.getTask(), z);
    }

    public static void zzg(int i2) {
        zzf = i2;
    }

    private final Task zzh(final int i2, long j2, Exception exc, String str, Map map, String str2) {
        if (this.zze) {
            final zzaku zza2 = zzaky.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zze(j2);
            zza2.zzg(zzf);
            if (exc != null) {
                zza2.zzf(zzfpi.zza(exc));
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfkr
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzaku zzakuVar = zzaku.this;
                    int i3 = i2;
                    int i4 = zzfks.zza;
                    if (task.isSuccessful()) {
                        zzfmt zza3 = ((zzfmu) task.getResult()).zza(((zzaky) zzakuVar.zzaj()).zzau());
                        zza3.zza(i3);
                        zza3.zzc();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfkq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i2, String str) {
        return zzh(i2, 0L, null, null, null, str);
    }

    public final Task zzc(int i2, long j2, Exception exc) {
        return zzh(i2, j2, exc, null, null, null);
    }

    public final Task zzd(int i2, long j2) {
        return zzh(i2, j2, null, null, null, null);
    }

    public final Task zze(int i2, long j2, String str) {
        return zzh(i2, j2, null, null, null, str);
    }

    public final Task zzf(int i2, long j2, String str, Map map) {
        return zzh(i2, j2, null, str, null, null);
    }
}
