package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzftq extends zzfuq implements Runnable {
    public zzfvj zza;
    public Class zzb;
    public Object zzc;

    public zzftq(zzfvj zzfvjVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 1
            if (r0 != 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r1 != 0) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            r4 = r4 | r5
            if (r2 != 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            r3 = r3 | r4
            if (r3 != 0) goto La2
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L21
            goto La2
        L21:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfwb     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            if (r4 == 0) goto L30
            r4 = r0
            com.google.android.gms.internal.ads.zzfwb r4 = (com.google.android.gms.internal.ads.zzfwb) r4     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            java.lang.Throwable r4 = r4.zzp()     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L31
        L30:
            r4 = r3
        L31:
            if (r4 != 0) goto L77
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfva.zzp(r0)     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L78
        L38:
            r4 = move-exception
            goto L77
        L3a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            f.a.b.a.a.R(r9, r7, r6, r8, r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
        L77:
            r5 = r3
        L78:
            if (r4 != 0) goto L7e
            r10.zzd(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L9f
            java.lang.Object r0 = r10.zzf(r2, r4)     // Catch: java.lang.Throwable -> L90
            r10.zzb = r3
            r10.zzc = r3
            r10.zzg(r0)
            return
        L90:
            r0 = move-exception
            r10.zze(r0)     // Catch: java.lang.Throwable -> L99
            r10.zzb = r3
            r10.zzc = r3
            return
        L99:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L9f:
            r10.zzt(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftq.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        String str;
        zzfvj zzfvjVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (zzfvjVar != null) {
            String obj2 = zzfvjVar.toString();
            str = a.v(new StringBuilder(obj2.length() + 16), "inputFuture=[", obj2, "], ");
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return zza.length() != 0 ? str.concat(zza) : new String(str);
            }
            return null;
        }
        String obj3 = cls.toString();
        String obj4 = obj.toString();
        StringBuilder sb = new StringBuilder(obj4.length() + obj3.length() + str.length() + 29);
        a.R(sb, str, "exceptionType=[", obj3, "], fallback=[");
        return a.u(sb, obj4, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zzf(Object obj, Throwable th);

    public abstract void zzg(Object obj);
}
