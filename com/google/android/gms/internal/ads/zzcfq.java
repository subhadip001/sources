package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcfq extends ScheduledThreadPoolExecutor {
    public zzcfq(int i2, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
