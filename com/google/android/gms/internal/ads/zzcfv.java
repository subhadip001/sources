package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcfv {
    public static final zzfvk zza;
    public static final zzfvk zzb;
    public static final zzfvk zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfvk zze;
    public static final zzfvk zzf;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfnt.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcfr("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfr("Default"));
        }
        zza = new zzcfu(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzfnt.zza().zzc(5, new zzcfr("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfr("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        zzb = new zzcfu(threadPoolExecutor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzfnt.zza().zzb(new zzcfr("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfr("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        zzc = new zzcfu(threadPoolExecutor3, null);
        zzd = new zzcfq(3, new zzcfr("Schedule"));
        zze = new zzcfu(new zzcfs(), null);
        zzf = new zzcfu(zzfvq.zzb(), null);
    }
}
