package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzftx extends zzfuq implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    public zzfvj zza;
    public Object zzb;

    public zzftx(zzfvj zzfvjVar, Object obj) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvj zzfvjVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfvjVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfvjVar.isCancelled()) {
            zzt(zzfvjVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfva.zzp(zzfvjVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e2) {
            zze(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            zze(e3);
        } catch (ExecutionException e4) {
            zze(e4.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        String str;
        zzfvj zzfvjVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfvjVar != null) {
            String obj2 = zzfvjVar.toString();
            str = a.v(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            String obj3 = obj.toString();
            return a.w(new StringBuilder(obj3.length() + str.length() + 11), str, "function=[", obj3, "]");
        } else if (zza != null) {
            return zza.length() != 0 ? str.concat(zza) : new String(str);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zzf(Object obj, Object obj2);

    public abstract void zzg(Object obj);
}
