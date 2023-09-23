package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class zad<T> extends zac {
    public final TaskCompletionSource<T> zaa;

    public zad(int i2, TaskCompletionSource<T> taskCompletionSource) {
        super(i2);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(zabq<?> zabqVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e2) {
            zad(zai.zah(e2));
            throw e2;
        } catch (RemoteException e3) {
            zad(zai.zah(e3));
        } catch (RuntimeException e4) {
            this.zaa.trySetException(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(zaad zaadVar, boolean z) {
    }
}
