package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfnx {
    public static zzfvj zza(Task task) {
        final zzfnw zzfnwVar = new zzfnw(task);
        task.addOnCompleteListener(zzfvq.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfnv
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfnw zzfnwVar2 = zzfnw.this;
                if (task2.isCanceled()) {
                    zzfnwVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfnwVar2.zzd(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfnwVar2.zze(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfnwVar;
    }
}
