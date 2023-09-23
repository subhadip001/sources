package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public abstract class zzp<T> {
    public final int zza;
    public final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    public final int zzc;
    public final Bundle zzd;

    public zzp(int i2, int i3, Bundle bundle) {
        this.zza = i2;
        this.zzc = i3;
        this.zzd = bundle;
    }

    public final String toString() {
        int i2 = this.zzc;
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(zzb());
        sb.append("}");
        return sb.toString();
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            Log.d("MessengerIpcClient", a.w(new StringBuilder(valueOf.length() + 14 + valueOf2.length()), "Failing ", valueOf, " with ", valueOf2));
        }
        this.zzb.setException(zzqVar);
    }

    public final void zzd(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            Log.d("MessengerIpcClient", a.w(new StringBuilder(valueOf.length() + 16 + valueOf2.length()), "Finishing ", valueOf, " with ", valueOf2));
        }
        this.zzb.setResult(t);
    }
}
