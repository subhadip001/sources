package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i2, ApiKey<?> apiKey, long j2, long j3, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i2;
        this.zac = apiKey;
        this.zad = j2;
        this.zae = j3;
    }

    public static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i2, ApiKey<?> apiKey) {
        boolean z;
        if (googleApiManager.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                z = config.getMethodTimingTelemetryEnabled();
                zabq zak = googleApiManager.zak(apiKey);
                if (zak != null) {
                    if (!(zak.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i2);
                        if (zab == null) {
                            return null;
                        }
                        zak.zaq();
                        z = zab.getMethodTimingTelemetryEnabled();
                    }
                }
            }
            return new zacd<>(googleApiManager, i2, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i2) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i2) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i2))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabq zak;
        int i2;
        int i3;
        int i4;
        int i5;
        int errorCode;
        long j2;
        long j3;
        int i6;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                boolean z = true;
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z2 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i2 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        z = (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) ? false : false;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z2 = z;
                    }
                    i3 = batchPeriodMillis;
                    i4 = maxMethodInvocationsInBatch;
                } else {
                    i2 = 0;
                    i3 = AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT;
                    i4 = 100;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    i5 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i5 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i5 = statusCode;
                        } else {
                            i5 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z2) {
                    long j4 = this.zad;
                    j3 = System.currentTimeMillis();
                    j2 = j4;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.zae);
                } else {
                    j2 = 0;
                    j3 = 0;
                    i6 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i5, errorCode, j2, j3, null, null, gCoreServiceId, i6), i2, i3, i4);
            }
        }
    }
}
