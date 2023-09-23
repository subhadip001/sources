package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcex {
    public static final ThreadPoolExecutor zza = new ThreadPoolExecutor(2, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zzcew("ClientDefault"));
    public static final ExecutorService zzb = Executors.newSingleThreadExecutor(new zzcew("ClientSingle"));
}
